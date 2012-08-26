package BastiMax.AppTest.dev;

import android.widget.TextView;

public class Console {
	
	public static TextView  console = null;
	public static int Lines = 17;
	
	public static void initConsole(TextView console1)
	{
		Console.console = console1;
		Console.console.setTextColor(android.graphics.Color.WHITE);
	}
	
	public static void initConsole(TextView console1, int Lines)
	{
		Console.initConsole(console1);
		Console.Lines = Lines;
	}
	
	public static void Write(String Text)
	{
		Console.ForceWrite(Text);
	}
	
	public static void WriteLine(String Text)
	{
			 Console.Write(Text + "\n");
	}
	
	private static void ForceWrite(String Text)
	{
		if(console==null) return;
		
		String tmp1 = Console.console.getText() + Text;
		String[] tmp = tmp1.split("\n");
		tmp1 = "";
		if(tmp.length > Console.Lines)
		{
			for(int i = 1; i < tmp.length; ++i)
			{
				tmp1 += tmp[i] + "\n";
			}
			Console.console.setText(tmp1);
		}
		else Console.console.setText(Console.console.getText() + Text);
	}

}
