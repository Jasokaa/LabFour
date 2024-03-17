/**
 * The Main class demonstrates the use of the Visitor pattern to calculate
 * the total power consumed by a computer system.
 */
public class Main
{
    /**
     * The main method of the program.
     * Creates elements of the computer structure, creates a visitor to calculate
     * power consumption, and applies the visitor to the object structure.
     * Prints the total power consumed by the computer.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args)
    {
        Processor processor = new Processor(50);
        Memory memory = new Memory(30);
        VideoCard videoCard = new VideoCard(80);
        ComputerStructure computer = new ComputerStructure(processor, memory, videoCard);
        // Create visitor
        PowerCalculator powerCalculator = new PowerCalculator();
        computer.accept(powerCalculator);
        // Get total power consumed
        int totalPowerConsumed = powerCalculator.getTotalPowerConsumed();
        System.out.println("Total power consumed by the computer: " + totalPowerConsumed);
    }
}