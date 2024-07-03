package controllador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl3;

public class controladorUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public controladorUsuario() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        TblUsuariocl3 usuario = new TblUsuariocl3();
        usuario.setUsuariocl3(username);

        TblUsuariocl3 usuarioEncontrado = ClassUsuarioImp.BuscarUsuario(usuario);

        if (usuarioEncontrado != null) {
            if (usuarioEncontrado.getPasswordcl3().equals(password)) {
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usuarioEncontrado);
                response.sendRedirect(request.getContextPath() + "/index.jsp");
            } else {
                // Contraseña incorrecta
                String mensajeError = "Usuario o contraseña incorrectos";
                request.setAttribute("mensaje", mensajeError);
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } else {
            // Usuario no encontrado
            String mensajeError = "Usuario o contraseña incorrecta";
            request.setAttribute("mensaje", mensajeError);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}