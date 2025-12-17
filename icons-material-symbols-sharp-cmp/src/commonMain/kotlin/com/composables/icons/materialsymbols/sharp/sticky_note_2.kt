package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sticky_note_2: ImageVector
    get() {
        if (_Sticky_note_2 != null) return _Sticky_note_2!!
        
        _Sticky_note_2 = ImageVector.Builder(
            name = "sticky_note_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(480f)
                lineTo(600f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-80f, 360f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Sticky_note_2!!
    }

private var _Sticky_note_2: ImageVector? = null

