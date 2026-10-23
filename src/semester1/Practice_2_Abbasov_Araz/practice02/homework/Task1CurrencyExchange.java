package semester1.Practice_2_Abbasov_Araz.practice02.homework;

// КНД-12 Аббасов Араз

public class Task1CurrencyExchange {
    public static void main(String[] args) {
        double usdAmount = 250.0;
        final double EXCHANGE_RATE = 41.25;
        final double COMMISSION_PERCENT = 1.5;
        double USDtoUAH = usdAmount * EXCHANGE_RATE;
        double ResultCommission = USDtoUAH * COMMISSION_PERCENT / 100;
        double ResultUah = USDtoUAH - ResultCommission;
        long MainResult = Math.round(ResultUah);
        System.out.println("================ КВИТАНЦІЯ ОБМІНУ ================");
        System.out.println("Сума до обміну: " + "\t\t\t" + usdAmount + " USD");
        System.out.println("Курс валют: " + "\t\t\t\t" + EXCHANGE_RATE + " UAH/USD");
        System.out.println("Нараховано до комісії" + "\t\t" + USDtoUAH + " UAH");
        System.out.println("Комісія банку (1.5%): " + "\t\t" + ResultCommission + " UAH");
        System.out.println("--------------------------------------------------");
        System.out.println("Чиста сума до видачі: " + "\t\t" + ResultUah + " UAH");
        System.out.println("До видачі готівкою: " + "\t\t" + MainResult + " UAH");
    }

}
