package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Personal_injury: ImageVector
    get() {
        if (_Personal_injury != null) return _Personal_injury!!
        
        _Personal_injury = ImageVector.Builder(
            name = "personal_injury",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 240f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-271f)
                quadToRelative(0f, -34f, 17f, -62.5f)
                reflectiveQuadToRelative(47f, -44.5f)
                quadToRelative(51f, -26f, 115.5f, -44f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(76f, 0f, 140.5f, 18f)
                reflectiveQuadTo(736f, 502f)
                quadToRelative(30f, 16f, 47f, 44.5f)
                reflectiveQuadToRelative(17f, 62.5f)
                verticalLineToRelative(191f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(390f)
                quadToRelative(-46f, 0f, -78f, -32f)
                reflectiveQuadToRelative(-32f, -78f)
                quadToRelative(0f, -46f, 32f, -78f)
                reflectiveQuadToRelative(78f, -32f)
                horizontalLineToRelative(113f)
                lineToRelative(62f, -132f)
                quadToRelative(-20f, -4f, -41f, -6f)
                reflectiveQuadToRelative(-44f, -2f)
                quadToRelative(-72f, 0f, -128f, 17.5f)
                reflectiveQuadTo(261f, 574f)
                quadToRelative(-10f, 5f, -15.5f, 14.5f)
                reflectiveQuadTo(240f, 609f)
                verticalLineToRelative(271f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(230f, -80f)
                horizontalLineToRelative(48f)
                lineToRelative(28f, -60f)
                horizontalLineToRelative(-76f)
                quadToRelative(-12f, 0f, -21f, 9f)
                reflectiveQuadToRelative(-9f, 21f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
                moveToRelative(136f, 0f)
                horizontalLineToRelative(194f)
                verticalLineToRelative(-191f)
                quadToRelative(0f, -11f, -5.5f, -20.5f)
                reflectiveQuadTo(700f, 574f)
                quadToRelative(-12f, -6f, -26f, -12.5f)
                reflectiveQuadTo(644f, 549f)
                lineTo(526f, 800f)
                close()
                moveToRelative(-46f, -560f)
                close()
                moveToRelative(0f, 426f)
                close()
            }
        }.build()
        
        return _Personal_injury!!
    }

private var _Personal_injury: ImageVector? = null

