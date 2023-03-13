package StudentClass;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("name");
        std1.setClasses("classes");
        System.out.println(std1);
    }
}
