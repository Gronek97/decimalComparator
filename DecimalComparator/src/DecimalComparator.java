public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
       a=1000*a;
       b=1000*b;
        int inta = (int)a;
        int intb = (int)b;
        if(inta==intb) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }
}
