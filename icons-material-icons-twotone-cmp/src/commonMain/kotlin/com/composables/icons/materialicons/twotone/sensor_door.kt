package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sensor_door: ImageVector
    get() {
        if (_Sensor_door != null) return _Sensor_door!!
        
        _Sensor_door = ImageVector.Builder(
            name = "sensor_door",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(6f)
                    verticalLineTo(4f)
                    horizontalLineTo(18f)
                    moveTo(15.5f, 10.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                    reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    reflectiveCurveTo(16.33f, 10.5f, 15.5f, 10.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(6f)
                    verticalLineTo(4f)
                    horizontalLineTo(18f)
                    moveTo(18f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(4f)
                    curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                    lineTo(18f, 2f)
                    close()
                    moveTo(15.5f, 10.5f)
                    curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                    reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    reflectiveCurveTo(16.33f, 10.5f, 15.5f, 10.5f)
                    close()
                }
            }
        }.build()
        
        return _Sensor_door!!
    }

private var _Sensor_door: ImageVector? = null

