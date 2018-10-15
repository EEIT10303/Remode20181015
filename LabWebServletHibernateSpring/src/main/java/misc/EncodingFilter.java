package misc;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(
		urlPatterns={"/*"}
)
public class EncodingFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
<<<<<<< HEAD

		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
=======

		System.out.println("1!");
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
		System.out.println("Hello");
		System.out.println("Hi!!");

>>>>>>> branch 'master' of https://github.com/EEIT10303/Remode20181015.git
	}
	private FilterConfig filterConfig;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}
	@Override
	public void destroy() {

	}
}
