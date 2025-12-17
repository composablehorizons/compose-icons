package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CircleNotch: ImageVector
    get() {
        if (_CircleNotch != null) return _CircleNotch!!
        
        _CircleNotch = ImageVector.Builder(
            name = "circle-notch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 39.056f)
                verticalLineToRelative(16.659f)
                curveToRelative(0f, 10.804f, 7.281f, 20.159f, 17.686f, 23.066f)
                curveTo(383.204f, 100.434f, 440f, 171.518f, 440f, 256f)
                curveToRelative(0f, 101.689f, -82.295f, 184f, -184f, 184f)
                curveToRelative(-101.689f, 0f, -184f, -82.295f, -184f, -184f)
                curveToRelative(0f, -84.47f, 56.786f, -155.564f, 134.312f, -177.219f)
                curveTo(216.719f, 75.874f, 224f, 66.517f, 224f, 55.712f)
                verticalLineTo(39.064f)
                curveToRelative(0f, -15.709f, -14.834f, -27.153f, -30.046f, -23.234f)
                curveTo(86.603f, 43.482f, 7.394f, 141.206f, 8.003f, 257.332f)
                curveToRelative(0.72f, 137.052f, 111.477f, 246.956f, 248.531f, 246.667f)
                curveTo(393.255f, 503.711f, 504f, 392.788f, 504f, 256f)
                curveToRelative(0f, -115.633f, -79.14f, -212.779f, -186.211f, -240.236f)
                curveTo(302.678f, 11.889f, 288f, 23.456f, 288f, 39.056f)
                close()
            }
        }.build()
        
        return _CircleNotch!!
    }

private var _CircleNotch: ImageVector? = null

