public class MainClass {

    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Денис", 170);
        person[1] = new Person("Коля", 216);
        person[2] = new Person("Вася", 315);
        person[3] = new Person("Петя", 829);
        Team team = new Team("*Мечта*", person);

        Course course = new Course(250);
        String result = course.doIt(team);
        System.out.println(result);

    }
}