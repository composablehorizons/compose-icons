package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_upload: ImageVector
    get() {
        if (_File_upload != null) return _File_upload!!
        
        _File_upload = ImageVector.Builder(
            name = "file_upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 16f)
                verticalLineTo(7.85f)
                lineToRelative(-2.6f, 2.6f)
                lineTo(7f, 9f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
                lineToRelative(-1.4f, 1.45f)
                lineToRelative(-2.6f, -2.6f)
                verticalLineTo(16f)
                close()
                moveToRelative(-7f, 4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _File_upload!!
    }

private var _File_upload: ImageVector? = null

