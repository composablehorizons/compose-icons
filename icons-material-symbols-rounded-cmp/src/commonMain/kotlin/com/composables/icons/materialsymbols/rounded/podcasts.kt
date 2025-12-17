package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Podcasts: ImageVector
    get() {
        if (_Podcasts != null) return _Podcasts!!
        
        _Podcasts = ImageVector.Builder(
            name = "podcasts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-291f)
                quadToRelative(-18f, -11f, -29f, -28.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 23f, -11f, 41f)
                reflectiveQuadToRelative(-29f, 28f)
                verticalLineToRelative(291f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                close()
                moveToRelative(-207f, -99f)
                quadToRelative(-12f, 12f, -29f, 12f)
                reflectiveQuadToRelative(-28f, -13f)
                quadToRelative(-45f, -53f, -70.5f, -119f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 75f, -25.5f, 141f)
                reflectiveQuadTo(784f, 740f)
                quadToRelative(-11f, 13f, -27.5f, 13.5f)
                reflectiveQuadTo(728f, 742f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -30f)
                quadToRelative(34f, -42f, 53f, -94f)
                reflectiveQuadToRelative(19f, -110f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 58f, 19f, 109.5f)
                reflectiveQuadToRelative(54f, 93.5f)
                quadToRelative(11f, 13f, 11.5f, 29.5f)
                reflectiveQuadTo(233f, 741f)
                close()
                moveToRelative(113f, -113f)
                quadToRelative(-12f, 12f, -29f, 12.5f)
                reflectiveQuadTo(290f, 627f)
                quadToRelative(-23f, -31f, -36.5f, -68f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 42f, -13.5f, 79.5f)
                reflectiveQuadTo(670f, 627f)
                quadToRelative(-10f, 13f, -27f, 13.5f)
                reflectiveQuadTo(614f, 629f)
                quadToRelative(-11f, -11f, -11.5f, -28f)
                reflectiveQuadToRelative(9.5f, -31f)
                quadToRelative(13f, -20f, 20.5f, -42.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 26f, 7.5f, 48f)
                reflectiveQuadToRelative(20.5f, 42f)
                quadToRelative(10f, 14f, 9.5f, 30.5f)
                reflectiveQuadTo(346f, 628f)
                close()
            }
        }.build()
        
        return _Podcasts!!
    }

private var _Podcasts: ImageVector? = null

