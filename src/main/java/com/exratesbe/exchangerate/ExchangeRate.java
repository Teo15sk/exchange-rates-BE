package com.exratesbe.exchangerate;

import javax.persistence.*;

@Entity
@Table(name = "exchange_rates")
public class ExchangeRate {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String shortName;
    private String validFrom;
    private String name;
    private String country;
    private Integer amount;
    private Double valBuy;
    private Double valSell;
    private Double valMid;
    private Double currBuy;
    private Double currSell;
    private Double currMid;
    private Double move;
    private Double cnbMid;
    private Integer version;

    public ExchangeRate() {
    }

    public ExchangeRate(Long id,
                        String shortName,
                        String validFrom,
                        String name,
                        String country,
                        Integer amount,
                        Double valBuy,
                        Double valSell,
                        Double valMid,
                        Double currBuy,
                        Double currSell,
                        Double currMid,
                        Double move,
                        Double cnbMid,
                        Integer version) {
        this.id = id;
        this.shortName = shortName;
        this.validFrom = validFrom;
        this.name = name;
        this.country = country;
        this.amount = amount;
        this.valBuy = valBuy;
        this.valSell = valSell;
        this.valMid = valMid;
        this.currBuy = currBuy;
        this.currSell = currSell;
        this.currMid = currMid;
        this.move = move;
        this.cnbMid = cnbMid;
        this.version = version;
    }

    public ExchangeRate(String shortName,
                        String validFrom,
                        String name,
                        String country,
                        Integer amount,
                        Double valBuy,
                        Double valSell,
                        Double valMid,
                        Double currBuy,
                        Double currSell,
                        Double currMid,
                        Double move,
                        Double cnbMid,
                        Integer version) {
        this.shortName = shortName;
        this.validFrom = validFrom;
        this.name = name;
        this.country = country;
        this.amount = amount;
        this.valBuy = valBuy;
        this.valSell = valSell;
        this.valMid = valMid;
        this.currBuy = currBuy;
        this.currSell = currSell;
        this.currMid = currMid;
        this.move = move;
        this.cnbMid = cnbMid;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getValBuy() {
        return valBuy;
    }

    public void setValBuy(Double valBuy) {
        this.valBuy = valBuy;
    }

    public Double getValSell() {
        return valSell;
    }

    public void setValSell(Double valSell) {
        this.valSell = valSell;
    }

    public Double getValMid() {
        return valMid;
    }

    public void setValMid(Double valMid) {
        this.valMid = valMid;
    }

    public Double getCurrBuy() {
        return currBuy;
    }

    public void setCurrBuy(Double currBuy) {
        this.currBuy = currBuy;
    }

    public Double getCurrSell() {
        return currSell;
    }

    public void setCurrSell(Double currSell) {
        this.currSell = currSell;
    }

    public Double getCurrMid() {
        return currMid;
    }

    public void setCurrMid(Double currMid) {
        this.currMid = currMid;
    }

    public Double getMove() {
        return move;
    }

    public void setMove(Double move) {
        this.move = move;
    }

    public Double getCnbMid() {
        return cnbMid;
    }

    public void setCnbMid(Double cnbMid) {
        this.cnbMid = cnbMid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "id=" + id +
                ", shortName='" + shortName + '\'' +
                ", validFrom='" + validFrom + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", amount=" + amount +
                ", valBuy=" + valBuy +
                ", valSell=" + valSell +
                ", valMid=" + valMid +
                ", currBuy=" + currBuy +
                ", currSell=" + currSell +
                ", currMid=" + currMid +
                ", move=" + move +
                ", cnbMid=" + cnbMid +
                ", version=" + version +
                '}';
    }
}

