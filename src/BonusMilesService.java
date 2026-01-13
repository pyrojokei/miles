public class BonusMilesService {

    public int calculate(double TicketCost) {
        int mile;
        if (TicketCost == (int) TicketCost) {
            mile = (int) Math.round(TicketCost) / 20;
        } else {
            mile = (int) TicketCost / 20;
        }
        int miles;
        if (TicketCost > 20) {
            miles = (int) (TicketCost / 20);
        } else {
            miles = (int) TicketCost;
        }

        return miles;
    }
}
