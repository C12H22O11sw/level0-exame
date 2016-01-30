/* Level 0 Exam: Coding  Exercise #1 */
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("what color would you like to chose?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(color.equalsIgnoreCase("red")){
			
			Tortoise.setPenColor(Colors.Reds.Crimson);
		}
		else if(color.equalsIgnoreCase("blue")){
			
			Tortoise.setPenColor(Colors.Blues.Blue);
		}
		else if(color.equalsIgnoreCase("green")){
			
			Tortoise.setPenColor(Colors.Greens.Green);
		}
		else if(color.equalsIgnoreCase("yellow")){
			
			Tortoise.setPenColor(Colors.Yellows.Yellow);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for(int i = 0; i< 4; i++){
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}
}





