/**
 * ConcreteElement representing Memory.
 */
public class Memory implements Element
{
    private int powerConsumption;
    public Memory(int powerConsumption)
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
