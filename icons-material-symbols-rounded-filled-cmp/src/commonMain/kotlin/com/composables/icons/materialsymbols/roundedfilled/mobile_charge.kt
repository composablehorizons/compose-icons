package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_charge: ImageVector
    get() {
        if (_Mobile_charge != null) return _Mobile_charge!!
        
        _Mobile_charge = ImageVector.Builder(
            name = "mobile_charge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(180f, -400f)
                verticalLineToRelative(118f)
                quadToRelative(0f, 8f, 7.5f, 9.5f)
                reflectiveQuadTo(479f, 642f)
                lineToRelative(87f, -173f)
                quadToRelative(5f, -10f, -1f, -19.5f)
                reflectiveQuadToRelative(-17f, -9.5f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-118f)
                quadToRelative(0f, -8f, -7.5f, -9.5f)
                reflectiveQuadTo(481f, 318f)
                lineToRelative(-87f, 173f)
                quadToRelative(-5f, 10f, 1f, 19.5f)
                reflectiveQuadToRelative(17f, 9.5f)
                horizontalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _Mobile_charge!!
    }

private var _Mobile_charge: ImageVector? = null

