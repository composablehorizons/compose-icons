package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_save: ImageVector
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
                moveTo(560f, 960f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineTo(960f)
                horizontalLineTo(560f)
                close()
                moveToRelative(160f, -120f)
                lineTo(560f, 680f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                verticalLineToRelative(-167f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(167f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
                moveToRelative(-560f, -40f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(121f)
                horizontalLineTo(480f)
                verticalLineToRelative(359f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -440f)
                horizontalLineToRelative(200f)
                lineTo(480f, 160f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _File_save!!
    }

private var _File_save: ImageVector? = null

