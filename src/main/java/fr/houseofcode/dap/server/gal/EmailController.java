package fr.houseofcode.dap.server.gal;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.houseofcode.dap.server.gal.google.GmailService;

/**
 * @author Alex
 *
 */
@RestController
public class EmailController {

    private static final Logger LOG = LogManager.getLogger();

    @Autowired
    private GmailService gservice;

    @RequestMapping("/email/nbunread")
    public Integer displayUnreadEmail(@RequestParam("userKey") String toto)
            throws IOException, GeneralSecurityException {

        LOG.info("Affichage du nombre d'email pour l'utilisateur : " + toto);

        return gservice.getNbUnreadEmails(toto);
    }

    public void setService(final GmailService gmailService) {
        this.gservice = gmailService;
    }
}
