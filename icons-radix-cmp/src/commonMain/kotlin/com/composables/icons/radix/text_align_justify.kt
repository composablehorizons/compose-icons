package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TextAlignJustify: ImageVector
    get() {
        if (_TextAlignJustify != null) return _TextAlignJustify!!
        
        _TextAlignJustify = ImageVector.Builder(
            name = "text-align-justify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.6006f, 10.0098f)
                curveTo(12.8286f, 10.0563f, 13f, 10.2583f, 13f, 10.5f)
                curveTo(13f, 10.7417f, 12.8286f, 10.9437f, 12.6006f, 10.9902f)
                lineTo(12.5f, 11f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 11f, 2f, 10.7761f, 2f, 10.5f)
                curveTo(2f, 10.2239f, 2.22386f, 10f, 2.5f, 10f)
                horizontalLineTo(12.5f)
                lineTo(12.6006f, 10.0098f)
                close()
                moveTo(12.6006f, 7.00977f)
                curveTo(12.8286f, 7.05629f, 13f, 7.25829f, 13f, 7.5f)
                curveTo(13f, 7.74171f, 12.8286f, 7.94371f, 12.6006f, 7.99023f)
                lineTo(12.5f, 8f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 8f, 2f, 7.77614f, 2f, 7.5f)
                curveTo(2f, 7.22386f, 2.22386f, 7f, 2.5f, 7f)
                horizontalLineTo(12.5f)
                lineTo(12.6006f, 7.00977f)
                close()
                moveTo(12.6006f, 4.00977f)
                curveTo(12.8286f, 4.05629f, 13f, 4.25829f, 13f, 4.5f)
                curveTo(13f, 4.74171f, 12.8286f, 4.94371f, 12.6006f, 4.99023f)
                lineTo(12.5f, 5f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 5f, 2f, 4.77614f, 2f, 4.5f)
                curveTo(2f, 4.22386f, 2.22386f, 4f, 2.5f, 4f)
                horizontalLineTo(12.5f)
                lineTo(12.6006f, 4.00977f)
                close()
            }
        }.build()
        
        return _TextAlignJustify!!
    }

private var _TextAlignJustify: ImageVector? = null

