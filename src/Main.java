public class Main { // Switch
    public static void main(String[] args) {
//        print(getDaysForMonth("January"));
        System.out.println(getDaysForMonth("January"));
        System.out.println(getDaysForMonth("march"));
        System.out.println(getDaysForMonth("february"));

    }

    private static String getDaysForMonth(String month){
        int days;
        switch (month.toLowerCase()){
            case "january":
                days = 31;
                break;
            case "february":
                days = 28;
                break;
            default:
                days = 0;
        }
        return month + " has " + days + " days. ";
    }
}
