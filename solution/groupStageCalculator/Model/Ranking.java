package groupStageCalculator.Model;

public class Ranking {

    private int firstPlace = 1;
    private int secondPlace = 2;
    private int thirdPlace = 3;
    private int lastPlace = 4;

    public Ranking() {
    }

    public Ranking(int firstPlace, int secondPlace, int thirdPlace, int lastPlace) {
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
        this.lastPlace = lastPlace;
    }

    public int getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(int firstPlace) {
        this.firstPlace = firstPlace;
    }

    public int getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(int secondPlace) {
        this.secondPlace = secondPlace;
    }

    public int getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(int thirdPlace) {
        this.thirdPlace = thirdPlace;
    }

    public int getLastPlace() {
        return lastPlace;
    }

    public void setLastPlace(int lastPlace) {
        this.lastPlace = lastPlace;
    }
}