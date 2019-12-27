package com.atguigu.gmall.service;

import com.atguigu.gmall.beans.PmsProductInfo;

import java.util.List;

public interface PmsProductInfoService {

    List<PmsProductInfo> spuList(String catalog3Id);
}
