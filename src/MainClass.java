public class MainClass {

    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("�����", 170);
        person[1] = new Person("����", 216);
        person[2] = new Person("����", 315);
        person[3] = new Person("����", 829);
        Team team = new Team("*�����*", person);

        Course course = new Course(250);
        String result = course.doIt(team);
        System.out.println(result);

    }
}