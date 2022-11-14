public class StaticVariable {

    private static int changeThis = 10;

    public StaticVariable() {}

    public void changeVar(int change) {
        this.changeThis = change;
    }

    public int showVar() {
        return this.changeThis;
    }

}
