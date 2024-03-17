/**
 * ConcreteElement representing a Processor.
 */
public class Processor implements Element
{
    private int powerConsumption;
    public Processor(int powerConsumption)
    {
        this.powerConsumption = powerConsumption;
    }
    public int getPowerConsumption()
    {
        return powerConsumption;
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}