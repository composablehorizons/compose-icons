package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wifi_tethering: ImageVector
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
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 2.22f, 1.21f, 4.15f, 3f, 5.19f)
                lineToRelative(1f, -1.74f)
                curveToRelative(-1.19f, -0.7f, -2f, -1.97f, -2f, -3.45f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.48f, -0.81f, 2.75f, -2f, 3.45f)
                lineToRelative(1f, 1.74f)
                curveToRelative(1.79f, -1.04f, 3f, -2.97f, 3f, -5.19f)
                close()
                moveTo(12f, 3f)
                curveTo(6.48f, 3f, 2f, 7.48f, 2f, 13f)
                curveToRelative(0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f)
                lineToRelative(1f, -1.73f)
                curveTo(5.61f, 18.53f, 4f, 15.96f, 4f, 13f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                curveToRelative(0f, 2.96f, -1.61f, 5.53f, -4f, 6.92f)
                lineToRelative(1f, 1.73f)
                curveToRelative(2.99f, -1.73f, 5f, -4.95f, 5f, -8.65f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                close()
            }
        }.build()
        
        return _Wifi_tethering!!
    }

private var _Wifi_tethering: ImageVector? = null

