
public class Bird {
    private String name, nameLatin;
    private int observation;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation=0;
    }
    public void observation(){
        this.observation++;
    }

    public String getName() {
        return name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public int getObservation() {
        return observation;
    }
    public String toString(){
       String complement=" observations";
        if(this.observation==1){
            complement=" observation";
        }
        return this.name+" ("+this.nameLatin+"): "+this.observation+complement;
    }
}
