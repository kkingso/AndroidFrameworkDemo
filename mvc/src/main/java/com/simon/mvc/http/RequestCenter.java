package com.simon.mvc.http;

import com.simon.okhttp.OkHttpUtils;
import com.simon.okhttp.callback.Callback;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class RequestCenter {

    public static void requestContributor(Callback<String> callback){
        OkHttpUtils.get(Https.request_contributor_url).execute(callback);
    }

}
