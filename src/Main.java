import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Exercise 1

        byte a = 8;
        short b = 398;
        int c = 68903;
        long d = 2222222222222L;
        float x = 12.234f;
        double y = 1.88999002234;
        char f = 42;

        //Exercise 2

        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double weightOfBothBoxers = boxerOne + boxerTwo;
        double weightDiference = boxerTwo - boxerOne;
        System.out.println("Общий вес боксеров " + weightOfBothBoxers + " кг");
        System.out.println("Разница в весе боксеров " + weightDiference + " кг");

        //Exercise 3

        int banana = 5;
        double weight1Banana = 80;
        double weightBananas = banana * weight1Banana;
        int MilkMl = 200;
        int Milk100Ml = 105;
        int weightMilkGr = Milk100Ml * 2;
        int icecreame = 2;
        int weightOf1Icecream = 100;
        int weightIcecream = icecreame * weightOf1Icecream;
        int eggs = 4;
        double weight1Egg = 70;
        double weightEggs = eggs * weight1Egg;
        double weightOfBreakfastGr = weightBananas + weightMilkGr + weightIcecream + weightEggs;
        int GrPerKg = 1000;
        double weightOfBreakfastKg = weightOfBreakfastGr / GrPerKg;
        System.out.println("Спорт-звтрак весит " + weightOfBreakfastGr + " гр");
        System.out.println("В кг это " +weightOfBreakfastKg);

        //Exercise 4

        int needWeightLossKg = 7;
        int grPerKg = 1000;
        int needWeightLossGr = grPerKg * needWeightLossKg;
        int variantLoss1 = 250;
        int variantLoss2 = 500;
        int daysForLoss1 = needWeightLossGr/variantLoss1;
        int daysForLoss2 = needWeightLossGr/variantLoss2;
        int daysOnAverage = (daysForLoss1 + daysForLoss2) / 2;
        System.out.println( "В первом варианте ему понадобится " + daysForLoss1 + " дней");
        System.out.println( "Во втором варианте ему понадобится " + daysForLoss2 + " дней");
        System.out.println( "В среднем ему понадобится " + daysOnAverage + " день");

        //Exercise 5

        int incomeIncreaseInPercent = 10;
        byte monthsPerYear = 12;

        int incomeOfMashaPerMonth = 67_760;
        int incomeIncreaseOfMasha = incomeOfMashaPerMonth / incomeIncreaseInPercent;
        int newIncomeOfMashaPerMonth = incomeOfMashaPerMonth + incomeIncreaseOfMasha;
        int incomeOfMashaPerYear = incomeOfMashaPerMonth * monthsPerYear;
        int newIncomeOfMashaPerYear = newIncomeOfMashaPerMonth * monthsPerYear;
        int incomeDifference = newIncomeOfMashaPerYear - incomeOfMashaPerYear;
        System.out.println("Маша теперь получает " + newIncomeOfMashaPerMonth + " рублей в месяц. Годовой доход вырос на " + incomeDifference + " рублей в год.");

        int incomeOfDenisPerMonth = 83_690;
        int incomeIncreaseODenis = incomeOfDenisPerMonth / incomeIncreaseInPercent;
        int newIncomeOfDenisPerMonth = incomeOfDenisPerMonth + incomeIncreaseODenis;
        int incomeOfDenisPerYear = incomeOfDenisPerMonth * monthsPerYear;
        int newIncomeOfDenisPerYear = newIncomeOfDenisPerMonth * monthsPerYear;
        int incomeDifferenceOfDenis = newIncomeOfDenisPerYear - incomeOfDenisPerYear;
        System.out.println("Денис теперь получает " + newIncomeOfDenisPerMonth + " рублей в месяц. Годовой доход вырос на " + incomeDifferenceOfDenis + " рублей в год.");

        int incomeOfCristinaPerMonth = 76_230;
        int incomeIncreaseOfCristina = incomeOfCristinaPerMonth / incomeIncreaseInPercent;
        int newIncomeOfCristina = incomeOfCristinaPerMonth + incomeIncreaseOfCristina;
        int incomeOfCristinaPerYear = incomeOfCristinaPerMonth * monthsPerYear;
        int newIncomeOfCristinaPerYear = newIncomeOfCristina * monthsPerYear;
        int incomeDifferenceOfCristina = newIncomeOfCristinaPerYear - incomeOfCristinaPerYear;
        System.out.println("Кристина теперь получает " + newIncomeOfCristina + " рублей в месяц. Годовой доход вырос на " + incomeDifferenceOfCristina + " рублей в год.");





    }
}