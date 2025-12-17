package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_open: ImageVector
    get() {
        if (_File_open != null) return _File_open!!
        
        _File_open = ImageVector.Builder(
            name = "file_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(878f, 895f)
                lineTo(760f, 777f)
                verticalLineToRelative(89f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-226f)
                horizontalLineToRelative(226f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-90f)
                lineToRelative(118f, 118f)
                lineToRelative(-56f, 57f)
                close()
                moveTo(520f, 360f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                verticalLineToRelative(200f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                verticalLineToRelative(320f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _File_open!!
    }

private var _File_open: ImageVector? = null

