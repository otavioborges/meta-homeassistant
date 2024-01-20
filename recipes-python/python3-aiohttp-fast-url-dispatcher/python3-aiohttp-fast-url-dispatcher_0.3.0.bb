SUMMARY = "A faster URL dispatcher for aiohttp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da57f3e0372e39698a274746eb9d65d6"

SRC_URI[sha256sum] = "0fc11c60a4209429340d9d2d07b6b0819a45ebd0d47ceb78bea915dbe042addd"

PYPI_PACKAGE = "aiohttp_fast_url_dispatcher"

inherit pypi python_setuptools_build_meta setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
