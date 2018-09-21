package zhangyanran201800921.bwie.com.gouwuche.mvp.model;

import java.util.HashMap;

import zhangyanran201800921.bwie.com.gouwuche.event.ShowCallBack;
import zhangyanran201800921.bwie.com.gouwuche.util.OkHttpUtil;

/**
 * Created by 匹诺曹 on 2018/9/21.
 */

public class ShowModel {
    public void show(String url, HashMap<String,String> parms, ShowCallBack showCallBack){
        OkHttpUtil.getInstance().postData(url,parms,showCallBack);
    }
}
