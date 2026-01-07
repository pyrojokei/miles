public class BonusMilesService {

    public int calculate(double a) {
            int mile;
            if (a == (int) a) {
                mile = (int) Math.round(a) / 20;
            } else {
                mile = (int) a / 20;
            }
 int miles;
        if (a>20) {
            miles = (int) (a / 20);
        } else {
            miles = (int) a;
        }

        return miles;
        }
    }
