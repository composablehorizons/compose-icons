package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Quick_reference: ImageVector
    get() {
        if (_Quick_reference != null) return _Quick_reference!!
        
        _Quick_reference = ImageVector.Builder(
            name = "quick_reference",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 800f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(20f, -200f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveTo(200f, 160f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
                moveToRelative(80f, 400f)
                horizontalLineToRelative(147f)
                quadToRelative(11f, -23f, 25.5f, -43f)
                reflectiveQuadToRelative(32.5f, -37f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(123f)
                quadToRelative(-3f, -20f, -3f, -40f)
                reflectiveQuadToRelative(3f, -40f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(92f)
                quadToRelative(-19f, -6f, -39f, -9f)
                reflectiveQuadToRelative(-41f, -3f)
                verticalLineToRelative(-40f)
                horizontalLineTo(480f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(227f)
                quadToRelative(11f, 23f, 25.5f, 43f)
                reflectiveQuadTo(485f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(560f, -400f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                close()
            }
        }.build()
        
        return _Quick_reference!!
    }

private var _Quick_reference: ImageVector? = null

