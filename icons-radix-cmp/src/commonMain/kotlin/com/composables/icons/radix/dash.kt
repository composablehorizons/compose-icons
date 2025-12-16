package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Dash: ImageVector
    get() {
        if (_Dash != null) return _Dash!!
        
        _Dash = ImageVector.Builder(
            name = "dash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.60059f, 7.00977f)
                curveTo(9.82855f, 7.05629f, 10f, 7.25829f, 10f, 7.5f)
                curveTo(10f, 7.74171f, 9.82855f, 7.94371f, 9.60059f, 7.99023f)
                lineTo(9.5f, 8f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 8f, 5f, 7.77614f, 5f, 7.5f)
                curveTo(5f, 7.22386f, 5.22386f, 7f, 5.5f, 7f)
                horizontalLineTo(9.5f)
                lineTo(9.60059f, 7.00977f)
                close()
            }
        }.build()
        
        return _Dash!!
    }

private var _Dash: ImageVector? = null

