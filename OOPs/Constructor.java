package OOPs;

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student("ram");
        s1.marks[0] = 22;
        s1.marks[1] = 20;
        s1.marks[2] = 3;
        Student s2 = new Student(s1);
        s1.marks[1] = 100;
        System.out.println(s2.marks[1]);
    }
}

class Student {
    int[] marks = new int[3];
    String name;

    Student() { // non-parametrized constructor
        marks = new int[3];
    }

    Student(String name) { // parametrized constructor
        this.name = name;
    }

    Student(Student s1) { //  copy constructor
        
        //shallow copy constructor
        //this.marks = s1.marks;

        //deep copy
        for(int i = 0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
}
