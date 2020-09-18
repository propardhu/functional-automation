package com.generic.functional.automation.ui.tests.datastudio;

import com.aventstack.extentreports.Status;
import com.generic.functional.automation.ui.tests.common.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DataStudioAutomation extends TestConfig {

    WebDriverWait wait;
    @BeforeMethod
    public void beforeMethod() {
        wait = new WebDriverWait(driver, 15);
    }

    @Test(priority = 1)
    public void DataStudioSmartView() throws Exception {
        test = extent.createTest("Data Studio Button Click Smart View");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        test.createNode("Smart View Is Displayed  ");
        Thread.sleep(5 * 1000);
    }

    @Test(priority = 2)
    public void DataStudioSmartViewAndInternalView() throws Exception {
        test = extent.createTest("Data Studio Smart & InternalView ", "Smart View Expand & Expand And Internal View");
//       driver.get("https://a4data-qe.netlify.app/databaseManager/");
//       driver.navigate().refresh();
//       test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("International Cluster Click to Show  Working of Internal View");
        WebElement InternationalCluster = driver.findElement(By.cssSelector("#table-International > text"));
        InternationalCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("Smart View Click For Expand Smart View");
        WebElement SmartViewClickForExpand = driver.findElement(By.cssSelector("header > svg.MuiSvgIcon-root"));
        SmartViewClickForExpand.click();
        Thread.sleep(5 * 1000);
        test.createNode("Smart View Click For Expand Smart View");
        WebElement SmartViewClickCollapse = driver.findElement(By.cssSelector("header > svg.MuiSvgIcon-root > path"));
        SmartViewClickCollapse.click();
        Thread.sleep(5 * 1000);
    }

    @Test(priority = 3)
    public void DataStudioFreightChargesClusterForeignKeyAndPrimaryKeyInInternalView() throws Exception {
        test = extent.createTest("Data Studio Freight Charges Cluster Foreign Key & Primary Key In Internal View");
//        driver.get("https://a4data-qe.netlify.app/databaseManager/");
//      driver.navigate().refresh();
//      test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);

        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("Freight Charges Cluster Click");
        WebElement FreightChargesCluster = driver.findElement(By.cssSelector("#table-Freight\\ Charges"));
        FreightChargesCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Primary Key   Freight Charges Identifier Element Click");
        WebElement PrimaryKeyFreightChargesIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        PrimaryKeyFreightChargesIdentifier.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Shipping Number Element Click");
        WebElement ForeignKeyShippingNumber = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[2]/span"));
        ForeignKeyShippingNumber.click();
        test.createNode("Primary Key & Foreign Key Displayed For Freight Charges Cluster ");
        Thread.sleep(5 * 1000);
    }

    @Test(priority = 4)
    public void DataStudioInternationalClusterForeignAndPrimaryKey() throws Exception {
        test = extent.createTest("Data Studio International Cluster Foreign Key & Primary Key In Internal View");
//        driver.get("https://a4data-qe.netlify.app/databaseManager/");
//        driver.navigate().refresh();
//        test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("International Cluster Click");
        WebElement InternationalCluster = driver.findElement(By.cssSelector("#table-International > text"));
        InternationalCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Handling Element Click");
        WebElement ForeignKeyHandling = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        ForeignKeyHandling.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Shipping  Element Click");
        WebElement ForeignKeyShipping = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[13]/span"));
        ForeignKeyShipping.click();
        test.createNode("Primary Key & Foreign Key Displayed For International Cluster");
        Thread.sleep(5 * 1000);

    }

    @Test(priority = 5)
    public void DataStudioDocumentsClusterForeignAndPrimaryKey() throws Exception {
        test = extent.createTest("Data Studio Documents Cluster Foreign Key & Primary Key In Internal View");
//        driver.get("https://a4data-qe.netlify.app/databaseManager/");
//        driver.navigate().refresh();
//        test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("Documents Cluster Click");
        WebElement DocumentsCluster = driver.findElement(By.cssSelector("#table-Documents > text"));
        DocumentsCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Primary Key Documents Identifier Element Click");
        WebElement PrimaryKeyDocumentsIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        PrimaryKeyDocumentsIdentifier.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Plant Identifier Element Click");
        WebElement ForeignKeyPlantIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[2]/span"));
        ForeignKeyPlantIdentifier.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key ShippingNumber Element Click");
        WebElement ForeignKeyShippingNumber = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[5]/span"));
        ForeignKeyShippingNumber.click();
        test.createNode("Primary Key & Foreign Key Displayed For DocumentsCluster");
        Thread.sleep(5 * 1000);
    }

    @Test(priority = 6)
    public void DataStudioDocumentsURLsClusterForeignAndPrimaryKey() throws Exception {
        test = extent.createTest("Data Studio DocumentsURLs Cluster Foreign Key & Primary Key In Internal View");
        //driver.get("https://a4data-qe.netlify.app/databaseManager/");
        //driver.navigate().refresh();
        //test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode(" Data Studio DocumentsURLs Cluster Click");
        WebElement DocumentsURLsCluster = driver.findElement(By.cssSelector("#table-Document\\ URLs > text"));
        DocumentsURLsCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Primary Key DocumentsURLs IdentifierElement  Click");
        WebElement PrimaryKeyDocumentsURLsIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        PrimaryKeyDocumentsURLsIdentifier.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Handling unit Element  Click");
        WebElement ForeignKeyShippingNumber = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[2]/span"));
        ForeignKeyShippingNumber.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Plant Identifier Element Click");
        WebElement ForeignKeyPlantIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[5]/span"));
        ForeignKeyPlantIdentifier.click();
        test.createNode("Primary Key & Foreign Key Displayed For DocumentsURLs Cluster ");
        Thread.sleep(5 * 1000);
    }

    @Test(priority = 7)
    public void DataStudioPackingItemsClusterForeignAndPrimaryKey() throws Exception {
        test = extent.createTest("Data Studio Packing Items Cluster Foreign Key & Primary Key In Internal View");
//        driver.get("https://a4data-qe.netlify.app/databaseManager/");
//        driver.navigate().refresh();
//        test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("PackingItems Cluster Click");
        WebElement PackingItemsCluster = driver.findElement(By.cssSelector("#table-Packing\\ Items > text"));
        PackingItemsCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Primary Key PackingItem Identifier Element Click");
        WebElement PrimaryKeyPackingItemIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        PrimaryKeyPackingItemIdentifier.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Plant Identifier Element Click");
        WebElement ForeignKeyPlantIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[2]/span"));
        ForeignKeyPlantIdentifier.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key HandlingUnit Element Click");
        WebElement ForeignKeyHandlingUnit = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[3]/span"));
        ForeignKeyHandlingUnit.click();
        test.createNode("Primary Key & Foreign Key Displayed For PackingItems Cluster ");
        Thread.sleep(5 * 1000);

    }

    @Test(priority = 8)
    public void DataStudioPackagesClusterForeignKeyPrimaryKey() throws Exception {
        test = extent.createTest("Data Studio Packages Cluster", "Foreign Key & Primary Key In Internal View");
//        driver.get("https://a4data-qe.netlify.app/databaseManager/");
//        driver.navigate().refresh();
//        test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("Packages Cluster Click");
        WebElement PackagesCluster = driver.findElement(By.cssSelector("#table-Packages"));
        PackagesCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Primary Key HandlingUnit Element Click");
        WebElement PrimaryKeyHandlingUnit = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        PrimaryKeyHandlingUnit.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Plant Identifier Element Click");
        WebElement ForeignKeyPlantIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[2]/span"));
        ForeignKeyPlantIdentifier.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key  ShippingNumber Element Click");
        WebElement ForeignKeyShippingNumber = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[3]/span"));
        ForeignKeyShippingNumber.click();
        test.createNode("Primary Key & Foreign Key Displayed For Packages Cluster ");
        Thread.sleep(5 * 1000);

    }

    @Test(priority = 9)
    public void DataStudioLocationClusterPrimaryAndForeignKey() throws Exception {
        test = extent.createTest("Data Studio Location Cluster", "Primary Key & ForeignKey In Internal View");
//        driver.get("https://a4data-qe.netlify.app/databaseManager/");
//        driver.navigate().refresh();
//        test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("Location Cluster Click");
        WebElement LocationCluster = driver.findElement(By.cssSelector("#table-Location"));
        LocationCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Primary Key Plant Identifier Element Click");
        WebElement PrimaryKeyPlantIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        PrimaryKeyPlantIdentifier.click();
        test.createNode(" Primary Key Displayed For Location Cluster ");
        Thread.sleep(5 * 1000);
    }

    @Test(priority = 10)
    public void DataStudioShipmentsClusterForeignAndPrimaryKey() throws Exception {
        test = extent.createTest("Data Studio Shipments Cluster Foreign Key & Primary Key In Internal View");
//        driver.get("https://a4data-qe.netlify.app/databaseManager/");
//       driver.navigate().refresh();
//       test.createNode("Refreshing :\"A4data Screen\"");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.createNode("Data Studio Button Clicked");
        WebElement DataStudioButton = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/header/div/header/div/div/div[3]/div[2]/div/div[2]/span"));
        DataStudioButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Cluster Click ");
        WebElement SubjectShipmentsCluster = driver.findElement(By.cssSelector("#subject-Shipments > text"));
        SubjectShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("Shipments Cluster Click");
        WebElement ShipmentsCluster = driver.findElement(By.cssSelector("#table-Shipments"));
        ShipmentsCluster.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Primary key ShippingNumber Element Click");
        WebElement ForeignKeyShippingNumber = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button/span"));
        ForeignKeyShippingNumber.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Foreign key Plant Identifier Element Click");
        WebElement ForeignKeyPlantIdentifier = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/button[3]/span"));
        ForeignKeyPlantIdentifier.click();
        test.createNode("Primary Key & Foreign Key Displayed For Shipments Cluster ");
        Thread.sleep(5 * 1000);
    }

    @Test
    public void TestingClusters() throws Exception {
        File file = new File("C:\\Users\\Partha\\Desktop\\NLP DB automation\\fork\\functional-automation\\src\\test\\java\\com\\generic\\functional\\automation\\ui\\tests\\datastudio\\demo.txt");
        Scanner scan = new Scanner(file);
        String Str = scan.nextLine();
        String[] arrStr = Str.split(":");
        test = extent.createTest("Data Studio Adding and removing clusters in Pardhus DB");
        test.createNode(String.valueOf(arrStr.length)+arrStr[2]);
        login.doLogin(test);
        WebElement DataStudioBtn = driver.findElement(By.xpath("//*[@id=\"databaseManager\"]"));
        wait.until(ExpectedConditions.visibilityOf(DataStudioBtn));
        DataStudioBtn.click();
        test.createNode("DataStudio Click ");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement PardhuPlusCir = driver.findElement(By.xpath("//*[@id=\"plusCircle-subject-pardhu\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(PardhuPlusCir));
        Thread.sleep(2000);
        PardhuPlusCir.click();
        test.createNode("Pardhu PlusCir click");

        WebElement PardhuPlus = driver.findElement(By.id("controlButtonAdd-subject-pardhu"));
        wait.until(ExpectedConditions.visibilityOf(PardhuPlus));
        PardhuPlus.click();
        test.createNode("PardhuPlus click");

        WebElement ClusterName = driver.findElement(By.xpath("//input[@name='clusterName']"));
        wait.until(ExpectedConditions.visibilityOf(ClusterName));
        ClusterName.click();
        ClusterName.sendKeys(arrStr[0]);
        test.createNode("Cluster name entered AutoGenerated");

        WebElement description = driver.findElement(By.xpath("//input[@name='description']"));
        wait.until(ExpectedConditions.visibilityOf(description));
        description.click();
        description.sendKeys(arrStr[1]);
        test.createNode("Description entered Autogenerated");

        WebElement nlpTokens = driver.findElement(By.xpath("//input[@name='nlpTokens']"));
        wait.until(ExpectedConditions.visibilityOf(nlpTokens));
        nlpTokens.click();
        nlpTokens.sendKeys(arrStr[2]);
        test.createNode("nlp entered AutoGenerated");

        WebElement Add = driver.findElement(By.id("add-inside-subject"));
        wait.until(ExpectedConditions.elementToBeClickable(Add));
        Add.click();
        test.createNode("Cluster Autogenerated added successfully");

        WebElement tableBtn = driver.findElement(By.id("plusCircle-text-table-"+arrStr[0]));
        wait.until(ExpectedConditions.elementToBeClickable(tableBtn));
        tableBtn.click();

        WebElement Addcol = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/main/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/button[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(Addcol));
        Addcol.click();

        String DemoCOl=scan.nextLine();
        String[] arrDetails = DemoCOl.split(":");
        WebElement clustername = driver.findElement(By.name("elementClusterName"));
        wait.until(ExpectedConditions.elementToBeClickable(clustername));
        clustername.clear();
        clustername.sendKeys(arrDetails[0]);

        WebElement DataCat = driver.findElement(By.id("select-elementClusterDataCategory"));
        wait.until(ExpectedConditions.elementToBeClickable(DataCat));
        DataCat.click();

        WebElement selectCat = driver.findElement(By.xpath("//li[@data-value='"+arrDetails[1]+"']"));
        selectCat.click();

        WebElement DataType = driver.findElement(By.id("select-elementClusterDataType"));
        wait.until(ExpectedConditions.elementToBeClickable(DataType));
        DataType.click();

        WebElement selectType = driver.findElement(By.xpath("//li[@data-value='"+arrDetails[2]+"']"));
        selectType.click();

        WebElement des = driver.findElement(By.name("description"));
        wait.until(ExpectedConditions.elementToBeClickable(des));
        des.sendKeys(arrDetails[3]);

        WebElement nlp = driver.findElement(By.name("nlpTokens"));
        nlp.sendKeys(arrDetails[4]);

        WebElement AddBtn = driver.findElement(By.xpath("//span[@class='MuiTouchRipple-root']"));
        AddBtn.click();

        Thread.sleep(2000);
//        WebElement tableBtn=driver.findElement(By.id("plusCircle-table-AutoGenerated"));
//        wait.until(ExpectedConditions.elementToBeClickable(tableBtn));
//        tableBtn.click();
//        test.createNode("Click on Auto generate table");
//
//        WebElement remove=driver.findElement(By.id("controlsIconsDelete-table-AutoGenerated"));
//        wait.until(ExpectedConditions.elementToBeClickable(remove));
//        remove.click();
//        test.createNode("Click to remove");
//
//        WebElement del=driver.findElement(By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-containedSizeSmall MuiButton-sizeSmall']"));
//        wait.until(ExpectedConditions.elementToBeClickable((del)));
//        del.click();
//        test.createNode("Click on delete");
        Thread.sleep(5000);
    }
}