package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HandThumbsDown: ImageVector
    get() {
        if (_HandThumbsDown != null) return _HandThumbsDown!!
        
        _HandThumbsDown = ImageVector.Builder(
            name = "hand-thumbs-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.956f, 14.534f)
                curveToRelative(0.065f, 0.936f, 0.952f, 1.659f, 1.908f, 1.42f)
                lineToRelative(0.261f, -0.065f)
                arcToRelative(1.38f, 1.38f, 0f, false, false, 1.012f, -0.965f)
                curveToRelative(0.22f, -0.816f, 0.533f, -2.512f, 0.062f, -4.51f)
                quadToRelative(0.205f, 0.03f, 0.443f, 0.051f)
                curveToRelative(0.713f, 0.065f, 1.669f, 0.071f, 2.516f, -0.211f)
                curveToRelative(0.518f, -0.173f, 0.994f, -0.68f, 1.2f, -1.272f)
                arcToRelative(1.9f, 1.9f, 0f, false, false, -0.234f, -1.734f)
                curveToRelative(0.058f, -0.118f, 0.103f, -0.242f, 0.138f, -0.362f)
                curveToRelative(0.077f, -0.27f, 0.113f, -0.568f, 0.113f, -0.856f)
                curveToRelative(0f, -0.29f, -0.036f, -0.586f, -0.113f, -0.857f)
                arcToRelative(2f, 2f, 0f, false, false, -0.16f, -0.403f)
                curveToRelative(0.169f, -0.387f, 0.107f, -0.82f, -0.003f, -1.149f)
                arcToRelative(3.2f, 3.2f, 0f, false, false, -0.488f, -0.9f)
                curveToRelative(0.054f, -0.153f, 0.076f, -0.313f, 0.076f, -0.465f)
                arcToRelative(1.86f, 1.86f, 0f, false, false, -0.253f, -0.912f)
                curveTo(13.1f, 0.757f, 12.437f, 0.28f, 11.5f, 0.28f)
                horizontalLineTo(8f)
                curveToRelative(-0.605f, 0f, -1.07f, 0.08f, -1.466f, 0.217f)
                arcToRelative(4.8f, 4.8f, 0f, false, false, -0.97f, 0.485f)
                lineToRelative(-0.048f, 0.029f)
                curveToRelative(-0.504f, 0.308f, -0.999f, 0.61f, -2.068f, 0.723f)
                curveTo(2.682f, 1.815f, 2f, 2.434f, 2f, 3.279f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.851f, 0.685f, 1.433f, 1.357f, 1.616f)
                curveToRelative(0.849f, 0.232f, 1.574f, 0.787f, 2.132f, 1.41f)
                curveToRelative(0.56f, 0.626f, 0.914f, 1.28f, 1.039f, 1.638f)
                curveToRelative(0.199f, 0.575f, 0.356f, 1.54f, 0.428f, 2.591f)
            }
        }.build()
        
        return _HandThumbsDown!!
    }

private var _HandThumbsDown: ImageVector? = null

