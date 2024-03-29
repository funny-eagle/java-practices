package org.nocoder.newfeature;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Java 11 对 Java 9 中引入并在 Java 10 中进行了更新的 Http Client API 进行了标准化，
 * 在前两个版本中进行孵化的同时，Http Client 几乎被完全重写，并且现在完全支持异步非阻塞。
 * <p>
 * 新版 Java 中，Http Client 的包名由 jdk.incubator.http 改为 java.net.http，
 * 该 API 通过 CompleteableFutures 提供非阻塞请求和响应语义，
 * 可以联合使用以触发相应的动作，并且 _RX Flo w_ 的概念也在 Java 11 中得到了实现。
 * 现在，在用户层请求发布者和响应发布者与底层套接字之间追踪数据流更容易了。
 * 这降低了复杂性，并最大程度上提高了 HTTP/1 和 HTTP/2 之间的重用的可能性。
 * <p>
 * Java 11 中的新 Http Client API，提供了对 HTTP/2 等业界前沿标准的支持，
 * 同时也向下兼容 HTTP/1.1，精简而又友好的 API 接口，
 * 与主流开源 API（如：Apache HttpClient、Jetty、OkHttp 等）类似甚至拥有更高的性能。
 * 与此同时它是 Java 在 Reactive-Stream 方面的第一个生产实践，
 * 其中广泛使用了 Java Flow API，终于让 Java 标准 HTTP 类库在扩展能力等方面，
 * 满足了现代互联网的需求，是一个难得的现代 Http/2 Client API 标准的实现，
 * Java 工程师终于可以摆脱老旧的 HttpURLConnection 了。
 * 下面模拟 Http GET 请求并打印返回内容：
 */
public class HttpClientApi {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.baidu.com"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

}
