package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Explore_off: ImageVector
    get() {
        if (_Explore_off != null) return _Explore_off!!
        
        _Explore_off = ImageVector.Builder(
            name = "explore_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(688f, 272f)
                quadToRelative(3f, 3f, 4f, 7.5f)
                reflectiveQuadToRelative(-1f, 9.5f)
                lineToRelative(-83f, 168f)
                quadToRelative(-5f, 9f, -14.5f, 11f)
                reflectiveQuadToRelative(-17.5f, -6f)
                lineToRelative(-78f, -78f)
                quadToRelative(-8f, -8f, -6f, -17.5f)
                reflectiveQuadToRelative(11f, -14.5f)
                lineToRelative(168f, -83f)
                quadToRelative(5f, -2f, 9.5f, -1f)
                reflectiveQuadToRelative(7.5f, 4f)
                close()
                moveTo(480f, 800f)
                quadToRelative(43f, 0f, 84f, -11f)
                reflectiveQuadToRelative(78f, -33f)
                lineTo(482f, 596f)
                lineToRelative(-193f, 95f)
                quadToRelative(-10f, 5f, -17.5f, -2.5f)
                reflectiveQuadTo(269f, 671f)
                lineToRelative(93f, -195f)
                lineToRelative(-158f, -158f)
                quadToRelative(-22f, 37f, -33f, 78f)
                reflectiveQuadToRelative(-11f, 84f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -59f, 17f, -115f)
                reflectiveQuadToRelative(49f, -105f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineToRelative(-63f, -62f)
                quadToRelative(-49f, 32f, -105f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(79f, -479f)
                close()
                moveTo(401f, 559f)
                close()
                moveToRelative(-87f, -443f)
                quadToRelative(39f, -18f, 81f, -27f)
                reflectiveQuadToRelative(85f, -9f)
                quadToRelative(80f, 0f, 153f, 30f)
                reflectiveQuadToRelative(130f, 87f)
                quadToRelative(57f, 57f, 87f, 130f)
                reflectiveQuadToRelative(30f, 153f)
                quadToRelative(0f, 43f, -9f, 85f)
                reflectiveQuadToRelative(-27f, 81f)
                quadToRelative(-7f, 15f, -23f, 19.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                quadToRelative(-14f, -8f, -19f, -24f)
                reflectiveQuadToRelative(2f, -32f)
                quadToRelative(13f, -30f, 19.5f, -62f)
                reflectiveQuadToRelative(6.5f, -64f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-32f, 0f, -64f, 6.5f)
                reflectiveQuadTo(354f, 186f)
                quadToRelative(-16f, 7f, -32f, 2f)
                reflectiveQuadToRelative(-24f, -19f)
                quadToRelative(-8f, -14f, -3.5f, -30f)
                reflectiveQuadToRelative(19.5f, -23f)
                close()
            }
        }.build()
        
        return _Explore_off!!
    }

private var _Explore_off: ImageVector? = null

