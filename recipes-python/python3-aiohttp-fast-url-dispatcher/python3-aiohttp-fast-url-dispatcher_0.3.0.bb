SUMMARY = "A faster URL dispatcher for aiohttp"
HOMEPAGE = "https://github.com/bdraco/aiohttp-fast-url-dispatcher"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da57f3e0372e39698a274746eb9d65d6"

DEPENDS = "\
    python3-poetry-native \
"
SRC_URI[sha256sum] = "0fc11c60a4209429340d9d2d07b6b0819a45ebd0d47ceb78bea915dbe042addd"

PYPI_PACKAGE = "aiohttp_fast_url_dispatcher"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-aiohttp \
"
