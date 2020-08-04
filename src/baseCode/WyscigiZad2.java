package baseCode;

public class WyscigiZad2 {
    public static String zdanie = "Na wyscigach wyscigowych wyscigowek wyscigowych wyscigowka wyscigowa wyscignela wyscigowke wyscigowa numer szesc";
    public static void main(String[] args) {
        String maleZdanie = zdanie.toLowerCase();
        String tablica[] = maleZdanie.split(" ");
        String temp;


        for (int i = 0; i < tablica.length; i++) {
            for (int j = i + 1; j < tablica.length; j++) {
                if (tablica[i].length() > tablica[j].length()) {
                    temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
        for (String element : tablica) {
            System.out.println(element + " " + element.length());


        }
    }
}
