package com.first;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Portlet implementation class FirstController
 */
@Controller(value = "FirstController")
@RequestMapping("VIEW")
public class FirstController{
 
	@RenderMapping
	public String handleRenderRequest(
			RenderRequest request,
			RenderResponse response,
			Model model){
		return "view";
	}

}
