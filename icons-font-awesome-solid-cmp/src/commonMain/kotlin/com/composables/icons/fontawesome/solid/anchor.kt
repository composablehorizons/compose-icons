package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Anchor: ImageVector
    get() {
        if (_Anchor != null) return _Anchor!!
        
        _Anchor = ImageVector.Builder(
            name = "anchor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.971f, 352f)
                horizontalLineToRelative(32.394f)
                curveTo(67.172f, 454.735f, 181.944f, 512f, 288f, 512f)
                curveToRelative(106.229f, 0f, 220.853f, -57.38f, 242.635f, -160f)
                horizontalLineToRelative(32.394f)
                curveToRelative(10.691f, 0f, 16.045f, -12.926f, 8.485f, -20.485f)
                lineToRelative(-67.029f, -67.029f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineToRelative(-67.029f, 67.029f)
                curveToRelative(-7.56f, 7.56f, -2.206f, 20.485f, 8.485f, 20.485f)
                horizontalLineToRelative(35.146f)
                curveToRelative(-20.29f, 54.317f, -84.963f, 86.588f, -144.117f, 94.015f)
                verticalLineTo(256f)
                horizontalLineToRelative(52f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-52f)
                verticalLineToRelative(-5.47f)
                curveToRelative(37.281f, -13.178f, 63.995f, -48.725f, 64f, -90.518f)
                curveTo(384.005f, 43.772f, 341.605f, 0.738f, 289.37f, 0.01f)
                curveTo(235.723f, -0.739f, 192f, 42.525f, 192f, 96f)
                curveToRelative(0f, 41.798f, 26.716f, 77.35f, 64f, 90.53f)
                verticalLineTo(192f)
                horizontalLineToRelative(-52f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(190.015f)
                curveToRelative(-58.936f, -7.399f, -123.82f, -39.679f, -144.117f, -94.015f)
                horizontalLineToRelative(35.146f)
                curveToRelative(10.691f, 0f, 16.045f, -12.926f, 8.485f, -20.485f)
                lineToRelative(-67.029f, -67.029f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineTo(4.485f, 331.515f)
                curveTo(-3.074f, 339.074f, 2.28f, 352f, 12.971f, 352f)
                close()
                moveTo(288f, 64f)
                curveToRelative(17.645f, 0f, 32f, 14.355f, 32f, 32f)
                reflectiveCurveToRelative(-14.355f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.355f, -32f, -32f)
                reflectiveCurveToRelative(14.355f, -32f, 32f, -32f)
                close()
            }
        }.build()
        
        return _Anchor!!
    }

private var _Anchor: ImageVector? = null

