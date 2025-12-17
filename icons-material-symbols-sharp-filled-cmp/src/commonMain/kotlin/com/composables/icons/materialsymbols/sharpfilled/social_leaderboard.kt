package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Social_leaderboard: ImageVector
    get() {
        if (_Social_leaderboard != null) return _Social_leaderboard!!
        
        _Social_leaderboard = ImageVector.Builder(
            name = "social_leaderboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(299f, 840f)
                quadToRelative(-91f, 0f, -155f, -64f)
                reflectiveQuadTo(80f, 621f)
                quadToRelative(0f, -86f, 57.5f, -148.5f)
                reflectiveQuadTo(281f, 403f)
                lineTo(120f, 80f)
                horizontalLineToRelative(280f)
                lineToRelative(80f, 160f)
                lineToRelative(80f, -160f)
                horizontalLineToRelative(280f)
                lineTo(680f, 401f)
                quadToRelative(85f, 8f, 142.5f, 70.5f)
                reflectiveQuadTo(880f, 620f)
                quadToRelative(0f, 92f, -64f, 156f)
                reflectiveQuadToRelative(-156f, 64f)
                quadToRelative(-9f, 0f, -18.5f, -0.5f)
                reflectiveQuadTo(623f, 837f)
                quadToRelative(55f, -36f, 86f, -93.5f)
                reflectiveQuadTo(740f, 620f)
                quadToRelative(0f, -109f, -75.5f, -184.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-109f, 0f, -184.5f, 75.5f)
                reflectiveQuadTo(220f, 620f)
                quadToRelative(0f, 68f, 28f, 128f)
                reflectiveQuadToRelative(88f, 89f)
                quadToRelative(-9f, 2f, -18.5f, 2.5f)
                reflectiveQuadToRelative(-18.5f, 0.5f)
                close()
                moveToRelative(181f, -40f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(300f, 620f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(660f, 620f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(-74f, -70f)
                lineToRelative(74f, -56f)
                lineToRelative(74f, 56f)
                lineToRelative(-28f, -91f)
                lineToRelative(74f, -53f)
                horizontalLineToRelative(-91f)
                lineToRelative(-29f, -96f)
                lineToRelative(-29f, 96f)
                horizontalLineToRelative(-91f)
                lineToRelative(74f, 53f)
                lineToRelative(-28f, 91f)
                close()
            }
        }.build()
        
        return _Social_leaderboard!!
    }

private var _Social_leaderboard: ImageVector? = null

