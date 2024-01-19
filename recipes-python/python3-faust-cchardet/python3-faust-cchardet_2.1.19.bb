SUMMARY = "cChardet is high speed universal character encoding detector."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rst;md5=782caaa8c54ca6cf84bb8ec14fe26abf"

SRC_URI[sha256sum] = "f89386297cde0c8e0f5e21464bc2d6d0e4a4fc1b1d77cdb238ca24d740d872e0"

DEPENDS += "python3-cython-native python3-cython"
PYPI_PACKAGE = "faust-cchardet"

inherit pypi setuptools3
