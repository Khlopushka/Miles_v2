public class BonusMilesService {
    public int calculate(int cost) {

        int mile = 20;
        int bonus = cost/mile;

        System.out.println("Начислено бонусных миль: ");

        return bonus;
    }
}
