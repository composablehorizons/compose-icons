package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Contact_support: ImageVector
    get() {
        if (_Contact_support != null) return _Contact_support!!
        
        _Contact_support = ImageVector.Builder(
            name = "contact_support",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(470f, 760f)
                horizontalLineToRelative(-10f)
                quadToRelative(-142f, 0f, -241f, -99f)
                reflectiveQuadToRelative(-99f, -241f)
                quadToRelative(0f, -142f, 99f, -241f)
                reflectiveQuadToRelative(241f, -99f)
                quadToRelative(71f, 0f, 132.5f, 26.5f)
                reflectiveQuadToRelative(108f, 73f)
                quadToRelative(46.5f, 46.5f, 73f, 108f)
                reflectiveQuadTo(800f, 420f)
                quadToRelative(0f, 134f, -75.5f, 249f)
                reflectiveQuadTo(534f, 849f)
                quadToRelative(-10f, 5f, -20f, 5.5f)
                reflectiveQuadToRelative(-18f, -4.5f)
                quadToRelative(-8f, -5f, -14f, -13f)
                reflectiveQuadToRelative(-7f, -19f)
                lineToRelative(-5f, -58f)
                close()
                moveToRelative(-11f, -121f)
                quadToRelative(17f, 0f, 29f, -12f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(0f, -17f, -12f, -29f)
                reflectiveQuadToRelative(-29f, -12f)
                quadToRelative(-17f, 0f, -29f, 12f)
                reflectiveQuadToRelative(-12f, 29f)
                quadToRelative(0f, 17f, 12f, 29f)
                reflectiveQuadToRelative(29f, 12f)
                close()
                moveToRelative(-87f, -304f)
                quadToRelative(11f, 5f, 22f, 0.5f)
                reflectiveQuadToRelative(18f, -14.5f)
                quadToRelative(9f, -12f, 21f, -18.5f)
                reflectiveQuadToRelative(27f, -6.5f)
                quadToRelative(24f, 0f, 39f, 13.5f)
                reflectiveQuadToRelative(15f, 34.5f)
                quadToRelative(0f, 13f, -7.5f, 26f)
                reflectiveQuadTo(480f, 402f)
                quadToRelative(-25f, 22f, -37f, 41.5f)
                reflectiveQuadTo(431f, 483f)
                quadToRelative(0f, 12f, 8.5f, 20.5f)
                reflectiveQuadTo(460f, 512f)
                quadToRelative(12f, 0f, 20f, -9f)
                reflectiveQuadToRelative(12f, -21f)
                quadToRelative(5f, -17f, 18f, -31f)
                reflectiveQuadToRelative(24f, -25f)
                quadToRelative(21f, -21f, 31.5f, -42f)
                reflectiveQuadToRelative(10.5f, -42f)
                quadToRelative(0f, -46f, -31.5f, -74f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(-32f, 0f, -59f, 15.5f)
                reflectiveQuadTo(357f, 298f)
                quadToRelative(-6f, 11f, -1.5f, 21.5f)
                reflectiveQuadTo(372f, 335f)
                close()
            }
        }.build()
        
        return _Contact_support!!
    }

private var _Contact_support: ImageVector? = null

