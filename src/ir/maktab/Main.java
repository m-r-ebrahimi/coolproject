package ir.maktab;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Manage manager=new Manage();
        manager.addCity(new City(1,"Mashhad"));
        manager.addCity(new City(2,"Tehran"));
        manager.addCity(new City(3,"Isfahan"));
        manager.addCity(new City(4,"Tabriz"));
        manager.addRoad(new Road(1,"as",1,2,null,120,1000,true));
        manager.addRoad(new Road(2,"df",1,3,null,120,1000,true));
        manager.addRoad(new Road(3,"gh",2,3,null,120,1000,true));
        manager.addRoad(new Road(4,"gh",3,4,null,120,1000,true));

        System.out.println(manager.getPaths(1,2));
    }
}
