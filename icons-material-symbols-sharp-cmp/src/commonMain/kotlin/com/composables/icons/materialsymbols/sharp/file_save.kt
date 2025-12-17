package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.File_save: ImageVector
    get() {
        if (_File_save != null) return _File_save!!
        
        _File_save = ImageVector.Builder(
            name = "file_save",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 840f)
                lineToRelative(160f, -160f)
                lineToRelative(-56f, -56f)
                lineToRelative(-64f, 64f)
                verticalLineToRelative(-167f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(167f)
                lineToRelative(-64f, -64f)
                lineToRelative(-56f, 56f)
                lineToRelative(160f, 160f)
                close()
                moveTo(560f, 960f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineTo(960f)
                horizontalLineTo(560f)
                close()
                moveTo(160f, 800f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(121f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-81f)
                horizontalLineTo(480f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _File_save!!
    }

private var _File_save: ImageVector? = null

