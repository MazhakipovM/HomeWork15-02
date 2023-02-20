public class Main {
    public static void main(String[] args) {

       ///zadacha 1
        byte a = 127;
        short b = 32000;
        int c = 2100000000;
        long d = 900000000;
        float e = 23.4F;
        double f = 56.4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

       //zadacha 2
        float g = 27.12F;
        long h = 987678965;
        double i = 2.786;
        short j = - 159;
        int k = 27897;
        byte l = 67;
        System.out.println(g);
        System.out.println(i);
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);


        ///zadacha 3
        short firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        int totalPaper = 480;
        int forStudent = totalPaper/(firstClass+secondClass+thirdClass);
        System.out.println("«На каждого ученика рассчитано "+forStudent+ " листов бумаги»");

        //zadacha 4

        int zaDveMinuty = 16;
        int zaDvadcatMinut = zaDveMinuty * 10;
        int vSutki = (zaDvadcatMinut * 3) * 24;
        int zaTriDnya = vSutki * 3;
        int zaMesyac = vSutki * 30;
        System.out.println("За две минуты машина произвела "+zaDveMinuty+" штук бутылок.");
        System.out.println("За двадцать минут машина произвела "+zaDvadcatMinut+" штук бутылок.");
        System.out.println("В сутки машина произвела "+vSutki+" штук бутылок.");
        System.out.println("За три дня машина произвела "+zaTriDnya+" штук бутылок.");
        System.out.println("За месяц машина произвела "+zaMesyac+" штук бутылок.");


        //zadacha 5

        int paints = 120;
        int whitePaintForClass = 2;
        int brownPaintForOneClass = 4;
        int paintsForOneClass = whitePaintForClass + brownPaintForOneClass;
        int allClasses = paints / paintsForOneClass;
        System.out.println("В школе, где "+allClasses+" классов, нужно "+allClasses*whitePaintForClass+" банок белой краски и "+allClasses * brownPaintForOneClass+" банок коричневой краски");



        //zadacha 6

        int banana = 5;
        int grammOfBanana = banana * 80;
        int milk = 2;
        int grammOfMilk = milk * 105;
        int iceCream = 2;
        int grammOfIceCream = iceCream * 100;
        int egg = 4;
        int grammOfegg = egg * 70;
        int allProductsInGr = grammOfegg + grammOfBanana + grammOfMilk + grammOfIceCream;
        double allProductInKg = allProductsInGr / 1000D;
        System.out.println("Завтрак весит "+allProductsInGr+" в граммах.");
        System.out.println("Завтрак весит "+allProductInKg+" в килограммах.");


        //zadacha 7
        int overWeightInKg = 7;
        int overWeightInGrammes = overWeightInKg * 1000;
        int firstDiet = 250;
        int secondDiet = 500;
        int daysOfFirstDiet = overWeightInGrammes / firstDiet;
        int daysOfSecondDiet = overWeightInGrammes / secondDiet;
        int averageDaysOfDiets = (daysOfFirstDiet + daysOfSecondDiet) / 2;
        System.out.println(daysOfFirstDiet+ " дней уйдет,если будет скидывать по 250гр в день.");
        System.out.println(daysOfSecondDiet+ " дней уйдет,если будет скидывать по 500гр в день.");
        System.out.println(averageDaysOfDiets + " дней уйдет в среднем.");


        ///zadacha 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double increasedPercentage = 1.1;
        double mashaSalary = masha * increasedPercentage;
        double denisSalary = denis * increasedPercentage;
        double kristinaSalary = kristina * increasedPercentage;



        System.out.println("Маша теперь получает "+(int)mashaSalary+" рублей в месяц. Годовой доход вырос на "+(((int)mashaSalary * 12)-(masha * 12))+" рублей");
        System.out.println("Денис теперь получает "+(int)denisSalary+" рублей в месяц. Годовой доход вырос на "+(((int)denisSalary * 12) - (denis * 12))+" рублей");
        System.out.println("Кристина теперь получает "+(int)kristinaSalary+" рублей в месяц. Годовой доход вырос на "+(((int)kristinaSalary * 12) - (kristina * 12))+" рублей");














    }
}