public class BonusMilesService {

    public int calculateBonus(int cost) {
        int miles = 20;
        int bonus;
        bonus = cost / miles;
        return bonus;
    }
}