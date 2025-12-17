package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Select_to_speak: ImageVector
    get() {
        if (_Select_to_speak != null) return _Select_to_speak!!
        
        _Select_to_speak = ImageVector.Builder(
            name = "select_to_speak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 829f)
                verticalLineToRelative(-82f)
                quadToRelative(90f, -26f, 145f, -100f)
                reflectiveQuadToRelative(55f, -168f)
                quadToRelative(0f, -94f, -55f, -168f)
                reflectiveQuadTo(560f, 211f)
                verticalLineToRelative(-82f)
                quadToRelative(124f, 28f, 202f, 125.5f)
                reflectiveQuadTo(840f, 479f)
                quadToRelative(0f, 127f, -78f, 224.5f)
                reflectiveQuadTo(560f, 829f)
                close()
                moveToRelative(-80f, -29f)
                lineTo(280f, 600f)
                horizontalLineTo(120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(80f, -160f)
                verticalLineToRelative(-322f)
                quadToRelative(47f, 22f, 73.5f, 66f)
                reflectiveQuadToRelative(26.5f, 96f)
                quadToRelative(0f, 51f, -26.5f, 94.5f)
                reflectiveQuadTo(560f, 640f)
                close()
                moveToRelative(-160f, -34f)
                verticalLineToRelative(-252f)
                lineToRelative(-86f, 86f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(114f)
                lineToRelative(86f, 86f)
                close()
                moveTo(40f, 280f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(40f)
                close()
                moveTo(680f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(680f)
                close()
                moveTo(300f, 480f)
                close()
            }
        }.build()
        
        return _Select_to_speak!!
    }

private var _Select_to_speak: ImageVector? = null

