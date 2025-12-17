package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Drive_file_move_rtl: ImageVector
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
                moveTo(12.725f, 16.325f)
                quadToRelative(0.275f, -0.275f, 0.275f, -0.7f)
                quadToRelative(0f, -0.425f, -0.275f, -0.7f)
                lineTo(11.8f, 14f)
                horizontalLineTo(15f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(16f, 13.425f, 16f, 13f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(15.425f, 12f, 15f, 12f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(0.925f, -0.925f)
                quadToRelative(0.275f, -0.275f, 0.275f, -0.7f)
                quadToRelative(0f, -0.425f, -0.275f, -0.7f)
                quadToRelative(-0.275f, -0.275f, -0.7f, -0.275f)
                quadToRelative(-0.425f, 0f, -0.7f, 0.275f)
                lineTo(8.7f, 12.3f)
                quadToRelative(-0.3f, 0.3f, -0.3f, 0.7f)
                quadToRelative(0f, 0.4f, 0.3f, 0.7f)
                lineToRelative(2.625f, 2.625f)
                quadToRelative(0.275f, 0.275f, 0.7f, 0.275f)
                quadToRelative(0.425f, 0f, 0.7f, -0.275f)
                close()
                moveTo(4f, 20f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 18.825f, 2f, 18f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 4f, 4f, 4f)
                horizontalLineToRelative(5.175f)
                quadToRelative(0.4f, 0f, 0.763f, 0.15f)
                quadToRelative(0.362f, 0.15f, 0.637f, 0.425f)
                lineTo(12f, 6f)
                horizontalLineToRelative(8f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 7.175f, 22f, 8f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 20f, 20f, 20f)
                close()
                moveTo(4f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                horizontalLineToRelative(-8.825f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Drive_file_move_rtl!!
    }

private var _Drive_file_move_rtl: ImageVector? = null

