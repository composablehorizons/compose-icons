package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignStop: ImageVector
    get() {
        if (_SignStop != null) return _SignStop!!
        
        _SignStop = ImageVector.Builder(
            name = "sign-stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.371f, 8.277f)
                verticalLineToRelative(-0.553f)
                curveToRelative(0f, -0.827f, -0.422f, -1.234f, -0.987f, -1.234f)
                curveToRelative(-0.572f, 0f, -0.99f, 0.407f, -0.99f, 1.234f)
                verticalLineToRelative(0.553f)
                curveToRelative(0f, 0.83f, 0.418f, 1.237f, 0.99f, 1.237f)
                curveToRelative(0.565f, 0f, 0.987f, -0.408f, 0.987f, -1.237f)
                moveToRelative(2.586f, -0.24f)
                curveToRelative(0.463f, 0f, 0.735f, -0.272f, 0.735f, -0.744f)
                reflectiveCurveToRelative(-0.272f, -0.741f, -0.735f, -0.741f)
                horizontalLineToRelative(-0.774f)
                verticalLineToRelative(1.485f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.893f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.353f, 0.146f)
                lineTo(0.146f, 4.54f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0f, 4.893f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.146f, 0.353f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.353f, 0.146f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.353f, -0.146f)
                lineToRelative(4.394f, -4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.146f, -0.353f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.146f, -0.353f)
                lineTo(11.46f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11.107f, 0f)
                close()
                moveTo(3.16f, 10.08f)
                curveToRelative(-0.931f, 0f, -1.447f, -0.493f, -1.494f, -1.132f)
                horizontalLineToRelative(0.653f)
                curveToRelative(0.065f, 0.346f, 0.396f, 0.583f, 0.891f, 0.583f)
                curveToRelative(0.524f, 0f, 0.83f, -0.246f, 0.83f, -0.62f)
                curveToRelative(0f, -0.303f, -0.203f, -0.467f, -0.637f, -0.572f)
                lineToRelative(-0.656f, -0.164f)
                curveToRelative(-0.61f, -0.147f, -0.978f, -0.51f, -0.978f, -1.078f)
                curveToRelative(0f, -0.706f, 0.597f, -1.184f, 1.444f, -1.184f)
                curveToRelative(0.853f, 0f, 1.386f, 0.475f, 1.436f, 1.087f)
                horizontalLineToRelative(-0.645f)
                curveToRelative(-0.064f, -0.32f, -0.352f, -0.542f, -0.797f, -0.542f)
                curveToRelative(-0.472f, 0f, -0.77f, 0.246f, -0.77f, 0.6f)
                curveToRelative(0f, 0.261f, 0.196f, 0.437f, 0.553f, 0.522f)
                lineToRelative(0.654f, 0.161f)
                curveToRelative(0.673f, 0.164f, 1.06f, 0.487f, 1.06f, 1.11f)
                curveToRelative(0f, 0.736f, -0.574f, 1.228f, -1.544f, 1.228f)
                close()
                moveToRelative(3.427f, -3.51f)
                verticalLineTo(10f)
                horizontalLineToRelative(-0.665f)
                verticalLineTo(6.57f)
                horizontalLineTo(4.753f)
                verticalLineTo(6f)
                horizontalLineToRelative(3.006f)
                verticalLineToRelative(0.568f)
                horizontalLineTo(6.587f)
                close()
                moveToRelative(4.458f, 1.16f)
                verticalLineToRelative(0.544f)
                curveToRelative(0f, 1.131f, -0.636f, 1.805f, -1.661f, 1.805f)
                curveToRelative(-1.026f, 0f, -1.664f, -0.674f, -1.664f, -1.805f)
                verticalLineTo(7.73f)
                curveToRelative(0f, -1.136f, 0.638f, -1.807f, 1.664f, -1.807f)
                reflectiveCurveToRelative(1.66f, 0.674f, 1.66f, 1.807f)
                close()
                moveTo(11.52f, 6f)
                horizontalLineToRelative(1.535f)
                curveToRelative(0.82f, 0f, 1.316f, 0.55f, 1.316f, 1.292f)
                curveToRelative(0f, 0.747f, -0.501f, 1.289f, -1.321f, 1.289f)
                horizontalLineToRelative(-0.865f)
                verticalLineTo(10f)
                horizontalLineToRelative(-0.665f)
                verticalLineTo(6.001f)
                close()
            }
        }.build()
        
        return _SignStop!!
    }

private var _SignStop: ImageVector? = null

