package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Drive_file_move: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 6f)
                    horizontalLineTo(12f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(6f)
                    close()
                    moveTo(12f, 17f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(9f)
                    lineToRelative(4f, 4f)
                    lineTo(12f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Drive_file_move!!
    }

private var _Drive_file_move: ImageVector? = null

