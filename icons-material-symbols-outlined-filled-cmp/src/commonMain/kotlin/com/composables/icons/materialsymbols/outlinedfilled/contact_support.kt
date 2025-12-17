package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Contact_support: ImageVector
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
                moveTo(480f, 880f)
                lineToRelative(-10f, -120f)
                horizontalLineToRelative(-10f)
                quadToRelative(-142f, 0f, -241f, -99f)
                reflectiveQuadToRelative(-99f, -241f)
                quadToRelative(0f, -142f, 99f, -241f)
                reflectiveQuadToRelative(241f, -99f)
                quadToRelative(71f, 0f, 132.5f, 26.5f)
                reflectiveQuadToRelative(108f, 73f)
                quadToRelative(46.5f, 46.5f, 73f, 108f)
                reflectiveQuadTo(800f, 420f)
                quadToRelative(0f, 75f, -24.5f, 144f)
                reflectiveQuadToRelative(-67f, 128f)
                quadToRelative(-42.5f, 59f, -101f, 107f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-21f, -241f)
                quadToRelative(17f, 0f, 29f, -12f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(0f, -17f, -12f, -29f)
                reflectiveQuadToRelative(-29f, -12f)
                quadToRelative(-17f, 0f, -29f, 12f)
                reflectiveQuadToRelative(-12f, 29f)
                quadToRelative(0f, 17f, 12f, 29f)
                reflectiveQuadToRelative(29f, 12f)
                close()
                moveToRelative(-29f, -127f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -30f, 6f, -42f)
                reflectiveQuadToRelative(38f, -44f)
                quadToRelative(18f, -18f, 30f, -39f)
                reflectiveQuadToRelative(12f, -45f)
                quadToRelative(0f, -51f, -34.5f, -76.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(-44f, 0f, -74f, 24.5f)
                reflectiveQuadTo(344f, 324f)
                lineToRelative(56f, 22f)
                quadToRelative(5f, -17f, 19f, -33.5f)
                reflectiveQuadToRelative(41f, -16.5f)
                quadToRelative(27f, 0f, 40.5f, 15f)
                reflectiveQuadToRelative(13.5f, 33f)
                quadToRelative(0f, 17f, -10f, 30.5f)
                reflectiveQuadTo(480f, 402f)
                quadToRelative(-35f, 30f, -42.5f, 47.5f)
                reflectiveQuadTo(430f, 512f)
                close()
            }
        }.build()
        
        return _Contact_support!!
    }

private var _Contact_support: ImageVector? = null

