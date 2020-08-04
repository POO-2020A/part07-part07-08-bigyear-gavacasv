
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Birds birds=new Birds();
        String opcion="";
        do{
            System.out.print("Option: ");
            opcion=scan.nextLine();
            switch(opcion){
                case "Add":
                    System.out.print("Name: ");
                    String name=scan.nextLine();
                    System.out.print("Name in Latin: ");
                    String nameL=scan.nextLine();
                    birds.add(new Bird(name,nameL));
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    String nameB=scan.nextLine();
                    Bird birdO= birds.found(nameB);
                    if(!birdO.getName().equals(""))
                        birdO.observation();
                    else
                        System.out.println("Not a bird!");
                    break;
                case "All":
                    System.out.println(birds.toString());
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String nameC=scan.nextLine();
                    Bird birdO1= birds.found(nameC);
                    if(!birdO1.getName().equals(""))
                        System.out.println(birdO1.toString());
                    else
                        System.out.println("Not a bird!");
                    break;
            }
        }while(!opcion.equals("Quit"));

    }

}
