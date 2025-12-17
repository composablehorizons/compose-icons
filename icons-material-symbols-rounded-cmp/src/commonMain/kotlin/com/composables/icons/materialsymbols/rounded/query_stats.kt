package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Query_stats: ImageVector
    get() {
        if (_Query_stats != null) return _Query_stats!!
        
        _Query_stats = ImageVector.Builder(
            name = "query_stats",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(70f, 702f)
                quadToRelative(-13f, -9f, -15.5f, -24.5f)
                reflectiveQuadTo(60f, 648f)
                lineToRelative(151f, -242f)
                quadToRelative(11f, -17f, 30.5f, -18.5f)
                reflectiveQuadTo(275f, 401f)
                lineToRelative(85f, 99f)
                lineToRelative(127f, -207f)
                quadToRelative(11f, -19f, 33.5f, -19f)
                reflectiveQuadToRelative(34.5f, 18f)
                lineToRelative(41f, 62f)
                quadToRelative(11f, 17f, 6.5f, 32.5f)
                reflectiveQuadTo(585f, 410f)
                quadToRelative(-13f, 8f, -28.5f, 6.5f)
                reflectiveQuadTo(530f, 398f)
                lineToRelative(-7f, -10f)
                lineToRelative(-123f, 200f)
                quadToRelative(-11f, 17f, -31f, 19f)
                reflectiveQuadToRelative(-34f, -14f)
                lineToRelative(-85f, -99f)
                lineToRelative(-122f, 197f)
                quadToRelative(-9f, 15f, -26.5f, 18.5f)
                reflectiveQuadTo(70f, 702f)
                close()
                moveToRelative(573f, 121f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(463f, 643f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(643f, 463f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(823f, 643f)
                quadToRelative(0f, 26f, -7f, 50.5f)
                reflectiveQuadTo(795f, 739f)
                lineToRelative(96f, 96f)
                quadToRelative(12f, 12f, 12.5f, 28f)
                reflectiveQuadTo(892f, 891f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(835f, 891f)
                lineToRelative(-97f, -96f)
                quadToRelative(-20f, 14f, -44.5f, 21f)
                reflectiveQuadToRelative(-50.5f, 7f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(49f, -331f)
                quadToRelative(-13f, -8f, -18f, -23f)
                reflectiveQuadToRelative(6f, -32f)
                lineToRelative(152f, -241f)
                quadToRelative(9f, -14f, 26f, -18f)
                reflectiveQuadToRelative(31f, 7f)
                quadToRelative(13f, 9f, 16f, 24.5f)
                reflectiveQuadToRelative(-5f, 29.5f)
                lineTo(747f, 399f)
                quadToRelative(-11f, 17f, -26.5f, 19f)
                reflectiveQuadToRelative(-28.5f, -6f)
                close()
            }
        }.build()
        
        return _Query_stats!!
    }

private var _Query_stats: ImageVector? = null

