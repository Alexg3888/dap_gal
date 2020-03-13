package fr.houseofcode.dap.server.gal.google;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface GmailService {
    /**
     * Display unread emails (Afficher les emails non lus de la boite GMAIL).
     * @param userKey 
     * @return Unread emails (les emails non lus de la boite GMAIL).
     * @throws IOException.
     * @throws GeneralSecurityException.
     */
    Integer getNbUnreadEmails(String userKey) throws IOException, GeneralSecurityException;
}
