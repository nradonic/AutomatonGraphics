public class Square {
    int value = 0;
    public static final int white=0;
    public static final int black=1;

    Square(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        if (value==0){
            return "white";
        }
        return "black";
    }

}
