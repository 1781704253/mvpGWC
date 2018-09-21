package zhangyanran201800921.bwie.com.gouwuche.event;


import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by 匹诺曹 on 2018/9/21.
 */

public interface ShowCallBack {
    void onSuccess(Call call, Response response);
    void onFailure(Call call, IOException e);
}
