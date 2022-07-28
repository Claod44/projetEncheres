package org.projetEncheres.OUTILS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Claod
 * {@summary Classe outil disposant de methodes statiques afin de vérifier / traiter les chaines de caractères type "email"}
 */
public class MailChecker {
	
	/**
	 * @author Claod
	 * {@summary Vérifie si la chaine en paramètre est un email acceptable et retourne un booléen en fonction du résultat }
	 * @param email
	 * @return
	 */
    public static boolean isEmailAdress(String email) {
        Pattern p = Pattern
                .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }
}
