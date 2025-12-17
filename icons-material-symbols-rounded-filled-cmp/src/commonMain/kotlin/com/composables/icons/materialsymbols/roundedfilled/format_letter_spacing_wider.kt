package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_letter_spacing_wider: ImageVector
    get() {
        if (_Format_letter_spacing_wider != null) return _Format_letter_spacing_wider!!
        
        _Format_letter_spacing_wider = ImageVector.Builder(
            name = "format_letter_spacing_wider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 800f)
                close()
                moveToRelative(720f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                close()
                moveTo(341f, 680f)
                quadToRelative(-17f, 0f, -27f, -14f)
                reflectiveQuadToRelative(-4f, -30f)
                lineToRelative(126f, -334f)
                quadToRelative(4f, -10f, 12f, -16f)
                reflectiveQuadToRelative(19f, -6f)
                horizontalLineToRelative(26f)
                quadToRelative(11f, 0f, 19f, 6f)
                reflectiveQuadToRelative(12f, 16f)
                lineToRelative(126f, 335f)
                quadToRelative(6f, 16f, -3.5f, 29.5f)
                reflectiveQuadTo(620f, 680f)
                quadToRelative(-11f, 0f, -19f, -6f)
                reflectiveQuadToRelative(-12f, -16f)
                lineToRelative(-28f, -80f)
                horizontalLineTo(399f)
                lineToRelative(-29f, 81f)
                quadToRelative(-3f, 10f, -11f, 15.5f)
                reflectiveQuadToRelative(-18f, 5.5f)
                close()
                moveToRelative(79f, -160f)
                horizontalLineToRelative(120f)
                lineToRelative(-58f, -166f)
                horizontalLineToRelative(-4f)
                lineToRelative(-58f, 166f)
                close()
            }
        }.build()
        
        return _Format_letter_spacing_wider!!
    }

private var _Format_letter_spacing_wider: ImageVector? = null

