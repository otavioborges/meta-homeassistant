SUMMARY = "cChardet is high speed universal character encoding detector."
HOMEPAGE = "https://github.com/faust-streaming/cChardet"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ecda54f6f525388d71d6b3cd92f7474"

DEPENDS = "\
    python3-cython-native \
    python3-pkgconfig-native \
"
SRC_URI[sha256sum] = "f89386297cde0c8e0f5e21464bc2d6d0e4a4fc1b1d77cdb238ca24d740d872e0"

PYPI_PACKAGE = "faust-cchardet"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-gitdb \
    ${PYTHON_PN}-typing-extensions \
"
