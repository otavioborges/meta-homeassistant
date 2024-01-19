SUMMARY = "Backported and Experimental Type Hints for Python 3.8+"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fcf6b249c2641540219a727f35d8d2c2"

SRC_URI[sha256sum] = "23478f88c37f27d76ac8aee6c905017a143b0b1b886c3c9f66bc2fd94f9f5783"

PYPI_PACKAGE = "typing_extensions"

inherit pypi setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
