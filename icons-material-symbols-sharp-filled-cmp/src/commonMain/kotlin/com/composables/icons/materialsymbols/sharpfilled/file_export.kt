package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_export: ImageVector
    get() {
        if (_File_export != null) return _File_export!!
        
        _File_export = ImageVector.Builder(
            name = "file_export",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(202f, 895f)
                lineToRelative(-56f, -57f)
                lineToRelative(118f, -118f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(226f)
                verticalLineToRelative(226f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-89f)
                lineTo(202f, 895f)
                close()
                moveToRelative(278f, -15f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(560f)
                horizontalLineTo(480f)
                close()
                moveToRelative(40f, -520f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _File_export!!
    }

private var _File_export: ImageVector? = null

