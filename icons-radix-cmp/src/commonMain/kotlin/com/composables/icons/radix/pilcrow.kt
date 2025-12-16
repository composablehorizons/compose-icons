package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Pilcrow: ImageVector
    get() {
        if (_Pilcrow != null) return _Pilcrow!!
        
        _Pilcrow = ImageVector.Builder(
            name = "pilcrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 5.5f)
                curveTo(3f, 7.983f, 4.99169f, 9f, 7f, 9f)
                verticalLineTo(12.5f)
                curveTo(7f, 12.7761f, 7.22386f, 13f, 7.5f, 13f)
                curveTo(7.77614f, 13f, 8f, 12.7761f, 8f, 12.5f)
                verticalLineTo(9f)
                verticalLineTo(3.0998f)
                horizontalLineTo(9f)
                verticalLineTo(12.5f)
                curveTo(9f, 12.7761f, 9.22386f, 13f, 9.5f, 13f)
                curveTo(9.77614f, 13f, 10f, 12.7761f, 10f, 12.5f)
                verticalLineTo(3.0998f)
                horizontalLineTo(11.5f)
                lineTo(11.6113f, 3.08906f)
                curveTo(11.8617f, 3.03762f, 12.0498f, 2.81564f, 12.0498f, 2.55f)
                curveTo(12.0498f, 2.28436f, 11.8617f, 2.06238f, 11.6113f, 2.01094f)
                lineTo(11.5f, 2.0002f)
                horizontalLineTo(9.51411f)
                curveTo(9.50942f, 2.00007f, 9.50472f, 2f, 9.5f, 2f)
                curveTo(9.49528f, 2f, 9.49058f, 2.00007f, 9.48589f, 2.0002f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(7.5f)
                horizontalLineTo(7f)
                curveTo(4.99169f, 2f, 3f, 3.017f, 3f, 5.5f)
                close()
            }
        }.build()
        
        return _Pilcrow!!
    }

private var _Pilcrow: ImageVector? = null

