package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Box_edit: ImageVector
    get() {
        if (_Box_edit != null) return _Box_edit!!
        
        _Box_edit = ImageVector.Builder(
            name = "box_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 240f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
                moveToRelative(184f, 270f)
                lineToRelative(80f, -40f)
                lineToRelative(80f, 40f)
                verticalLineToRelative(-190f)
                horizontalLineTo(400f)
                verticalLineToRelative(190f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-608f)
                lineToRelative(92f, -112f)
                horizontalLineToRelative(536f)
                lineToRelative(92f, 112f)
                verticalLineToRelative(93f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(-85f)
                horizontalLineTo(640f)
                verticalLineToRelative(205f)
                lineToRelative(-77f, 77f)
                lineToRelative(-83f, -42f)
                lineToRelative(-160f, 80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(520f, -520f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(-440f, 0f)
                horizontalLineToRelative(363f)
                horizontalLineToRelative(-363f)
                close()
                moveToRelative(360f, 520f)
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
        
        return _Box_edit!!
    }

private var _Box_edit: ImageVector? = null

