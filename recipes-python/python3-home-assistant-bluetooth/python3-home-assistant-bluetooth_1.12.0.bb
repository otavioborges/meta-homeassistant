SUMMARY = "Home Assistant Bluetooth Models and Helpers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=732518afbb3ba92dbf606e49f9045cc9"

SRC_URI[sha256sum] = "9cac369fea11f67c1165df527f918a8c56630cbccb3c5cbe24b72f06aeb9f59b"

PYPI_PACKAGE = "home_assistant_bluetooth"

inherit pypi setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
