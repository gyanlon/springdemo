package other.bean;

public class OtherBeanX {
    private OtherBean b;
    public OtherBeanX(OtherBean b){
        this.b = b;
    }

    @Override
    public String toString() {
        return "Other bean X with " + b;
    }
}
