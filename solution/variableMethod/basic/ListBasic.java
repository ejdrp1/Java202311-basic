package variableMethod.basic;

import java.util.*;

public class ListBasic {

    //    List
//    1. 선언
    List<String> listA = new ArrayList<>();
    List<String> listB = new LinkedList<String>();
    List<String> listC = new Vector<String>();
    List<String> listD = new Stack<String>();

    public void setListA() {
        listA.add("가가가");
        listA.add("나나나");
        listA.add("다다다");
        System.out.println(listA);
    }

    public void removeListA() {
        listA.remove("가가가");
        System.out.println(listA);
    }

    public void checkListA() {
        System.out.println(listA.contains("가가가"));
    }

    public void inputListA() {
        listA.add(0, "가가가");
        System.out.println(listA);
    }

    public void sizeListA() {
        System.out.println(listA.size());
    }

    public void objListA() {

        String[] data = {"50", "100", "150"};
        ArrayList<String> newData = new ArrayList<>(Arrays.asList(data));
        System.out.println(newData);
        System.out.println(newData.contains("50"));
        System.out.println(newData.add("300"));
        System.out.println(newData.remove("50"));
        System.out.println(newData.size());
        System.out.println(newData.indexOf("100"));
        System.out.println(newData.isEmpty());
    }


//    private void playerList() {
//        List<Player> players = new ArrayList<>();
//        Player player = players.get(0);
//        player.setName("손흥민");
//        player.setAge(30);
//        System.out.println(player.getName());
//        System.out.println(player.getAge());
//
//    }


    public static void main(String[] args) {

        ListBasic listBasic = new ListBasic();
//        listBasic.playerList();

    }


}
