#!/bin/bash

NAME=`echo $1 | cut -d= -f1`
VERSION=`echo $1 | cut -d= -f3`
echo $NAME - $VERSION
cp -ar python3-gitpython/ python3-${NAME}
mv python3-${NAME}/python3-gitpython_3.1.40.bb python3-${NAME}/python3-${NAME}_${VERSION}.bb
gnome-text-editor python3-${NAME}/python3-${NAME}_${VERSION}.bb

