public class BonusMilesService {
    public int calculate(int cost)
    {
        int priceOfMile = 20; //цена одной бонусной мили
        int numberOfMiles = cost / priceOfMile; //количество миль за купленный билет
        return numberOfMiles;
    }
}
