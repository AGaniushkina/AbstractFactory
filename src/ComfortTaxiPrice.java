public class ComfortTaxiPrice implements Taxi {
    public YandexTaxi getYandexTaxi() {
        return new ComfortYandexTaxi();
    }

    public Uber getUber() {
        return new ComfortUber();
    }

    public CityMobil getCityMobil() {
        return new ComfortCityMobil();
    }
}
