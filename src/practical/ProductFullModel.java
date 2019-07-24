/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical;
import dbo.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tnnh
 */
public class ProductFullModel extends AbstractTableModel{

    ProductList productList = null;

    public ProductFullModel(ProductList list) {
        this.productList = list;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }
    
    
    @Override
    public int getRowCount() {
        return productList.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
     public String getColumnName(int column){
         String columnName = "";
        switch(column){
            case 0: columnName = "ID";break;
            case 1: columnName = "Name";break;
            case 2: columnName = "Price";break;
        }
        return columnName;
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = productList.get(rowIndex);
        Object obj = null;
        switch(columnIndex){
            case 0: obj = product.getId();break;
            case 1: obj = product.getName();break;
            case 2: obj = product.getPrice();break;
        }
        return obj;
    }
    
}
