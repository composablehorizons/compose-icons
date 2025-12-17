package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.All_match: ImageVector
    get() {
        if (_All_match != null) return _All_match!!
        
        _All_match = ImageVector.Builder(
            name = "all_match",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(266f, 680f)
                lineToRelative(130f, -200f)
                lineToRelative(-130f, -200f)
                lineToRelative(130f, 200f)
                lineToRelative(-20.5f, 31f)
                quadTo(355f, 542f, 331f, 579.5f)
                reflectiveQuadToRelative(-44.5f, 69f)
                lineTo(266f, 680f)
                close()
                moveToRelative(-146f, 80f)
                lineToRelative(180f, -280f)
                lineToRelative(-180f, -280f)
                horizontalLineToRelative(522f)
                lineToRelative(185f, 261f)
                quadToRelative(-27f, -11f, -55.5f, -16.5f)
                reflectiveQuadTo(714f, 440f)
                lineTo(600f, 280f)
                horizontalLineTo(266f)
                lineToRelative(130f, 200f)
                lineToRelative(-130f, 200f)
                horizontalLineToRelative(177f)
                quadToRelative(-3f, 20f, -3f, 40f)
                reflectiveQuadToRelative(3f, 40f)
                horizontalLineTo(120f)
                close()
                moveToRelative(571f, 50f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
                moveToRelative(29f, 110f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
            }
        }.build()
        
        return _All_match!!
    }

private var _All_match: ImageVector? = null

