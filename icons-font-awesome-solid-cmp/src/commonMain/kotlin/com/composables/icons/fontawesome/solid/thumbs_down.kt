package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ThumbsDown: ImageVector
    get() {
        if (_ThumbsDown != null) return _ThumbsDown!!
        
        _ThumbsDown = ImageVector.Builder(
            name = "thumbs-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 56f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(80f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveTo(10.745f, 32f, 0f, 42.745f, 0f, 56f)
                close()
                moveToRelative(40f, 200f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.745f, -24f, -24f)
                close()
                moveToRelative(272f, 256f)
                curveToRelative(-20.183f, 0f, -29.485f, -39.293f, -33.931f, -57.795f)
                curveToRelative(-5.206f, -21.666f, -10.589f, -44.07f, -25.393f, -58.902f)
                curveToRelative(-32.469f, -32.524f, -49.503f, -73.967f, -89.117f, -113.111f)
                arcToRelative(11.98f, 11.98f, 0f, false, true, -3.558f, -8.521f)
                verticalLineTo(59.901f)
                curveToRelative(0f, -6.541f, 5.243f, -11.878f, 11.783f, -11.998f)
                curveToRelative(15.831f, -0.29f, 36.694f, -9.079f, 52.651f, -16.178f)
                curveTo(256.189f, 17.598f, 295.709f, 0.017f, 343.995f, 0f)
                horizontalLineToRelative(2.844f)
                curveToRelative(42.777f, 0f, 93.363f, 0.413f, 113.774f, 29.737f)
                curveToRelative(8.392f, 12.057f, 10.446f, 27.034f, 6.148f, 44.632f)
                curveToRelative(16.312f, 17.053f, 25.063f, 48.863f, 16.382f, 74.757f)
                curveToRelative(17.544f, 23.432f, 19.143f, 56.132f, 9.308f, 79.469f)
                lineToRelative(0.11f, 0.11f)
                curveToRelative(11.893f, 11.949f, 19.523f, 31.259f, 19.439f, 49.197f)
                curveToRelative(-0.156f, 30.352f, -26.157f, 58.098f, -59.553f, 58.098f)
                horizontalLineTo(350.723f)
                curveTo(358.03f, 364.34f, 384f, 388.132f, 384f, 430.548f)
                curveTo(384f, 504f, 336f, 512f, 312f, 512f)
                close()
            }
        }.build()
        
        return _ThumbsDown!!
    }

private var _ThumbsDown: ImageVector? = null

