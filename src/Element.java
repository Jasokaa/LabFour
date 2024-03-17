/**
 * The Element interface defines the accept() method, accepting a Visitor as a parameter.
 */
public interface Element
{
    /**
     * Accept method to allow a Visitor to visit this Element.
     * @param visitor The Visitor to accept.
     */
    void accept(Visitor visitor);
}
