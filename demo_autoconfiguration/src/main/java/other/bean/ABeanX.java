package other.bean;

public class ABeanX {
    private ABean b;
    public ABeanX(ABean b){
        this.b = b;
    }

    @Override
    public String toString() {
        return "A bean X with " + b;
    }
}
