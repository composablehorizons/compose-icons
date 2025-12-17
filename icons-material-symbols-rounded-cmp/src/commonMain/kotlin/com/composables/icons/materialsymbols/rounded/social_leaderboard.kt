package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Social_leaderboard: ImageVector
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
                moveTo(480f, 800f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 620f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 620f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveTo(363f, 388f)
                quadToRelative(20f, -11f, 42.5f, -17.5f)
                reflectiveQuadTo(451f, 362f)
                lineTo(350f, 160f)
                horizontalLineTo(250f)
                lineToRelative(113f, 228f)
                close()
                moveTo(256f, 752f)
                quadToRelative(-17f, -29f, -26.5f, -62.5f)
                reflectiveQuadTo(220f, 620f)
                quadToRelative(0f, -36f, 9.5f, -69.5f)
                reflectiveQuadTo(256f, 488f)
                quadToRelative(-42f, 14f, -69f, 49.5f)
                reflectiveQuadTo(160f, 620f)
                quadToRelative(0f, 47f, 27f, 82.5f)
                reflectiveQuadToRelative(69f, 49.5f)
                close()
                moveToRelative(448f, 0f)
                quadToRelative(42f, -14f, 69f, -49.5f)
                reflectiveQuadToRelative(27f, -82.5f)
                quadToRelative(0f, -47f, -27f, -82.5f)
                reflectiveQuadTo(704f, 488f)
                quadToRelative(17f, 29f, 26.5f, 62.5f)
                reflectiveQuadTo(740f, 620f)
                quadToRelative(0f, 36f, -9.5f, 69.5f)
                reflectiveQuadTo(704f, 752f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-40f, 0f, -76.5f, -11.5f)
                reflectiveQuadTo(336f, 837f)
                quadToRelative(-9f, 2f, -18f, 2.5f)
                reflectiveQuadToRelative(-19f, 0.5f)
                quadToRelative(-91f, 0f, -155f, -64f)
                reflectiveQuadTo(80f, 621f)
                quadToRelative(0f, -87f, 58f, -149f)
                reflectiveQuadToRelative(143f, -69f)
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
                quadToRelative(85f, 8f, 142.5f, 70f)
                reflectiveQuadTo(880f, 620f)
                quadToRelative(0f, 92f, -64f, 156f)
                reflectiveQuadToRelative(-156f, 64f)
                quadToRelative(-9f, 0f, -18.5f, -0.5f)
                reflectiveQuadTo(623f, 837f)
                quadToRelative(-31f, 20f, -67f, 31.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -260f)
                close()
                moveTo(363f, 388f)
                lineTo(250f, 160f)
                lineToRelative(113f, 228f)
                close()
                moveToRelative(117f, 286f)
                lineToRelative(-49f, 37f)
                quadToRelative(-6f, 5f, -12f, 0.5f)
                reflectiveQuadToRelative(-4f, -11.5f)
                lineToRelative(19f, -61f)
                lineToRelative(-49f, -35f)
                quadToRelative(-6f, -5f, -4f, -11.5f)
                reflectiveQuadToRelative(10f, -6.5f)
                horizontalLineToRelative(60f)
                lineToRelative(19f, -65f)
                quadToRelative(2f, -7f, 10f, -7f)
                reflectiveQuadToRelative(10f, 7f)
                lineToRelative(19f, 65f)
                horizontalLineToRelative(60f)
                quadToRelative(8f, 0f, 10f, 6.5f)
                reflectiveQuadToRelative(-4f, 11.5f)
                lineToRelative(-49f, 35f)
                lineToRelative(19f, 61f)
                quadToRelative(2f, 7f, -4f, 11.5f)
                reflectiveQuadToRelative(-12f, -0.5f)
                lineToRelative(-49f, -37f)
                close()
                moveToRelative(117f, -286f)
                lineToRelative(114f, -228f)
                horizontalLineTo(610f)
                lineToRelative(-85f, 170f)
                lineToRelative(19f, 38f)
                quadToRelative(14f, 4f, 27f, 8.5f)
                reflectiveQuadToRelative(26f, 11.5f)
                close()
            }
        }.build()
        
        return _Social_leaderboard!!
    }

private var _Social_leaderboard: ImageVector? = null

