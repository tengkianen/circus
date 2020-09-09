package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
<<<<<<< HEAD:src/main/java/circus/Trainer.java
import circus.animal.Parrot;
=======
>>>>>>> improved:src/main/java/Trainer.java

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
<<<<<<< HEAD:src/main/java/circus/Trainer.java
        train(new Parrot());
        //circus.animal.Animal a2 = new circus.animal.Animal();
        //circus.animal.Bird b2 = new circus.animal.Bird();
=======
        // train(new circus.animal.Parrot());
>>>>>>> improved:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
<<<<<<< HEAD:src/main/java/circus/Trainer.java
            }
        }
=======
        }
    }
>>>>>>> improved:src/main/java/Trainer.java
}
