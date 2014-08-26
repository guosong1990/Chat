package com.dongdong.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.dongdong.chat.ChatTestActivity;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;

public class MyCity {
	/**
     * 抓取当前的城市信息
     * 
     * @return String 城市名
     */
    public String getCurrentCityName(){
        String city = "";
        TelephonyManager telManager = (TelephonyManager) ChatTestActivity.self.getSystemService(Context.TELEPHONY_SERVICE);
        GsmCellLocation glc = (GsmCellLocation) telManager.getCellLocation();
        
        if (glc != null){
            int cid = glc.getCid(); // value 基站ID号
            int lac = glc.getLac();// 写入区域代码
            String strOperator = telManager.getNetworkOperator();
            int mcc = Integer.valueOf(strOperator.substring(0, 3));// 写入当前城市代码
            int mnc = Integer.valueOf(strOperator.substring(3, 5));// 写入网络代码
            String getNumber = "";
            getNumber += ("cid:" + cid + "\n");
            getNumber += ("cid:" + lac + "\n");
            getNumber += ("cid:" + mcc + "\n");
            getNumber += ("cid:" + mnc + "\n");
            DefaultHttpClient client = new DefaultHttpClient();
            BasicHttpParams params = new BasicHttpParams();
            HttpConnectionParams.setSoTimeout(params, 20000);
            HttpPost post = new HttpPost("http://www.google.com/loc/json");
            
            try{
                JSONObject jObject = new JSONObject();
                jObject.put("version", "1.1.0");
                jObject.put("host", "maps.google.com");
                jObject.put("request_address", true);
                if (mcc == 460)
                    jObject.put("address_language", "zh_CN");
                else
                    jObject.put("address_language", "en_US");

                JSONArray jArray = new JSONArray();
                JSONObject jData = new JSONObject();
                jData.put("cell_id", cid);
                jData.put("location_area_code", lac);
                jData.put("mobile_country_code", mcc);
                jData.put("mobile_network_code", mnc);
                jArray.put(jData);
                jObject.put("cell_towers", jArray);
                StringEntity se = new StringEntity(jObject.toString());
                post.setEntity(se);

                HttpResponse resp = client.execute(post);
                BufferedReader br = null;
                if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                    br = new BufferedReader(new InputStreamReader(resp
                            .getEntity().getContent()));
                    StringBuffer sb = new StringBuffer();

                    String result = br.readLine();
                    while (result != null){
                        sb.append(getNumber);
                        sb.append(result);
                        result = br.readLine();
                    }
                    String s = sb.toString();
                    s = s.substring(s.indexOf("{"));
                    JSONObject jo = new JSONObject(s);
                    JSONObject arr = jo.getJSONObject("location");
                    JSONObject address = arr.getJSONObject("address");
                    city = address.getString("city");
                }
            }
            catch (JSONException e){
                e.printStackTrace();
            }
            catch (UnsupportedEncodingException e){
                e.printStackTrace();
            }
            catch (ClientProtocolException e){
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            finally{
                post.abort();
                client = null;
            }
        }
        return city;
    }
}
