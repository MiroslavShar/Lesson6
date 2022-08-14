public class LaboratornajaStringList {
    static String stroka2;


    public static void main(String[] args) {
    indexOf("hit");

    }


    public static char indexOf(String stroka2){
        if (stroka2 == null || stroka2.length() < 3){
            System.out.println("Pustaja stroka");
            return 0;
        } else {
            System.out.println(stroka2.charAt(2));
            return (stroka2.charAt(2));
        }
    }
}
