SUMMARY = "Build and publish crates with pyo3, rust-cpython and cffi bindings as well as rust binaries as python packages"
HOMEPAGE = "https://github.com/pyo3/maturin"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://MANIFEST.in;md5=0faadf3b94842f8410ba63d42955c5c1"

require ${BPN}-crates.inc

SRC_URI[sha256sum] = "ed12e1768094a7adeafc3a74ebdb8dc2201fa64c4e7e31f14cfc70378bf93790"

PYPI_PACKAGE = "maturin"
PIP_INSTALL_PACKAGE = "maturin"
inherit pypi python_setuptools3_rust cargo-update-recipe-crates

RDEPENDS:${PN} += "python3-core"

BBCLASSEXTEND = "native nativesdk"

