public class BusinessTaxiPrice implements Taxi {
    public YandexTaxi getYandexTaxi() {
        return new BusinessYandexTaxi();
    }

    public Uber getUber() {
        return new BusinessUber();
    }

    public CityMobil getCityMobil() {
        return new BusinessCityMobil();
    }
}
