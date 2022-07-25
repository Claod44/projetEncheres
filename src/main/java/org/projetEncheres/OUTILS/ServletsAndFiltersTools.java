package org.projetEncheres.OUTILS;

import java.util.Collections;

import jakarta.servlet.http.HttpSession;

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
