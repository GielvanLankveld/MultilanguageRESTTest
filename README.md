# MultilanguageRESTTest
Testing the performance of multiple RESTful implementations in various languages and frameworks

In this project I attempt to give some clarity on the performance and initial overhead of REST services implemented in various programming languages, frameworks, and containers.

## Testing approach

Testing consist of three types of tests: (1) a single request through postman 7.2.2 (x64), (2) multiple requests (100 and 100k) through SoapUI, and (3) multiple requests (100 and 100k) through ApacheBench.

### Testing results

|Project|Postman|SoapUI(100)|SoapUI(100k)|ApacheBench(100)|ApacheBench(100k)|
|---|---|---|---|---|---|
|||||||
