package com.utopisoft;

import com.utopisoft.model.Scraper;
import com.utopisoft.service.OpusService;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScraperApplication implements CommandLineRunner
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OpusService opusService;


    public static void main(String[] args)
    {
        SpringApplication.run(ScraperApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

        System.out.println(opusService.getPageNumber(new Document("")));
        /*final String url = "https://eksisozluk.com/basliklar/istatistik/skocax/son-entryleri";
        final Document document = Jsoup.connect(url).get();
        final String url = "https://eksisozluk.com/basliklar/istatistik/skocax/son-entryleri";

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
