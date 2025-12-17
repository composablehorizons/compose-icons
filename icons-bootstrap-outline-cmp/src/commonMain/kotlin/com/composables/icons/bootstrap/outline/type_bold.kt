package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TypeBold: ImageVector
    get() {
        if (_TypeBold != null) return _TypeBold!!
        
        _TypeBold = ImageVector.Builder(
            name = "type-bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.21f, 13f)
                curveToRelative(2.106f, 0f, 3.412f, -1.087f, 3.412f, -2.823f)
                curveToRelative(0f, -1.306f, -0.984f, -2.283f, -2.324f, -2.386f)
                verticalLineToRelative(-0.055f)
                arcToRelative(2.176f, 2.176f, 0f, false, false, 1.852f, -2.14f)
                curveToRelative(0f, -1.51f, -1.162f, -2.46f, -3.014f, -2.46f)
                horizontalLineTo(3.843f)
                verticalLineTo(13f)
                close()
                moveTo(5.908f, 4.674f)
                horizontalLineToRelative(1.696f)
                curveToRelative(0.963f, 0f, 1.517f, 0.451f, 1.517f, 1.244f)
                curveToRelative(0f, 0.834f, -0.629f, 1.32f, -1.73f, 1.32f)
                horizontalLineTo(5.908f)
                verticalLineTo(4.673f)
                close()
                moveToRelative(0f, 6.788f)
                verticalLineTo(8.598f)
                horizontalLineToRelative(1.73f)
                curveToRelative(1.217f, 0f, 1.88f, 0.492f, 1.88f, 1.415f)
                curveToRelative(0f, 0.943f, -0.643f, 1.449f, -1.832f, 1.449f)
                horizontalLineTo(5.907f)
                close()
            }
        }.build()
        
        return _TypeBold!!
    }

private var _TypeBold: ImageVector? = null

