/**
 * ConcreteElement representing a VideoCard.
 */
public class VideoCard implements Element
{
    private int powerConsumption;
    public VideoCard(int powerConsumption)
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