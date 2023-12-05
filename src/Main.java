public class Main {
    public static void main(String[] args) {
        Time jinx  = new Time(10, 14, 43);
        System.out.println(jinx);
        Time jerri = new Time(8, 30, 29);
        jinx.add(jerri);
        System.out.println(jinx);
        System.out.println(jerri);
        Time rigg = new Time(7, 20, 0);
        jinx.add(rigg);
        System.out.println(jinx);
    }
}