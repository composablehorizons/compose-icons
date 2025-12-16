package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.NewFile: ImageVector
    get() {
        if (_NewFile != null) return _NewFile!!
        
        _NewFile = ImageVector.Builder(
            name = "new-file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 14f)
                curveTo(4.448f, 14f, 4f, 13.552f, 4f, 13f)
                verticalLineTo(3f)
                curveTo(4f, 2.448f, 4.448f, 2f, 5f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(6.025f)
                curveTo(12.344f, 6.056f, 12.677f, 6.121f, 13f, 6.213f)
                verticalLineTo(5.414f)
                curveTo(13f, 5.016f, 12.842f, 4.635f, 12.561f, 4.353f)
                lineTo(9.647f, 1.439f)
                curveTo(9.366f, 1.158f, 8.984f, 1f, 8.586f, 1f)
                horizontalLineTo(5f)
                curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
                verticalLineTo(13f)
                curveTo(3f, 14.105f, 3.895f, 15f, 5f, 15f)
                horizontalLineTo(7.261f)
                curveTo(7.008f, 14.693f, 6.791f, 14.357f, 6.607f, 14f)
                horizontalLineTo(5f)
                close()
                moveTo(9f, 2.207f)
                lineTo(11.793f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 5f, 9f, 4.776f, 9f, 4.5f)
                verticalLineTo(2.207f)
                close()
                moveTo(11.5f, 7f)
                curveTo(9.015f, 7f, 7f, 9.015f, 7f, 11.5f)
                curveTo(7f, 13.985f, 9.015f, 16f, 11.5f, 16f)
                curveTo(13.985f, 16f, 16f, 13.985f, 16f, 11.5f)
                curveTo(16f, 9.015f, 13.985f, 7f, 11.5f, 7f)
                close()
                moveTo(14f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                curveTo(12f, 14.276f, 11.776f, 14.5f, 11.5f, 14.5f)
                curveTo(11.224f, 14.5f, 11f, 14.276f, 11f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                curveTo(8.724f, 12f, 8.5f, 11.776f, 8.5f, 11.5f)
                curveTo(8.5f, 11.224f, 8.724f, 11f, 9f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                curveTo(11f, 8.724f, 11.224f, 8.5f, 11.5f, 8.5f)
                curveTo(11.776f, 8.5f, 12f, 8.724f, 12f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                curveTo(14.276f, 11f, 14.5f, 11.224f, 14.5f, 11.5f)
                curveTo(14.5f, 11.776f, 14.276f, 12f, 14f, 12f)
                close()
            }
        }.build()
        
        return _NewFile!!
    }

private var _NewFile: ImageVector? = null

