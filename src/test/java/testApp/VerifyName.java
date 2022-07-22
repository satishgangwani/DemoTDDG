package testApp;

import org.junit.Assert;
import org.junit.Test;

import devApp.CreateNameField;

public class VerifyName {
	
	CreateNameField obj = new CreateNameField();
	
	@Test
	public void verifyNameWithAlphabets()
	{
		String name = "Atos";
		Assert.assertTrue(obj.nameField(name));
	}
	
	@Test
	public void verifyNamewithDollar()
	{
		String name = "Atos$";
		Assert.assertFalse(obj.nameField(name));
	}
	
	@Test
	public void verifyNamewithExclamation()
	{
		String name = "Atos!";
		Assert.assertFalse(obj.nameField(name));
	}
	
	@Test
	public void verifyNamewithHash()
	{
		String name = "Atos#";
		Assert.assertFalse(obj.nameField(name));
	}
	
	@Test
	public void verifyNamewithNumbers()
	{
		String name = "Atos1";
		Assert.assertFalse(obj.nameField(name));
	}
	
	
	
	
}
