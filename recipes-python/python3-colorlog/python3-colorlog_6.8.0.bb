SUMMARY = "Add colours to the output of Python's logging module."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c3c6ebdec7792ae12df8d1c0a46b26a"

SRC_URI[sha256sum] = "fbb6fdf9d5685f2517f388fb29bb27d54e8654dd31f58bc2a3b217e967a95ca6"

PYPI_PACKAGE = "colorlog"

inherit pypi python_setuptools_build_meta setuptools3
