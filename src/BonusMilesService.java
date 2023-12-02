public class BonusMilesService {
    public int calculate(int ticketValue) {
        short bonusValue = 20;
        int bonusSum;

        bonusSum = ticketValue / bonusValue;
        return bonusSum;
    }
}
