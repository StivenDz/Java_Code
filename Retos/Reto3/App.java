public class App {
    public static void main(String[] args) {
        SchoolGradingSystem sc = new SchoolGradingSystem();

        sc.loadData();
        System.out.printf("%,.2f",sc.stat1());
        System.out.printf("\n%d",sc.stat2());
        System.out.printf("\n%s",sc.stat3());
        System.out.printf("\n%s",sc.stat4());

    }
}
