package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.All_match: ImageVector
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
                moveTo(691f, 725f)
                lineToRelative(-17f, -17f)
                quadToRelative(-9f, -9f, -21.5f, -9f)
                reflectiveQuadToRelative(-21.5f, 9f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(39f, 39f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                lineToRelative(97f, -95f)
                quadToRelative(9f, -9f, 9f, -21.5f)
                reflectiveQuadToRelative(-9f, -21.5f)
                quadToRelative(-9f, -9f, -21.5f, -9f)
                reflectiveQuadToRelative(-21.5f, 9f)
                lineToRelative(-75f, 74f)
                close()
                moveToRelative(29f, 195f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(193f, 760f)
                quadToRelative(-24f, 0f, -35f, -21f)
                reflectiveQuadToRelative(2f, -41f)
                lineToRelative(140f, -218f)
                lineToRelative(-140f, -218f)
                quadToRelative(-13f, -20f, -2f, -41f)
                reflectiveQuadToRelative(35f, -21f)
                horizontalLineToRelative(407f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(118f, 167f)
                quadToRelative(11f, 14f, 0.5f, 29f)
                reflectiveQuadTo(755f, 442f)
                quadToRelative(-11f, -2f, -20.5f, -2f)
                horizontalLineTo(714f)
                quadToRelative(-59f, 2f, -108.5f, 25f)
                reflectiveQuadTo(519f, 526f)
                quadToRelative(-39f, 42f, -60f, 95f)
                reflectiveQuadToRelative(-19f, 110f)
                quadToRelative(1f, 12f, -7f, 20.5f)
                reflectiveQuadToRelative(-19f, 8.5f)
                horizontalLineTo(193f)
                close()
            }
        }.build()
        
        return _All_match!!
    }

private var _All_match: ImageVector? = null

