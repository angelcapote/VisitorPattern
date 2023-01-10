public class TaxVisitor implements Visitor{
    public TaxVisitor(){

    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor Item: Price with Tax");
        return ((liquorItem.getPrice() * .18) + liquorItem.getPrice());

    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco Item: Price with Tax");
        return ((tobaccoItem.getPrice() * .18) + tobaccoItem.getPrice());
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item: Price with Tax");
        return ((necessityItem.getPrice() * .18) + necessityItem.getPrice());
    }
}
