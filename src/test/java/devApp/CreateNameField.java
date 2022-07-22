package devApp;

public class CreateNameField {
	
	public boolean nameField(String name)
	{
		if(name.contains("$") || name.contains("!") || name.contains("#"))
		{
			return false;
		}
		
		else if(name.contains("1"))
		{
			return false;
		}
		
		return true;
	}

}
