public class Main {
    public static void main(String[] args) {

        //Задание 1
        int [] w = new int[]{1,2,3};
        float[] wer = {1.57f,7.654f,9.986f};
        int[]footwear = {8,15,26};

        //Задание 2
        for (int i=0; i<w.length; i++){
            if(i<w.length-1){
                System.out.print(w[i]+",");
            }else{
                System.out.println(w[i]);
            }
        }

        for (int i=0;i<wer.length;i++){
            if(i<wer.length-1){
                System.out.print(wer[i]+",");
            }else{
                System.out.println(wer[i]);
            }
        }

        for (int i=0;i<footwear.length;i++){
            if(i<footwear.length-1){
                System.out.print(footwear[i]+",");
            }else{
                System.out.println(footwear[i]);
            }
        }

        System.out.println();

        //Задание 3
        for (int i=w.length-1; i>=0; i--){
            if(i==0){
                System.out.println(w[i]);
            }else{
                System.out.print(w[i]+",");
            }
        }

        for (int i=wer.length-1; i>=0; i--){
            if(i==0){
                System.out.println(wer[i]);
            }else{
                System.out.print(wer[i]+",");
            }
        }

        for (int i=footwear.length-1; i>=0; i--){
            if(i==0){
                System.out.println(footwear[i]);
            }else{
                System.out.print(footwear[i]+",");
            }
        }

        System.out.println();

        //Задание 4
        for (int i=0; i<w.length; i++){
            if(w[i] %2!=0){
                w[i]=w[i]+1;
            }
            System.out.print(w[i]+ " ");
        }

    }
}
