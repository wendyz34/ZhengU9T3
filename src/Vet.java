import java.util.*;
public class Vet {
    private String name;
    private ArrayList<Animal> clients = new ArrayList<Animal>();
    public Vet(String name){
        this.name = name;
    }
    public void addClient(Animal animal){
        if(clients.indexOf(animal)==-1){
            clients.add(animal);
            System.out.println("Welcome to vet office, " +animal.getName());
        }else{
            System.out.println(animal.getName()+ " is already a client of vet office.");
        }
    }
}
