package com.virtualadrian.pogen;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller(value = "/generate")
public class GenerateController {

    static public final String driver = "com.mysql.jdbc.Driver";
    static public final String connection =
            "jdbc:mysql://localhost:13306/appdb";
    static public final String user = "appdbuser";
    static public final String databasepass = "P@ssword1";


    @RequestMapping(value="/table", method=RequestMethod.GET)
    public String greetingSubmit(Model model) {

        List<DatabaseTable> allTables = null;
        try {
            allTables = this.getTables();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        model.addAttribute("allTables", allTables);
        return "tables";

    }

    public List<DatabaseTable> getTables() throws SQLException, ClassNotFoundException {

        ArrayList<DatabaseTable> tableNames = new ArrayList<>();

        Class.forName(driver);
        try (Connection conn = DriverManager.getConnection(connection, user, databasepass)) {//Statement st = conn.createStatement();

            DatabaseMetaData md = conn.getMetaData();
            ResultSet rs = md.getTables(null, null, "%", null);

            // list of tables to POJO
            while (rs.next()) {
                tableNames.add(new DatabaseTable(rs.getString(3)));
            }


        } catch (Exception e) {
            System.out.println(e);
        }


        return tableNames;

    }



    //    public Object processMetaData(DatabaseMetaData dbmd) throws SQLException {
    //
    //        ResultSet rs = dbmd.getTables(dbmd.getUserName(), null, null, new String[]{"TABLE"});
    //
    //        ArrayList tableNameList = new ArrayList();
    //
    //        while (rs.next()) {
    //            tableNameList.add(rs.getString(3));
    //        }
    //
    //        return tableNameList;
    //    }
    //
    //


}

