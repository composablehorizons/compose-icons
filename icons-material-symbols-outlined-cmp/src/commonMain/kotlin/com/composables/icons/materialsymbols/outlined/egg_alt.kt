package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Egg_alt: ImageVector
    get() {
        if (_Egg_alt != null) return _Egg_alt!!
        
        _Egg_alt = ImageVector.Builder(
            name = "egg_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 880f)
                quadToRelative(-67f, 0f, -101.5f, -22.5f)
                reflectiveQuadTo(480f, 810f)
                quadToRelative(-19f, -20f, -36.5f, -35f)
                reflectiveQuadTo(399f, 760f)
                quadToRelative(-45f, 0f, -100f, -15.5f)
                reflectiveQuadToRelative(-103.5f, -51f)
                quadTo(147f, 658f, 114f, 601f)
                reflectiveQuadTo(80f, 461f)
                quadToRelative(-2f, -167f, 82.5f, -274f)
                reflectiveQuadTo(399f, 80f)
                quadToRelative(71f, 0f, 120f, 20.5f)
                reflectiveQuadToRelative(84.5f, 51.5f)
                quadToRelative(35.5f, 31f, 60f, 68.5f)
                reflectiveQuadTo(710f, 293f)
                quadToRelative(12f, 20f, 24f, 36.5f)
                reflectiveQuadToRelative(26f, 30.5f)
                quadToRelative(60f, 60f, 90f, 105f)
                reflectiveQuadToRelative(30f, 136f)
                quadToRelative(0f, 120f, -74.5f, 199.5f)
                reflectiveQuadTo(640f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(57f, 0f, 108.5f, -56.5f)
                reflectiveQuadTo(800f, 601f)
                quadToRelative(0f, -66f, -19.5f, -97f)
                reflectiveQuadTo(704f, 416f)
                quadToRelative(-21f, -20f, -37.5f, -44.5f)
                reflectiveQuadTo(633f, 321f)
                quadToRelative(-41f, -65f, -87f, -113f)
                reflectiveQuadToRelative(-147f, -48f)
                quadToRelative(-129f, 0f, -185f, 92.5f)
                reflectiveQuadTo(160f, 460f)
                quadToRelative(1f, 67f, 29f, 110f)
                reflectiveQuadToRelative(66.5f, 67.5f)
                quadTo(294f, 662f, 334f, 671f)
                reflectiveQuadToRelative(65f, 9f)
                quadToRelative(51f, 0f, 82f, 24.5f)
                reflectiveQuadToRelative(51f, 45.5f)
                quadToRelative(22f, 23f, 42.5f, 36.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveTo(480f, 620f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(-1f, -140f)
                close()
            }
        }.build()
        
        return _Egg_alt!!
    }

private var _Egg_alt: ImageVector? = null

