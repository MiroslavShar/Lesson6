public class Stroka {
    String stroka = "Schubert";
    String strokaTest = "Spartak";

    public static void main(String[] args){
        Stroka start = new Stroka();
        start.CharAt(); // Возвращаем букву которая находится под этим индексом
        start.Concat(); // Метод работает как +
        start.Contains(); // Находит с чего начинается строка?????
        start.ContentEquals(); // Проверяет имеет ли строка подобное значение
        start.Copy(); // Записывает в строку указанные значения. Использует данные длинны строки
        start.EndWith(); // Проверяем на что заканчивается строка
        start.Equals(); // Сравниваем сроку и объект


    }

    public Stroka(){
        this.stroka = stroka;
    }

    public String CharAt(){
        char myChar = stroka.charAt(2);
        System.out.println(myChar);

        return stroka;
    }

    public String Concat(){
        String strokaNew = stroka.concat(" Kot");
        System.out.println(strokaNew);

        return strokaNew;
    }

    public String Contains(){
        if (stroka.contains("Schubert")){
            System.out.println("W strokie jest' slowo Schubert");
        }
        return stroka;
    }

    public String ContentEquals(){
        if (strokaTest.contentEquals("Spar")){
            System.out.println("Stroka imeet podobnoe znaczenie");
        }
        else System.out.println("Stroka nie imeet podobnoe znaczenie");
    return strokaTest;
    }

    public String Copy(){
        char[] textArray = {'M', 'I', 'R', 'E', 'K'};
        strokaTest = String.copyValueOf(textArray, 1, 4);
        System.out.println(strokaTest);

        return strokaTest;
    }

    public String EndWith(){
        System.out.println("Jest li w strokie REK? " + strokaTest.endsWith("REK"));

        return strokaTest;
    }

    public String Equals(){
        System.out.println("Stroka == StrokaTest ? " + stroka.equals(strokaTest));

        return strokaTest;
    }


}
