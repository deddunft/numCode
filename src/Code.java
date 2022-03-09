import java.util.Arrays;

public class Code {
    private int[] codda;
    private int count;



    public Code() {
        this.codda = new int[5];
    }

    public String getCodda() {
        return Arrays.toString(codda);
    }

    public void setCodda(int[] codda) {
        this.codda = codda;
    }


    public void inCoda(int num){
        if (count==5){
            count=0;
        }
        codda[count]= num;
        count++;

    }

    @Override
    public String toString() {
        return "Code{" +
                "codda=" + Arrays.toString(codda) +
                ", count=" + count +
                '}';
    }
}
