package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wifi_tethering_error: ImageVector
    get() {
        if (_Wifi_tethering_error != null) return _Wifi_tethering_error!!
        
        _Wifi_tethering_error = ImageVector.Builder(
            name = "wifi_tethering_error",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 7f)
                        curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                        curveToRelative(0f, 1.66f, 0.68f, 3.15f, 1.76f, 4.24f)
                        lineToRelative(1.42f, -1.42f)
                        curveTo(8.45f, 15.1f, 8f, 14.11f, 8f, 13f)
                        curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                        reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                        curveToRelative(0f, 1.11f, -0.45f, 2.1f, -1.18f, 2.82f)
                        lineToRelative(1.42f, 1.42f)
                        curveTo(17.32f, 16.15f, 18f, 14.66f, 18f, 13f)
                        curveTo(18f, 9.69f, 15.31f, 7f, 12f, 7f)
                        close()
                        moveTo(12f, 3f)
                        curveTo(6.48f, 3f, 2f, 7.48f, 2f, 13f)
                        curveToRelative(0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f)
                        lineToRelative(1.42f, -1.42f)
                        curveTo(4.9f, 17.21f, 4f, 15.21f, 4f, 13f)
                        curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                        curveToRelative(2.53f, 0f, 4.78f, 1.17f, 6.24f, 3f)
                        horizontalLineToRelative(2.42f)
                        curveTo(18.93f, 5.01f, 15.7f, 3f, 12f, 3f)
                        close()
                        moveTo(12f, 11f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        curveToRelative(0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f)
                        curveTo(10.95f, 14.77f, 11.45f, 15f, 12f, 15f)
                        reflectiveCurveToRelative(1.05f, -0.23f, 1.41f, -0.59f)
                        curveTo(13.77f, 14.05f, 14f, 13.55f, 14f, 13f)
                        curveTo(14f, 11.9f, 13.1f, 11f, 12f, 11f)
                        close()
                        moveTo(20f, 10f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(10f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wifi_tethering_error!!
    }

private var _Wifi_tethering_error: ImageVector? = null

