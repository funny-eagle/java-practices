package org.nocoder.socket;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URIDemo {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        URI uri = new URI("http://nocoder.org/java-jian-kong-gong-ju/");
        System.out.println("uri:" + uri);
        System.out.println(uri.normalize());

        final URI BASE = new URI("http://nocoder.org");
        System.out.println(BASE + ":" + BASE.relativize(uri));

        URL url = new URL(uri.normalize().toString());
        System.out.println(url);
        System.out.println(new URI("bean:test"));
    }
}
