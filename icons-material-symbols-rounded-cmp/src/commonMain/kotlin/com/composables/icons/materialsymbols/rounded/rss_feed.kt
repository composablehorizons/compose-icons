package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rss_feed: ImageVector
    get() {
        if (_Rss_feed != null) return _Rss_feed!!
        
        _Rss_feed = ImageVector.Builder(
            name = "rss_feed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 760f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 840f)
                close()
                moveToRelative(540f, 0f)
                quadToRelative(-26f, 0f, -43.5f, -19f)
                reflectiveQuadTo(676f, 776f)
                quadToRelative(-11f, -97f, -52.5f, -181.5f)
                reflectiveQuadTo(516f, 444f)
                quadToRelative(-66f, -66f, -150.5f, -107.5f)
                reflectiveQuadTo(184f, 284f)
                quadToRelative(-26f, -3f, -45f, -20.5f)
                reflectiveQuadTo(120f, 220f)
                quadToRelative(0f, -26f, 18f, -42.5f)
                reflectiveQuadToRelative(43f, -14.5f)
                quadToRelative(123f, 11f, 230.5f, 62.5f)
                reflectiveQuadTo(601f, 359f)
                quadToRelative(82f, 82f, 133.5f, 189.5f)
                reflectiveQuadTo(797f, 779f)
                quadToRelative(2f, 25f, -14.5f, 43f)
                reflectiveQuadTo(740f, 840f)
                close()
                moveToRelative(-240f, 0f)
                quadToRelative(-25f, 0f, -43f, -17.5f)
                reflectiveQuadTo(434f, 780f)
                quadToRelative(-9f, -49f, -31.5f, -90.5f)
                reflectiveQuadTo(346f, 614f)
                quadToRelative(-34f, -34f, -75.5f, -56.5f)
                reflectiveQuadTo(180f, 526f)
                quadToRelative(-25f, -5f, -42.5f, -23f)
                reflectiveQuadTo(120f, 460f)
                quadToRelative(0f, -26f, 18f, -43f)
                reflectiveQuadToRelative(43f, -13f)
                quadToRelative(73f, 10f, 136.5f, 42.5f)
                reflectiveQuadTo(431f, 529f)
                quadToRelative(50f, 50f, 82.5f, 113.5f)
                reflectiveQuadTo(556f, 779f)
                quadToRelative(4f, 25f, -13f, 43f)
                reflectiveQuadToRelative(-43f, 18f)
                close()
            }
        }.build()
        
        return _Rss_feed!!
    }

private var _Rss_feed: ImageVector? = null

