
public class NonStaticMethod {
    int sum(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        NonStaticMethod obj1 = new NonStaticMethod();
        int result = obj1.sum(20, 30);
        System.out.println(result);
    }
}
