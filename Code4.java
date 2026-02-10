public class Code4{
    public static void main(String[] args){
        String S = "java,python,C";
        String[] arr = S.split(",");
        for(String lang:arr){
            System.out.println(lang);
        }
    }
}