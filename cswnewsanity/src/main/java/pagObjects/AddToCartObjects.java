package pagObjects;

import globals.Globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCartObjects extends Globals {
	
	public AddToCartObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	//Define the page Objects
	
	@FindBy(xpath="//span[contains(text(),'Clothing')]")
	public WebElement clothing;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'All New')]")
	public WebElement allNew;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Dresses & Jumpsuits')]")
	public WebElement dressAndJumpsuits;
	
	@FindBy(xpath="//a[@id='jumpsuit']")
	public WebElement jumpsuits;
	
	@FindBy(xpath="//a[@id='maxi']")
	public WebElement maxi;
	
	@FindBy(xpath="//*[@id='productsCatalog']/li[3]/div/div[2]/a/img")
	public WebElement PLP;
	
	@FindBy(xpath="//span[contains(text(),'XS')]")
	public WebElement selectSizeXS;
	
	@FindBy(xpath="//span[contains(text(),'S')]")
	public WebElement selectSizeS;
	
	@FindBy(xpath="//span[contains(text(),'M')]")
	public WebElement selectSizeM;
	
	@FindBy(xpath="//span[contains(text(),'L')]")
	public WebElement selectSizeL;
	
	@FindBy(xpath="//span[contains(text(),'XL')]")
	public WebElement selectSizeXL;
	
	@FindBy(xpath="//a[@id='midi']")
	public WebElement madi;
	
	@FindBy(xpath="//a[@id='mini']")
	public WebElement mani;
	
	@FindBy(xpath="//a[@id='skater']")
	public WebElement skaters;
	
	@FindBy(xpath="//a[@id='shift']")
	public WebElement shifts;
	
	@FindBy(xpath="//a[@id='bodycon']")
	public WebElement bodycon;
	
	
	@FindBy(xpath="//button[@id='pdp-add-tocart-btn']")
	public WebElement addTocartButton;
	
	@FindBy(xpath="//*[@id=\"page\"]/header/div/div/div/div[4]/div/div[1]/div[1]")
	public WebElement cartIcon_PDP;

	@FindBy(xpath="//*[@id=\"mini-cart-drobdwon\"]/div[4]/div[4]/div[1]/a")
	public WebElement viewCartButton_PDP;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Tops & Tees')]")
	public WebElement topsAnTees;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Skirts & Shorts')]")
	public WebElement skirtsAndShorts;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Trousers & Leggings')]")
	public WebElement trousersAndLeggings;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Jeans')]")
	public WebElement jeans;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Jackets & Sweaters')]")
	public WebElement jacketsAndSweaters;
	
	@FindBy(xpath="//span[contains(text(),'Accessories')]")
	public WebElement accessories;
	
	
	
	
	/*@FindBy(xpath="//img[@src='//www.coverstory.co.in/media/cms/home/category/Shoes_155x210.jpg']")
	public WebElement bags;
	
	@FindBy(xpath="//img[@src='//www.coverstory.co.in/media/cms/home/category/Shoes_155x210.jpg']")
	public WebElement shoes;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/div/div[7]/a")
	public WebElement minicartViewall;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[3]/div/div[5]/a")
	public WebElement minicartViewallquickview;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/a/span[1]")
	public WebElement cartIcon;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[2]/div/div[7]/a")
	public WebElement cartIconviewbag;
	
	@FindBy(xpath=".//*[@class='btn-view-cart']")
	public WebElement cartIconviewbagquickview;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/a")
	public WebElement productImage;
	
	@FindBy(xpath=".//*[@id='productsCatalog product-grid']/li[1]/div/div[2]/a")
	public WebElement productImagepdp;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[3]/div[1]/button")
	public WebElement addtobagPdp;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[5]")
	public WebElement selectsizePdpxxl;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[1]")
	public WebElement selectsizePdpsmall;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[2]")
	public WebElement selectsizePdpmedium;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[3]")
	public WebElement selectsizePdplarge;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]/span[4]")
	public WebElement selectsizePdpxl;
	
	@FindBy(xpath=".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[2]/div[1]")
	public WebElement pdpErrormsg;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[3]/div[1]/div/span[1]")
	public WebElement Quickview;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[1]")
	public WebElement Quickviewpxxl;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[2]/div[1]/span[2]")
	public WebElement Quickviewsmall;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[3]")
	public WebElement Quickviewmedium;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[4]")
	public WebElement Quickviewlarge;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]/span[5]")
	public WebElement Quickviewxl;
	
	@FindBy(xpath=".//*[@class='add-to-button']/button")
	public WebElement Quickviewaddtobag;
	
	@FindBy(xpath=".//*[@id='dialogClose']/i")
	public WebElement Quickviewclose;
	
	@FindBy(xpath=".//*[@id='uiDialogBody']/div[2]/div[3]/div[1]")
	public WebElement Quickviewerrormsg;*/
	
	// Size Handling
	
	public void PDPsizeSelect(){
		  
		  
		  if( selectSizeXS.isEnabled()) {
		    
			  selectSizeXS.click();
		     System.out.println("Extra Small size is selected");
		      
		       }
		  
		   else if(selectSizeS.isEnabled())  {
			   selectSizeS.click();
		       System.out.println("Small size is selected");
		       
		       }
		   else if(selectSizeM.isEnabled())  {
			   selectSizeM.click();
		       System.out.println("Medium size is selected");
		       }
		   else if(selectSizeL.isEnabled())  {
			   selectSizeL.click();
		       System.out.println("Large size is selected");
		       }
	
		   else {
		    System.out.println("Product is Out of stock");
		   }
		    
		 }
		 
		 /*public void PDPsizeSelect(){
		  
		  if( selectsizePdpsmall.isEnabled()) {
		    
		     selectsizePdpsmall.click();
		     System.out.println("Small size is selected");
		      
		       }
		  
		   else if(selectsizePdpmedium.isEnabled())  {
		    selectsizePdpmedium.click();
		       System.out.println("Medium size is selected");
		       
		       }
		   else if(selectsizePdplarge.isEnabled())  {
		    selectsizePdplarge.click();
		       System.out.println("Large size is selected");
		       }
		   else if(selectsizePdpxl.isEnabled())  {
		    selectsizePdpxl.click();
		       System.out.println("XL size is selected");
		       }
		   else if(selectsizePdpxxl.isEnabled())  {
		    selectsizePdpxxl.click();
		       System.out.println("XXL size is selected");
		       }
		   else {
		    System.out.println("Product is Out of stock");
		   }
		  
		 }
		 
		 public void QuickviewsizeSelect(){
		  
		  if( Quickviewsmall.isEnabled()) {
		    
		     Quickviewsmall.click();
		     System.out.println("Small size is selected");
		      
		       }
		  
		   else if(Quickviewmedium.isEnabled())  {
		    Quickviewmedium.click();
		       System.out.println("Medium size is selected");
		       
		       }
		   else if(Quickviewlarge.isEnabled())  {
		    Quickviewlarge.click();
		       System.out.println("Large size is selected");
		       }
		   else if(Quickviewxl.isEnabled())  {
		   Quickviewxl.click();
		       System.out.println("XL size is selected");
		       }
		   else if(Quickviewpxxl.isEnabled())  {
		   Quickviewpxxl.click();
		       System.out.println("XXL size is selected");
		       }
		   else {
		    System.out.println("Product is Out of stock");
		   }
		  */
		  
		 }
