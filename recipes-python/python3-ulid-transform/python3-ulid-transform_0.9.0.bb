SUMMARY = "Create and transform ULIDs"
HOMEPAGE = "https://github.com/bdraco/ulid-transform"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8b5b84f8af09011094cd7c29a9f972c"

DEPENDS = "\
    pkgconfig \
    python3-poetry-native \
    python3-cython-native \
"

SRC_URI[sha256sum] = "e50c78ddb89629d1d7b5e7436b51bb49ac3ddca7a278a78640299d4cd49105bc"

PYPI_PACKAGE = "ulid_transform"
inherit python_setuptools_build_meta pypi

