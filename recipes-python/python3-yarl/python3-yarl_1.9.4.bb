SUMMARY = "Yet another URL library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "566db86717cf8080b99b58b083b773a908ae40f06681e87e589a976faf8246bf"

PYPI_PACKAGE = "yarl"

inherit pypi setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
