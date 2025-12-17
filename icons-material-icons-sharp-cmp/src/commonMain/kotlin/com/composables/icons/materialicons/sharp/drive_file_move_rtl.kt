package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Drive_file_move_rtl: ImageVector
    get() {
        if (_Drive_file_move_rtl != null) return _Drive_file_move_rtl!!
        
        _Drive_file_move_rtl = ImageVector.Builder(
            name = "drive_file_move_rtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(22f, 6f)
                horizontalLineTo(12f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                close()
                moveTo(12f, 17f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Drive_file_move_rtl!!
    }

private var _Drive_file_move_rtl: ImageVector? = null

