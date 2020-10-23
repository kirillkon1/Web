package main.java.servlets;

import javax.servlet.http.HttpServletRequest;

public class Utils {
    public static double getDoubleParameter(HttpServletRequest request, String parameter) {
        return Double.parseDouble(request.getParameter(parameter).replace(",", "."));
    }
}