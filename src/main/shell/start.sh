#!/bin/sh
./stop.sh
nohup java -jar ftp-proxy-jar-with-dependencies.jar &
cmd_path=`dirname $0`
cd ${cmd_path}
echo $! > ${cmd_path}/proxy.pid