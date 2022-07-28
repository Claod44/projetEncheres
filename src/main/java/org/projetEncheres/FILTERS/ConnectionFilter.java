package org.projetEncheres.FILTERS;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.projetEncheres.OUTILS.ServletsAndFiltersTools;

/**
 * Servlet Filter implementation class ConnectionFilter
 * @author Claod
 */
public class ConnectionFilter extends HttpFilter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 3628935633270815083L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public ConnectionFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 * @author Claod
	 * {@summary Permet de filtrer les utilisateurs connectés selon les URI définis dans la web.xml lié à ce filtre }
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession(true);
		
		if(null==servletRequest.getSession().getAttribute("utilisateur"))
		{
			System.out.println("T'es pas co, je te kick vers l'accueil >_< !!");

			//TODO verifier que tout les messages transmis aux jsp commencent par "message_"
			ServletsAndFiltersTools.removeSessionMessages(session);
			session.setAttribute("message_utilisateur_non_connecte", "Merci de vous connecter pour accéder à cette page.");
			servletResponse.sendRedirect("/Accueil");
		} else {
			System.out.println("T'es co ^^ bienvenue sur les pages restreintes !");
			//TODO verifier que tout les messages transmis aux jsp commencent par "message_"
			ServletsAndFiltersTools.removeSessionMessages(session);
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
