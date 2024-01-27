SUMMARY = "Zlib"
HOMEPAGE = "https://github.com/pycompression/python-zlib-ng"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=18130810ab035d8cac1d00602892f13d"

SRC_URI[sha256sum] = "f2d196b70c733a1e59f380f626fb68fe65aa6fe080a8aa5039c898e83367761d"

PYPI_PACKAGE = "zlib-ng"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-gitdb \
    ${PYTHON_PN}-typing-extensions \
"
