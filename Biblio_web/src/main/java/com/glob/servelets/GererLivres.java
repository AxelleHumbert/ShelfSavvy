package com.glob.servelets;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.glob.facade.AuteurFacade;
import com.glob.facade.GenreFacade;
import com.glob.facade.LivreFacade;
import com.glob.facade.StatutFacade;
import com.glob.modeles.AuteurVO;
import com.glob.modeles.GenreVO;
import com.glob.modeles.LivreVO;
import com.glob.modeles.StatutVO;

/**
 * Servlet implementation class GererLivres
 */
@WebServlet("/GererLivres")
public class GererLivres extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GererLivres() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 *
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LivreFacade oLivreFacade = new LivreFacade();
		Vector<LivreVO> mvLivres = oLivreFacade.chargerLivres();
		
		AuteurFacade oAuteurFacade = new AuteurFacade();
		Vector<AuteurVO> mvAuteurs = oAuteurFacade.chargerAuteur();
		
		GenreFacade oGenreFacade = new GenreFacade();
		Vector<GenreVO> mvGenres = oGenreFacade.chargerGenres();
		
		StatutFacade oStatutFacade = new StatutFacade();
		Vector<StatutVO> mvStatut = oStatutFacade.chargerStatut();
		
		request.setAttribute("mvLivres", mvLivres);
		request.setAttribute("mvAuteurs", mvAuteurs);
		request.setAttribute("mvGenres", mvGenres);
		request.setAttribute("mvStatut", mvStatut);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/GererLivres.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
