SUMMARY = "Enable zlib_ng on aiohttp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da57f3e0372e39698a274746eb9d65d6"

SRC_URI[sha256sum] = "e8ac72b855a194da4c869e89f69a9dc9339229d2366931dfea34cff93fb960fa"

PYPI_PACKAGE = "aiohttp_zlib_ng"

inherit pypi setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
