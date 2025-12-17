package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Drive_file_rename_outline: ImageVector
    get() {
        if (_Drive_file_rename_outline != null) return _Drive_file_rename_outline!!
        
        _Drive_file_rename_outline = ImageVector.Builder(
            name = "drive_file_rename_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 21f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(8.3f, -12.075f)
                lineToRelative(-4.25f, -4.2f)
                lineTo(16.875f, 1.9f)
                lineTo(21.1f, 6.125f)
                close()
                moveTo(2f, 21f)
                verticalLineToRelative(-4.25f)
                lineToRelative(10.6f, -10.6f)
                lineToRelative(4.25f, 4.25f)
                lineTo(6.25f, 21f)
                close()
            }
        }.build()
        
        return _Drive_file_rename_outline!!
    }

private var _Drive_file_rename_outline: ImageVector? = null

