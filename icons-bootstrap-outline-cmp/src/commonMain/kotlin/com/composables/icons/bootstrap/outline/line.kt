package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Line: ImageVector
    get() {
        if (_Line != null) return _Line!!
        
        _Line = ImageVector.Builder(
            name = "line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                curveToRelative(4.411f, 0f, 8f, 2.912f, 8f, 6.492f)
                curveToRelative(0f, 1.433f, -0.555f, 2.723f, -1.715f, 3.994f)
                curveToRelative(-1.678f, 1.932f, -5.431f, 4.285f, -6.285f, 4.645f)
                curveToRelative(-0.83f, 0.35f, -0.734f, -0.197f, -0.696f, -0.413f)
                lineToRelative(0.003f, -0.018f)
                lineToRelative(0.114f, -0.685f)
                curveToRelative(0.027f, -0.204f, 0.055f, -0.521f, -0.026f, -0.723f)
                curveToRelative(-0.09f, -0.223f, -0.444f, -0.339f, -0.704f, -0.395f)
                curveTo(2.846f, 12.39f, 0f, 9.701f, 0f, 6.492f)
                curveTo(0f, 2.912f, 3.59f, 0f, 8f, 0f)
                moveTo(5.022f, 7.686f)
                horizontalLineTo(3.497f)
                verticalLineTo(4.918f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.155f, -0.156f)
                horizontalLineTo(2.78f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.156f, 0.156f)
                verticalLineToRelative(3.486f)
                curveToRelative(0f, 0.041f, 0.017f, 0.08f, 0.044f, 0.107f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(0.002f, 0.002f)
                arcToRelative(0.15f, 0.15f, 0f, false, false, 0.108f, 0.043f)
                horizontalLineToRelative(2.242f)
                curveToRelative(0.086f, 0f, 0.155f, -0.07f, 0.155f, -0.156f)
                verticalLineToRelative(-0.56f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.155f, -0.157f)
                moveToRelative(0.791f, -2.924f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.156f, 0.156f)
                verticalLineToRelative(3.486f)
                curveToRelative(0f, 0.086f, 0.07f, 0.155f, 0.156f, 0.155f)
                horizontalLineToRelative(0.562f)
                curveToRelative(0.086f, 0f, 0.155f, -0.07f, 0.155f, -0.155f)
                verticalLineTo(4.918f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.155f, -0.156f)
                close()
                moveToRelative(3.863f, 0f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.156f, 0.156f)
                verticalLineToRelative(2.07f)
                lineTo(7.923f, 4.832f)
                lineToRelative(-0.013f, -0.015f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(-0.003f, -0.003f)
                lineToRelative(-0.011f, -0.009f)
                horizontalLineToRelative(-0.001f)
                lineTo(7.88f, 4.79f)
                lineToRelative(-0.003f, -0.002f)
                lineToRelative(-0.005f, -0.003f)
                lineToRelative(-0.008f, -0.005f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.003f, -0.002f)
                lineToRelative(-0.01f, -0.004f)
                lineToRelative(-0.004f, -0.002f)
                lineToRelative(-0.01f, -0.003f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.003f, -0.001f)
                lineToRelative(-0.009f, -0.002f)
                horizontalLineToRelative(-0.006f)
                lineToRelative(-0.003f, -0.001f)
                horizontalLineToRelative(-0.004f)
                lineToRelative(-0.002f, -0.001f)
                horizontalLineToRelative(-0.574f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.156f, 0.155f)
                verticalLineToRelative(3.486f)
                curveToRelative(0f, 0.086f, 0.07f, 0.155f, 0.156f, 0.155f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.087f, 0f, 0.157f, -0.07f, 0.157f, -0.155f)
                verticalLineToRelative(-2.07f)
                lineToRelative(1.6f, 2.16f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, 0.039f, 0.038f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(0.01f, 0.006f)
                lineToRelative(0.004f, 0.002f)
                lineToRelative(0.008f, 0.004f)
                lineToRelative(0.007f, 0.003f)
                lineToRelative(0.005f, 0.002f)
                lineToRelative(0.01f, 0.003f)
                horizontalLineToRelative(0.003f)
                arcToRelative(0.2f, 0.2f, 0f, false, false, 0.04f, 0.006f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.087f, 0f, 0.157f, -0.07f, 0.157f, -0.155f)
                verticalLineTo(4.918f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.156f, -0.156f)
                close()
                moveToRelative(3.815f, 0.717f)
                verticalLineToRelative(-0.56f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.155f, -0.157f)
                horizontalLineToRelative(-2.242f)
                arcToRelative(0.16f, 0.16f, 0f, false, false, -0.108f, 0.044f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.002f, 0.003f)
                arcToRelative(0.16f, 0.16f, 0f, false, false, -0.044f, 0.107f)
                verticalLineToRelative(3.486f)
                curveToRelative(0f, 0.041f, 0.017f, 0.08f, 0.044f, 0.107f)
                lineToRelative(0.002f, 0.003f)
                lineToRelative(0.002f, 0.002f)
                arcToRelative(0.16f, 0.16f, 0f, false, false, 0.108f, 0.043f)
                horizontalLineToRelative(2.242f)
                curveToRelative(0.086f, 0f, 0.155f, -0.07f, 0.155f, -0.156f)
                verticalLineToRelative(-0.56f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.155f, -0.157f)
                horizontalLineTo(11.81f)
                verticalLineToRelative(-0.589f)
                horizontalLineToRelative(1.525f)
                curveToRelative(0.086f, 0f, 0.155f, -0.07f, 0.155f, -0.156f)
                verticalLineToRelative(-0.56f)
                arcToRelative(0.156f, 0.156f, 0f, false, false, -0.155f, -0.157f)
                horizontalLineTo(11.81f)
                verticalLineToRelative(-0.589f)
                horizontalLineToRelative(1.525f)
                curveToRelative(0.086f, 0f, 0.155f, -0.07f, 0.155f, -0.156f)
                close()
            }
        }.build()
        
        return _Line!!
    }

private var _Line: ImageVector? = null

