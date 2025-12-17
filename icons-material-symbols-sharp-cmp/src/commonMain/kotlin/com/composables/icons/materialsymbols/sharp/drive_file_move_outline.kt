package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Drive_file_move_outline: ImageVector
    get() {
        if (_Drive_file_move_outline != null) return _Drive_file_move_outline!!
        
        _Drive_file_move_outline = ImageVector.Builder(
            name = "drive_file_move_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.975f, 17.025f)
                lineTo(16f, 13f)
                lineToRelative(-4.025f, -4.025f)
                lineToRelative(-1.4f, 1.4f)
                lineTo(12.2f, 12f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.2f)
                lineToRelative(-1.625f, 1.625f)
                close()
                moveTo(2f, 20f)
                verticalLineTo(4f)
                horizontalLineToRelative(8f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(2f, -2f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                horizontalLineToRelative(-8.825f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(6f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Drive_file_move_outline!!
    }

private var _Drive_file_move_outline: ImageVector? = null

