Java FTP proxy server
========

This program will help you if you are behind a firewall and do not have FTP access to the internet, but you have access to machine that has. It will then work as proxy server and in that way let you connect to FTP servers outside the firewall. It is also possible to do it the other way around, i.e. gain FTP access from the internet to beyond the firewall.

To run the program

1. Build this project
    ```
    mvn clean install
    ```

2. Run
    ```
    nohup ./start.sh
    ```

For further documentation and confiration examples, please refer to project homepage on http://aggemam.dk/ftpproxy.
