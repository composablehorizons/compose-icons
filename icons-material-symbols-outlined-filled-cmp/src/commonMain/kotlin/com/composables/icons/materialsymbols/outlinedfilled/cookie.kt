package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cookie: ImageVector
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
                quadToRelative(0f, -75f, 29f, -147f)
                reflectiveQuadToRelative(81f, -128.5f)
                quadToRelative(52f, -56.5f, 125f, -91f)
                reflectiveQuadTo(475f, 79f)
                quadToRelative(21f, 0f, 43f, 2f)
                reflectiveQuadToRelative(45f, 7f)
                quadToRelative(-9f, 45f, 6f, 85f)
                reflectiveQuadToRelative(45f, 66.5f)
                quadToRelative(30f, 26.5f, 71.5f, 36.5f)
                reflectiveQuadToRelative(85.5f, -5f)
                quadToRelative(-26f, 59f, 7.5f, 113f)
                reflectiveQuadToRelative(99.5f, 56f)
                quadToRelative(1f, 11f, 1.5f, 20.5f)
                reflectiveQuadToRelative(0.5f, 20.5f)
                quadToRelative(0f, 82f, -31.5f, 154.5f)
                reflectiveQuadToRelative(-85.5f, 127f)
                quadToRelative(-54f, 54.5f, -127f, 86f)
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

