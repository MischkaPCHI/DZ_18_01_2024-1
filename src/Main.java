import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> randomNumbers = randomNumbersInList();
        //System.out.println(randomNumbers);
        List<Integer> randomNumbersAndPositions = randomNumbersAndPositions();
        //System.out.println(randomNumbersAndPositions);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Акакий",16));
        personList.add(new Person("Марина",26));
        personList.add(new Person("Дань-Хён",20));
        personList.add(new Person("Чембер",12));
        personList.add(new Person("Гаара",14));

        Person yourPerson = new Person("Игорь",16);
        System.out.println(countPersonsInList(personList,yourPerson));

        System.out.println(namesOfPersonsOlder20(personList));
    }
    public static List<Integer> randomNumbersInList() {
        List<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            numberList.add(random.nextInt(5000001));
        }
        return numberList;
    }
    public static List<Integer> randomNumbersAndPositions(){
        Random random = new Random();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++){
            int randomPosition = random.nextInt(numberList.size()+1);
            numberList.add(randomPosition,random.nextInt());
        }
        return numberList;
    }
    public static List<String> namesOfPersonsOlder20(List<Person> persons){
        List<String> names = new ArrayList<>();
        for (Person person : persons){
            if (person.getAge()>=20){
                names.add(person.getName());
            }
        }
        return names;
    }
    public static int countPersonsInList(List<Person> persons, Person yourPerson){
        int count = 0;
        for (Person person : persons){
            if (person.equals(yourPerson)){
                count++;
            }
        }
        return count;
    }
}