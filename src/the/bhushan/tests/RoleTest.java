package the.bhushan.tests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import the.bhushan.Role;

public class RoleTest {
	@Test
	public void testRoleStatus() {
		Role role = new Role();
		Role role1 = new Role();
		role.setStatus("A");
		Assert.assertEquals("Status of role doesn't match.", "A",
				role.getStatus());
	}
	
	@Test
	public void testRoleCommands() {
		Role role = new Role();
		List<String> commands = new ArrayList<String>();
		commands.add("the");
		role.setCommands(commands);
		Assert.assertEquals("inserted cmd is not matched to popped cmd.", "the", role.getCommands().get(0));
		role.getCommands().retainAll(commands);
	}
}
