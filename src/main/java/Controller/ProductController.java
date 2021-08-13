package Controller;

import Models.Product;
import Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class ProductController {
    ProductService ProductService=new ProductService();
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("show","ListProduct",ProductService.List);
        return modelAndView;
    }
    @GetMapping("/remove/{index}")
    public ModelAndView remove(@PathVariable int index){
        ArrayList<Product> List=ProductService.List;
        List.remove(index);
        return new ModelAndView("show","ListProduct",List);

    }
    @GetMapping("/edit/{index}")
    public ModelAndView editindex(@PathVariable int index){
        return new ModelAndView("edit","Index",index);
    }
    @PostMapping("/edit/{index}")
    public ModelAndView edit(@PathVariable int index, @ModelAttribute Product Product){
        System.out.println(index);
        System.out.println(Product.toString());
        ProductService.editProduct(index,Product);
        return new ModelAndView("show","ListProduct", ProductService.List);

    }
    @RequestMapping("/create")
    public String getCreate(){
        return "create.html";
    }
    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Product product){
        ProductService.Create(product);
        return new ModelAndView("show","ListProduct",ProductService.List);
    }
}
