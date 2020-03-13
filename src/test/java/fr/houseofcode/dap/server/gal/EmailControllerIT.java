package fr.houseofcode.dap.server.gal;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.junit.Assert;
import org.junit.Test;

import fr.houseofcode.dap.server.gal.google.GmailServiceImpl;

public class EmailControllerIT {

    @Test
    public void testDisplayNbUnreadEmail() throws IOException, GeneralSecurityException {

        // Init Data
        EmailController ec = new EmailController();
        ec.setService(new GmailServiceImpl());

        // Appel de la méthode
        Integer result = ec.displayUnreadEmail("AlexG");

        // Controle de l'éxécution de la méthode
        Assert.assertNotNull("Nombre d'email non présent", result);
    }
}
