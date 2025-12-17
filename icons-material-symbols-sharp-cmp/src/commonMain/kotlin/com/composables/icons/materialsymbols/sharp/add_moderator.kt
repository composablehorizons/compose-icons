package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Add_moderator: ImageVector
    get() {
        if (_Add_moderator != null) return _Add_moderator!!
        
        _Add_moderator = ImageVector.Builder(
            name = "add_moderator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(227f)
                quadToRelative(-19f, -8f, -39f, -14.5f)
                reflectiveQuadToRelative(-41f, -9.5f)
                verticalLineToRelative(-147f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 47f, 12.5f, 94f)
                reflectiveQuadToRelative(35f, 89.5f)
                quadTo(310f, 670f, 342f, 706f)
                reflectiveQuadToRelative(71f, 60f)
                quadToRelative(11f, 32f, 29f, 61f)
                reflectiveQuadToRelative(41f, 52f)
                quadToRelative(-1f, 0f, -1.5f, 0.5f)
                reflectiveQuadToRelative(-1.5f, 0.5f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(480f, 466f)
                close()
                moveToRelative(180f, 334f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                horizontalLineTo(700f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(100f)
                horizontalLineTo(560f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                close()
            }
        }.build()
        
        return _Add_moderator!!
    }

private var _Add_moderator: ImageVector? = null

