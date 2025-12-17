package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Drive_file_move: ImageVector
    get() {
        if (_Drive_file_move != null) return _Drive_file_move!!
        
        _Drive_file_move = ImageVector.Builder(
            name = "drive_file_move",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(408f, -240f)
                lineToRelative(-65f, 65f)
                lineToRelative(56f, 56f)
                lineToRelative(161f, -161f)
                lineToRelative(-161f, -161f)
                lineToRelative(-56f, 56f)
                lineToRelative(65f, 65f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(168f)
                close()
            }
        }.build()
        
        return _Drive_file_move!!
    }

private var _Drive_file_move: ImageVector? = null

