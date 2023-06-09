package locator;

import org.openqa.selenium.By;

public class AbstractPageLocator {
    public By btn_add_categories = By.xpath("//a[@href='/Admin/Category/Create']");
    public By btn_add_product = By.xpath("//a[@href='/Admin/Product/Create']");
    public By btn_export = By.className("btn-group");
    public By btn_import = By.name("importexcel");
    public By btn_delete = By.id("delete-selected");
    public By name = By.id("Name");
    public By btn_save = By.name("save");
    public String search = "//*[contains(@data-hideattribute, 'HideSearchBlock')]";
    public String info_product_field = "//*[contains(@data-hideattribute, 'HideInfoBlock')]";


}
