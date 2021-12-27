public class Override {
    static class no1{
        public static int Result(){
            int sum = 0;
            for(int i=1;i<=3;i++){
                sum+=i;
            }
            return sum;
        }
    }
    static class no2 extends no1{
        public static int Result(){
            int sum = 0;
            for(int i=3;i<=6;i++){
                sum+=i;
            }
            return sum;
        }
    }
    static class no3 extends no1{
        public static int Result(){
            int sum = 0;
            for(int i=6;i<=9;i++){
                sum+=i;
            }
            return sum;
        }
    }
    static class no4 extends no1{
        public static int Result(){
            int sum = 0;
            for(int i=9;i<=12;i++){
                sum+=i;
            }
            return sum;
        }
    }
    public static void main(String args[]){
        System.out.println(no1.Result());
        System.out.println(no2.Result());
        System.out.println(no3.Result());
        System.out.println(no4.Result());
    }
}
