public class Timebom
{

    public static void main(String[] args)  throws InterruptedException {

        {
            int counter = 20;
            do
            {
                System.out.println(counter + " Dit is de tijd tot de bom ontploft");
                counter--;
                Thread.sleep(1500);
            } while (counter !=0);
            System.out.println("KABOOM!");
        }
    }
}