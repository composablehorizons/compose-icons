package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Markdown: ImageVector
    get() {
        if (_Markdown != null) return _Markdown!!
        
        _Markdown = ImageVector.Builder(
            name = "markdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 3.5f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.776f, 8.776f, 12f, 8.5f, 12f)
                curveTo(8.224f, 12f, 8f, 11.776f, 8f, 11.5f)
                verticalLineTo(4.831f)
                lineTo(5.376f, 7.83f)
                curveTo(5.187f, 8.048f, 4.814f, 8.048f, 4.624f, 7.83f)
                lineTo(2f, 4.831f)
                verticalLineTo(11.5f)
                curveTo(2f, 11.776f, 1.776f, 12f, 1.5f, 12f)
                curveTo(1.224f, 12f, 1f, 11.776f, 1f, 11.5f)
                verticalLineTo(3.5f)
                curveTo(1f, 3.292f, 1.129f, 3.105f, 1.324f, 3.032f)
                curveTo(1.521f, 2.96f, 1.74f, 3.014f, 1.876f, 3.171f)
                lineTo(5f, 6.741f)
                lineTo(8.124f, 3.171f)
                curveTo(8.261f, 3.014f, 8.478f, 2.959f, 8.676f, 3.032f)
                curveTo(8.871f, 3.105f, 9f, 3.292f, 9f, 3.5f)
                close()
                moveTo(14.854f, 9.146f)
                curveTo(14.659f, 8.951f, 14.342f, 8.951f, 14.147f, 9.146f)
                lineTo(13.001f, 10.292f)
                verticalLineTo(3.5f)
                curveTo(13.001f, 3.224f, 12.777f, 3f, 12.501f, 3f)
                curveTo(12.225f, 3f, 12.001f, 3.224f, 12.001f, 3.5f)
                verticalLineTo(10.293f)
                lineTo(10.855f, 9.147f)
                curveTo(10.66f, 8.952f, 10.343f, 8.952f, 10.148f, 9.147f)
                curveTo(9.953f, 9.342f, 9.953f, 9.659f, 10.148f, 9.854f)
                lineTo(12.148f, 11.854f)
                curveTo(12.246f, 11.952f, 12.757f, 11.952f, 12.855f, 11.854f)
                lineTo(14.855f, 9.854f)
                curveTo(15.05f, 9.659f, 15.05f, 9.342f, 14.855f, 9.147f)
                lineTo(14.854f, 9.146f)
                close()
            }
        }.build()
        
        return _Markdown!!
    }

private var _Markdown: ImageVector? = null

