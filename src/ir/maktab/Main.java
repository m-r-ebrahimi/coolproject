package ir.maktab;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Manage manager=new Manage();
        manager.addCity(new City(251,"Qom"));
        manager.addCity(new City(21,"Tehran"));
        manager.addCity(new City(361,"Kashan"));
        manager.addCity(new City(5,"Tabriz"));
        manager.addCity(new City(6,"Semnan"));
        manager.addCity(new City(7,"Shiraz"));
        manager.addCity(new City(8,"Karaj"));
        manager.addRoad(new Road(1,"T-K",21,251,null,120,1000,true));
        manager.addRoad(new Road(2,"df",361,21,null,120,1000,true));
        manager.addRoad(new Road(3,"gh",2,8,null,120,1000,true));
        manager.addRoad(new Road(4,"jk",3,4,null,120,1000,true));
        manager.addRoad(new Road(5,"mn",4,5,null,120,1000,true));
        manager.addRoad(new Road(7,"vc",5,6,null,120,1000,true));
        manager.addRoad(new Road(12,"we",6,8,null,120,1000,true));

        System.out.println(manager.getPaths(361,251));
    }
}
