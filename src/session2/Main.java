package session2;

import session1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        //  c.brand = "Honda";
        Human h = new Human();
        h.run(5);
        h.run("CHó đuổi");
        h.run(10,"Chó đuổi");
        h.run("Chó đuổi",10);

        Human h2 = new Human("Nguyễn Tuấn Anh");
        System.out.println(h2.name);

        Student s = new Student("Nguyễn Văn An","09838833","8 Ton that thuyet",18,new Car());
        s.girlFriends[0] = "Ngọc Trinh";
        s.girlFriends[1] = "THị Nở";
        s.myCar = new Car();
        s.myCar.brand = "Toyota";

        int[] marks = new int[4];
        marks[0] = 19;

        Student[] students = new Student[10];
        Car c1 = new Car();
        c1.brand = "Honda";
        students[0] = new Student("Hà Hòang Hưng","09838833","8 Ton that thuyet",18,c1);

        for(int i=0;i<students.length;i++){
            students[i] = new Student();
        }
        // set 10 sinh vien theo do tuoi tu 20->29
        for(int i=0;i<students.length;i++){
            students[i].setAge(i+20);
        }

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].getAge());
        }

        for (Student st : students){ // foreach
            System.out.println(st.getAge());// st <=> students[i]
        }
    }
}