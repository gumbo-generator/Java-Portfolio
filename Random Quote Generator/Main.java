import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://andruxnet-random-famous-quotes.p.rapidapi.com/?count=10&cat=famous"))
                .header("X-RapidAPI-Key", "ENTER-USER-KEY")
                .header("X-RapidAPI-Host", "andruxnet-random-famous-quotes.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        String quote = response.body();

        BufferedWriter writer = new BufferedWriter(new FileWriter("quote.txt"));
        writer.write(quote);
        writer.close();
    }
}