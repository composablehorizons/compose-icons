package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Drive_file_move_rtl: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.025f, 17.025f)
                lineToRelative(1.4f, -1.4f)
                lineTo(11.8f, 14f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.2f)
                lineToRelative(1.625f, -1.625f)
                lineToRelative(-1.4f, -1.4f)
                lineTo(8f, 13f)
                close()
                moveTo(2f, 20f)
                verticalLineTo(4f)
                horizontalLineToRelative(8f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Drive_file_move_rtl!!
    }

private var _Drive_file_move_rtl: ImageVector? = null

