package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_wrench: ImageVector
    get() {
        if (_Mobile_wrench != null) return _Mobile_wrench!!
        
        _Mobile_wrench = ImageVector.Builder(
            name = "mobile_wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 700f)
                quadToRelative(11f, -12f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 644f)
                lineToRelative(-42f, -41f)
                quadToRelative(-9f, -9f, -6.5f, -21.5f)
                reflectiveQuadTo(626f, 565f)
                quadToRelative(8f, -2f, 16.5f, -3f)
                reflectiveQuadToRelative(17.5f, -1f)
                quadToRelative(58f, 0f, 99f, 40.5f)
                reflectiveQuadToRelative(41f, 99.5f)
                quadToRelative(0f, 12f, -2f, 24f)
                reflectiveQuadToRelative(-7f, 23f)
                lineToRelative(60f, 60f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-28f, 28f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(767f, 892f)
                lineToRelative(-60f, -60f)
                quadToRelative(-11f, 5f, -23f, 6.5f)
                reflectiveQuadToRelative(-24f, 1.5f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(520f, 701f)
                quadToRelative(0f, -9f, 1f, -17.5f)
                reflectiveQuadToRelative(3f, -16.5f)
                quadToRelative(3f, -12f, 15.5f, -15f)
                reflectiveQuadToRelative(22.5f, 7f)
                lineToRelative(42f, 42f)
                quadToRelative(12f, 12f, 28f, 11.5f)
                reflectiveQuadToRelative(28f, -12.5f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(68f)
                quadToRelative(-23f, -11f, -48f, -17.5f)
                reflectiveQuadToRelative(-52f, -6.5f)
                quadToRelative(-91f, 0f, -155.5f, 64.5f)
                reflectiveQuadTo(440f, 700f)
                quadToRelative(0f, 91f, 64.5f, 155.5f)
                reflectiveQuadTo(660f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Mobile_wrench!!
    }

private var _Mobile_wrench: ImageVector? = null

