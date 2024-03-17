/**
 * The Visitor interface defines a set of visitor methods, each of which corresponds to a specific operation.
 */
public interface Visitor
{
    /**
     * Visit method for Processor objects.
     * @param processor The Processor object to visit.
     */
    void visit(Processor processor);
    /**
     * Visit method for Memory objects.
     * @param memory The Memory object to visit.
     */
    void visit(Memory memory);
    /**
     * Visit method for VideoCard objects.
     * @param videoCard The VideoCard object to visit.
     */
    void visit(VideoCard videoCard);
}