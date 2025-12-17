package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TypeH5: ImageVector
    get() {
        if (_TypeH5 != null) return _TypeH5!!
        
        _TypeH5 = ImageVector.Builder(
            name = "type-h5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 10.516f)
                horizontalLineToRelative(1.264f)
                curveToRelative(0.193f, 0.976f, 1.112f, 1.364f, 2.01f, 1.364f)
                curveToRelative(1.005f, 0f, 2.067f, -0.782f, 2.067f, -2.247f)
                curveToRelative(0f, -1.292f, -0.983f, -2.082f, -2.089f, -2.082f)
                curveToRelative(-1.012f, 0f, -1.658f, 0.596f, -1.924f, 1.077f)
                horizontalLineToRelative(-1.12f)
                lineTo(9.646f, 3f)
                horizontalLineToRelative(5.535f)
                verticalLineToRelative(1.141f)
                horizontalLineToRelative(-4.415f)
                lineTo(10.5f, 7.28f)
                horizontalLineToRelative(0.072f)
                curveToRelative(0.201f, -0.316f, 0.883f, -0.84f, 1.967f, -0.84f)
                curveToRelative(1.709f, 0f, 3.13f, 1.177f, 3.13f, 3.158f)
                curveToRelative(0f, 2.025f, -1.407f, 3.403f, -3.475f, 3.403f)
                curveToRelative(-1.809f, 0f, -3.1f, -1.048f, -3.194f, -2.484f)
                close()
                moveTo(7.495f, 13f)
                verticalLineTo(3.201f)
                horizontalLineTo(6.174f)
                verticalLineToRelative(4.15f)
                horizontalLineTo(1.32f)
                verticalLineTo(3.2f)
                horizontalLineTo(0f)
                verticalLineTo(13f)
                horizontalLineToRelative(1.32f)
                verticalLineTo(8.512f)
                horizontalLineToRelative(4.854f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _TypeH5!!
    }

private var _TypeH5: ImageVector? = null

