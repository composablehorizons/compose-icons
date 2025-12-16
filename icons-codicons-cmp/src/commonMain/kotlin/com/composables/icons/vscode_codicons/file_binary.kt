package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FileBinary: ImageVector
    get() {
        if (_FileBinary != null) return _FileBinary!!
        
        _FileBinary = ImageVector.Builder(
            name = "file-binary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1f)
                curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
                verticalLineTo(13f)
                curveTo(3f, 14.105f, 3.895f, 15f, 5f, 15f)
                horizontalLineTo(11f)
                curveTo(12.105f, 15f, 13f, 14.105f, 13f, 13f)
                verticalLineTo(5.414f)
                curveTo(13f, 5.016f, 12.842f, 4.635f, 12.561f, 4.353f)
                lineTo(9.647f, 1.439f)
                curveTo(9.366f, 1.158f, 8.984f, 1f, 8.586f, 1f)
                horizontalLineTo(5f)
                close()
                moveTo(4f, 3f)
                curveTo(4f, 2.448f, 4.448f, 2f, 5f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                curveTo(12f, 13.552f, 11.552f, 14f, 11f, 14f)
                horizontalLineTo(5f)
                curveTo(4.448f, 14f, 4f, 13.552f, 4f, 13f)
                verticalLineTo(3f)
                close()
                moveTo(11.793f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 5f, 9f, 4.776f, 9f, 4.5f)
                verticalLineTo(2.207f)
                lineTo(11.793f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.801f, 8.204f)
                curveTo(10.901f, 8.298f, 11f, 8.451f, 11f, 8.655f)
                verticalLineTo(12.501f)
                curveTo(11f, 12.777f, 10.776f, 13.001f, 10.5f, 13.001f)
                curveTo(10.224f, 13.001f, 10f, 12.777f, 10f, 12.501f)
                verticalLineTo(9.459f)
                curveTo(9.781f, 9.641f, 9.519f, 9.814f, 9.207f, 9.956f)
                curveTo(8.956f, 10.07f, 8.659f, 9.959f, 8.545f, 9.708f)
                curveTo(8.431f, 9.457f, 8.542f, 9.16f, 8.793f, 9.046f)
                curveTo(9.26f, 8.833f, 9.573f, 8.522f, 9.77f, 8.262f)
                curveTo(9.993f, 7.967f, 10.343f, 7.996f, 10.495f, 8.037f)
                curveTo(10.593f, 8.064f, 10.705f, 8.114f, 10.801f, 8.204f)
                close()
                moveTo(6.5f, 8f)
                curveTo(5.672f, 8f, 5f, 8.672f, 5f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(5f, 12.328f, 5.672f, 13f, 6.5f, 13f)
                curveTo(7.328f, 13f, 8f, 12.328f, 8f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(8f, 8.672f, 7.328f, 8f, 6.5f, 8f)
                close()
                moveTo(6f, 9.5f)
                curveTo(6f, 9.224f, 6.224f, 9f, 6.5f, 9f)
                curveTo(6.776f, 9f, 7f, 9.224f, 7f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(7f, 11.776f, 6.776f, 12f, 6.5f, 12f)
                curveTo(6.224f, 12f, 6f, 11.776f, 6f, 11.5f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()
        
        return _FileBinary!!
    }

private var _FileBinary: ImageVector? = null

