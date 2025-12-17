package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_hand_off: ImageVector
    get() {
        if (_Mobile_hand_off != null) return _Mobile_hand_off!!
        
        _Mobile_hand_off = ImageVector.Builder(
            name = "mobile_hand_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-528f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 904f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(791f, 904f)
                lineTo(421f, 534f)
                quadToRelative(-17f, 4f, -33f, 12f)
                reflectiveQuadToRelative(-30f, 22f)
                lineToRelative(-7.5f, 7.5f)
                lineToRelative(-7.5f, 7.5f)
                quadToRelative(-22f, 22f, -23.5f, 53f)
                reflectiveQuadToRelative(18.5f, 55f)
                lineTo(496f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(360f, -800f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(560f, 320f)
                verticalLineToRelative(128f)
                lineTo(202f, 90f)
                quadToRelative(8f, -5f, 17.5f, -7.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(360f)
                close()
                moveTo(420f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 280f)
                close()
                moveToRelative(380f, 408f)
                lineTo(640f, 528f)
                verticalLineToRelative(-168f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(248f)
                close()
                moveTo(638f, 880f)
                quadToRelative(-18f, 0f, -34.5f, -7.5f)
                reflectiveQuadTo(576f, 851f)
                lineTo(414f, 656f)
                quadToRelative(-6f, -7f, -5.5f, -16f)
                reflectiveQuadToRelative(6.5f, -15f)
                quadToRelative(11f, -11f, 27.5f, -13.5f)
                reflectiveQuadTo(474f, 617f)
                lineToRelative(286f, 143f)
                lineToRelative(35f, 35f)
                quadToRelative(-11f, 37f, -42.5f, 61f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineToRelative(-42f)
                close()
            }
        }.build()
        
        return _Mobile_hand_off!!
    }

private var _Mobile_hand_off: ImageVector? = null

