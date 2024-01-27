SUMMARY = "The next generation HTTP client."
HOMEPAGE = "https://github.com/encode/httpx"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c624803bdf6fc1c4ce39f5ae11d7bd05"

SRC_URI[sha256sum] = "451b55c30d5185ea6b23c2c793abf9bb237d2a7dfb901ced6ff69ad37ec1dfaf"

PYPI_PACKAGE = "httpx"
inherit python_setuptools_build_meta pypi

RDEPENDS:${PN} = "\
  ${PYTHON_PN}-anyio \
  ${PYTHON_PN}-certifi \
  ${PYTHON_PN}-httpcore \
  ${PYTHON_PN}-idna \
  ${PYTHON_PN}-sniffio \
  ${PYTHON_PN}-brotli \
  ${PYTHON_PN}-brotlicffi \
  ${PYTHON_PN}-click \
  ${PYTHON_PN}-pygments \
  ${PYTHON_PN}-rich \
  ${PYTHON_PN}-h2 \
  ${PYTHON_PN}-socksio \
"
