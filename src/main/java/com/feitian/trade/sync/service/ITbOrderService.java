package com.feitian.trade.sync.service;

import com.feitian.trade.sync.model.TbUser;
import com.taobao.api.domain.Shipping;
import com.taobao.api.domain.Trade;
import com.taobao.api.request.TradesSoldGetRequest;
import com.taobao.api.request.TradesSoldIncrementGetRequest;

import java.util.List;

public interface ITbOrderService {
    long getTaobaoOrderTotal(TradesSoldGetRequest req, TbUser user);
    long getTaobaoIncrementOrderTotal(TradesSoldIncrementGetRequest req, TbUser user);
    List<Trade> getTradeList(TradesSoldGetRequest reqParams, TbUser user);
    List<Trade> getTradeIncrementList(TradesSoldIncrementGetRequest reqParams, TbUser user);
    List<Shipping> getOrderLogisticInfo(long tid, String fields, TbUser user);
}
