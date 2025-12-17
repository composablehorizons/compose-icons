package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Search_gear: ImageVector
    get() {
        if (_Search_gear != null) return _Search_gear!!
        
        _Search_gear = ImageVector.Builder(
            name = "search_gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(824f, 840f)
                lineTo(568f, 584f)
                quadToRelative(-12f, -13f, -25.5f, -26.5f)
                reflectiveQuadTo(516f, 532f)
                quadToRelative(38f, -24f, 61f, -64f)
                reflectiveQuadToRelative(23f, -88f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(240f, 380f)
                quadToRelative(0f, 6f, 0.5f, 11.5f)
                reflectiveQuadTo(242f, 403f)
                quadToRelative(-18f, 2f, -39.5f, 8f)
                reflectiveQuadTo(164f, 425f)
                quadToRelative(-2f, -11f, -3f, -22f)
                reflectiveQuadToRelative(-1f, -23f)
                quadToRelative(0f, -109f, 75.5f, -184.5f)
                reflectiveQuadTo(420f, 120f)
                quadToRelative(109f, 0f, 184.5f, 75.5f)
                reflectiveQuadTo(680f, 380f)
                quadToRelative(0f, 43f, -13.5f, 81.5f)
                reflectiveQuadTo(629f, 532f)
                lineToRelative(251f, 252f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(240f, 880f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(184f, 796f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -13f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(228f, 540f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 22.5f, 10.5f)
                reflectiveQuadTo(376f, 564f)
                lineToRelative(58f, -18f)
                lineToRelative(40f, 68f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 13f, 2f, 26f)
                reflectiveQuadToRelative(-2f, 26f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(332f, 820f)
                lineToRelative(-12f, 60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 760f)
                close()
            }
        }.build()
        
        return _Search_gear!!
    }

private var _Search_gear: ImageVector? = null

