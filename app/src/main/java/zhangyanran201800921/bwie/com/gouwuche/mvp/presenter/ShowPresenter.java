package zhangyanran201800921.bwie.com.gouwuche.mvp.presenter;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Response;
import zhangyanran201800921.bwie.com.gouwuche.event.ShowCallBack;
import zhangyanran201800921.bwie.com.gouwuche.mvp.model.ShowModel;
import zhangyanran201800921.bwie.com.gouwuche.mvp.view.ShowView;

/**
 * Created by 匹诺曹 on 2018/9/21.
 */

public class ShowPresenter {
    private ShowView showView;
    private ShowModel showModel;
    public ShowPresenter(ShowView showView) {
        this.showView = showView;
        showModel = new ShowModel();
    }

    public void show(){
        HashMap<String, String> parms = new HashMap<>();
        showModel.show("https://www.zhaoapi.cn/product/getCarts?uid=71", parms, new ShowCallBack() {
            @Override
            public void onSuccess(Call call, Response response) {
                try {
                    String string = response.body().string();
                    showView.onSuccess(string);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call call, IOException e) {
                showView.onFailure("失败");
            }
        });
    }
}
