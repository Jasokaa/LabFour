/**
 * ConcreteVisitor implementing operations for specific types of objects.
 */
public class PowerCalculator implements Visitor
{
    private int totalPowerConsumed = 0;
    @Override
    public void visit(Processor processor)
    {
        totalPowerConsumed += processor.getPowerConsumption();
    }
    @Override
    public void visit(Memory memory)
    {
        totalPowerConsumed += memory.getPowerConsumption();
    }
    @Override
    public void visit(VideoCard videoCard)
    {
        totalPowerConsumed += videoCard.getPowerConsumption();
    }
    /**
     * Get the total power consumed.
     * @return The total power consumed.
     */
    public int getTotalPowerConsumed()
    {
        return totalPowerConsumed;
    }
}
