
package Controllers;

import Objects.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.*;
import javax.servlet.http.HttpServletRequest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
;

@ManagedBean(name = "userController")
@SessionScoped
public class UserController {
    
    private String email;
    private String password;
    private Boolean flag = true;
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Producto> carrito = new ArrayList<>();
    
    public UserController(){
    }
    public UserController(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    @PostConstruct
    public void init() {
        llenar();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPasword(String password) {
        this.setPassword(password);
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }
    
    public void goToLandingPage(){
        this.redirect("/faces/landingPage.xhtml");
    }
    
    public void goToCreateAccount(){
        this.redirect("/faces/createAccount.xhtml");
    }
    
    public void goToIndex(){
        this.redirect("/faces/index.xhtml");
    }
    
     public void redirect(String rute) {
        HttpServletRequest request;
        try {
            request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
            FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath() + rute);
        } catch (Exception e) {

        }
    }
     
     public void confirmar() {
        addMessage("Confirmado", "haz aceptado");
    } 
     
     public void comprar() {
        addMessage("Confirmado", "Nuestros operadores se estarán poniendo en contacto lo más pronto posible");
    } 
     public void añadirCarrito(int id){
         
         for (Producto pro : listaProductos){
            if(pro.getId() == id){
                carrito.add(pro);
                addMessage("Confirmado", "Haz añadido el producto correctamernte");
            }
         }
     } 
     
     public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

   public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
   
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    private void llenar(){
        
        listaProductos.add(new Producto(1000, "f230fh0g3", " Arctic Alpine 17 CO - Intel ", "Product Description", 65, "Accessories", 24, 5));
        listaProductos.add(new Producto(1001, "nvklal433", " i 14900k ", "Product Description", 72, "Accessories", 61, 5));
        listaProductos.add(new Producto(1002, "zz21cz3c1", " Redragon CCW-3013 - 360mm -Negro ", "Product Description", 79,"Fitness", 2, 5));
        listaProductos.add(new Producto(1003, "244wgerg2", " Aerocool Force 12 - Negro - Molex + 3 pines ", "Product Description", 29,"Clothing", 25, 5));
        listaProductos.add(new Producto(1004, "h456wer53", " 4070 Ti Super ", "Product Description", 15,"Accessories", 73, 5));
        listaProductos.add(new Producto(1005, "av2231fwg", " MSI Geforce RTX 3050 Low Profile 6 GB ", "Product Description", 120,"Accessories", 0, 5));
        listaProductos.add(new Producto(1006, "bib36pfvm", " Aerocool Saturn 12F ARGB - Conector 6 pines ", "Product Description", 32,"Accessories", 5, 5));
        listaProductos.add(new Producto(1007, "mbvjkgip5", " T-Dagger Geometry M T-TMP201 ", "Product Description", 34,"Accessories", 23, 5));
        listaProductos.add(new Producto(1008, "vbb124btr", " Control de Ventiladores Aerocool H66F ", "Product Description", 99,"Electronics", 2, 5));
        listaProductos.add(new Producto(1009, "cm230f032", " Montura UNNO TEKNO para TV - 42'' - TM8043BK ", "Product Description", 299,"Electronics", 63, 5));
        listaProductos.add(new Producto(1010, "plb34234v", " Xiaomi TV A Pro 55 2025 - 55 pulgadas - 4K - QLED ", "Product Description", 24,"Accessories", 0, 5));
        listaProductos.add(new Producto(1011, "4920nnc2d", " Extreme PC Level 4 PRO AMD ", "Product Description", 89,"Electronics", 23, 5));
        listaProductos.add(new Producto(1012, "250vm23cc", " Aerocool Duo 12 Pro ARGB - 120mm PWM  ", "Product Description", 49,"Clothing", 74, 5));
        listaProductos.add(new Producto(1013, "fldsmn31b", " DarkFlash DK352 blanco ", "Product Description", 48,"Clothing", 0, 5));
        listaProductos.add(new Producto(1014, "waas1x2as", " Kit Camara Trasera para Vehiculo Hirige R01 ", "Product Description", 175,"Electronics", 8, 5));
        listaProductos.add(new Producto(1015, "vb34btbg5", " Webcam Argom CAM20 ", "Product Description", 49,"Clothing", 34, 5));
        listaProductos.add(new Producto(1016, "k8l6j58jl", " Extreme PC Moba lite ", "Product Description", 79,"Fitness", 12, 5));
        listaProductos.add(new Producto(1017, "v435nn85n", " APC BVX1200L-LM - 1200VA ", "Product Description", 85,"Clothing", 42, 5));
        listaProductos.add(new Producto(1018, "09zx9c0zc", " Kingston Fury Beast RGB 8GB DDR5 5600 ", "Product Description", 56,"Accessories", 41, 5));
        listaProductos.add(new Producto(1019, "mnb5mb2m5", " Thermaltake Smart 600W 80 Plus RGB ", "Product Description", 79,"Fitness", 63, 5));
        listaProductos.add(new Producto(1020, "r23fwf2w3", " Sapphire PULSE AMD Radeon RX 7700 XT 12GB ", "Product Description", 110, "Accessories", 0, 5));
        listaProductos.add(new Producto(1021, "pxpzczo23", " ENCAPSULADOR UNNO TEKNO 2.5' A USB 2.0 ", "Product Description", 79, "Fitness", 6, 5));
        listaProductos.add(new Producto(1022, "2c42cb5cb", " Genius NX-7009 - Inalambrico - Blanco gris ", "Product Description", 45, "Accessories", 62, 5));
        listaProductos.add(new Producto(1023, "5k43kkk23", " Mouse Xtech - XTM165 ", "Product Description", 49, "Clothing", 2, 5));
        listaProductos.add(new Producto(1024, "lm2tny2k4", " Adata Legend 960 4TB ", "Product Description", 64, "Clothing", 0, 5));
        listaProductos.add(new Producto(1025, "nbm5mv45n", " Gigabyte H610M H DDR4 ", "Product Description", 78, "Clothing", 52, 5));
        listaProductos.add(new Producto(1026, "zx23zc42c", " MSI A520M-A PRO ", "Product Description", 49, "Clothing", 3, 5));
        listaProductos.add(new Producto(1027, "acvx872gc", " Xiaomi Redmi A3 - 4 GB RAM 128GB ", "Product Description", 89, "Electronics", 35, 5));
        listaProductos.add(new Producto(1028, "tx125ck42", " Base Enfriadora DarkFlash G200 Plus RGB ", "Product Description", 20, "Fitness", 15, 5));
        listaProductos.add(new Producto(1029, "gwuby345v", " NZXT H6 Flow - Negro ", "Product Description", 20, "Fitness", 25, 5));

    }
    
    public void eliminarCarrito(){
        carrito = new ArrayList<>();
    }
}
