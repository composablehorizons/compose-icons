package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wifi_password: ImageVector
    get() {
        if (_Wifi_password != null) return _Wifi_password!!
        
        _Wifi_password = ImageVector.Builder(
            name = "wifi_password",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(24f, 8.98f)
                    lineToRelative(-2.12f, 2.13f)
                    curveTo(19.35f, 8.57f, 15.85f, 7f, 12f, 7f)
                    reflectiveCurveToRelative(-7.35f, 1.57f, -9.88f, 4.11f)
                    lineTo(0f, 8.98f)
                    curveTo(3.07f, 5.9f, 7.31f, 4f, 12f, 4f)
                    reflectiveCurveTo(20.93f, 5.9f, 24f, 8.98f)
                    close()
                    moveTo(4.24f, 13.22f)
                    lineToRelative(2.12f, 2.12f)
                    curveTo(7.8f, 13.9f, 9.8f, 13f, 12f, 13f)
                    curveToRelative(2.2f, 0f, 4.2f, 0.9f, 5.64f, 2.35f)
                    lineToRelative(2.12f, -2.12f)
                    curveTo(17.78f, 11.23f, 15.03f, 10f, 12f, 10f)
                    curveTo(8.97f, 10f, 6.22f, 11.23f, 4.24f, 13.22f)
                    close()
                    moveTo(24f, 20f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(1f)
                    curveTo(23.55f, 19f, 24f, 19.45f, 24f, 20f)
                    close()
                    moveTo(22f, 18f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(12f, 16f)
                    curveToRelative(-1.38f, 0f, -2.63f, 0.56f, -3.53f, 1.46f)
                    lineTo(12f, 21f)
                    lineToRelative(3.53f, -3.54f)
                    curveTo(14.63f, 16.56f, 13.38f, 16f, 12f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Wifi_password!!
    }

private var _Wifi_password: ImageVector? = null

