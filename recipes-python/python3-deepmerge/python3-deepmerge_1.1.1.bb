SUMMARY = "a toolset to deeply merge python dictionaries."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5461efe2d19ce359c7d72d7be3c05e1c"

SRC_URI[sha256sum] = "53a489dc9449636e480a784359ae2aab3191748c920649551c8e378622f0eca4"

PYPI_PACKAGE = "deepmerge"

inherit pypi setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
