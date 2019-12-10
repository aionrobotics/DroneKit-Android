#!/bin/sh
# script to re-generate mavlink C code for APM

mavdir="$(dirname $0)"

if ! which mavgen.py > /dev/null; then
    echo "mavgen.py must be in your PATH. Get it from http://github.com/mavlink/mavlink in the pymavlink/generator directory"
    exit 1
fi

echo "Generating Java code"
/mnt/c/Users/magic/Documents/GitHub/ardupilot/modules/mavlink/pymavlink/tools/mavgen.py --lang=Java --wire-protocol=2.0 --output=$mavdir/src $mavdir/message_definitions/ardupilotmega.xml
