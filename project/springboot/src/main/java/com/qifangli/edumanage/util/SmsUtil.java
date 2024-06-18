package com.qifangli.edumanage.util;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.stereotype.Component;

// 此文件原本未被注释，由于一些未知的问题，导致无法编译，所以暂时注释掉，后续有时间再进行修复
// 此文件是用于发送短信验证码的工具类，使用的是阿里云的短信服务，需要在阿里云上进行配置
// 倘若需要此文件进行编译，可自行研究

@Component
public class SmsUtil {

    static final String domain = "dysmsapi.aliyuncs.com";
    static final String sign_name="三组教务";
    static final String template_code="SMS_189835091";
    DefaultProfile profile = DefaultProfile.getProfile("default", "此处应该是账号", "密码");
    IAcsClient client = new DefaultAcsClient(profile);


    /**
     * 发送验证码
     * @param phoneNumber
     * @return code
     */
    public String SendMessage(String phoneNumber){
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain(domain);
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        System.out.println(phoneNumber);
        request.putQueryParameter("SignName", sign_name);
        request.putQueryParameter("TemplateCode", template_code);
        int code = ((int) (Math.random() * 900000 + 100000));
        request.putQueryParameter("TemplateParam", "{code:"+code+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            return String.valueOf(code);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询发送信息
     * @param phoneNumber
     * @param sendDate
     * @param pageSize
     * @param currentPage
     */
    public void QuerySendDetails(String phoneNumber,String sendDate,String pageSize,String currentPage){
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain(domain);
        request.setSysVersion("2017-05-25");
        request.setSysAction("QuerySendDetails");
        request.putQueryParameter("PhoneNumber", phoneNumber);
        request.putQueryParameter("SendDate", sendDate);
        request.putQueryParameter("PageSize", pageSize);
        request.putQueryParameter("CurrentPage", currentPage);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
