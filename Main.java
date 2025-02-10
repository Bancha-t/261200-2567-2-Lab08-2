import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread t1= new Thread(new drawLighthouse());
        Thread t2 = new Thread(new drawuaaq1());
        Thread t3 = new Thread(new drawuaaq2());
        Thread t4 = new Thread(new drawcloud());

        t1.start();
        t2.start();
        t4.start();
        t3.start();
    }
}

class drawuaaq1 implements Runnable{
    public void run(){
        Turtle bob = new Turtle();
        bob.speed(10);
        bob.bgcolor("beige");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bob.up();
        bob.setPosition(-150, -130);
        bob.down();
        bob.dot("red", 300);

        bob.up();
        bob.setPosition(-300, -200);
        bob.down();
        bob.penColor("blue");
        bob.width(200);
        bob.forward(550);
        
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt(-250, 251); 
            int y = rand.nextInt(-250, -119); 

            bob.up();
            bob.setPosition(x, y);
            bob.penColor("white");
            bob.down();
            bob.width(1);
            bob.forward(70);
        }
        bob.hide();
    }
}

class drawuaaq2 implements Runnable{
    public void run(){
        Turtle bob = new Turtle();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random rand = new Random();
        bob.speed(10);
        for (int i = 0; i < 300; i++) {
            int x = rand.nextInt(-250, 251); 
            int y = rand.nextInt(-250, -119); 

            bob.up();
            bob.setPosition(x, y);
            bob.penColor("darkblue");
            bob.down();
            bob.width(1);
            bob.forward(70);
        }
        bob.hide();
    }
}

class drawLighthouse implements Runnable{
    public void run(){
        Turtle bob = new Turtle();
        bob.speed(10);
        bob.up();
        bob.setPosition(130, -100);
        bob.setDirection(95);
        bob.penColor("green");
        bob.width(120);
        bob.down();
        bob.forward(50);   

        bob.up();
        bob.setPosition(100, -100);
        bob.setDirection(85);
        bob.penColor("green");
        bob.width(120);
        bob.down();
        bob.forward(50);   

        bob.hide();
    }

}

class drawcloud implements Runnable{
    public void run(){
        Turtle bob = new Turtle();
        bob.penColor("white");
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            int x = rand.nextInt(-250, 251); 
            int y = rand.nextInt(119, 200); 

            bob.up();
            bob.setPosition(x, y);
            bob.down();
            bob.dot("white",70);
        }

        bob.hide();
    }
}