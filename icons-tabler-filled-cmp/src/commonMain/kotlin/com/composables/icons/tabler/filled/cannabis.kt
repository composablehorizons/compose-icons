package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Cannabis: ImageVector
    get() {
        if (_Cannabis != null) return _Cannabis!!
        
        _Cannabis = ImageVector.Builder(
            name = "cannabis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.894f, 1.553f)
                curveToRelative(1.472f, 2.945f, 2.17f, 5.028f, 2.244f, 6.812f)
                lineToRelative(0.001f, 0.091f)
                lineToRelative(0.032f, -0.022f)
                arcToRelative(8.7f, 8.7f, 0f, false, true, 2.73f, -1.191f)
                lineToRelative(0.352f, -0.079f)
                arcToRelative(8f, 8f, 0f, false, true, 1.562f, -0.169f)
                lineToRelative(0.253f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.85f, 1.396f)
                curveToRelative(-0.949f, 2.187f, -1.818f, 3.595f, -2.902f, 4.664f)
                lineToRelative(-0.061f, 0.058f)
                lineToRelative(0.25f, 0.055f)
                quadToRelative(0.45f, 0.108f, 0.869f, 0.259f)
                lineToRelative(0.276f, 0.104f)
                curveToRelative(0.586f, 0.235f, 1.006f, 0.479f, 1.25f, 0.662f)
                arcToRelative(1f, 1f, 0f, false, true, -0.042f, 1.63f)
                lineToRelative(-0.199f, 0.112f)
                lineToRelative(-1.133f, 0.587f)
                curveToRelative(-0.567f, 0.289f, -1.166f, 0.584f, -1.404f, 0.67f)
                quadToRelative(-0.123f, 0.045f, -0.244f, 0.083f)
                lineToRelative(-0.074f, 0.019f)
                lineToRelative(0.016f, 0.042f)
                curveToRelative(0.327f, 0.912f, 0.456f, 1.789f, 0.477f, 2.462f)
                lineToRelative(0.003f, 0.195f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                curveToRelative(-1.257f, 0f, -2.77f, -0.729f, -4.001f, -1.647f)
                lineToRelative(0.001f, 2.647f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-2.647f)
                curveToRelative(-1.16f, 0.866f, -2.57f, 1.563f, -3.781f, 1.64f)
                lineToRelative(-0.219f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                curveToRelative(0f, -0.624f, 0.098f, -1.464f, 0.379f, -2.358f)
                lineToRelative(0.116f, -0.341f)
                lineToRelative(-0.073f, -0.02f)
                lineToRelative(-0.244f, -0.081f)
                curveToRelative(-0.343f, -0.125f, -1.442f, -0.686f, -2.106f, -1.032f)
                lineToRelative(-0.52f, -0.274f)
                arcToRelative(1f, 1f, 0f, false, true, -0.152f, -1.694f)
                curveToRelative(0.244f, -0.183f, 0.664f, -0.427f, 1.25f, -0.662f)
                arcToRelative(8f, 8f, 0f, false, true, 1.145f, -0.363f)
                lineToRelative(0.249f, -0.055f)
                lineToRelative(-0.06f, -0.058f)
                curveToRelative(-1.024f, -1.01f, -1.856f, -2.322f, -2.744f, -4.307f)
                lineToRelative(-0.157f, -0.357f)
                arcToRelative(1f, 1f, 0f, false, true, 0.724f, -1.38f)
                lineToRelative(0.149f, -0.017f)
                lineToRelative(0.058f, -0.003f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 1.744f, 0.159f)
                arcToRelative(8.6f, 8.6f, 0f, false, true, 2.727f, 1.045f)
                lineToRelative(0.27f, 0.169f)
                verticalLineToRelative(-0.037f)
                curveToRelative(-0.028f, -1.594f, 0.375f, -3.18f, 1.095f, -4.704f)
                lineToRelative(0.139f, -0.285f)
                curveToRelative(0.455f, -0.908f, 0.914f, -1.586f, 1.238f, -1.98f)
                arcToRelative(1f, 1f, 0f, false, true, 1.666f, 0.189f)
            }
        }.build()
        
        return _Cannabis!!
    }

private var _Cannabis: ImageVector? = null

