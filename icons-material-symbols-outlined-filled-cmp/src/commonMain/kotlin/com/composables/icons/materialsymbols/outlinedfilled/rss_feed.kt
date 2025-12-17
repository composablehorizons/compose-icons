package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rss_feed: ImageVector
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
                moveToRelative(480f, 0f)
                quadToRelative(0f, -117f, -44f, -218.5f)
                reflectiveQuadTo(516f, 444f)
                quadToRelative(-76f, -76f, -177.5f, -120f)
                reflectiveQuadTo(120f, 280f)
                verticalLineToRelative(-120f)
                quadToRelative(142f, 0f, 265f, 53f)
                reflectiveQuadToRelative(216f, 146f)
                quadToRelative(93f, 93f, 146f, 216f)
                reflectiveQuadToRelative(53f, 265f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-240f, 0f)
                quadToRelative(0f, -67f, -25f, -124.5f)
                reflectiveQuadTo(346f, 614f)
                quadToRelative(-44f, -44f, -101.5f, -69f)
                reflectiveQuadTo(120f, 520f)
                verticalLineToRelative(-120f)
                quadToRelative(92f, 0f, 171.5f, 34.5f)
                reflectiveQuadTo(431f, 529f)
                quadToRelative(60f, 60f, 94.5f, 139.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Rss_feed!!
    }

private var _Rss_feed: ImageVector? = null

