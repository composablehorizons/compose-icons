package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Regex: ImageVector
    get() {
        if (_Regex != null) return _Regex!!
        
        _Regex = ImageVector.Builder(
            name = "regex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.498f, 5f)
                horizontalLineTo(9.705f)
                lineTo(10.973f, 3.732f)
                curveTo(11.168f, 3.537f, 11.168f, 3.22f, 10.973f, 3.025f)
                curveTo(10.778f, 2.83f, 10.461f, 2.83f, 10.266f, 3.025f)
                lineTo(8.998f, 4.293f)
                verticalLineTo(2.5f)
                curveTo(8.998f, 2.224f, 8.774f, 2f, 8.498f, 2f)
                curveTo(8.222f, 2f, 7.998f, 2.224f, 7.998f, 2.5f)
                verticalLineTo(4.293f)
                lineTo(6.73f, 3.025f)
                curveTo(6.535f, 2.83f, 6.218f, 2.83f, 6.023f, 3.025f)
                curveTo(5.828f, 3.22f, 5.828f, 3.537f, 6.023f, 3.732f)
                lineTo(7.291f, 5f)
                horizontalLineTo(5.498f)
                curveTo(5.222f, 5f, 4.998f, 5.224f, 4.998f, 5.5f)
                curveTo(4.998f, 5.776f, 5.222f, 6f, 5.498f, 6f)
                horizontalLineTo(7.291f)
                lineTo(6.023f, 7.268f)
                curveTo(5.828f, 7.463f, 5.828f, 7.78f, 6.023f, 7.975f)
                curveTo(6.121f, 8.073f, 6.249f, 8.121f, 6.377f, 8.121f)
                curveTo(6.505f, 8.121f, 6.633f, 8.072f, 6.731f, 7.975f)
                lineTo(7.999f, 6.707f)
                verticalLineTo(8.5f)
                curveTo(7.999f, 8.776f, 8.223f, 9f, 8.499f, 9f)
                curveTo(8.775f, 9f, 8.999f, 8.776f, 8.999f, 8.5f)
                verticalLineTo(6.707f)
                lineTo(10.267f, 7.975f)
                curveTo(10.365f, 8.073f, 10.493f, 8.121f, 10.621f, 8.121f)
                curveTo(10.749f, 8.121f, 10.877f, 8.072f, 10.975f, 7.975f)
                curveTo(11.17f, 7.78f, 11.17f, 7.463f, 10.975f, 7.268f)
                lineTo(9.707f, 6f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 6f, 12f, 5.776f, 12f, 5.5f)
                curveTo(12f, 5.224f, 11.776f, 5f, 11.5f, 5f)
                horizontalLineTo(11.498f)
                close()
                moveTo(5f, 12f)
                curveTo(5f, 12.552f, 4.552f, 13f, 4f, 13f)
                curveTo(3.448f, 13f, 3f, 12.552f, 3f, 12f)
                curveTo(3f, 11.448f, 3.448f, 11f, 4f, 11f)
                curveTo(4.552f, 11f, 5f, 11.448f, 5f, 12f)
                close()
            }
        }.build()
        
        return _Regex!!
    }

private var _Regex: ImageVector? = null

