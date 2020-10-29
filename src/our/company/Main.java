package our.company;


public class Main {
    public static void main(String[] args) {
        Object[] array = {
                new Human("Vasya", 10, 20),
                new Cat("Mursik", 15, 30),
                new Robot("T-8000", 80)
        };

        Object[] trials = {
                new Treadmill(20),
                new Wall(8),
                new Treadmill(30),
                new Wall(14),
                new Treadmill(50)
        };

        for (Object obj : array){
            if (obj instanceof Human){
                for (Object trial : trials){
                    if (trial instanceof Treadmill){
                        ((Treadmill)trial).runTrough(((Human)obj));
                    } else if (trial instanceof Wall){
                        ((Wall)trial).skip(((Human)obj));
                    }
                }
            } else if (obj instanceof Cat){
                for (Object trial : trials){
                    if (trial instanceof Treadmill){
                        ((Treadmill)trial).runTrough(((Cat)obj));
                    } else if (trial instanceof Wall){
                        ((Wall)trial).skip(((Cat)obj));
                    }
                }
            } else if (obj instanceof Robot){
                for (Object trial : trials){
                    if (trial instanceof Treadmill){
                        ((Treadmill)trial).runTrough(((Robot)obj));
                    } else if (trial instanceof Wall){
                        ((Wall)trial).skip(((Robot)obj));
                    }
                }
            }

        }
    }

}
