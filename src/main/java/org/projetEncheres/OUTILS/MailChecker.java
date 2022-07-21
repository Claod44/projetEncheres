package org.projetEncheres.OUTILS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailChecker {
    public static boolean isEmailAdress(String email) {
        Pattern p = Pattern
                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }
}
