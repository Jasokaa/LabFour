/**
 * ObjectStructure class that stores a collection of element objects and provides an interface for visitors to interact with those objects.
 */
public class ComputerStructure
{
    private Element[] elements;
    /**
     * Constructor for ComputerStructure.
     * @param elements The elements to store in the structure.
     */
    public ComputerStructure(Element... elements)
    {
        this.elements = elements;
    }
    /**
     * Accepts a Visitor and applies it to all elements in the structure.
     * @param visitor The Visitor to apply.
     */
    public void accept(Visitor visitor)
    {
        for (Element element : elements)
        {
            element.accept(visitor);
        }
    }
}