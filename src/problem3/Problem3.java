package problem3;

public class Problem3 {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.add(new Scoreboard.Entry("John", 100));
        scoreboard.add(new Scoreboard.Entry("Jane", 200));
        scoreboard.add(new Scoreboard.Entry("Jack", 300));
        scoreboard.add(new Scoreboard.Entry("Jill", 400));
        scoreboard.add(new Scoreboard.Entry("James", 500));
        scoreboard.add(new Scoreboard.Entry("Jenny", 600));
        scoreboard.add(new Scoreboard.Entry("Jeff", 700));
        scoreboard.add(new Scoreboard.Entry("Jade1", 800));
        scoreboard.add(new Scoreboard.Entry("Jade2", 900));
        scoreboard.add(new Scoreboard.Entry("Jade3", 1000));
        scoreboard.add(new Scoreboard.Entry("Jade4", 1100));
        scoreboard.add(new Scoreboard.Entry("Jade5", 1200));
        System.out.println(scoreboard);
    }
}
