package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Drive_file_move_rtl: ImageVector
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
                moveTo(4f, 20f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 18.825f, 2f, 18f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 4f, 4f, 4f)
                horizontalLineToRelative(6f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(8f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 7.175f, 22f, 8f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 20f, 20f, 20f)
                close()
            }
        }.build()
        
        return _Drive_file_move_rtl!!
    }

private var _Drive_file_move_rtl: ImageVector? = null

