SUMMARY = "A faster version of dbus-next"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=729e372b5ea0168438e4fd4a00a04947"

SRC_URI[sha256sum] = "87b852d2005f1d59399ca51c5f3538f28a4742d739d7abe82b7ae8d01d8a5d02"

PYPI_PACKAGE = "dbus_fast"

inherit pypi python_setuptools_build_meta setuptools3
