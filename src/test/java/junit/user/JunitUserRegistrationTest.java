package junit.user;
import org.junit.Assert;
import org.junit.Test;

public class JunitUserRegistrationTest {
	    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

	    @Test
	    public void givenFirstName_IsProper_ReturnTrue() {
	        boolean actualResult = junitUserRegistration.firstName("Tom");
	        Assert.assertEquals(true, actualResult);
	    }

	    @Test
	    public void givenFirstName_IsProper_ReturnFalse() {
	        boolean actualResult = junitUserRegistration.firstName("tom");
	        Assert.assertEquals(false, actualResult);
	    }

	    @Test
	    public void givenLastName_IsProper_ReturnTrue() {
	        boolean actualResult = junitUserRegistration.lastName("Thomas");
	        Assert.assertEquals(true, actualResult);
	    }

	    @Test
	    public void givenLastName_IsNotProper_ReturnFalse() {
	        boolean actualResult = junitUserRegistration.lastName("thOmas");
	        Assert.assertEquals(false, actualResult);
	    }

	    @Test
	    public void givenEmailId_IsProper_ReturnTrue() {
	        boolean actualResult = junitUserRegistration.emailId("tom.thomas437@gmail.com");
	        Assert.assertEquals(true, actualResult);
	    }

	    @Test
	    public void givenEmailId_IsNotProper_ReturnFalse() {
	        boolean actualResult = junitUserRegistration.emailId("tom473gmail.com");
	        Assert.assertEquals(false, actualResult);
	    }

	    @Test
	    public void givenMobileNumber_IsProper_ReturnTrue() {
	        boolean actualResult = junitUserRegistration.mobileNumber("91 9158679678");
	        Assert.assertEquals(true, actualResult);
	    }

	    @Test
	    public void givenMobileNumber_IsNotProper_ReturnFalse() {
	        boolean actualResult = junitUserRegistration.mobileNumber("919875645674");
	        Assert.assertEquals(false, actualResult);
	    }


	    @Test
	    public void givenPassword_IsProper_ReturnTrue() {
	        boolean actualResult = junitUserRegistration.password("qw98hRL@&dl");
	        Assert.assertEquals(true, actualResult);
	    }

	    @Test
	    public void givenPassword_IsNotProper_ReturnFalse() {
	        boolean actualResult = junitUserRegistration.password("jsdjcvcp");
	        Assert.assertEquals(false, actualResult);
	    }
	}

