package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Smart_card_reader_off: ImageVector
    get() {
        if (_Smart_card_reader_off != null) return _Smart_card_reader_off!!
        
        _Smart_card_reader_off = ImageVector.Builder(
            name = "smart_card_reader_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(350f, 511f)
                quadToRelative(20f, 0f, 35f, -13f)
                reflectiveQuadToRelative(25f, -28f)
                lineToRelative(-90f, -90f)
                verticalLineToRelative(101f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(350f, 511f)
                close()
                moveTo(120f, 828f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 788f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 628f)
                horizontalLineToRelative(407f)
                lineToRelative(-60f, -60f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 528f)
                verticalLineToRelative(-268f)
                lineTo(56f, 116f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 60f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 735f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 851f)
                lineToRelative(-24f, -23f)
                horizontalLineTo(120f)
                close()
                moveToRelative(572f, -301f)
                lineTo(587f, 422f)
                quadToRelative(23f, -8f, 38f, -28.5f)
                reflectiveQuadToRelative(15f, -46.5f)
                quadToRelative(0f, -33f, -23.5f, -56f)
                reflectiveQuadTo(560f, 268f)
                quadToRelative(-26f, 0f, -46.5f, 15f)
                reflectiveQuadTo(485f, 321f)
                lineTo(261f, 96f)
                quadToRelative(-19f, -19f, -9f, -43.5f)
                reflectiveQuadToRelative(37f, -24.5f)
                horizontalLineToRelative(391f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 108f)
                verticalLineToRelative(391f)
                quadToRelative(0f, 27f, -24.5f, 37f)
                reflectiveQuadToRelative(-43.5f, -9f)
                close()
            }
        }.build()
        
        return _Smart_card_reader_off!!
    }

private var _Smart_card_reader_off: ImageVector? = null

