package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Dash: ImageVector
    get() {
        if (_Dash != null) return _Dash!!
        
        _Dash = ImageVector.Builder(
            name = "dash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 8.5f)
                curveTo(5f, 8.22386f, 5.22386f, 8f, 5.5f, 8f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 8f, 11f, 8.22386f, 11f, 8.5f)
                curveTo(11f, 8.77614f, 10.7761f, 9f, 10.5f, 9f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 9f, 5f, 8.77614f, 5f, 8.5f)
                close()
            }
        }.build()
        
        return _Dash!!
    }

private var _Dash: ImageVector? = null

