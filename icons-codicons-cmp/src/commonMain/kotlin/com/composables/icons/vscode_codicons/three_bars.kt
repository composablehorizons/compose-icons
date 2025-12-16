package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ThreeBars: ImageVector
    get() {
        if (_ThreeBars != null) return _ThreeBars!!
        
        _ThreeBars = ImageVector.Builder(
            name = "three-bars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.50049f)
                curveTo(2f, 3.22435f, 2.22386f, 3.00049f, 2.5f, 3.00049f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 3.00049f, 14f, 3.22435f, 14f, 3.50049f)
                curveTo(14f, 3.77663f, 13.7761f, 4.00049f, 13.5f, 4.00049f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 4.00049f, 2f, 3.77663f, 2f, 3.50049f)
                close()
                moveTo(2f, 7.50049f)
                curveTo(2f, 7.22435f, 2.22386f, 7.00049f, 2.5f, 7.00049f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 7.00049f, 14f, 7.22435f, 14f, 7.50049f)
                curveTo(14f, 7.77663f, 13.7761f, 8.00049f, 13.5f, 8.00049f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 8.00049f, 2f, 7.77663f, 2f, 7.50049f)
                close()
                moveTo(2f, 11.5005f)
                curveTo(2f, 11.2243f, 2.22386f, 11.0005f, 2.5f, 11.0005f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 11.0005f, 14f, 11.2243f, 14f, 11.5005f)
                curveTo(14f, 11.7766f, 13.7761f, 12.0005f, 13.5f, 12.0005f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 12.0005f, 2f, 11.7766f, 2f, 11.5005f)
                close()
            }
        }.build()
        
        return _ThreeBars!!
    }

private var _ThreeBars: ImageVector? = null

