public class StaticVariableTest {


    public static void main(String[] args) {
        StaticVariable varStatOne = new StaticVariable();
        StaticVariable varStatTwo = new StaticVariable();


        System.out.println(varStatOne.showVar());
        varStatOne.changeVar(20);
        System.out.println(varStatTwo.showVar());
    }
}
