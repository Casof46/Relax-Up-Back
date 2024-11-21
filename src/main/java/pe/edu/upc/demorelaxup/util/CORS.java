package pe.edu.upc.demorelaxup.util;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORS implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// Inicialización si es necesaria
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;

		// Especifica la URL de tu frontend aquí
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/usuarios");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/usuarios/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/rol");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/rol/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/eventos");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/eventos/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/foross");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/foross/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/mensajeforos");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/mensajeforos/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/rutina");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/rutina/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/UsuarioRutina");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/UsuarioRutina/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/ejerciciorutinas");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/ejerciciorutinas/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/emergencias");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/emergencias/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/tecnicasrelajacion");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/tecnicasrelajacion/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/planes");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/planes/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/metodos");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/metodos/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/suscripciones");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/suscripciones/nuevo");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/gatos");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes/totalingresos");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes/emergencias");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes/reporte-confirmaron");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes/reporte-progreso");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes/suscripciones");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes/Forosporusuario");
		response.setHeader("Access-Control-Allow-Origin", "https://relaxupfrontenddeploy.vercel.app/reportes/Mensajeporforo");
		response.setHeader("Access-Control-Allow-Methods", "DELETE, GET, OPTIONS, PATCH, POST, PUT");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers",
				"x-requested-with, authorization, Content-Type, Authorization, credential, X-XSRF-TOKEN");

		// Manejo de solicitudes OPTIONS
		if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			chain.doFilter(req, res);
		}
	}

	@Override
	public void destroy() {
		// Código de limpieza si es necesario
	}
}
//spring.datasource.url=jdbc:postgresql://localhost/basedatosrelaxup
//spring.datasource.username=postgres
//spring.datasource.password=040402