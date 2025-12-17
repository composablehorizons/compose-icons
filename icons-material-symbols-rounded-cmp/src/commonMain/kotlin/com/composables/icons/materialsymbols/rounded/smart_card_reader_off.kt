package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Smart_card_reader_off: ImageVector
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
                moveTo(680f, 28f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 108f)
                verticalLineToRelative(392f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 540f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(680f, 499f)
                verticalLineToRelative(-391f)
                horizontalLineTo(313f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(273f, 68f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(313f, 28f)
                horizontalLineToRelative(367f)
                close()
                moveToRelative(-91f, 396f)
                lineTo(485f, 321f)
                quadToRelative(9f, -23f, 29f, -38f)
                reflectiveQuadToRelative(46f, -15f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 348f)
                quadToRelative(0f, 26f, -14f, 46.5f)
                reflectiveQuadTo(589f, 424f)
                close()
                moveTo(320f, 268f)
                lineToRelative(118f, 118f)
                quadToRelative(-2f, 24f, -10f, 47f)
                reflectiveQuadToRelative(-22f, 43f)
                quadToRelative(-11f, 14f, -25f, 24.5f)
                reflectiveQuadTo(350f, 511f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(320f, 481f)
                verticalLineToRelative(-213f)
                close()
                moveTo(160f, 748f)
                horizontalLineToRelative(527f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(160f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-40f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 788f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 628f)
                horizontalLineToRelative(407f)
                lineTo(280f, 340f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 568f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 528f)
                verticalLineToRelative(-268f)
                lineTo(56f, 116f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 60f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 735f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 851f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 851f)
                lineToRelative(-23f, -23f)
                horizontalLineTo(120f)
                close()
                moveToRelative(304f, -80f)
                close()
                moveToRelative(52f, -436f)
                close()
                moveToRelative(-82f, 142f)
                close()
            }
        }.build()
        
        return _Smart_card_reader_off!!
    }

private var _Smart_card_reader_off: ImageVector? = null

