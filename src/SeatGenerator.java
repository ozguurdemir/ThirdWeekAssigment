package Business;

import java.util.List;
import java.util.ArrayList;

public class SeatGenerator {
    public static List<String> generateSeatList(int numRows, int seatsPerRow) {
        List<String> seatList = new ArrayList<>();
        char rowCode = 'A';

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                char seatChar = (char) (rowCode + j);
                int seatNumber = i + 1;
                String seatCode = seatChar + Integer.toString(seatNumber);
                seatList.add(seatCode);
            }

        }

        return seatList;
    }
}
