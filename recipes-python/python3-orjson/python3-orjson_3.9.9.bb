SUMMARY = "Fast, correct Python JSON library supporting dataclasses, datetimes, and numpy"
HOMEPAGE = "https://github.com/ijl/orjson"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542"

DEPENDS += "\
    python3-maturin-native \
"
SRC_URI[sha256sum] = "02e693843c2959befdd82d1ebae8b05ed12d1cb821605d5f9fe9f98ca5c9fd2b"

PYPI_PACKAGE = "orjson"
inherit pypi python_setuptools3_rust python_setuptools_build_meta

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-maturin \
"

