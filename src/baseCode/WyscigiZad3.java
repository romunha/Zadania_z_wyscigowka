package baseCode;

public class WyscigiZad3 {
    public static String zdanie = "Na wyscigach wyscigowych wyscigowek wyscigowych wyscigowka wyscigowa wyscignela wyscigowke wyscigowa numer szesc";

    public static void main(String[] args) {

        String maleZdanie = zdanie.toLowerCase();
        String pozamienianeSlowa = maleZdanie.replaceAll("wyscig", "nowa");
        System.out.print(pozamienianeSlowa);

    }
}
