package com.utopisoft.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScraperApplication implements CommandLineRunner
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    public static void main(String[] args)
    {
        SpringApplication.run(ScraperApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

        final String url = "https://eksisozluk.com/basliklar/istatistik/skocax/son-entryleri";
        final Document document = Jsoup.connect(url).get();
        /*final String url = "https://eksisozluk.com/basliklar/istatistik/skocax/son-entryleri";

        final Document document = Jsoup.connect(url).get();

        Elements entries = document.select("div#content").select("ul");

        Elements children = entries.get(0).children();

        List<String> urls = new ArrayList<>();

        for(Element element : children){

            urls.add(element.select("li").select("a").attr("href"));
        }

        urls.forEach(s -> System.out.println(s));

        String moreUrl;

        if(document.select("div#full-index-continue-link-container") != null){
            Elements test2 = document.select("div#full-index-continue-link-container").select("a");
            moreUrl = document.select("div#full-index-continue-link-container").select("a").attr("href");
        }*/
    }
}
