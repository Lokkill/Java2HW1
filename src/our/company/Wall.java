package our.company;

public class Wall {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public void skip(Jumper jumper){
        if (jumper instanceof Human || jumper instanceof Cat || jumper instanceof Robot){
            jumper.jump(height);
        }
    }
}
