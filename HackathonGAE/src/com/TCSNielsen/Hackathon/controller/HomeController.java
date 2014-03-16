package com.TCSNielsen.Hackathon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller class to handle the request and response related to the general
 * game details along with authentication/authorization process.
 * 
 * @author Prasanna Parthasarathy
 * 
 */
@Controller
public class HomeController extends BaseController {

	/**
	 * Method to handle the requests to the login screen.
	 * 
	 * @param request
	 *            - HTTP Servlet Request.
	 * @param response
	 *            - HTTP Servlet Response.
	 * @return - Model And View containing the home page details.
	 * @throws Exception
	 */
	@RequestMapping("/home.hck")
	public ModelAndView displayLoginPage(
			@RequestParam(required=false) String barCode,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LOGGER.debug("Entering into displayLoginPage method in the HomeController class");
		ModelAndView mav = new ModelAndView();
		if (null != barCode) {
			mav.addObject("barCodeValue", barCode);
		}
		mav.setViewName("home");
		LOGGER.debug("Exit from displayLoginPage method in the HomeController class");
		return mav;
	}

	/**
	 * Method to handle the requests to the product search page.
	 * 
	 * @param request
	 *            - HTTP Servlet Request.
	 * @param response
	 *            - HTTP Servlet Response.
	 * @return - Model And View containing the home page details.
	 * @throws Exception
	 */
	@RequestMapping("/search.hck")
	public ModelAndView search(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LOGGER.debug("Entering into search method in the HomeController class");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("search");
		LOGGER.debug("Exit from displayHomePage method in the HomeController class");
		return mav;
	}

	/**
	 * Method to handle the requests to the about us page.
	 * 
	 * @param request
	 *            - HTTP Servlet Request.
	 * @param response
	 *            - HTTP Servlet Response.
	 * @return - Model And View containing the about us page details.
	 * @throws Exception
	 */
	@RequestMapping("/aboutUs.hck")
	public ModelAndView displayAboutUsPage(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LOGGER.debug("Displaying AboutUs page from HomeController class");
		return new ModelAndView("aboutUs");
	}

	/**
	 * Method to handle the requests for the BarCode Reader screen (Mobile
	 * Only).
	 * 
	 * @param request
	 *            - HTTP Servlet Request.
	 * @param response
	 *            - HTTP Servlet Response.
	 * @return - Model And View containing the about us page details.
	 * @throws Exception
	 */
	@RequestMapping("/barcodeReader.hck")
	public ModelAndView invokeBarCodeScanner(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LOGGER.debug("Displaying BarCode Scanner page from HomeController class for mobile devices");
		return new ModelAndView("barCodeScanner");
	}

}