public class BonusMilesService {

    public int calculate(int price ) {
        int bonus = 20;
        int mile = price / bonus;
        return mile;
    }
}