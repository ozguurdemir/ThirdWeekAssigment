import java.util.List;
import java.util.Scanner;
public class SeatPicker {
    private SeatPicker() {
    }

    public static String pickSeat(Airline airline, List<String> seatList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koltuk Listesi:");
        for (int i = 0; i < seatList.size(); i++) {
            System.out.print(seatList.get(i) + " ");
            if ((i + 1) % 6 == 0) {
                System.out.println();
            }
        }
        System.out.println("Bir koltuk seçin");
        System.out.println("ilk üç sıra businesstır");

        String selectedSeat = scanner.nextLine();
        if (selectedSeat.charAt(1) >= '1' && selectedSeat.charAt(1) <= '3'&& airline.getName().equals(Company.THY)){
            airline.isBusiness=true;
        }

        int index = seatList.indexOf(selectedSeat);
        if (index != -1) {
            seatList.set(index, "xx");
        }
        return selectedSeat;
    }
}
