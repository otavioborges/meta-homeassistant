SUMMARY = "One version package to rule them all, One version package to find them, One version package to bring them all, and in the darkness bind them."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=92622b5a8e216099be741d78328bae5d"

SRC_URI[sha256sum] = "9146329196f0f045887de6c195730750f8f7a9302d1c149378db73ab5dc468f0"

PYPI_PACKAGE = "awesomeversion"

inherit pypi setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
