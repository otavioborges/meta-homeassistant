SUMMARY = "Enable zlib_ng on aiohttp"
HOMEPAGE = "https://github.com/bdraco/aiohttp-zlib-ng"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da57f3e0372e39698a274746eb9d65d6"

SRC_URI[sha256sum] = "e8ac72b855a194da4c869e89f69a9dc9339229d2366931dfea34cff93fb960fa"

PYPI_PACKAGE = "aiohttp-zlib-ng"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-aiohttp \
    ${PYTHON_PN}-isal \
    ${PYTHON_PN}-zlib-ng \
"
