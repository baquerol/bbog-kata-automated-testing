package com.orangehrmlive.opensourcedemo.userInterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class PaginaPrincipalUI {
    public static final Target LLB_Dashboard= Target.the("Dashboard").located(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
    public static final Target BTN_ADMIN= Target.the("Dashboard").located(By.xpath("//li[1]//a[1]//span[1]"));
    public static final Target BTN_ADD= Target.the("Dashboard").located(By.xpath("//button[normalize-space()='Add']"));
    public static final Target BTN_SELEC= Target.the("Dashboard").located(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
    public static final Target BTN_ELEC= Target.the("Dashboard").located(By.xpath("//div[contains(text(),'Admin')]"));

   // public static final Target LST_USERROLE= Target.the("Dashboard").located(By.xpath("(//div [@class='oxd-select-text-input'])[1]"));
    public static final Target LST_USERROLE= Target.the("Dashboard").located(By.xpath("//label[contains(text(), 'User Role')]/following::div[contains(@class, 'oxd-select-text')][1]"));
    public static final Target LST_STATUS= Target.the("Dashboard").located(By.xpath("(//div [@class='oxd-select-text oxd-select-text--active'])[2]"));
    public static final Target TXT_EMPLOYEE= Target.the("Dashboard").located(By.xpath("//input[@placeholder='Type for hints...']"));
    public static final Target TXT_USERNAME= Target.the("Dashboard").located(By.xpath("(//input [@class='oxd-input oxd-input--active'])[2]"));
    public static final Target TXT_PASSWORD= Target.the("Dashboard").located(By.xpath("(//input [@class='oxd-input oxd-input--active'])[3]"));
    public static final Target TXT_CONFIRMPASSWORD= Target.the("Dashboard").located(By.xpath("(//input [@class='oxd-input oxd-input--active'])[4]"));
    public static final Target BTN_SAVE= Target.the("Dashboard").located(By.xpath("//button[@type='submit']"));
}
