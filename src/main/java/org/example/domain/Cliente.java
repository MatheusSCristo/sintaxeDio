package org.example.domain;

public class Cliente {
    private String name;
    private String agency;
    private Integer number;
    private Double balance;

    public String getName() {
        return name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Cliente(String name, String agency, Integer number, Double balance) {
        this.name = name;
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
}
