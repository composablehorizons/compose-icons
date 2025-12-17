package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_password: ImageVector
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
                    moveTo(18.49f, 12.13f)
                    curveTo(16.67f, 10.79f, 14.43f, 10f, 12f, 10f)
                    curveToRelative(-2.43f, 0f, -4.67f, 0.79f, -6.49f, 2.13f)
                    curveToRelative(-0.72f, 0.53f, -0.76f, 1.6f, -0.13f, 2.24f)
                    curveToRelative(0.53f, 0.54f, 1.37f, 0.57f, 1.98f, 0.12f)
                    curveTo(8.67f, 13.55f, 10.27f, 13f, 12f, 13f)
                    curveToRelative(1.73f, 0f, 3.33f, 0.55f, 4.64f, 1.49f)
                    curveToRelative(0.62f, 0.44f, 1.45f, 0.41f, 1.98f, -0.12f)
                    curveTo(19.26f, 13.73f, 19.22f, 12.66f, 18.49f, 12.13f)
                    close()
                    moveTo(22.8f, 7.89f)
                    curveTo(19.86f, 5.46f, 16.1f, 4f, 12f, 4f)
                    reflectiveCurveTo(4.14f, 5.46f, 1.2f, 7.89f)
                    curveTo(0.53f, 8.44f, 0.49f, 9.47f, 1.11f, 10.1f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.55f, 0.55f, 1.42f, 0.58f, 2.02f, 0.09f)
                    curveTo(5.55f, 8.2f, 8.64f, 7f, 12f, 7f)
                    reflectiveCurveToRelative(6.45f, 1.2f, 8.87f, 3.19f)
                    curveToRelative(0.6f, 0.49f, 1.47f, 0.46f, 2.02f, -0.09f)
                    lineToRelative(0f, 0f)
                    curveTo(23.51f, 9.47f, 23.47f, 8.44f, 22.8f, 7.89f)
                    close()
                    moveTo(12f, 16f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(13.1f, 16f, 12f, 16f)
                    close()
                    moveTo(23f, 19f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(1f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3f)
                    curveTo(24f, 19.45f, 23.55f, 19f, 23f, 19f)
                    close()
                    moveTo(22f, 19f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Wifi_password!!
    }

private var _Wifi_password: ImageVector? = null

