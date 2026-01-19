public class BonusMilesService {

    public int calculate(double ticketCost) {
        int miles;
        if (ticketCost >= 20) {
            miles = (int) Math.round(ticketCost) / 20;
        } else {
            miles = (int) ticketCost;
        }

        return miles;
    }
}
