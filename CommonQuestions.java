public class CommonQuestions {
    public int factorial(int n)  {
        if(n == 1) return 1;
        else return n * factorial(n-1);
    }

    public static void main(String[] args) {
        CommonQuestions cq = new CommonQuestions();
        System.out.println(cq.factorial(5));
    }
}
