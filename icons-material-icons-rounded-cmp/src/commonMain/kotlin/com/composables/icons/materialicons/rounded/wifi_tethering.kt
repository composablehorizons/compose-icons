package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_tethering: ImageVector
    get() {
        if (_Wifi_tethering != null) return _Wifi_tethering!!
        
        _Wifi_tethering = ImageVector.Builder(
            name = "wifi_tethering",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(6f, 2f)
                curveToRelative(0f, -3.56f, -3.11f, -6.4f, -6.75f, -5.95f)
                curveToRelative(-2.62f, 0.32f, -4.78f, 2.41f, -5.18f, 5.02f)
                curveToRelative(-0.33f, 2.15f, 0.49f, 4.11f, 1.93f, 5.4f)
                curveToRelative(0.48f, 0.43f, 1.23f, 0.33f, 1.56f, -0.23f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.24f, -0.42f, 0.14f, -0.93f, -0.22f, -1.26f)
                curveToRelative(-1.03f, -0.93f, -1.59f, -2.37f, -1.22f, -3.94f)
                curveToRelative(0.33f, -1.42f, 1.48f, -2.57f, 2.9f, -2.91f)
                curveTo(13.65f, 8.49f, 16f, 10.47f, 16f, 13f)
                curveToRelative(0f, 1.18f, -0.52f, 2.23f, -1.33f, 2.96f)
                curveToRelative(-0.36f, 0.32f, -0.47f, 0.84f, -0.23f, 1.26f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.31f, 0.53f, 1.03f, 0.69f, 1.5f, 0.28f)
                curveTo(17.2f, 16.41f, 18f, 14.8f, 18f, 13f)
                close()
                moveToRelative(-7.17f, -9.93f)
                curveToRelative(-4.62f, 0.52f, -8.35f, 4.33f, -8.78f, 8.96f)
                curveToRelative(-0.35f, 3.7f, 1.32f, 7.02f, 4.02f, 9.01f)
                curveToRelative(0.48f, 0.35f, 1.16f, 0.2f, 1.46f, -0.31f)
                curveToRelative(0.25f, -0.43f, 0.14f, -0.99f, -0.26f, -1.29f)
                curveToRelative(-2.28f, -1.69f, -3.65f, -4.55f, -3.16f, -7.7f)
                curveToRelative(0.54f, -3.5f, 3.46f, -6.29f, 6.98f, -6.68f)
                curveTo(15.91f, 4.51f, 20f, 8.28f, 20f, 13f)
                curveToRelative(0f, 2.65f, -1.29f, 4.98f, -3.27f, 6.44f)
                curveToRelative(-0.4f, 0.3f, -0.51f, 0.85f, -0.26f, 1.29f)
                curveToRelative(0.3f, 0.52f, 0.98f, 0.66f, 1.46f, 0.31f)
                curveTo(20.4f, 19.22f, 22f, 16.3f, 22f, 13f)
                curveToRelative(0f, -5.91f, -5.13f, -10.62f, -11.17f, -9.93f)
                close()
            }
        }.build()
        
        return _Wifi_tethering!!
    }

private var _Wifi_tethering: ImageVector? = null

