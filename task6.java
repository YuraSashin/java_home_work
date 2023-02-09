import java.util.HashMap;

// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, метод toString 
// возвращающий строку с элементами множества и метод позволяющий 
// читать элементы по индексу. Формат данных Integer.

public class task6 {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(3);
        mySet.add(12);
        mySet.add(22);
        mySet.add(123);
        System.out.println(mySet);

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));
        }

        int count = mySet.get(0) + 10;
        System.out.println(count);//проверил, что есть возможность изменить элемент
    }

}

class MySet{
    private HashMap<Integer,Object> map = new HashMap<>();
    private final Object Obj = new Object();
    @Override
    public String toString() {
        return map.keySet().toString();
    }

    public boolean add(Integer i){
        return map.put(i,Obj) != null ? true: false;
    }

    public Integer size(){
        return map.keySet().size();
    }

    public Integer get(Integer a){
        return (Integer) map.keySet().toArray()[a];
    }

}