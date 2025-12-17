package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Drive_file_move_rtl: ImageVector
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
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                close()
                moveTo(13.41f, 15.59f)
                lineTo(12f, 17f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11.83f, 12f)
                horizontalLineTo(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.17f)
                lineTo(13.41f, 15.59f)
                close()
            }
        }.build()
        
        return _Drive_file_move_rtl!!
    }

private var _Drive_file_move_rtl: ImageVector? = null

