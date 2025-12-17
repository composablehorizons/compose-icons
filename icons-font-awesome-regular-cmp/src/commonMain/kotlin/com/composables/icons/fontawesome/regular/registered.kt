package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Registered: ImageVector
    get() {
        if (_Registered != null) return _Registered!!
        
        _Registered = ImageVector.Builder(
            name = "registered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.033f, 8f, 8f, 119.033f, 8f, 256f)
                reflectiveCurveToRelative(111.033f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.033f, 248f, -248f)
                reflectiveCurveTo(392.967f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-110.532f, 0f, -200f, -89.451f, -200f, -200f)
                curveToRelative(0f, -110.531f, 89.451f, -200f, 200f, -200f)
                curveToRelative(110.532f, 0f, 200f, 89.451f, 200f, 200f)
                curveToRelative(0f, 110.532f, -89.451f, 200f, -200f, 200f)
                close()
                moveToRelative(110.442f, -81.791f)
                curveToRelative(-53.046f, -96.284f, -50.25f, -91.468f, -53.271f, -96.085f)
                curveToRelative(24.267f, -13.879f, 39.482f, -41.563f, 39.482f, -73.176f)
                curveToRelative(0f, -52.503f, -30.247f, -85.252f, -101.498f, -85.252f)
                horizontalLineToRelative(-78.667f)
                curveToRelative(-6.617f, 0f, -12f, 5.383f, -12f, 12f)
                verticalLineTo(380f)
                curveToRelative(0f, 6.617f, 5.383f, 12f, 12f, 12f)
                horizontalLineToRelative(38.568f)
                curveToRelative(6.617f, 0f, 12f, -5.383f, 12f, -12f)
                verticalLineToRelative(-83.663f)
                horizontalLineToRelative(31.958f)
                lineToRelative(47.515f, 89.303f)
                arcToRelative(11.98f, 11.98f, 0f, false, false, 10.593f, 6.36f)
                horizontalLineToRelative(42.81f)
                curveToRelative(9.14f, 0f, 14.914f, -9.799f, 10.51f, -17.791f)
                close()
                moveTo(256.933f, 239.906f)
                horizontalLineToRelative(-33.875f)
                verticalLineToRelative(-64.14f)
                horizontalLineToRelative(27.377f)
                curveToRelative(32.417f, 0f, 38.929f, 12.133f, 38.929f, 31.709f)
                curveToRelative(-0.001f, 20.913f, -11.518f, 32.431f, -32.431f, 32.431f)
                close()
            }
        }.build()
        
        return _Registered!!
    }

private var _Registered: ImageVector? = null

