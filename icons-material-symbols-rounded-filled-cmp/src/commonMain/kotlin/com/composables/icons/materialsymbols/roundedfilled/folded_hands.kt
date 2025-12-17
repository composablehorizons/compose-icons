package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Folded_hands: ImageVector
    get() {
        if (_Folded_hands != null) return _Folded_hands!!
        
        _Folded_hands = ImageVector.Builder(
            name = "folded_hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(590f, 880f)
                quadToRelative(-11f, 0f, -20.5f, -5.5f)
                reflectiveQuadTo(555f, 860f)
                lineToRelative(-35f, -62f)
                quadToRelative(-5f, -9f, -7.5f, -18.5f)
                reflectiveQuadTo(510f, 759f)
                verticalLineToRelative(-299f)
                quadToRelative(0f, -21f, 8f, -39f)
                reflectiveQuadToRelative(27f, -18f)
                quadToRelative(8f, 0f, 14.5f, 4f)
                reflectiveQuadToRelative(10.5f, 12f)
                lineToRelative(60f, 109f)
                verticalLineToRelative(82f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(660f, 640f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(690f, 610f)
                verticalLineToRelative(-77f)
                quadToRelative(0f, -10f, -2.5f, -20f)
                reflectiveQuadToRelative(-7.5f, -19f)
                lineTo(527f, 215f)
                quadToRelative(-15f, -28f, -15f, -59f)
                reflectiveQuadToRelative(16f, -58f)
                quadToRelative(13f, -15f, 32f, -16f)
                reflectiveQuadToRelative(31f, 13f)
                lineToRelative(232f, 265f)
                quadToRelative(8f, 10f, 13f, 21.5f)
                reflectiveQuadToRelative(6f, 24.5f)
                lineToRelative(35f, 431f)
                quadToRelative(2f, 17f, -10.5f, 30f)
                reflectiveQuadTo(837f, 880f)
                horizontalLineTo(590f)
                close()
                moveToRelative(-467f, 0f)
                quadToRelative(-17f, 0f, -29.5f, -13f)
                reflectiveQuadTo(83f, 837f)
                lineToRelative(35f, -431f)
                quadToRelative(1f, -13f, 6f, -24.5f)
                reflectiveQuadToRelative(13f, -21.5f)
                lineToRelative(232f, -264f)
                quadToRelative(12f, -14f, 30.5f, -13.5f)
                reflectiveQuadTo(430f, 97f)
                quadToRelative(16f, 28f, 17f, 59f)
                reflectiveQuadToRelative(-14f, 59f)
                lineTo(280f, 494f)
                quadToRelative(-5f, 9f, -7.5f, 19f)
                reflectiveQuadToRelative(-2.5f, 20f)
                verticalLineToRelative(77f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(300f, 640f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(330f, 610f)
                verticalLineToRelative(-82f)
                lineToRelative(60f, -109f)
                quadToRelative(4f, -8f, 11f, -12f)
                reflectiveQuadToRelative(15f, -4f)
                quadToRelative(18f, 0f, 26f, 18f)
                reflectiveQuadToRelative(8f, 39f)
                verticalLineToRelative(299f)
                quadToRelative(0f, 11f, -2.5f, 20.5f)
                reflectiveQuadTo(440f, 798f)
                lineToRelative(-35f, 62f)
                quadToRelative(-5f, 9f, -14.5f, 14.5f)
                reflectiveQuadTo(370f, 880f)
                horizontalLineTo(123f)
                close()
            }
        }.build()
        
        return _Folded_hands!!
    }

private var _Folded_hands: ImageVector? = null

