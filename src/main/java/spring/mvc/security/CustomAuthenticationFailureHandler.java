package spring.mvc.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler{

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		if(exception.getClass().isAssignableFrom(SessionAuthenticationException.class)) {
			response.sendRedirect(request.getServletContext().getContextPath()+"/login?message=max_session");
			return;
		}
		response.sendRedirect(request.getServletContext().getContextPath()+"/login?message=error");
	}

}
