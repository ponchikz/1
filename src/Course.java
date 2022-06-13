//полоса препятствий
public class Course {
    String result; //результат
    private int distance; //расстояние


    public Course(int action) {
        this.distance = action; //действие

    }

    public String doIt(Team team){
        System.out.println("Пробажать " + distance + " метров");
        result = "Имя команды: "+ team.getName()+ " " + '\n';
        for(Person person: team.getPeoples()){
            result += "Имя участника: " + person.getName()+ " " + person.getCanEatCalories() + '\n';
            int value = person.getCanEatCalories();
            testAction(value);
        }
        return result;
    }
    private void testAction(int value){
        if(value>=distance) result += "Пробежал "+ '\n';
        else result += "Не пробежал "+ '\n';
    }

}
