package com.utopisoft.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * User: Erman PAYASLI
 * Date: 6.04.2019
 * Time: 02:58
 */
public interface OpusService
{
    public int getPageNumber(Document document);
}
