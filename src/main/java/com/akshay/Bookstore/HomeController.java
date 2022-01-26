package com.akshay.Bookstore;

import com.akshay.Bookstore.model.Inquiry;
import com.akshay.Bookstore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }
    @GetMapping("/about.html")
    public String about(){
        return "about.html";
    }
    @GetMapping("/cart.html")
    public String cart(){
        return "cart.html";
    }
    @GetMapping("/checkout.html")
    public String checkout(){
        return "checkout.html";
    }
    @GetMapping("/contact.html")
    public String contact(){
        return "contact.html";
    }
    @GetMapping("/product.html")
    public String product(Model model){

        model.addAttribute("products", homeService.getProduct());
        return "product.html";
    }
    @GetMapping("/shop.html")
    public String shop(){
        return "shop.html";
    }
    @PostMapping("/product.html")
    public String searchProduct(Model model, @ModelAttribute Inquiry inquiry){

        String productName = inquiry.getSearchString();


        model.addAttribute("products", homeService.searchedProduct(productName));
        return "product.html";
    }
}
