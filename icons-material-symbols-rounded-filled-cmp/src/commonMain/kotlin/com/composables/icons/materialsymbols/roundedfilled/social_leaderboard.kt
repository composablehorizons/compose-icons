package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Social_leaderboard: ImageVector
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
                lineTo(149f, 138f)
                quadToRelative(-10f, -20f, 1.5f, -39f)
                reflectiveQuadToRelative(34.5f, -19f)
                horizontalLineToRelative(166f)
                quadToRelative(23f, 0f, 41.5f, 12f)
                reflectiveQuadToRelative(29.5f, 32f)
                lineToRelative(58f, 116f)
                lineToRelative(58f, -116f)
                quadToRelative(11f, -20f, 29.5f, -32f)
                reflectiveQuadToRelative(41.5f, -12f)
                horizontalLineToRelative(166f)
                quadToRelative(23f, 0f, 34.5f, 19f)
                reflectiveQuadToRelative(1.5f, 39f)
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
                moveToRelative(0f, -126f)
                lineToRelative(49f, 37f)
                quadToRelative(6f, 5f, 12f, 0.5f)
                reflectiveQuadToRelative(4f, -11.5f)
                lineToRelative(-19f, -61f)
                lineToRelative(49f, -35f)
                quadToRelative(6f, -5f, 4f, -11.5f)
                reflectiveQuadToRelative(-10f, -6.5f)
                horizontalLineToRelative(-60f)
                lineToRelative(-19f, -65f)
                quadToRelative(-2f, -7f, -10f, -7f)
                reflectiveQuadToRelative(-10f, 7f)
                lineToRelative(-19f, 65f)
                horizontalLineToRelative(-60f)
                quadToRelative(-8f, 0f, -10f, 6.5f)
                reflectiveQuadToRelative(4f, 11.5f)
                lineToRelative(49f, 35f)
                lineToRelative(-19f, 61f)
                quadToRelative(-2f, 7f, 4f, 11.5f)
                reflectiveQuadToRelative(12f, -0.5f)
                lineToRelative(49f, -37f)
                close()
            }
        }.build()
        
        return _Social_leaderboard!!
    }

private var _Social_leaderboard: ImageVector? = null

