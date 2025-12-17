package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bluetooth_drive: ImageVector
    get() {
        if (_Bluetooth_drive != null) return _Bluetooth_drive!!
        
        _Bluetooth_drive = ImageVector.Builder(
            name = "bluetooth_drive",
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
                        moveTo(15f, 10f)
                        horizontalLineTo(4.81f)
                        lineToRelative(1.04f, -3f)
                        horizontalLineTo(15f)
                        verticalLineTo(5f)
                        horizontalLineTo(4.43f)
                        lineTo(2f, 12f)
                        verticalLineToRelative(9f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-9f)
                        horizontalLineToRelative(-3f)
                        curveTo(15.9f, 12f, 15f, 11.1f, 15f, 10f)
                        close()
                        moveTo(6.5f, 16f)
                        curveTo(5.67f, 16f, 5f, 15.33f, 5f, 14.5f)
                        reflectiveCurveTo(5.67f, 13f, 6.5f, 13f)
                        reflectiveCurveTo(8f, 13.67f, 8f, 14.5f)
                        reflectiveCurveTo(7.33f, 16f, 6.5f, 16f)
                        close()
                        moveTo(15.5f, 16f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(16.33f, 16f, 15.5f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 3.85f)
                        lineTo(19.15f, 1f)
                        horizontalLineToRelative(-0.5f)
                        verticalLineToRelative(3.79f)
                        lineToRelative(-2.3f, -2.29f)
                        lineToRelative(-0.7f, 0.7f)
                        lineTo(18.44f, 6f)
                        lineToRelative(-2.79f, 2.79f)
                        lineToRelative(0.7f, 0.71f)
                        lineToRelative(2.3f, -2.3f)
                        verticalLineTo(11f)
                        horizontalLineToRelative(0.5f)
                        lineTo(22f, 8.14f)
                        lineTo(19.85f, 6f)
                        lineTo(22f, 3.85f)
                        close()
                        moveTo(19.65f, 2.91f)
                        lineToRelative(0.94f, 0.94f)
                        lineToRelative(-0.94f, 0.94f)
                        verticalLineTo(2.91f)
                        close()
                        moveTo(20.59f, 8.14f)
                        lineToRelative(-0.94f, 0.94f)
                        verticalLineTo(7.2f)
                        lineTo(20.59f, 8.14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bluetooth_drive!!
    }

private var _Bluetooth_drive: ImageVector? = null

