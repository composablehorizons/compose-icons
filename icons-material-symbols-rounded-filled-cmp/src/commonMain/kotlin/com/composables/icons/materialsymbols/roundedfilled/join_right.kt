package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Join_right: ImageVector
    get() {
        if (_Join_right != null) return _Join_right!!
        
        _Join_right = ImageVector.Builder(
            name = "join_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(920f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(640f, 760f)
                quadToRelative(-27f, 0f, -52.5f, -5f)
                reflectiveQuadTo(538f, 741f)
                quadToRelative(58f, -49f, 90f, -117f)
                reflectiveQuadToRelative(32f, -144f)
                quadToRelative(0f, -76f, -32f, -144f)
                reflectiveQuadToRelative(-90f, -117f)
                quadToRelative(24f, -9f, 49.5f, -14f)
                reflectiveQuadToRelative(52.5f, -5f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(920f, 480f)
                close()
                moveTo(480f, 698f)
                quadToRelative(-7f, 0f, -14f, -2.5f)
                reflectiveQuadToRelative(-12f, -7.5f)
                quadToRelative(-46f, -38f, -70f, -93f)
                reflectiveQuadToRelative(-24f, -115f)
                quadToRelative(0f, -60f, 24f, -115f)
                reflectiveQuadToRelative(70f, -93f)
                quadToRelative(5f, -5f, 12f, -7.5f)
                reflectiveQuadToRelative(14f, -2.5f)
                quadToRelative(7f, 0f, 14f, 2.5f)
                reflectiveQuadToRelative(12f, 7.5f)
                quadToRelative(46f, 38f, 70f, 93f)
                reflectiveQuadToRelative(24f, 115f)
                quadToRelative(0f, 60f, -24f, 115f)
                reflectiveQuadToRelative(-70f, 93f)
                quadToRelative(-5f, 5f, -12f, 7.5f)
                reflectiveQuadToRelative(-14f, 2.5f)
                close()
                moveTo(40f, 480f)
                quadToRelative(0f, -56f, 21f, -107f)
                reflectiveQuadToRelative(61f, -91f)
                quadToRelative(45f, -45f, 105.5f, -66.5f)
                reflectiveQuadTo(352f, 202f)
                quadToRelative(17f, 2f, 27f, 14.5f)
                reflectiveQuadToRelative(8f, 29.5f)
                quadToRelative(-2f, 17f, -15f, 27f)
                reflectiveQuadToRelative(-30f, 8f)
                quadToRelative(-45f, -5f, -88f, 10.5f)
                reflectiveQuadTo(179f, 339f)
                quadToRelative(-28f, 28f, -43.5f, 64.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 40f, 15.5f, 76.5f)
                reflectiveQuadTo(179f, 621f)
                quadToRelative(32f, 32f, 75f, 47.5f)
                reflectiveQuadToRelative(88f, 10.5f)
                quadToRelative(17f, -2f, 29.5f, 8f)
                reflectiveQuadToRelative(14.5f, 27f)
                quadToRelative(2f, 16f, -7.5f, 29f)
                reflectiveQuadTo(352f, 758f)
                quadToRelative(-64f, 8f, -124.5f, -13.5f)
                reflectiveQuadTo(122f, 678f)
                quadToRelative(-40f, -40f, -61f, -91f)
                reflectiveQuadTo(40f, 480f)
                close()
            }
        }.build()
        
        return _Join_right!!
    }

private var _Join_right: ImageVector? = null

