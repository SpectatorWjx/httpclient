package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.HttpHelper;
import com.example.demo.domain.Goods;
import com.example.demo.service.NewService;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;


/**
 * @author wjx
 * @Date:2019/1/2
 * @Description:
 */
@Service
public class NewServiceImpl implements NewService {
    @Override
    public List<Goods> findGoods() {
            try {
                Response response = HttpHelper.post("http://localhost:9091/getGoods");
                List<Goods> goods = returnList(response,Goods.class);
                return goods;
            } catch (Exception e) {
                return null;
            }
    }
    public static <K> List<K> returnList(Response response, Class<K> tClass) throws Exception{
        if (response.isSuccessful()) {
//            List<K> list =JSON.parseArray(response.body().string(),tClass);
            JSONObject object = JSON.parseObject(response.body().string());
            Boolean result = object.get("status").equals(200);
            if (result) {
                List<K> list = object.getJSONArray("data").toJavaList(tClass);
                return list;
            }
        }else {
            throw new Exception("返回结果失败");
        }
        return new LinkedList<K>();
    }
}
