package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Note_alt: ImageVector
    get() {
        if (_Note_alt != null) return _Note_alt!!
        
        _Note_alt = ImageVector.Builder(
            name = "note_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                horizontalLineToRelative(84f)
                lineToRelative(240f, -238f)
                lineToRelative(-86f, -86f)
                lineToRelative(-238f, 238f)
                verticalLineToRelative(86f)
                close()
                moveToRelative(352f, -266f)
                lineToRelative(42f, -44f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-56f, -56f)
                quadToRelative(-6f, -6f, -14f, -6f)
                reflectiveQuadToRelative(-14f, 6f)
                lineToRelative(-44f, 42f)
                lineToRelative(86f, 86f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(168f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(38f, 0f, 68.5f, 22f)
                reflectiveQuadToRelative(43.5f, 58f)
                horizontalLineToRelative(168f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(280f, -590f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 140f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 110f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 140f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 170f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Note_alt!!
    }

private var _Note_alt: ImageVector? = null

