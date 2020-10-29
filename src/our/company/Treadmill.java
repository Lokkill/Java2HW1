package our.company;

public class Treadmill {

    int maxWeight;

    public Treadmill(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void runTrough(Runner runner){
        if (runner instanceof Human || runner instanceof Cat || runner instanceof Robot){
            runner.run(maxWeight);
        }
    }
}
