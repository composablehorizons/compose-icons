package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Location_off: ImageVector
    get() {
        if (_Location_off != null) return _Location_off!!
        
        _Location_off = ImageVector.Builder(
            name = "location_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-10f, 0f, -19f, 2f)
                reflectiveQuadToRelative(-17f, 7f)
                lineToRelative(107f, 107f)
                quadToRelative(5f, -8f, 7f, -17f)
                reflectiveQuadToRelative(2f, -19f)
                close()
                moveToRelative(168f, 213f)
                lineToRelative(-58f, -58f)
                quadToRelative(25f, -42f, 37.5f, -78.5f)
                reflectiveQuadTo(720f, 408f)
                quadToRelative(0f, -109f, -69.5f, -178.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-44f, 0f, -82.5f, 13.5f)
                reflectiveQuadTo(328f, 213f)
                lineToRelative(-57f, -57f)
                quadToRelative(43f, -37f, 97f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(127f, 0f, 223.5f, 89f)
                reflectiveQuadTo(800f, 408f)
                quadToRelative(0f, 48f, -18f, 98.5f)
                reflectiveQuadTo(728f, 613f)
                close()
                moveToRelative(-157f, 71f)
                lineTo(244f, 357f)
                quadToRelative(-2f, 12f, -3f, 25f)
                reflectiveQuadToRelative(-1f, 26f)
                quadToRelative(0f, 71f, 59f, 162.5f)
                reflectiveQuadTo(480f, 774f)
                quadToRelative(26f, -23f, 48.5f, -45.5f)
                reflectiveQuadTo(571f, 684f)
                close()
                moveToRelative(-91f, 169f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -32f, 5f, -61f)
                reflectiveQuadToRelative(14f, -55f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 903f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 903f)
                lineTo(627f, 740f)
                quadToRelative(-17f, 18f, -38f, 39f)
                reflectiveQuadToRelative(-56f, 54f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                close()
                moveToRelative(-72f, -332f)
                close()
                moveToRelative(91f, -137f)
                close()
            }
        }.build()
        
        return _Location_off!!
    }

private var _Location_off: ImageVector? = null

