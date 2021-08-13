package Service;

import Models.Product;

import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> List=new ArrayList<Product>();
    public ProductService(){
        List.add(new Product(1,"TI VI",2000,"Xuat xu nhat ban"));
    }
    public void Create(Product Product){
        List.add(Product);
    }
    public void editProduct(int index,Product Product){
        List.set(index,Product);
    }
    public void remove(int index){
        List.remove(index);
    }
}
