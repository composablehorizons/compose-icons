package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Error: ImageVector
    get() {
        if (_Error != null) return _Error!!
        
        _Error = ImageVector.Builder(
            name = "error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(4.14f, 1f, 1f, 4.14f, 1f, 8f)
                curveTo(1f, 11.86f, 4.14f, 15f, 8f, 15f)
                curveTo(11.86f, 15f, 15f, 11.86f, 15f, 8f)
                curveTo(15f, 4.14f, 11.86f, 1f, 8f, 1f)
                close()
                moveTo(8f, 14f)
                curveTo(4.691f, 14f, 2f, 11.309f, 2f, 8f)
                curveTo(2f, 4.691f, 4.691f, 2f, 8f, 2f)
                curveTo(11.309f, 2f, 14f, 4.691f, 14f, 8f)
                curveTo(14f, 11.309f, 11.309f, 14f, 8f, 14f)
                close()
                moveTo(10.854f, 5.854f)
                lineTo(8.708f, 8f)
                lineTo(10.854f, 10.146f)
                curveTo(11.049f, 10.341f, 11.049f, 10.658f, 10.854f, 10.853f)
                curveTo(10.756f, 10.951f, 10.628f, 10.999f, 10.5f, 10.999f)
                curveTo(10.372f, 10.999f, 10.244f, 10.95f, 10.146f, 10.853f)
                lineTo(8f, 8.707f)
                lineTo(5.854f, 10.853f)
                curveTo(5.756f, 10.951f, 5.628f, 10.999f, 5.5f, 10.999f)
                curveTo(5.372f, 10.999f, 5.244f, 10.95f, 5.146f, 10.853f)
                curveTo(4.951f, 10.658f, 4.951f, 10.341f, 5.146f, 10.146f)
                lineTo(7.292f, 8f)
                lineTo(5.146f, 5.854f)
                curveTo(4.951f, 5.659f, 4.951f, 5.342f, 5.146f, 5.147f)
                curveTo(5.341f, 4.952f, 5.658f, 4.952f, 5.853f, 5.147f)
                lineTo(7.999f, 7.293f)
                lineTo(10.145f, 5.147f)
                curveTo(10.34f, 4.952f, 10.657f, 4.952f, 10.852f, 5.147f)
                curveTo(11.047f, 5.342f, 11.047f, 5.659f, 10.852f, 5.854f)
                horizontalLineTo(10.854f)
                close()
            }
        }.build()
        
        return _Error!!
    }

private var _Error: ImageVector? = null

