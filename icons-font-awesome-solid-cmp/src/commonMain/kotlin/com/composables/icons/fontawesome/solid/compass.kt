package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Compass: ImageVector
    get() {
        if (_Compass != null) return _Compass!!
        
        _Compass = ImageVector.Builder(
            name = "compass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(225.38f, 233.37f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0f, 45.25f)
                curveToRelative(12.49f, 12.5f, 32.76f, 12.5f, 45.25f, 0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.76f, 0f, -45.25f)
                curveToRelative(-12.5f, -12.49f, -32.76f, -12.49f, -45.25f, 0f)
                close()
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(126.14f, 148.05f)
                lineTo(308.17f, 300.4f)
                arcToRelative(31.938f, 31.938f, 0f, false, true, -15.77f, 15.77f)
                lineToRelative(-144.34f, 65.97f)
                curveToRelative(-16.65f, 7.61f, -33.81f, -9.55f, -26.2f, -26.2f)
                lineToRelative(65.98f, -144.35f)
                arcToRelative(31.938f, 31.938f, 0f, false, true, 15.77f, -15.77f)
                lineToRelative(144.34f, -65.97f)
                curveToRelative(16.65f, -7.6f, 33.8f, 9.55f, 26.19f, 26.2f)
                close()
            }
        }.build()
        
        return _Compass!!
    }

private var _Compass: ImageVector? = null

