/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84346
 */
public class Database {
    public static void main(String[] args) {
          try {
            Connection kn = Connect.connectDaTaBase();
            if(kn == null) {
                System.out.println("Ket noi that bai");
            } else {
                System.out.println("Ket noi thanh cong");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
