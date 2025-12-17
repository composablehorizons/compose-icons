package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Flower3: ImageVector
    get() {
        if (_Flower3 != null) return _Flower3!!
        
        _Flower3 = ImageVector.Builder(
            name = "flower3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.424f, 8f)
                curveToRelative(0.437f, -0.052f, 0.811f, -0.136f, 1.04f, -0.268f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -3.464f)
                curveToRelative(-0.229f, 0.132f, -0.489f, 0.414f, -0.752f, 0.767f)
                curveTo(9.886f, 4.63f, 10f, 4.264f, 10f, 4f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                curveToRelative(0f, 0.264f, 0.114f, 0.63f, 0.288f, 1.035f)
                curveToRelative(-0.263f, -0.353f, -0.523f, -0.635f, -0.752f, -0.767f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 3.464f)
                curveToRelative(0.229f, 0.132f, 0.603f, 0.216f, 1.04f, 0.268f)
                curveToRelative(-0.437f, 0.052f, -0.811f, 0.136f, -1.04f, 0.268f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, 3.464f)
                curveToRelative(0.229f, -0.132f, 0.489f, -0.414f, 0.752f, -0.767f)
                curveTo(6.114f, 11.37f, 6f, 11.736f, 6f, 12f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                curveToRelative(0f, -0.264f, -0.114f, -0.63f, -0.288f, -1.035f)
                curveToRelative(0.263f, 0.353f, 0.523f, 0.635f, 0.752f, 0.767f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -3.464f)
                curveToRelative(-0.229f, -0.132f, -0.603f, -0.216f, -1.04f, -0.268f)
                moveTo(9f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, -0.045f, 0.205f)
                quadToRelative(-0.059f, 0.2f, -0.183f, 0.484f)
                arcToRelative(13f, 13f, 0f, false, true, -0.637f, 1.223f)
                lineTo(8f, 6.142f)
                lineToRelative(-0.135f, -0.23f)
                arcToRelative(13f, 13f, 0f, false, true, -0.637f, -1.223f)
                arcToRelative(4f, 4f, 0f, false, true, -0.183f, -0.484f)
                arcTo(2f, 2f, 0f, false, true, 7f, 4f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                moveTo(3.67f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1.366f, -0.366f)
                arcToRelative(2f, 2f, 0f, false, true, 0.156f, 0.142f)
                quadToRelative(0.142f, 0.15f, 0.326f, 0.4f)
                curveToRelative(0.245f, 0.333f, 0.502f, 0.747f, 0.742f, 1.163f)
                lineToRelative(0.13f, 0.232f)
                lineToRelative(-0.265f, 0.002f)
                arcToRelative(13f, 13f, 0f, false, true, -1.379f, -0.06f)
                arcToRelative(4f, 4f, 0f, false, true, -0.51f, -0.083f)
                arcToRelative(2f, 2f, 0f, false, true, -0.2f, -0.064f)
                arcTo(1f, 1f, 0f, false, true, 3.67f, 5.5f)
                moveToRelative(1.366f, 5.366f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1.732f)
                lineToRelative(0.047f, -0.02f)
                quadToRelative(0.055f, -0.02f, 0.153f, -0.044f)
                quadToRelative(0.202f, -0.048f, 0.51f, -0.083f)
                arcToRelative(13f, 13f, 0f, false, true, 1.379f, -0.06f)
                quadToRelative(0.135f, 0f, 0.266f, 0.002f)
                lineToRelative(-0.131f, 0.232f)
                curveToRelative(-0.24f, 0.416f, -0.497f, 0.83f, -0.742f, 1.163f)
                arcToRelative(4f, 4f, 0f, false, true, -0.327f, 0.4f)
                arcToRelative(2f, 2f, 0f, false, true, -0.155f, 0.142f)
                moveTo(9f, 12f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 0.045f, -0.206f)
                quadToRelative(0.058f, -0.198f, 0.183f, -0.483f)
                curveToRelative(0.166f, -0.378f, 0.396f, -0.808f, 0.637f, -1.223f)
                lineTo(8f, 9.858f)
                lineToRelative(0.135f, 0.23f)
                curveToRelative(0.241f, 0.415f, 0.47f, 0.845f, 0.637f, 1.223f)
                quadToRelative(0.124f, 0.285f, 0.183f, 0.484f)
                arcTo(1.3f, 1.3f, 0f, false, true, 9f, 12f)
                moveToRelative(3.33f, -6.5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.366f, 1.366f)
                arcToRelative(2f, 2f, 0f, false, true, -0.2f, 0.064f)
                quadToRelative(-0.202f, 0.048f, -0.51f, 0.083f)
                curveToRelative(-0.412f, 0.045f, -0.898f, 0.061f, -1.379f, 0.06f)
                quadToRelative(-0.135f, 0f, -0.266f, -0.002f)
                lineToRelative(0.131f, -0.232f)
                curveToRelative(0.24f, -0.416f, 0.497f, -0.83f, 0.742f, -1.163f)
                arcToRelative(4f, 4f, 0f, false, true, 0.327f, -0.4f)
                quadToRelative(0.07f, -0.074f, 0.114f, -0.11f)
                lineToRelative(0.041f, -0.032f)
                arcToRelative(1f, 1f, 0f, false, true, 1.366f, 0.366f)
                moveToRelative(-1.366f, 5.366f)
                arcToRelative(2f, 2f, 0f, false, true, -0.155f, -0.141f)
                arcToRelative(4f, 4f, 0f, false, true, -0.327f, -0.4f)
                arcTo(13f, 13f, 0f, false, true, 9.74f, 9.16f)
                lineToRelative(-0.13f, -0.232f)
                lineToRelative(0.265f, -0.002f)
                curveToRelative(0.48f, -0.001f, 0.967f, 0.015f, 1.379f, 0.06f)
                quadToRelative(0.308f, 0.035f, 0.51f, 0.083f)
                quadToRelative(0.098f, 0.024f, 0.153f, 0.044f)
                lineToRelative(0.048f, 0.02f)
                arcToRelative(1f, 1f, 0f, true, true, -1f, 1.732f)
                close()
                moveTo(8f, 9f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
            }
        }.build()
        
        return _Flower3!!
    }

private var _Flower3: ImageVector? = null

