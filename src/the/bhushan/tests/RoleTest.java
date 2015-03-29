package the.bhushan.tests;

import junit.framework.Assert;

import org.junit.Test;

import the.bhushan.Role;

public class RoleTest {
	@Test
	public void testRoleStatus() {
		Role role = new Role();
		role.setStatus("A");
		Assert.assertEquals("Status of role doesn't match.", "A",
				role.getStatus());
	}
}
