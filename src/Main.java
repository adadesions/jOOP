import oop.composites.Bone;
import oop.composites.Human;
import oop.composites.Organ;
import oop.composites.Vessel;
import oop.concepts.Jargon;
import oop.gameEngine.Character;
import oop.gameEngine.Support;
import oop.gameEngine.Tank;
import oop.myAbstract.Circle;
import oop.myInterface.InterCircle;
import oop.myInterface.Shape;
import oop.objects.*;
import oop.patterns.ShapeFactory;
import problems.Account;

import java.util.concurrent.RecursiveAction;

public class Main {

    public static void mainHero(String[] args) {

        Hero spiderman = new Hero("Spider-man", "Marvel", 100);
        Hero superman = new Hero("Superman", "DC", 999);
//        System.out.println(spiderman.getHeroName());
//        spiderman.setHeroName("X-Spider-Man V.2");
//        System.out.println(spiderman.getHeroName());

        System.out.println("Name: " + spiderman.getHeroName());
        System.out.println("Team: " + spiderman.getTeam());
        System.out.println("Power: " + spiderman.getPower());

        System.out.println("Name: " + superman.getHeroName());
        System.out.println("Team: " + superman.getTeam());
        System.out.println("Power: " + superman.getPower());

        System.out.println("Hero was created: " + Hero.getNumCreated());

        Hero.setTarget("x: 30, y: 92");

        System.out.println("Target Superman: " + superman.getTarget());
        System.out.println("Target Spider-man: " + spiderman.getTarget());
    }

//    public static void mainOldGeometry(String[] args) {
//        // Geometry Object
//        // Class: Circle, Triangle, and Rectangle
//
//        // Constructor: Circle(radius), Triangle(base, height)
//        // Rectangle(width, height) --> double or float
//
//        // methods: area(), circumference(), perimeter()
//        // printInfo() --> Radius: ..., Area: ..., Circumference: ...
//
//        // static var: counter
//
////        Circle c1 = new Circle(1);
////        Circle c2 = new Circle(5.5);
////        Circle c3 = new Circle(10);
//
//        c1.printInfo();
//        c2.printInfo();
//        c3.printInfo();
//        System.out.println("Circles : " + Circle.getCounter());
//
//        Triangle t1 = new Triangle(5, 13);
//        Triangle t2 = new Triangle(10, 26);
//
//        t1.printInfo();
//        t2.printInfo();
//        System.out.println("Triangles: " + Triangle.getCounter());
//
//        Rectangle r1 = new Rectangle(3, 5);
//        Rectangle r2 = new Rectangle(7, 9);
//
//        r1.printInfo();
//        r2.printInfo();
//        System.out.println("Rectangles: " + Rectangle.getCounter());
//
//        // Reference <--> Address
//        Circle theCircle = new Circle(9);
//        Circle ghostCircle = theCircle;
//
//        System.out.println("===== REF =====");
//        theCircle.printInfo();
//
//        System.out.println("===== UPDATED =====");
//        ghostCircle.setRadius(72);
//        theCircle.printInfo();
//
//        System.out.println("The Circle " + theCircle);
//        System.out.println("Ghost Circle" + ghostCircle);
//
//        ghostCircle = c1;
//        System.out.println("C1 r = " + c1.getRadius());
//
//        ghostCircle.setRadius(ghostCircle.getRadius() + 0.5);
//        System.out.println("(update) C1 r = " + c1.getRadius());
//    }

    public static void mainPolygon(String[] args) {
        Polygon p1 = new Polygon("#FFF", 5);
        Polygon p2 = new Polygon();
        Polygon p3 = new Polygon(9);
        Polygon p4 = new Polygon("Yellow");

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();

        p1.calculate();
        p1.calculate(9);
        p1.calculate(9, "+");
    }

    public static void mainGame(String[] args) {
        Character deadpool = new Character("DeadPool", 50, 100, 5);
        Tank hulk = new Tank("Hulk", 150, 40, 3000, 100);
        Support scarletWitch = new Support("Scarlet Witch", 100);

        deadpool.attacked(hulk.getPower());
        hulk.attacked(deadpool.getHp());

        scarletWitch.heal(deadpool);
        scarletWitch.printInfo();

        scarletWitch.powerUp(deadpool);
        scarletWitch.printInfo();

        hulk.attacked(deadpool.getPower());

        scarletWitch.defUp(hulk);
        scarletWitch.printInfo();

        System.out.println(scarletWitch.getClass());
    }

    public static void mainComposite(String[] args) {
        // Composites!!
        Human ada = new Human(
                "Ada",
                new Organ("Brain", "Head", 120),
                new Organ("Lung", "Chest", 60),
                new Organ("Liver", "Middle", 60),
                new Organ("Heart", "Chest", 100),
                new Vessel("Pulmonary vain", 80, false),
                new Vessel("Pulmonary artery", 40, true),
                new Bone(),
                new Bone()
        );

        ada.think("Java Programming");
        System.out.println(ada.getVein().getPressure());
    }

    public static void mainFactory(String[] args) {
        ShapeFactory sf = new ShapeFactory(10, 3, 5);
        Shape c = sf.build("Circle");
        Shape t = sf.build("Triangle");
        c.printInfo();
        t.printInfo();
    }

    public static void main(String[] args) {
        Account a1 = new Account(10000);
        System.out.println("Account a1");
        System.out.println("Init balance: " + a1.getBalance());
        a1.credit(3000);
        a1.debit(5000);
        a1.printAccountInfo();

        Account a2 = new Account(30000);
        System.out.println("Account a2");
        System.out.println("Init balance: " + a2.getBalance());
        a2.credit(50000);
        a2.debit(90000);
        a2.printAccountInfo();


    }
}
