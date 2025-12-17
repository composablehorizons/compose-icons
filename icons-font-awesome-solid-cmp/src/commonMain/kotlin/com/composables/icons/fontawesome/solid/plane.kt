package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Plane: ImageVector
    get() {
        if (_Plane != null) return _Plane!!
        
        _Plane = ImageVector.Builder(
            name = "plane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 192f)
                horizontalLineTo(365.71f)
                lineTo(260.61f, 8.06f)
                arcTo(16.014f, 16.014f, 0f, false, false, 246.71f, 0f)
                horizontalLineToRelative(-65.5f)
                curveToRelative(-10.63f, 0f, -18.3f, 10.17f, -15.38f, 20.39f)
                lineTo(214.86f, 192f)
                horizontalLineTo(112f)
                lineToRelative(-43.2f, -57.6f)
                curveToRelative(-3.02f, -4.03f, -7.77f, -6.4f, -12.8f, -6.4f)
                horizontalLineTo(16.01f)
                curveTo(5.6f, 128f, -2.04f, 137.78f, 0.49f, 147.88f)
                lineTo(32f, 256f)
                lineTo(0.49f, 364.12f)
                curveTo(-2.04f, 374.22f, 5.6f, 384f, 16.01f, 384f)
                horizontalLineTo(56f)
                curveToRelative(5.04f, 0f, 9.78f, -2.37f, 12.8f, -6.4f)
                lineTo(112f, 320f)
                horizontalLineToRelative(102.86f)
                lineToRelative(-49.03f, 171.6f)
                curveToRelative(-2.92f, 10.22f, 4.75f, 20.4f, 15.38f, 20.4f)
                horizontalLineToRelative(65.5f)
                curveToRelative(5.74f, 0f, 11.04f, -3.08f, 13.89f, -8.06f)
                lineTo(365.71f, 320f)
                horizontalLineTo(480f)
                curveToRelative(35.35f, 0f, 96f, -28.65f, 96f, -64f)
                reflectiveCurveToRelative(-60.65f, -64f, -96f, -64f)
                close()
            }
        }.build()
        
        return _Plane!!
    }

private var _Plane: ImageVector? = null

