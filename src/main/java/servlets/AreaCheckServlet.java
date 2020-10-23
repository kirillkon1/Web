package main.java.servlets;


import main.java.models.Entries;
import main.java.models.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet("/area_check")
public class AreaCheckServlet extends HttpServlet {

    // Переопределение doGet и doPost запросов

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double x = 0;
        double y = 0;
        double r = 0;

        try {
            x = Utils.getDoubleParameter(request, "x");
            y = Utils.getDoubleParameter(request, "y");
            r = Utils.getDoubleParameter(request, "r");
        } catch (NumberFormatException ignored) {
        }

        boolean result = getResult(x, y, r);
        Date currentTime = new Date();

        Entry entry = new Entry(x, y, r, result, currentTime);

        HttpSession session = request.getSession();

        Entries entries = (Entries) session.getAttribute("entries");
        entries = entries == null ? new Entries() : entries;

        entries.addEntry(entry);
        session.setAttribute("entries", entries);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    // Проверка X, Y, R на принадлежность графику

    private boolean getResult(double x, double y, double r) {
        return inFirstQuarter(x, y, r) || inSecondQuarter(x, y, r) || inThirdQuarter(x, y, r);
    }

    private boolean inFirstQuarter(double x, double y, double r){
        return ((x >= 0) &&
                (y >= 0) &&
                (y <= r) &&
                (x <= r / 2) &&
                (x / 2 + y <= r));
    }

    private boolean inSecondQuarter(double x, double y, double r){
        return ((x <= 0) &&
                (y >= 0) &&
                (y <= r) &&
                (x >= -r));
    }

    private boolean inThirdQuarter(double x, double y, double r){
        return ((x <= 0) &&
                (y <= 0) &&
                (x * x + y * y <= r * r));
    }
}