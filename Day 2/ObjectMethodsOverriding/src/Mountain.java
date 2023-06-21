public class Mountain implements Comparable <Mountain>{
    private String name;
    private int height;

    Mountain(String name, int height){
        this.name = name;
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(int height){
        this.height = height;
    }

    // Custom define how to compare two Mountain objects
    @Override
    public boolean equals(Object obj){
        if((obj instanceof Mountain) && ((Mountain)obj).getName().equals(this.getName())){
            return true;
        }else{
            return false;
        }
    }

    // Custom define how to get hashcode for the Mountain class object
    @Override
    public int hashCode(){
        return this.getName().hashCode();
    }

    // Custom define how to convert Mountain object to a String
    @Override
    public String toString(){
        return this.getName();
    }

    // Can be used to order Montains using names
    @Override
    public int compareTo(Mountain o) {
        return this.getName().compareTo(o.getName());
    }

    /*
    // Can be used to order Montains using height
    @Override
    public int compareTo(Mountain o) {
        return ((Integer)(this.getHeight())).compareTo(((Integer)o.getHeight()));
    }
    */
}