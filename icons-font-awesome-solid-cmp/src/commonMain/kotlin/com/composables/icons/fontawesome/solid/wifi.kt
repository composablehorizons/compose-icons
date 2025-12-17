package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Wifi: ImageVector
    get() {
        if (_Wifi != null) return _Wifi!!
        
        _Wifi = ImageVector.Builder(
            name = "wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(634.91f, 154.88f)
                curveTo(457.74f, -8.99f, 182.19f, -8.93f, 5.09f, 154.88f)
                curveToRelative(-6.66f, 6.16f, -6.79f, 16.59f, -0.35f, 22.98f)
                lineToRelative(34.24f, 33.97f)
                curveToRelative(6.14f, 6.1f, 16.02f, 6.23f, 22.4f, 0.38f)
                curveToRelative(145.92f, -133.68f, 371.3f, -133.71f, 517.25f, 0f)
                curveToRelative(6.38f, 5.85f, 16.26f, 5.71f, 22.4f, -0.38f)
                lineToRelative(34.24f, -33.97f)
                curveToRelative(6.43f, -6.39f, 6.3f, -16.82f, -0.36f, -22.98f)
                close()
                moveTo(320f, 352f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                reflectiveCurveToRelative(28.65f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.65f, 64f, -64f)
                reflectiveCurveToRelative(-28.65f, -64f, -64f, -64f)
                close()
                moveToRelative(202.67f, -83.59f)
                curveToRelative(-115.26f, -101.93f, -290.21f, -101.82f, -405.34f, 0f)
                curveToRelative(-6.9f, 6.1f, -7.12f, 16.69f, -0.57f, 23.15f)
                lineToRelative(34.44f, 33.99f)
                curveToRelative(6f, 5.92f, 15.66f, 6.32f, 22.05f, 0.8f)
                curveToRelative(83.95f, -72.57f, 209.74f, -72.41f, 293.49f, 0f)
                curveToRelative(6.39f, 5.52f, 16.05f, 5.13f, 22.05f, -0.8f)
                lineToRelative(34.44f, -33.99f)
                curveToRelative(6.56f, -6.46f, 6.33f, -17.06f, -0.56f, -23.15f)
                close()
            }
        }.build()
        
        return _Wifi!!
    }

private var _Wifi: ImageVector? = null

