SUMMARY = "Extra userspace packages for QCOM platforms"

inherit packagegroup

PACKAGES = " \
    ${PN}-boot-essential \
    ${PN}-boot-additional \
    ${PN}-miscellaneous \
"

RRECOMMENDS:${PN}-boot-essential = " \
    pd-mapper \
    qrtr \
    rmtfs \
    tqftpserv \
"

RRECOMMENDS:${PN}-boot-additional = " \
    fastrpc \
"

RRECOMMENDS:${PN}-miscellaneous = " \
    libdmabufheap \
    libvmmem \
"
