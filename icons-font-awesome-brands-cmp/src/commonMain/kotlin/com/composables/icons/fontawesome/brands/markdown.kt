package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Markdown: ImageVector
    get() {
        if (_Markdown != null) return _Markdown!!
        
        _Markdown = ImageVector.Builder(
            name = "markdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(593.8f, 59.1f)
                horizontalLineTo(46.2f)
                curveTo(20.7f, 59.1f, 0f, 79.8f, 0f, 105.2f)
                verticalLineToRelative(301.5f)
                curveToRelative(0f, 25.5f, 20.7f, 46.2f, 46.2f, 46.2f)
                horizontalLineToRelative(547.7f)
                curveToRelative(25.5f, 0f, 46.2f, -20.7f, 46.1f, -46.1f)
                verticalLineTo(105.2f)
                curveToRelative(0f, -25.4f, -20.7f, -46.1f, -46.2f, -46.1f)
                close()
                moveTo(338.5f, 360.6f)
                horizontalLineTo(277f)
                verticalLineToRelative(-120f)
                lineToRelative(-61.5f, 76.9f)
                lineToRelative(-61.5f, -76.9f)
                verticalLineToRelative(120f)
                horizontalLineTo(92.3f)
                verticalLineTo(151.4f)
                horizontalLineToRelative(61.5f)
                lineToRelative(61.5f, 76.9f)
                lineToRelative(61.5f, -76.9f)
                horizontalLineToRelative(61.5f)
                verticalLineToRelative(209.2f)
                close()
                moveToRelative(135.3f, 3.1f)
                lineTo(381.5f, 256f)
                horizontalLineTo(443f)
                verticalLineTo(151.4f)
                horizontalLineToRelative(61.5f)
                verticalLineTo(256f)
                horizontalLineTo(566f)
                close()
            }
        }.build()
        
        return _Markdown!!
    }

private var _Markdown: ImageVector? = null

