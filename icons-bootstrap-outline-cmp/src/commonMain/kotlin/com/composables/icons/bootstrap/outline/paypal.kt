package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Paypal: ImageVector
    get() {
        if (_Paypal != null) return _Paypal!!
        
        _Paypal = ImageVector.Builder(
            name = "paypal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.06f, 3.713f)
                curveToRelative(0.12f, -1.071f, -0.093f, -1.832f, -0.702f, -2.526f)
                curveTo(12.628f, 0.356f, 11.312f, 0f, 9.626f, 0f)
                horizontalLineTo(4.734f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.691f, 0.59f)
                lineTo(2.005f, 13.509f)
                arcToRelative(0.42f, 0.42f, 0f, false, false, 0.415f, 0.486f)
                horizontalLineToRelative(2.756f)
                lineToRelative(-0.202f, 1.28f)
                arcToRelative(0.628f, 0.628f, 0f, false, false, 0.62f, 0.726f)
                horizontalLineTo(8.14f)
                curveToRelative(0.429f, 0f, 0.793f, -0.31f, 0.862f, -0.731f)
                lineToRelative(0.025f, -0.13f)
                lineToRelative(0.48f, -3.043f)
                lineToRelative(0.03f, -0.164f)
                lineToRelative(0.001f, -0.007f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, 0.348f, -0.297f)
                horizontalLineToRelative(0.38f)
                curveToRelative(1.266f, 0f, 2.425f, -0.256f, 3.345f, -0.91f)
                quadToRelative(0.57f, -0.403f, 0.993f, -1.005f)
                arcToRelative(4.94f, 4.94f, 0f, false, false, 0.88f, -2.195f)
                curveToRelative(0.242f, -1.246f, 0.13f, -2.356f, -0.57f, -3.154f)
                arcToRelative(2.7f, 2.7f, 0f, false, false, -0.76f, -0.59f)
                lineToRelative(-0.094f, -0.061f)
                close()
                moveTo(6.543f, 8.82f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 0.321f, -0.079f)
                horizontalLineTo(8.3f)
                curveToRelative(2.82f, 0f, 5.027f, -1.144f, 5.672f, -4.456f)
                lineToRelative(0.003f, -0.016f)
                quadToRelative(0.326f, 0.186f, 0.548f, 0.438f)
                curveToRelative(0.546f, 0.623f, 0.679f, 1.535f, 0.45f, 2.71f)
                curveToRelative(-0.272f, 1.397f, -0.866f, 2.307f, -1.663f, 2.874f)
                curveToRelative(-0.802f, 0.57f, -1.842f, 0.815f, -3.043f, 0.815f)
                horizontalLineToRelative(-0.38f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, -0.863f, 0.734f)
                lineToRelative(-0.03f, 0.164f)
                lineToRelative(-0.48f, 3.043f)
                lineToRelative(-0.024f, 0.13f)
                lineToRelative(-0.001f, 0.004f)
                arcToRelative(0.35f, 0.35f, 0f, false, true, -0.348f, 0.296f)
                horizontalLineTo(5.595f)
                arcToRelative(0.106f, 0.106f, 0f, false, true, -0.105f, -0.123f)
                lineToRelative(0.208f, -1.32f)
                close()
            }
        }.build()
        
        return _Paypal!!
    }

private var _Paypal: ImageVector? = null

