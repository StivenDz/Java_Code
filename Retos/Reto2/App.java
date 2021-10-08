public class App{
    public static void main(String[] args) {
        SchoolGradingSystem school = new SchoolGradingSystem();

        school.readData();
        school.question1();
        school.question2();
        System.out.println("\n"+school.question3());
        System.out.println(school.question4());
    }
}