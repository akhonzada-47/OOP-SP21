
package Assignment.Assign1;

public class Runner
{
    public static void main(String[] args)
    {
        Book b = new Book(" 'The Fault in Our Stars' ", 5.02, 320);
        Tape t = new Tape(" 'Perfect' ", 3.0, 3.58);
        
        System.out.println("\tBook,");
        b.display();
        System.out.println("\n\tTape,");
        t.display();
    }
}
