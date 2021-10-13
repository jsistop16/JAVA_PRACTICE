package org.javatutorials.jsonDemo;
import org.json.JSONArray;
import org.json.JSONObject;
public class JsonDemo {

	public static void main(String[] args) {

		String str =
                "[{'top_bottom':'top','long_short': 'long'},"+
                        "{'top_bottom':'bottom','long_short':'short'}]";

        JSONArray jarray = new JSONArray(str);

        for (int i=0; i<jarray.length(); i++){
            JSONObject jObject = jarray.getJSONObject(i);
        }
	}

}
