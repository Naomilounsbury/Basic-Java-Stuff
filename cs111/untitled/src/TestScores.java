public class TestScores {
    private String name;
    private double totalScore;
    private int numScores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestScores(String name, double totalScore, int numScores) {
        this.name = name;
        numScores = 0;
        totalScore = 0;
    }

    public TestScores() {
    }

    public TestScores(String name) {
        this.name = name;
    }

    public void addTestScore(double earned) {
    totalScore+=earned;
    numScores++;
    }

    public int getNumTestsTaken(){
        return numScores;

    }
    public double getAverage(){
        return totalScore/numScores;
    }


}
