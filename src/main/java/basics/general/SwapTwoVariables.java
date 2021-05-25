package basics.general;

public class SwapTwoVariables {

    public int[] swap(int num1,int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        return new int[]{num1,num2};
    }

    public String[] swap(String text1,String text2){
        // ** end index is excluded in substring
        text1=text1+text2;
        text2=text1.substring(0,text1.length()-text2.length());
        text1=text1.substring(text2.length(),text1.length());
        return new String[]{text1,text2};
    }

//    public static void main(String[] args){
//        swap(32,23);
//        swap(312312322,23);
//        swap("mahesh","harish");
//    }
}
