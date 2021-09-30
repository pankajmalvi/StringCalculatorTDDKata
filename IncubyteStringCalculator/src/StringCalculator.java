

//public class IncubyteStringCalculator {
//    public static void main(String args){
//        System.out.println("''" + Add(""));
//        System.out.println("1" + Add("1"));
//        System.out.println("2" + Add("2"));
//        System.out.println("1,2" + Add("1,2"));
//        Add("");
//
//    }
//    static int Add(String number){
//        int sum = 0;
////        try{
////            sum += Integer.parseInt(number);
////        }catch (Exception e){
////            sum = 0;
////        }
//        return sum;
//    }
//
//}
public class StringCalculator {
    private String name;
    public StringCalculator(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    StringCalculator stringCalculator= new StringCalculator("Hello");
}