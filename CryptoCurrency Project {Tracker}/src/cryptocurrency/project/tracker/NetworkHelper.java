package cryptocurrency.project.tracker;

import java.awt.Color;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.*;

class CoinData
{
    String fullData;
    String name;
    String symbol;
    String imageLink;
    Double currentPrice;
    Integer marketRank;
    Double priceChange;
    Double percentChange;
    String lastUpadte;
    Color changeValueColor=Color.WHITE;
}



public class NetworkHelper 
{
   
    public void getData(String coinID,String currency, CoinData coinObj) throws Exception
    { 
        String url ="https://api.coingecko.com/api/v3/coins/markets?vs_currency="+currency+"&ids="+coinID+"&order=market_cap_desc&per_page=100&page=1&sparkline=false";
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpResponse jsonResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        if(jsonResponse.statusCode()==200)
        {
            coinObj.fullData = jsonResponse.body().toString();
        }
        else
        {
            coinObj.fullData = null;
            System.err.print(jsonResponse.statusCode());
            throw new Exception("Error - Data not found!!!");
        }
    }
    
    public void decodeData(CoinData coinObj) throws Exception
    {
        if(coinObj.fullData != null)
        {
            JSONArray fullArray = new JSONArray(coinObj.fullData);
            if(fullArray.length()==0)
            {
                throw new Exception("Data recieved is 'null' , Operation cannot be performed !");
            }
            JSONObject fullObject = fullArray.getJSONObject(0);
            coinObj.name = fullObject.getString("name");
            coinObj.symbol = fullObject.getString("symbol");
            coinObj.imageLink = fullObject.getString("image");
            coinObj.currentPrice = fullObject.getDouble("current_price");
            coinObj.marketRank = fullObject.getInt("market_cap_rank");
            coinObj.priceChange = fullObject.getDouble("price_change_24h");
            coinObj.percentChange = fullObject.getDouble("price_change_percentage_24h");
            if(coinObj.priceChange<0 && coinObj.percentChange<0)
            {
                coinObj.changeValueColor = Color.RED;
            }
            else
            {
                coinObj.changeValueColor = Color.GREEN;
            }
            coinObj.lastUpadte = fullObject.getString("last_updated");
            
        }
        else
        {
            throw new Exception("Data recieved is 'null' , Operation cannot be performed !");
        }
    }
}
