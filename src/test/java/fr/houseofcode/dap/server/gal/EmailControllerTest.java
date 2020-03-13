package fr.houseofcode.dap.server.gal;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.junit.Assert;
import org.junit.Test;

public class EmailControllerTest {

    @Test
    public void testDisplayNbUnreadEmail() throws IOException, GeneralSecurityException {

        // Init Data
        EmailController ec = new EmailController();
        ec.setService(new GmailServiceMock());

        // Appel de la méthode
        Integer result = ec.displayUnreadEmail("AlexG");

        // Controle de l'éxécution de la méthode
        Integer expectedNbEmail = 12;
        Assert.assertNotNull("Nombre d'email non présent", result);
        Assert.assertEquals(expectedNbEmail, result);
    }
}
