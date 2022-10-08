package session5;

import session4.Human;

public class Main {
    public static void main(String[] args){
        int x = 10;
        StudentInterface s = new StudentInterface() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void learn() {

            }
        };
        Human h = new Human() {
            @Override
            public void eat() {
                System.out.println("Eat..");
            }

            @Override
            public void run() {
                System.out.println("Run..");
            }
        };
        h.eat();
        Human h2 = new Human() {
            @Override
            public void eat() {
                System.out.println("Eating..");
            }

            @Override
            public void run() {

            }
        };
        h2.eat();

        FptStudentInterface f = new FptStudentInterface() {
            @Override
            public void coding(int y) {

            }
        };
        // lambda expression
        FptStudentInterface fs = (y)->{
            // body of coding function
        };
    }
}