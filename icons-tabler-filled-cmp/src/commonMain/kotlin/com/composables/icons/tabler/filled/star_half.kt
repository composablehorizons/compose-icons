package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) return _StarHalf!!
        
        _StarHalf = ImageVector.Builder(
            name = "star-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(0.993f, 0.993f, 0f, false, true, 0.823f, 0.443f)
                lineToRelative(0.067f, 0.116f)
                lineToRelative(2.852f, 5.781f)
                lineToRelative(6.38f, 0.925f)
                curveToRelative(0.741f, 0.108f, 1.08f, 0.94f, 0.703f, 1.526f)
                lineToRelative(-0.07f, 0.095f)
                lineToRelative(-0.078f, 0.086f)
                lineToRelative(-4.624f, 4.499f)
                lineToRelative(1.09f, 6.355f)
                arcToRelative(1.001f, 1.001f, 0f, false, true, -1.249f, 1.135f)
                lineToRelative(-0.101f, -0.035f)
                lineToRelative(-0.101f, -0.046f)
                lineToRelative(-5.693f, -3f)
                lineToRelative(-5.706f, 3f)
                curveToRelative(-0.105f, 0.055f, -0.212f, 0.09f, -0.32f, 0.106f)
                lineToRelative(-0.106f, 0.01f)
                arcToRelative(1.003f, 1.003f, 0f, false, true, -1.038f, -1.06f)
                lineToRelative(0.013f, -0.11f)
                lineToRelative(1.09f, -6.355f)
                lineToRelative(-4.623f, -4.5f)
                arcToRelative(1.001f, 1.001f, 0f, false, true, 0.328f, -1.647f)
                lineToRelative(0.113f, -0.036f)
                lineToRelative(0.114f, -0.023f)
                lineToRelative(6.379f, -0.925f)
                lineToRelative(2.853f, -5.78f)
                arcToRelative(0.968f, 0.968f, 0f, false, true, 0.904f, -0.56f)
                close()
                moveToRelative(0f, 3.274f)
                verticalLineToRelative(12.476f)
                arcToRelative(1f, 1f, 0f, false, true, 0.239f, 0.029f)
                lineToRelative(0.115f, 0.036f)
                lineToRelative(0.112f, 0.05f)
                lineToRelative(4.363f, 2.299f)
                lineToRelative(-0.836f, -4.873f)
                arcToRelative(1f, 1f, 0f, false, true, 0.136f, -0.696f)
                lineToRelative(0.07f, -0.099f)
                lineToRelative(0.082f, -0.09f)
                lineToRelative(3.546f, -3.453f)
                lineToRelative(-4.891f, -0.708f)
                arcToRelative(1f, 1f, 0f, false, true, -0.62f, -0.344f)
                lineToRelative(-0.073f, -0.097f)
                lineToRelative(-0.06f, -0.106f)
                lineToRelative(-2.183f, -4.424f)
                close()
            }
        }.build()
        
        return _StarHalf!!
    }

private var _StarHalf: ImageVector? = null

