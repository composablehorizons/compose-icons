package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Drive_file_move_outline: ImageVector
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
                moveTo(12.2f, 14f)
                lineToRelative(-0.925f, 0.925f)
                quadToRelative(-0.275f, 0.275f, -0.275f, 0.7f)
                quadToRelative(0f, 0.425f, 0.275f, 0.7f)
                quadToRelative(0.275f, 0.275f, 0.7f, 0.275f)
                quadToRelative(0.425f, 0f, 0.7f, -0.275f)
                lineTo(15.3f, 13.7f)
                quadToRelative(0.275f, -0.275f, 0.275f, -0.7f)
                quadToRelative(0f, -0.425f, -0.275f, -0.7f)
                lineToRelative(-2.625f, -2.625f)
                quadToRelative(-0.275f, -0.275f, -0.7f, -0.275f)
                quadToRelative(-0.425f, 0f, -0.7f, 0.275f)
                quadToRelative(-0.275f, 0.275f, -0.275f, 0.7f)
                quadToRelative(0f, 0.425f, 0.275f, 0.7f)
                lineTo(12.2f, 12f)
                horizontalLineTo(9f)
                quadToRelative(-0.425f, 0f, -0.712f, 0.287f)
                quadTo(8f, 12.575f, 8f, 13f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(8.575f, 14f, 9f, 14f)
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
            }
        }.build()
        
        return _Drive_file_move_outline!!
    }

private var _Drive_file_move_outline: ImageVector? = null

