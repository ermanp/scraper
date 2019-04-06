package com.utopisoft.scraper;

import com.utopisoft.ScraperApplication;
import com.utopisoft.model.Scraper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ScraperApplication.class)
public class ScraperApplicationTests
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Test
    public void contextLoads()
    {
    }

    @Test
    public void checkMoreThanOnePage()
    {

        final String url = "https://eksisozluk.com/basliklar/istatistik/skocax/son-entryleri";

        try
        {
            final Document document = Jsoup.connect(url).get();

            Elements section = document.getElementsByClass("full-index-continue-link-container");
            boolean empty = true;

            if (section != null)
                empty = false;

            Assert.assertEquals(false, empty);


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    @Test
    public void getPageNumber(){

        try
        {
            Scraper scraper = new Scraper("skocax");

            Elements elementsByClass = scraper.getDocument().getElementsByClass("full-index-continue-link-container").select("a");

            String href = elementsByClass.attr("href");

            System.out.println(href);

            Document document = Jsoup.connect("https://eksisozluk.com" + href).get();


            Elements pager = document.getElementsByClass("pager");

            String attr = pager.attr("data-pagecount");

            Assert.assertEquals("38",attr);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }




    }





}
