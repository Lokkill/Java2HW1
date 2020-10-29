package our.company;

public class Human implements Runner, Jumper {

    String name;
    int maxHeightJump;
    int maxWeightRun;
    boolean isInvolvement = true;

    public Human(String name, int maxHeightJump, int maxWeightRun) {
        this.name = name;
        this.maxHeightJump = maxHeightJump;
        this.maxWeightRun = maxWeightRun;
    }

    @Override
    public void jump(int height) {
        if (isInvolvement){
            if (maxHeightJump >= height) {
                System.out.println(name + " перепрыгнул: " + height);
            } else {
                System.out.println(name + " не смог пройти препятствие, из-за чего выбывает из соревнования");
                isInvolvement = false;
            }
        }

    }

    @Override
    public void run(int weight) {
        if (isInvolvement){
            if (maxWeightRun >= weight) {
                System.out.println(name + " пробежал: " + weight);
            } else {
                System.out.println(name + " не смог пройти препятствие, из-за чего выбывает из соревнования");
                isInvolvement = false;
            }
        }
    }
}
