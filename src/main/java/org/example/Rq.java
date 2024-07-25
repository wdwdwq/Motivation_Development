package org.example;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String actionMethod;
    private Map<String, String> params;

    //Rq == Request
    public Rq(String cmd) {
        // cmd를 '?'로 분리해 액센 메서드 파라미터로 나눔
        String[] cmdBits = cmd.split("\\?", 2);

        actionMethod = cmdBits[0];

        params = new HashMap<>();

        String[] paramBits;

        try { // 파라미터 부분을 '&'로 분리해 각 파라미터를 처리
            paramBits = cmdBits[1].split("&");
        } catch (ArrayIndexOutOfBoundsException e) { // '?'가 없을 경우 예외처리 
            System.out.println("명령어 확인해");
            return;
        }

        for (String paramStr : paramBits) {// 각 파라미터를 "="로 분리해 키와 값으로 나눔
            String[] paramStrBits = paramStr.split("=", 2);
            String key = paramStrBits[0];
            String value = paramStrBits[1];
            params.put(key, value);
        }
    }
//액션 메서드
    public String getActionMethod() {
        return actionMethod;
    }
// 파라미터 이름에 해당 값 반환
    public String getParams(String paramName) {
        return params.get(paramName);
    }

}
