package org.projetEncheres.OUTILS;

import java.util.Collections;

import jakarta.servlet.http.HttpSession;

/**
 * 
 * @author Claod
 * {@summary Classe outil permettant de rassember des fonctions statiques utiles de façon communes dans les Fitres et les Servlets }
 */
public class ServletsAndFiltersTools {

    
    public static void removeSessionMessages(HttpSession session) {
    	for (String messageName : Collections.list(session.getAttributeNames())) {
			if(messageName.contains("message_")) {
				System.out.println("message name removed : "+messageName);
				session.removeAttribute(messageName);
			}
		}
    }
}
