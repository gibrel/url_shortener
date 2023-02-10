# url_shortener
Code evaluation session

We must be able to post an URL into a route and get back a new URL with the shortest possible length.

• We must GET the full URL when we enter the short URL (ex: http://localhost:3000/a => https://google.com)

There should be an endpoint that returns top 100 most frequently accessed URLs.
There must be a new thread that runs in background (after the short url is created) and that crawls the URL being shortened, pulls the <title> from the website and stores it. This can be achieved with scheduled jobs as well.
Display the title with the URL on the top 100 endpoint.


• There must be a README that explains how to setup the application and
the algorithm used for generating the URL short code.
Nicolas sarmiento18:42
NICE TO HAVE:

Write a bot to populate your DB, and include it in the source code
Write Unit or Integration Tests
