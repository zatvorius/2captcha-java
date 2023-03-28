package com.twocaptcha;

import com.twocaptcha.captcha.Yandex;

import java.util.HashMap;
import java.util.Map;

public class YandexTest extends AbstractWrapperTestCase {

    public void testAllOptions() throws Exception {
        Yandex captcha = new Yandex();
        captcha.setSiteKey("Y5Lh0tiycconMJGsFd3EbbuNKSp1yaZESUOIHfeV");
        captcha.setUrl("https://rutube.ru");

        Map<String, String> params = new HashMap<>();
        params.put("method", "yandex");
        params.put("sitekey", "Y5Lh0tiycconMJGsFd3EbbuNKSp1yaZESUOIHfeV");
        params.put("pageurl", "https://rutube.ru");

        checkIfCorrectParamsSendAndResultReturned(captcha, params);
    }

}