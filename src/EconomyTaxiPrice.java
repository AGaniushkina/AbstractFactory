public class EconomyTaxiPrice implements Taxi {
    public YandexTaxi getYandexTaxi() {
        return new EconomyYandexTaxi();
    }

    public Uber getUber() {
        return new EconomyUber();
    }

    public CityMobil getCityMobil() {
        return new EconomyCityMobil();
    }
}
