import javax.management.ObjectName;
import java.util.*;

public class Main {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();


    public static void main(String[] args) {
       Main start = new Main();
       start.Add(); // Метод добавления
       start.Remove(); // Метод удаления
       start.Get(); // Метод прочтения или получения значения
       start.Set(); // Метод добавления значения в уже существующий элемент
       start.Size(); // Метод получения количества элементов
       start.Foreach(); // Метод форич
       start.AddAll(); // Метод добавления в середину
       start.Boolean(); // Метод проверки наличия объекта в списке
       start.RetainAll(); // Метод удаляет все из зсписка, кроме значений в инициализации
       start.IndexOf(); // Метод возвращает индекс первого вхождения элемента в списке. Если элемента не существует в списке, метод вернет -1.
       start.IsEmpty(); // Метод проверки пустой ли список

       start.Clear(); // Метод удаления из списка всего
       start.IsEmpty(); // Метод проверки пустой ли список

    }

    public Main(){
        this.list = list;
    }

    public List Add(){
        list.add("Privet");
        list.add(1, "Hello");
        list.add(2,"Pusto");
        list.add(3,"Zdraste");
        System.out.println("Dobavili " + list);

        return list;
    }

    public List Remove(){
        list.remove(0);
        System.out.println("Udalili po indeksu 0 " + list);

        return list;
    }

    public List Get(){
        System.out.println(list.get(1));

        return list;
    }

    public List Set(){
        list.set(2, "Czesc");

        System.out.println("Dobavili Set'om element nr 2 " + list);

        return list;
    }

    public List Size(){
        System.out.println(list.size());

        return list;
    }

    public List Foreach(){
        for (String list2 : list){
            System.out.println(list2);
        }

        return list2;
    }

    public List AddAll(){
        List<String > list3 = new ArrayList<>();
        list3.add(0, "iBuenos Dias");

        list.addAll(list3);
        System.out.println("prostoje dobawlenie " + list);

        list.addAll(1, list3);
        System.out.println("Wtoroje dobawlenie w seredinu " + list);

        return list;
    }

    public List Boolean(){
        System.out.println(list.contains("iBuenos Dias"));

        return list;
    }

    public List Clear(){
        list.clear();
        System.out.println("Udalili wse elementy " + list);

        return list;
    }

    public List RetainAll(){
        List<String> list3 = List.of("iBuenos Dias");

        list.retainAll(list3);
        System.out.println(list);

        return list3;
    }



    public List IndexOf() {
        System.out.println(list.indexOf("iBuenos Dias"));
        return list;
    }

    public List IsEmpty(){
        System.out.println("Pustoj li spisok? " + list.isEmpty());

        return list;
    }
}
