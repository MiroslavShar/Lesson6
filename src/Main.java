import javax.management.ObjectName;
import java.util.*;

public class Main {
    List<String> list = new ArrayList<>();
    String str = new String();
    List<String> list2 = new ArrayList<>();


    public static void main(String[] args) {
       Main start = new Main();
       start.Add();
       start.Remove();
       start.Get();
       start.Set();
       start.Size();
       start.Foreach();
       start.AddAll();
       start.Boolean();
       start.RetainAll();
       start.Clear();



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

    /*public List Clone(){
        List<String> list5 = (List<String>) list.clone();

        return list5;
    }

     */

    /*public List Sort(){

        return list;
    }

     */
    

}
