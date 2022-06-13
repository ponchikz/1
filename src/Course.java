//������ �����������
public class Course {
    String result; //���������
    private int distance; //����������


    public Course(int action) {
        this.distance = action; //��������

    }

    public String doIt(Team team){
        System.out.println("��������� " + distance + " ������");
        result = "��� �������: "+ team.getName()+ " " + '\n';
        for(Person person: team.getPeoples()){
            result += "��� ���������: " + person.getName()+ " " + person.getCanEatCalories() + '\n';
            int value = person.getCanEatCalories();
            testAction(value);
        }
        return result;
    }
    private void testAction(int value){
        if(value>=distance) result += "�������� "+ '\n';
        else result += "�� �������� "+ '\n';
    }

}
