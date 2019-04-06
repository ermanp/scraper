package com.utopisoft.service.impl;

import com.utopisoft.model.Opus;
import com.utopisoft.service.OpusService;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

/**
 * User: Erman PAYASLI
 * Date: 6.04.2019
 * Time: 02:59
 */
@Service
public class OpusServiceImpl implements OpusService
{
    @Override
    public int getPageNumber(Document document)
    {
        return 0;
    }
}
