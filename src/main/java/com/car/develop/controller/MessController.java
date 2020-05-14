package com.car.develop.controller;

import com.car.develop.model.MessTotal;
import com.car.develop.model.Message;
import com.car.develop.model.SiteMess;
import com.car.develop.service.MessageService;
import com.car.develop.util.ResultMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zxs
 * @date 2020/5/13 5:11 下午
 */
@RestController
@RequestMapping("mess")
public class MessController {

    @Resource
    private MessageService messageService;

    @RequestMapping("insert")
    public ResultMessage insertone(Message message, SiteMess siteMess, MessTotal messTotal){
        return messageService.insertone(message, siteMess, messTotal);
    }
}
