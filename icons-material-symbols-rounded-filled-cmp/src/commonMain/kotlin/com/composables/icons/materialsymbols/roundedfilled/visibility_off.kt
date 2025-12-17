package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Visibility_off: ImageVector
    get() {
        if (_Visibility_off != null) return _Visibility_off!!
        
        _Visibility_off = ImageVector.Builder(
            name = "visibility_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 876f)
                lineTo(624f, 738f)
                quadToRelative(-35f, 11f, -71f, 16.5f)
                reflectiveQuadToRelative(-73f, 5.5f)
                quadToRelative(-134f, 0f, -245f, -72f)
                reflectiveQuadTo(61f, 498f)
                quadToRelative(-5f, -9f, -7.5f, -18.5f)
                reflectiveQuadTo(51f, 460f)
                quadToRelative(0f, -10f, 2.5f, -19.5f)
                reflectiveQuadTo(61f, 422f)
                quadToRelative(22f, -39f, 47f, -76f)
                reflectiveQuadToRelative(58f, -66f)
                lineToRelative(-83f, -84f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(480f, 640f)
                quadToRelative(11f, 0f, 21f, -1f)
                reflectiveQuadToRelative(20f, -4f)
                lineTo(305f, 419f)
                quadToRelative(-3f, 10f, -4f, 20f)
                reflectiveQuadToRelative(-1f, 21f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -480f)
                quadToRelative(134f, 0f, 245.5f, 72.5f)
                reflectiveQuadTo(900f, 423f)
                quadToRelative(5f, 8f, 7.5f, 17.5f)
                reflectiveQuadTo(910f, 460f)
                quadToRelative(0f, 10f, -2f, 19.5f)
                reflectiveQuadToRelative(-7f, 17.5f)
                quadToRelative(-19f, 37f, -42.5f, 70f)
                reflectiveQuadTo(806f, 629f)
                quadToRelative(-14f, 14f, -33f, 13f)
                reflectiveQuadToRelative(-33f, -15f)
                lineToRelative(-80f, -80f)
                quadToRelative(-7f, -7f, -9f, -16.5f)
                reflectiveQuadToRelative(1f, -19.5f)
                quadToRelative(4f, -13f, 6f, -25f)
                reflectiveQuadToRelative(2f, -26f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-14f, 0f, -26f, 2f)
                reflectiveQuadToRelative(-25f, 6f)
                quadToRelative(-10f, 3f, -20f, 1f)
                reflectiveQuadToRelative(-17f, -9f)
                lineToRelative(-33f, -33f)
                quadToRelative(-19f, -19f, -12.5f, -44f)
                reflectiveQuadToRelative(31.5f, -32f)
                quadToRelative(25f, -5f, 50.5f, -8f)
                reflectiveQuadToRelative(51.5f, -3f)
                close()
                moveToRelative(79f, 226f)
                quadToRelative(11f, 13f, 18.5f, 28.5f)
                reflectiveQuadTo(587f, 447f)
                quadToRelative(1f, 8f, -6f, 11f)
                reflectiveQuadToRelative(-13f, -3f)
                lineToRelative(-82f, -82f)
                quadToRelative(-6f, -6f, -2.5f, -13f)
                reflectiveQuadToRelative(11.5f, -7f)
                quadToRelative(19f, 2f, 35f, 10.5f)
                reflectiveQuadToRelative(29f, 22.5f)
                close()
            }
        }.build()
        
        return _Visibility_off!!
    }

private var _Visibility_off: ImageVector? = null

