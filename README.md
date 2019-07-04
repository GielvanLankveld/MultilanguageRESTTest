# MultilanguageRESTTest
Testing the performance of multiple RESTful implementations in various languages and frameworks

## Overview

In this repo I attempt to give some clarity on the performance and initial overhead of REST services implemented in various programming languages, frameworks, and containers.

## Testing approach

Testing consist of three types of REST request testing protocols: (1) a single request through postman 7.2.2 (x64), (2) multiple requests (100 and 100k) through SoapUI, and (3) multiple requests (100 and 100k) through ApacheBench. Results per protocol are reported as mean speeds in milliseconds.

Some solutions are slower on their 1st time booting (cold boot) while other solutions do not have this startup cost. To compensate for this fact, all solutions are first started and triggered with 1 manual REST request through postman before any other testing is done (this approach includes the postman testing itself). 

### Testing results

|Project|Postman|SoapUI(100)|SoapUI(100k)|ApacheBench(100)|ApacheBench(100k)|
|---|---|---|---|---|---|
|Spring + Tomcat|17 ms|||||
|Python + Flask|511 ms|||||
|||||||
