SUMMARY = "The next generation HTTP client."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c624803bdf6fc1c4ce39f5ae11d7bd05"

SRC_URI[sha256sum] = "451b55c30d5185ea6b23c2c793abf9bb237d2a7dfb901ced6ff69ad37ec1dfaf"

#SETUPTOOLS_SETUP_PATH = "${S}/httpx"
PYPI_PACKAGE = "httpx"

inherit pypi python_setuptools_build_meta setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
