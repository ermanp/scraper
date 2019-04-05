package com.utopisoft.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ScraperApplication.class)
public class ScraperApplicationTests
{

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

        



    }





}
