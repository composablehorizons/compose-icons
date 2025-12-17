package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.File_copy_off: ImageVector
    get() {
        if (_File_copy_off != null) return _File_copy_off!!
        
        _File_copy_off = ImageVector.Builder(
            name = "file_copy_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 726f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-326f)
                horizontalLineTo(560f)
                verticalLineToRelative(-200f)
                horizontalLineTo(320f)
                verticalLineToRelative(86f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(360f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(446f)
                close()
                moveToRelative(-520f, -46f)
                horizontalLineToRelative(248f)
                lineTo(320f, 432f)
                verticalLineToRelative(248f)
                close()
                moveTo(820f, 932f)
                lineTo(648f, 760f)
                horizontalLineTo(240f)
                verticalLineToRelative(-408f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(540f, 383f)
                close()
                moveToRelative(-96f, 173f)
                close()
                moveTo(80f, 920f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _File_copy_off!!
    }

private var _File_copy_off: ImageVector? = null

