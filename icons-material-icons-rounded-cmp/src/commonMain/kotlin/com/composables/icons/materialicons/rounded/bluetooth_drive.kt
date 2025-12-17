package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bluetooth_drive: ImageVector
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
                        moveTo(19.85f, 6f)
                        lineToRelative(1.8f, -1.8f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineTo(19.5f, 1.36f)
                        curveToRelative(-0.32f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f)
                        verticalLineToRelative(3.08f)
                        lineTo(16.7f, 2.85f)
                        curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0f)
                        curveToRelative(-0.19f, 0.19f, -0.19f, 0.51f, 0f, 0.7f)
                        lineTo(18.44f, 6f)
                        lineTo(16f, 8.44f)
                        curveToRelative(-0.19f, 0.19f, -0.19f, 0.5f, 0f, 0.7f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0f)
                        lineToRelative(1.95f, -1.95f)
                        verticalLineToRelative(3.09f)
                        curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                        lineToRelative(2.14f, -2.15f)
                        curveToRelative(0.2f, -0.2f, 0.19f, -0.51f, 0f, -0.71f)
                        lineTo(19.85f, 6f)
                        close()
                        moveTo(19.65f, 2.91f)
                        lineToRelative(0.94f, 0.94f)
                        lineToRelative(-0.94f, 0.94f)
                        verticalLineTo(2.91f)
                        close()
                        moveTo(19.65f, 9.08f)
                        verticalLineTo(7.2f)
                        lineToRelative(0.94f, 0.94f)
                        lineTo(19.65f, 9.08f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 10f)
                        horizontalLineTo(4.81f)
                        lineToRelative(1.04f, -3f)
                        horizontalLineTo(15f)
                        verticalLineTo(5f)
                        horizontalLineTo(5.5f)
                        curveTo(4.84f, 5f, 4.29f, 5.42f, 4.08f, 6.01f)
                        lineTo(2f, 12f)
                        verticalLineToRelative(7.5f)
                        curveTo(2f, 20.33f, 2.67f, 21f, 3.5f, 21f)
                        reflectiveCurveTo(5f, 20.33f, 5f, 19.5f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(0.5f)
                        curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                        reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                        verticalLineTo(12f)
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
                }
            }
        }.build()
        
        return _Bluetooth_drive!!
    }

private var _Bluetooth_drive: ImageVector? = null

