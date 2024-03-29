package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanAmountCalculator extends basePage{

	public LoanAmountCalculator(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="loan-amount-calc")
	WebElement loanamountcalculator;
	
	@FindBy(id="loanemi")
	WebElement loanemi;
	
	@FindBy(id="loanemislider")
	WebElement loanemislider;
	
	@FindBy(id="loaninterest")
	WebElement loaninterest;
	
	@FindBy(id="loaninterestslider")
	WebElement loaninterestslider;
	
	@FindBy(id="loanterm")
	WebElement loanterm;
	
	@FindBy(id="loantermslider")
	WebElement loantermslider;
	
	@FindBy(id="loanfees")
	WebElement loanfees;
	
	@FindBy(id="loanfeesslider")
	WebElement loanfeesslider;
	
	@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[1]")
	WebElement yrsbtn;
	
	@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[2]/span")
	WebElement loantermyrs;
	
	@FindBy(xpath="//*[@id='ltermwrapper']/div[1]/div/div/div/div/div/label[2]")
	WebElement monthbtn;
	
	@FindBy(xpath="//*[@id='loantermsteps']/span[2]/span")
	WebElement loantermmnths;
	
	//clicks on loan amounmt calculator
	public void clickloanamountcalculator() {
		loanamountcalculator.click();
	}
	
	//checks UI for the EMI
	public boolean checkLoanEMITextbox() {
		boolean loanamountTextbox=loanemi.isEnabled();
		return loanamountTextbox;
	}
	
	public boolean checkLoanEMIScale() {
		boolean loanamountScale=loanemislider.isEnabled();
		return loanamountScale;
	}
	
	//checks UI for the Interest Rate
	public boolean checkLoanInterestTextbox() {
		boolean loaninterestTextbox=loaninterest.isEnabled();
		return loaninterestTextbox;
	}
	
	public boolean checkLoanInterestsliderScale() {
		boolean loaninterestsliderScale=loaninterestslider.isEnabled();
		return loaninterestsliderScale;
	}
	
	//checks UI for the Loan Tenure
	public boolean checkLoanTermTextbox() {
		boolean loantermTextbox=loanterm.isEnabled();
		return loantermTextbox;
	}
	
	public boolean checkLoanTermsliderScale() {
		boolean loantermsliderScale=loantermslider.isEnabled();
		return loantermsliderScale;
	}
	
	//checks UI for Fees and charges
	public boolean checkLoanFeesTextbox() {
		boolean loanfeesTextbox=loanfees.isEnabled();
		return loanfeesTextbox;
	}
	
	public boolean checkLoanFeessliderScale() {
		boolean loanfeessliderScale=loanfeesslider.isEnabled();
		return loanfeessliderScale;
	}

	//validates if month to year is working fine or not
	public boolean checkLoanAmountTenure() {
		yrsbtn.click();
		String loantermyears=loantermyrs.getText();
		int years=Integer.parseInt(loantermyears);
		monthbtn.click();
		String loantermmonths=loantermmnths.getText();
		int months=Integer.parseInt(loantermmonths);
		if(years==months)
			return false;
		return true;
			
	}
}
