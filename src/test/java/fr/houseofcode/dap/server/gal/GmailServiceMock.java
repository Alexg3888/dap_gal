/**
 * 
 */
package fr.houseofcode.dap.server.gal;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

import fr.houseofcode.dap.server.gal.google.GmailService;

/**
 * @author aga
 *
 */
public class GmailServiceMock implements GmailService {

    /**
     * Mock : Afficher les emails non lus de la boite GMAIL.
     * @param userKey 
     * @return Unread emails (les emails non lus de la boite GMAIL).
     * @throws IOException.
     * @throws GeneralSecurityException.
     */
    @Override
    public Integer getNbUnreadEmails(String userKey) throws IOException, GeneralSecurityException {

        return 12;
    }

    public void getLabels(String userKey) throws IOException, GeneralSecurityException {

        List<String> data = new ArrayList<String>();
        data.add("Bouchon1");
        data.add("Bouchon2");
    }
}
