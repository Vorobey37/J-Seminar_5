import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * task_0
 */
public class task_0 {

    public static void main(String[] args) {
        /*
         * Создать структуру для хранения Номеров паспортов и Фамилий
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
         */
        HashMap<Integer, String> people = new HashMap<>();
        FillPeople(people);
        //System.out.println(people);
    }
    private static void FillPeople (HashMap<Integer, String> people){
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String name = input.nextLine();
            String[] nameSplit = name.split(" ");
            people.put(Integer.parseInt(nameSplit[0]), nameSplit[1]);
        }
        for (Map.Entry<Integer, String> el : people.entrySet()) {
            if(el.getValue().equals("Ivanov")){
            System.out.println(el.getKey() + ":" + el.getValue());}
            
        }
        System.out.println(people);
        input.close();
    }
}