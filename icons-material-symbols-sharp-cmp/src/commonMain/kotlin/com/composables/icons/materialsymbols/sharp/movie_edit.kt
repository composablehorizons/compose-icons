package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Movie_edit: ImageVector
    get() {
        if (_Movie_edit != null) return _Movie_edit!!
        
        _Movie_edit = ImageVector.Builder(
            name = "movie_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(125f)
                lineTo(765f, 400f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, 40f)
                verticalLineToRelative(-123f)
                lineToRelative(263f, -262f)
                lineToRelative(123f, 122f)
                lineToRelative(-263f, 263f)
                horizontalLineTo(560f)
                close()
                moveToRelative(300f, -263f)
                lineToRelative(-37f, -37f)
                lineToRelative(37f, 37f)
                close()
                moveTo(620f, 780f)
                horizontalLineToRelative(38f)
                lineToRelative(121f, -122f)
                lineToRelative(-18f, -19f)
                lineToRelative(-19f, -18f)
                lineToRelative(-122f, 121f)
                verticalLineToRelative(38f)
                close()
                moveToRelative(141f, -141f)
                lineToRelative(-19f, -18f)
                lineToRelative(37f, 37f)
                lineToRelative(-18f, -19f)
                close()
            }
        }.build()
        
        return _Movie_edit!!
    }

private var _Movie_edit: ImageVector? = null

