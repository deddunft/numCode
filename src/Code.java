import java.util.Arrays;

public class Code {
    private int[] codda;
    private int count =0;
    private int count2 =1;



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
        if (count==0){
            codda[0]=num;
        }


     if (count>0){
         codda[count]=codda[count-1];
         codda[count-1]=codda[0];
         codda[0]=num;
     }
             count++;

    }

    public int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Code{" +
                "codda=" + Arrays.toString(codda) +
                ", count=" + count +
                '}';
    }
}
