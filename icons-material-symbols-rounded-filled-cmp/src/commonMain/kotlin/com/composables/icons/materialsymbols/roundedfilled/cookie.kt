package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cookie: ImageVector
    get() {
        if (_Cookie != null) return _Cookie!!
        
        _Cookie = ImageVector.Builder(
            name = "cookie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -81f, 33.5f, -157.5f)
                reflectiveQuadToRelative(93f, -134.5f)
                quadTo(266f, 130f, 348f, 100f)
                reflectiveQuadToRelative(180f, -18f)
                quadToRelative(15f, 2f, 23f, 12.5f)
                reflectiveQuadToRelative(9f, 28.5f)
                quadToRelative(2f, 64f, 47.5f, 109.5f)
                reflectiveQuadTo(716f, 280f)
                quadToRelative(21f, 1f, 32f, 12f)
                reflectiveQuadToRelative(12f, 34f)
                quadToRelative(2f, 42f, 25.5f, 69f)
                reflectiveQuadToRelative(65.5f, 41f)
                quadToRelative(14f, 5f, 21.5f, 14.5f)
                reflectiveQuadTo(880f, 474f)
                quadToRelative(2f, 83f, -29f, 157f)
                reflectiveQuadToRelative(-85f, 129.5f)
                quadTo(712f, 816f, 638f, 848f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-60f, -480f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(420f, 280f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(360f, 340f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(420f, 400f)
                close()
                moveToRelative(-80f, 200f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 600f)
                close()
                moveToRelative(260f, 40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 640f)
                close()
            }
        }.build()
        
        return _Cookie!!
    }

private var _Cookie: ImageVector? = null

