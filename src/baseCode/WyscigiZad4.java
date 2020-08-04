package baseCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WyscigiZad4 {
    public static String zdanie = "Na wyscigach wyscigowych wyscigowek wyscigowych wyscigowka wyscigowa wyscignela wyscigowke wyscigowa numer szesc";

    public static void main(String[] args) {
        String maleZdanie = zdanie.toLowerCase();
        String tablica[] = maleZdanie.split(" ");
        String pierwszaTablica = tablica[0]+ tablica[1]+ tablica[tablica.length -2]+ tablica[tablica.length -1];
        System.out.println(pierwszaTablica);
        List list = new ArrayList();

        for (int i = 2; i < tablica.length -2; i++) {
            list.add(tablica[i]);


        }
        char charArray[] = pierwszaTablica.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

        System.out.println((list));
    }
}

