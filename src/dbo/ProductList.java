/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbo;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
public class ProductList extends Vector<Product>{

    public ProductList() {
        super();
    }
    
    public int find(int id){
        for (int i = 0; i < this.size(); i++) {
            if(id == this.get(i).getId()){
                return i;
            }
        }
        return -1;
    }
    
    public void loadFromDB(PE2018Access dbObj) {
        int id;
        String name;
        float price;
        String sql = "";
        sql = "Select * from products";
        try {
            ResultSet rs = dbObj.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt(1);
                name = rs.getString(2);
                price = rs.getFloat(3);
                this.add(new Product(id, name, price));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
