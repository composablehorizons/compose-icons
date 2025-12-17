package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EvFront: ImageVector
    get() {
        if (_EvFront != null) return _EvFront!!
        
        _EvFront = ImageVector.Builder(
            name = "ev-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.354f, 4.243f)
                arcToRelative(0.19f, 0.19f, 0f, false, false, -0.085f, -0.218f)
                arcToRelative(0.186f, 0.186f, 0f, false, false, -0.23f, 0.034f)
                lineTo(6.051f, 7.246f)
                arcToRelative(0.188f, 0.188f, 0f, false, false, 0.136f, 0.316f)
                horizontalLineToRelative(1.241f)
                lineToRelative(-0.673f, 2.195f)
                arcToRelative(0.19f, 0.19f, 0f, false, false, 0.085f, 0.218f)
                curveToRelative(0.075f, 0.043f, 0.17f, 0.03f, 0.23f, -0.034f)
                lineToRelative(2.88f, -3.187f)
                arcToRelative(0.188f, 0.188f, 0f, false, false, -0.137f, -0.316f)
                horizontalLineTo(8.572f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.819f, 2f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2.52f, 3.515f)
                lineToRelative(-0.792f, 1.848f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.38f, 0.404f)
                curveToRelative(-0.5f, 0.25f, -0.855f, 0.715f, -0.965f, 1.262f)
                lineTo(0.05f, 8.708f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.049f, 0.49f)
                verticalLineToRelative(0.413f)
                curveToRelative(0f, 0.814f, 0.39f, 1.543f, 1f, 1.997f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.338f)
                curveToRelative(1.292f, 0.048f, 2.745f, 0.088f, 4f, 0.088f)
                reflectiveCurveToRelative(2.708f, -0.04f, 4f, -0.088f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.892f)
                curveToRelative(0.61f, -0.454f, 1f, -1.183f, 1f, -1.997f)
                verticalLineToRelative(-0.413f)
                quadToRelative(0f, -0.248f, -0.049f, -0.49f)
                lineToRelative(-0.335f, -1.68f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, -0.964f, -1.261f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -0.381f, -0.404f)
                lineToRelative(-0.792f, -1.848f)
                arcTo(2.5f, 2.5f, 0f, false, false, 11.181f, 2f)
                horizontalLineTo(4.82f)
                close()
                moveTo(3.44f, 3.91f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.82f, 3f)
                horizontalLineToRelative(6.362f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.379f, 0.91f)
                lineToRelative(0.792f, 1.847f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 0.853f, 0.904f)
                curveToRelative(0.222f, 0.112f, 0.381f, 0.32f, 0.43f, 0.564f)
                lineToRelative(0.336f, 1.679f)
                quadToRelative(0.03f, 0.146f, 0.029f, 0.294f)
                verticalLineToRelative(0.413f)
                arcToRelative(1.48f, 1.48f, 0f, false, true, -1.408f, 1.484f)
                curveToRelative(-1.555f, 0.07f, -3.786f, 0.155f, -5.592f, 0.155f)
                reflectiveCurveToRelative(-4.037f, -0.084f, -5.592f, -0.155f)
                arcTo(1.48f, 1.48f, 0f, false, true, 1f, 9.611f)
                verticalLineToRelative(-0.413f)
                quadToRelative(0f, -0.148f, 0.03f, -0.294f)
                lineToRelative(0.335f, -1.68f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 0.43f, -0.563f)
                curveToRelative(0.383f, -0.19f, 0.685f, -0.511f, 0.853f, -0.904f)
                close()
            }
        }.build()
        
        return _EvFront!!
    }

private var _EvFront: ImageVector? = null

