package baseCode;

public class WyscigiZad1 {
    public static String zdanie = "Na wyscigach wyscigowych wyscigowek wyscigowych wyscigowka wyscigowa wyscignela wyscigowke wyscigowa numer szesc";

    public static void main(String[] args) {
        int iloscO = zdanie.split("o").length-1;
        int iloscW = zdanie.split("w").length-1;


        System.out.println(iloscO);
        System.out.println(iloscW);
    }
}
