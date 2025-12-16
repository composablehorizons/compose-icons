package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FilePdf: ImageVector
    get() {
        if (_FilePdf != null) return _FilePdf!!
        
        _FilePdf = ImageVector.Builder(
            name = "file-pdf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(5.414f)
                curveTo(13f, 5.016f, 12.842f, 4.635f, 12.561f, 4.353f)
                lineTo(9.647f, 1.439f)
                curveTo(9.366f, 1.158f, 8.984f, 1f, 8.586f, 1f)
                horizontalLineTo(5f)
                curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(2.5f)
                curveTo(1.673f, 7f, 1f, 7.673f, 1f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(1f, 14.327f, 1.673f, 15f, 2.5f, 15f)
                horizontalLineTo(13.5f)
                curveTo(14.327f, 15f, 15f, 14.327f, 15f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(15f, 7.673f, 14.327f, 7f, 13.5f, 7f)
                close()
                moveTo(9f, 2.207f)
                lineTo(11.793f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 5f, 9f, 4.776f, 9f, 4.5f)
                verticalLineTo(2.207f)
                close()
                moveTo(4f, 3f)
                curveTo(4f, 2.448f, 4.448f, 2f, 5f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                close()
                moveTo(14f, 13.5f)
                curveTo(14f, 13.775f, 13.775f, 14f, 13.5f, 14f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 14f, 2f, 13.775f, 2f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 8.225f, 2.224f, 8f, 2.5f, 8f)
                horizontalLineTo(13.5f)
                curveTo(13.775f, 8f, 14f, 8.225f, 14f, 8.5f)
                verticalLineTo(13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 9f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 9f, 3f, 9.224f, 3f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 12.776f, 3.224f, 13f, 3.5f, 13f)
                curveTo(3.776f, 13f, 4f, 12.776f, 4f, 12.5f)
                verticalLineTo(12f)
                horizontalLineTo(4.5f)
                curveTo(5.327f, 12f, 6f, 11.327f, 6f, 10.5f)
                curveTo(6f, 9.673f, 5.327f, 9f, 4.5f, 9f)
                close()
                moveTo(4.5f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(4.5f)
                curveTo(4.776f, 10f, 5f, 10.225f, 5f, 10.5f)
                curveTo(5f, 10.775f, 4.776f, 11f, 4.5f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 9f, 7f, 9.224f, 7f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(7f, 12.776f, 7.224f, 13f, 7.5f, 13f)
                horizontalLineTo(8f)
                curveTo(9.103f, 13f, 10f, 12.103f, 10f, 11f)
                curveTo(10f, 9.897f, 9.103f, 9f, 8f, 9f)
                close()
                moveTo(8f, 12f)
                verticalLineTo(10f)
                curveTo(8.552f, 10f, 9f, 10.448f, 9f, 11f)
                curveTo(9f, 11.552f, 8.552f, 12f, 8f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 9f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 9f, 11f, 9.224f, 11f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(11f, 12.776f, 11.224f, 13f, 11.5f, 13f)
                curveTo(11.776f, 13f, 12f, 12.776f, 12f, 12.5f)
                verticalLineTo(12f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 12f, 13f, 11.776f, 13f, 11.5f)
                curveTo(13f, 11.224f, 12.776f, 11f, 12.5f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                curveTo(13.276f, 10f, 13.5f, 9.776f, 13.5f, 9.5f)
                curveTo(13.5f, 9.224f, 13.276f, 9f, 13f, 9f)
                close()
            }
        }.build()
        
        return _FilePdf!!
    }

private var _FilePdf: ImageVector? = null

