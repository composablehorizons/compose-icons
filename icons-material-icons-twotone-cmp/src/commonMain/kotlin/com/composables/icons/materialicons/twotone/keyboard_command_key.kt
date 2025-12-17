package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Keyboard_command_key: ImageVector
    get() {
        if (_Keyboard_command_key != null) return _Keyboard_command_key!!
        
        _Keyboard_command_key = ImageVector.Builder(
            name = "keyboard_command_key",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.5f, 3f)
                        curveTo(15.57f, 3f, 14f, 4.57f, 14f, 6.5f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(6.5f)
                        curveTo(10f, 4.57f, 8.43f, 3f, 6.5f, 3f)
                        reflectiveCurveTo(3f, 4.57f, 3f, 6.5f)
                        reflectiveCurveTo(4.57f, 10f, 6.5f, 10f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(6.5f)
                        curveTo(4.57f, 14f, 3f, 15.57f, 3f, 17.5f)
                        reflectiveCurveTo(4.57f, 21f, 6.5f, 21f)
                        reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                        verticalLineTo(16f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(1.5f)
                        curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                        reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                        reflectiveCurveTo(19.43f, 14f, 17.5f, 14f)
                        horizontalLineTo(16f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(1.5f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        reflectiveCurveTo(19.43f, 3f, 17.5f, 3f)
                        lineTo(17.5f, 3f)
                        close()
                        moveTo(16f, 8f)
                        verticalLineTo(6.5f)
                        curveTo(16f, 5.67f, 16.67f, 5f, 17.5f, 5f)
                        reflectiveCurveTo(19f, 5.67f, 19f, 6.5f)
                        reflectiveCurveTo(18.33f, 8f, 17.5f, 8f)
                        horizontalLineTo(16f)
                        lineTo(16f, 8f)
                        close()
                        moveTo(6.5f, 8f)
                        curveTo(5.67f, 8f, 5f, 7.33f, 5f, 6.5f)
                        reflectiveCurveTo(5.67f, 5f, 6.5f, 5f)
                        reflectiveCurveTo(8f, 5.67f, 8f, 6.5f)
                        verticalLineTo(8f)
                        horizontalLineTo(6.5f)
                        lineTo(6.5f, 8f)
                        close()
                        moveTo(10f, 14f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(10f)
                        lineTo(10f, 14f)
                        close()
                        moveTo(17.5f, 19f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        verticalLineTo(16f)
                        horizontalLineToRelative(1.5f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(18.33f, 19f, 17.5f, 19f)
                        lineTo(17.5f, 19f)
                        close()
                        moveTo(6.5f, 19f)
                        curveTo(5.67f, 19f, 5f, 18.33f, 5f, 17.5f)
                        reflectiveCurveTo(5.67f, 16f, 6.5f, 16f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(1.5f)
                        curveTo(8f, 18.33f, 7.33f, 19f, 6.5f, 19f)
                        lineTo(6.5f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Keyboard_command_key!!
    }

private var _Keyboard_command_key: ImageVector? = null

