package cryptocurrency.project.tracker;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONObject;

public class MyCryptoGraph extends JPanel {
    
    NetworkGraphHelper nh = new NetworkGraphHelper();
    String coinID,currency;

    public MyCryptoGraph(String coinID,String currency) 
    {
        this.coinID=coinID;
        this.currency=currency;
        try 
        {
            nh.getData(coinID,currency);
            nh.decodePlotValues();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    
    
    //initialize coordinates  
    double[] cord = nh.y_values;  
    int marg = 60;  
      
    protected void paintComponent(Graphics grf)
    {  
        //create instance of the Graphics to use its methods  
        super.paintComponent(grf);  
        Graphics2D graph = (Graphics2D)grf;  
          
        //Sets the value of a single preference for the rendering algorithms.  
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
          
        // get width and height  
        int width = getWidth();  
        int height = getHeight();  
          
        // draw graph  
        graph.draw(new Line2D.Double(marg, marg, marg, height-marg));  
        graph.draw(new Line2D.Double(marg, height-marg, width-marg, height-marg));  
          
        //find value of x and scale to plot points  
        double x = (double)(width-2*marg)/(cord.length-1);  
        double scale = (double)(height-2*marg)/getMax();  
          
        //set color for points  
        graph.setPaint(Color.RED);  
          
        // set points to the graph  
        for(int i=0; i<cord.length; i++)
        {  
            double x1 = marg+i*x;  
            double y1 = height-marg-scale*cord[i];  
            graph.fill(new Ellipse2D.Double(x1-2, y1-2, 4, 4));  
        }  
    }  
      
    //create getMax() method to find maximum value  
    private double getMax()
    {  
        double max = -Double.MAX_VALUE;  
        for(int i=0; i< cord.length; i++)
        {  
            if(cord[i]>max)  
                max = cord[i];  
             
        }  
        return max;  
    }         
      
    public void DrawGraph()
    {
        //create an instance of JFrame class  
        JFrame frame = new JFrame();  
        
        // set size, layout and location for frame.  
        frame.setTitle(coinID.toUpperCase()+"'s Growth Chart ");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        frame.add(new MyCryptoGraph(this.coinID,this.currency));  
        frame.setSize(800 , 450);  
        frame.setLocation(200, 200);  
        frame.setVisible(true);
    }
    
    
}  

class PlotDataValues
{
    long x;
    double y;

    public PlotDataValues(long x, double y) 
    {
        this.x = x;
        this.y = y;
    }
}

class NetworkGraphHelper {
    
//    PlotDataValues dataValues [] = new PlotDataValues[30];
    
    String fullData;
    
    long x_values [] = new long[30];
    double y_values [] = new double[30];
    
    public void getData(String coinID,String currency) throws Exception
    { 
        String url = "https://api.coingecko.com/api/v3/coins/"+coinID.toLowerCase()+"/market_chart?vs_currency="+currency+"&days=30&interval=daily";
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpResponse jsonResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        if(jsonResponse.statusCode()==200)
        {
            fullData = jsonResponse.body().toString();
        }
        else
        {
            fullData = null;
            System.err.print(jsonResponse.statusCode());
            throw new Exception("Error - Data not found!!!");
        }
    }
    
    public void decodePlotValues() throws Exception
    {
        if(this.fullData!=null)
        {
            JSONObject fullJSONObject = new JSONObject(fullData);
            JSONArray pricesArray = fullJSONObject.getJSONArray("prices");
            
            for(int index = 0;index < 30;index++)
            {
                //JSONArray.get(index) , returns the actual value or object at that index , and if thats an array then decode the outer array as jsonArray and use .get(index)
                
                long x = (long) pricesArray.getJSONArray(index).get(0);
                double y = (double) pricesArray.getJSONArray(index).get(1);
                x_values[index]=x;
                y_values[index]=y;
//                dataValues[index] = new PlotDataValues(x, y);   
            }
            
        }
    }
}

