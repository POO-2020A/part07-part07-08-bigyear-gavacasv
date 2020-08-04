import java.util.ArrayList;
public class Birds {
    private ArrayList<Bird> birds ;

    public Birds() {
        this.birds = new ArrayList<>();
    }
    public void add(Bird newBird){
        this.birds.add(newBird);
    }
    public Bird found(String name){
        Bird foundBird= new Bird("","");
        for(Bird bird:this.birds){
            if(bird.getName().equals(name)){
                foundBird=bird;
                break;
            }
        }
        return foundBird;
    }
    public String toString(){
       String complement="";
        for(Bird bird:this.birds){
            complement+=bird.toString()+"\n";
        }
        return complement;
    }
    
}
