package com.exratesbe.exchangerate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

@Service
public class ExchangeRateService {

    private final ExchangeRateRepository exchangeRateRepository;

    @Autowired
    public ExchangeRateService(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

//    public List<ExchangeRate> getExchangeRates() {
//            return exchangeRateRepository.findAll();
//    }
//}

    public List<ExchangeRate> getExchangeRates(Boolean usedb) throws IOException {
        if (usedb) {
            return exchangeRateRepository.findAll();
        }   ObjectMapper mapper = new ObjectMapper();
            List<ExchangeRate> exchangeRates = mapper.readValue(new URL("https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e"), new TypeReference<List<ExchangeRate>>() {
                });
            System.out.println(exchangeRates);
            for (ExchangeRate exchangeRate : exchangeRates) {
                Optional<ExchangeRate> exchangeRateByShortNameAndValidFrom = exchangeRateRepository.findExchangeRateByShortNameAndValidFrom(exchangeRate.getShortName(), exchangeRate.getValidFrom());
                if (exchangeRateByShortNameAndValidFrom.isPresent()) {
                    continue;
                }
                exchangeRateRepository.save(exchangeRate);
            }

           return exchangeRateRepository.findAll();
    }
}
