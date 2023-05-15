public class Main {
    public static void main(String[] args) {
        String priceClass = "Economy";
        Taxi taxi = null;
        if(priceClass.equals("Economy")) {
            taxi = new EconomyTaxiPrice();
        } else if(priceClass.equals("Comfort")) {
            taxi = new ComfortTaxiPrice();
        } else if(priceClass.equals("Business")) {
            taxi = new BusinessTaxiPrice();
        }

        YandexTaxi yaTaxi = taxi.getYandexTaxi();
        System.out.println(yaTaxi.getYandexTaxiPrice());

        priceClass = "Business";
        if(priceClass.equals("Economy")) {
            taxi = new EconomyTaxiPrice();
        } else if(priceClass.equals("Comfort")) {
            taxi = new ComfortTaxiPrice();
        } else if(priceClass.equals("Business")) {
            taxi = new BusinessTaxiPrice();
        }
        Uber uber = taxi.getUber();
        System.out.println(uber.getUberPrice());
    }
}