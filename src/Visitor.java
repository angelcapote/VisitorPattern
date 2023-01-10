public interface Visitor {
    // Created to automatically use the right
    // code based on the Object sent
    // Method Overloading

    public double visit(Liquor liquorItem);
    public double visit(Tobacco tobaccoItem);
    public double visit(Necessity necessityItem);

}
