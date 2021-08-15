public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;
        int miles = 20;
        int bonus = service.calculateBonus(cost);
        System.out.println(bonus);
    }
}