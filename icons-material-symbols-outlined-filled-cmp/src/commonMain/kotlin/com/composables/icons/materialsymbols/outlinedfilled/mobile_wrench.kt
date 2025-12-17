package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_wrench: ImageVector
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
                moveTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
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
                moveToRelative(515f, 0f)
                lineToRelative(-88f, -88f)
                quadToRelative(-11f, 5f, -23f, 6.5f)
                reflectiveQuadToRelative(-24f, 1.5f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(520f, 701f)
                quadToRelative(0f, -18f, 4.5f, -35f)
                reflectiveQuadToRelative(12.5f, -32f)
                lineToRelative(95f, 95f)
                lineToRelative(56f, -57f)
                lineToRelative(-95f, -94f)
                quadToRelative(15f, -8f, 32f, -12.5f)
                reflectiveQuadToRelative(35f, -4.5f)
                quadToRelative(58f, 0f, 99f, 40.5f)
                reflectiveQuadToRelative(41f, 99.5f)
                quadToRelative(0f, 12f, -2f, 24f)
                reflectiveQuadToRelative(-7f, 23f)
                lineToRelative(89f, 88f)
                lineToRelative(-85f, 84f)
                close()
            }
        }.build()
        
        return _Mobile_wrench!!
    }

private var _Mobile_wrench: ImageVector? = null

