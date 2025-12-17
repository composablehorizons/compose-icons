package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Person: ImageVector
    get() {
        if (_Person != null) return _Person!!
        
        _Person = ImageVector.Builder(
            name = "person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.342f, 4.53549f)
                curveTo(9.597f, 4.17049f, 9.75f, 3.72849f, 9.75f, 3.25049f)
                curveTo(9.75f, 2.00949f, 8.74f, 1.00049f, 7.5f, 1.00049f)
                curveTo(6.26f, 1.00049f, 5.25f, 2.00949f, 5.25f, 3.25049f)
                curveTo(5.25f, 3.72849f, 5.402f, 4.17049f, 5.658f, 4.53549f)
                curveTo(4.719f, 4.69949f, 4f, 5.51549f, 4f, 6.50049f)
                verticalLineTo(9.50049f)
                curveTo(4f, 10.0515f, 4.448f, 10.5005f, 5f, 10.5005f)
                verticalLineTo(13.5005f)
                curveTo(5f, 14.3275f, 5.673f, 15.0005f, 6.5f, 15.0005f)
                horizontalLineTo(8.5f)
                curveTo(9.327f, 15.0005f, 10f, 14.3275f, 10f, 13.5005f)
                verticalLineTo(10.5005f)
                curveTo(10.552f, 10.5005f, 11f, 10.0515f, 11f, 9.50049f)
                verticalLineTo(6.50049f)
                curveTo(11f, 5.51449f, 10.282f, 4.69849f, 9.342f, 4.53549f)
                close()
                moveTo(7.5f, 2.00049f)
                curveTo(8.189f, 2.00049f, 8.75f, 2.56149f, 8.75f, 3.25049f)
                curveTo(8.75f, 3.93949f, 8.189f, 4.50049f, 7.5f, 4.50049f)
                curveTo(6.811f, 4.50049f, 6.25f, 3.93949f, 6.25f, 3.25049f)
                curveTo(6.25f, 2.56149f, 6.811f, 2.00049f, 7.5f, 2.00049f)
                close()
                moveTo(10f, 9.50049f)
                horizontalLineTo(9f)
                verticalLineTo(13.5005f)
                curveTo(9f, 13.7765f, 8.775f, 14.0005f, 8.5f, 14.0005f)
                horizontalLineTo(8f)
                verticalLineTo(11.0005f)
                curveTo(8f, 10.7245f, 7.776f, 10.5005f, 7.5f, 10.5005f)
                curveTo(7.224f, 10.5005f, 7f, 10.7245f, 7f, 11.0005f)
                verticalLineTo(14.0005f)
                horizontalLineTo(6.5f)
                curveTo(6.225f, 14.0005f, 6f, 13.7765f, 6f, 13.5005f)
                verticalLineTo(9.50049f)
                horizontalLineTo(5f)
                verticalLineTo(6.50049f)
                curveTo(5f, 5.94949f, 5.448f, 5.50049f, 6f, 5.50049f)
                horizontalLineTo(9f)
                curveTo(9.552f, 5.50049f, 10f, 5.94949f, 10f, 6.50049f)
                verticalLineTo(9.50049f)
                close()
            }
        }.build()
        
        return _Person!!
    }

private var _Person: ImageVector? = null

