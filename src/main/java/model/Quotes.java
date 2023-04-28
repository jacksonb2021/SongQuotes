package model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Quotes {

    HashMap<String, ArrayList<Quote>> map;
    ArrayList<Quote> quotes;
    Serializer ser;



    public Quotes(){
        ser = new Serializer();
        quotes = ser.getList();
        map = new HashMap<>();
        //arr = new ArrayList<Quote>();
        for(Quote q : quotes){
            if(map.containsKey(q.getSong())){
                map.get(q.getSong()).add(q);
            }
            else{
                map.put(q.getSong(), new ArrayList<>());
            }
        }




    }


    public void save(){
        ser.saveMap();


    }

    public int size(){
        return quotes.size();
    }



    public void addQuote(String song, String author, String quote){
//        if(quotes.containsKey(song)) {
//            quotes.get(song).add(quote);
//        }
//        else{
//            ArrayList<String> newQuote = new ArrayList<>();
//            newQuote.add(quote);
//            quotes.put(song, newQuote);
//        }
        quotes.add(new Quote(song,author, quote));
    }


    //public ArrayList<String> getQuotes(String song){
//        return quotes.get(song);
//    }

    public ArrayList<Quote> getList(){
        return quotes;
    }



    public void deleteQuote(Quote quote){
        quotes.remove(quote);

    }

//    public void deleteQuoteByIndex(String title, int index){
//        quotes.get(title).remove(index);
//
//    }

//    public String toString(){
//        String str = "";
//        for(Map.Entry entry : map.entrySet()){
//            String key = q.getSong()+" ("+q.getArtist()+")\n";
//            ArrayList<String> value = entry.getValue();
//            for(String s : value){
//                str += "\t"+s + '\n';
//            }
//        }
//        return str;
//    }

}