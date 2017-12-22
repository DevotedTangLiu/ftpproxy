#!/bin/sh
cmd_path=`dirname $0`
PID=$(cat ${cmd_path}/proxy.pid)
echo ${PID}
if [ "$PID" != "" ];
then
    kill -9 $PID
fi
cd ${cmd_path}
echo "" > ${cmd_path}/proxy.pid