package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Drive_file_move: ImageVector
    get() {
        if (_Drive_file_move != null) return _Drive_file_move!!
        
        _Drive_file_move = ImageVector.Builder(
            name = "drive_file_move",
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
                        moveTo(20f, 6f)
                        horizontalLineToRelative(-8f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(5.17f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(11.17f, 8f)
                        horizontalLineTo(20f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 14f)
                        lineTo(12f, 14f)
                        lineTo(12f, 17f)
                        lineTo(16f, 13f)
                        lineTo(12f, 9f)
                        lineTo(12f, 12f)
                        lineTo(8f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.59f, 7.41f)
                        lineTo(9.17f, 6f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-8.83f)
                        lineTo(10.59f, 7.41f)
                        close()
                        moveTo(12f, 9f)
                        lineToRelative(4f, 4f)
                        lineToRelative(-4f, 4f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Drive_file_move!!
    }

private var _Drive_file_move: ImageVector? = null

