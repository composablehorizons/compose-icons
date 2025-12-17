package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hdr_plus_off: ImageVector
    get() {
        if (_Hdr_plus_off != null) return _Hdr_plus_off!!
        
        _Hdr_plus_off = ImageVector.Builder(
            name = "hdr_plus_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 420f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(340f, 620f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 60f)
                horizontalLineToRelative(44f)
                lineToRelative(27f, 63f)
                quadToRelative(3f, 8f, 10.5f, 12.5f)
                reflectiveQuadTo(437f, 760f)
                quadToRelative(15f, 0f, 23.5f, -13f)
                reflectiveQuadToRelative(2.5f, -27f)
                lineToRelative(-19f, -44f)
                quadToRelative(15f, -9f, 25.5f, -23.5f)
                reflectiveQuadTo(480f, 620f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(420f, 520f)
                horizontalLineTo(310f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(280f, 550f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(310f, 760f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(340f, 730f)
                verticalLineToRelative(-50f)
                close()
                moveToRelative(-30f, -200f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(340f, 450f)
                verticalLineToRelative(-54f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(310f, 480f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -84f, 31f, -156.5f)
                reflectiveQuadTo(199f, 199f)
                lineToRelative(562f, 562f)
                quadToRelative(-51f, 57f, -123.5f, 88f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(312f, 24f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(88f, -424f)
                quadToRelative(0f, 44f, -8f, 84f)
                reflectiveQuadToRelative(-25f, 77f)
                quadToRelative(-5f, 11f, -15f, 18f)
                reflectiveQuadToRelative(-21f, 9f)
                quadToRelative(-11f, 2f, -23f, -2f)
                reflectiveQuadToRelative(-21f, -13f)
                lineTo(594f, 480f)
                horizontalLineToRelative(46f)
                quadToRelative(24f, 0f, 42f, -18f)
                reflectiveQuadToRelative(18f, -42f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -24f, -18f, -42f)
                reflectiveQuadToRelative(-42f, -18f)
                horizontalLineTo(520f)
                verticalLineToRelative(166f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-96f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(450f, 240f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(420f, 270f)
                verticalLineToRelative(36f)
                lineTo(307f, 193f)
                quadToRelative(-9f, -9f, -13f, -21f)
                reflectiveQuadToRelative(-2f, -23f)
                quadToRelative(2f, -11f, 8.5f, -21f)
                reflectiveQuadToRelative(17.5f, -15f)
                quadToRelative(37f, -17f, 78f, -25f)
                reflectiveQuadToRelative(84f, -8f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                close()
            }
        }.build()
        
        return _Hdr_plus_off!!
    }

private var _Hdr_plus_off: ImageVector? = null

