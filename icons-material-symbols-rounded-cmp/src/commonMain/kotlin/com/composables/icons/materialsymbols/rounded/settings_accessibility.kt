package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Settings_accessibility: ImageVector
    get() {
        if (_Settings_accessibility != null) return _Settings_accessibility!!
        
        _Settings_accessibility = ImageVector.Builder(
            name = "settings_accessibility",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveTo(360f, 720f)
                verticalLineToRelative(-440f)
                quadToRelative(-49f, -4f, -99f, -11f)
                reflectiveQuadToRelative(-98f, -18f)
                quadToRelative(-17f, -4f, -27.5f, -19f)
                reflectiveQuadToRelative(-5.5f, -32f)
                quadToRelative(5f, -17f, 21f, -25f)
                reflectiveQuadToRelative(34f, -4f)
                quadToRelative(70f, 15f, 145.5f, 22f)
                reflectiveQuadToRelative(149.5f, 7f)
                quadToRelative(74f, 0f, 149.5f, -7f)
                reflectiveQuadTo(775f, 171f)
                quadToRelative(18f, -4f, 34f, 4f)
                reflectiveQuadToRelative(21f, 25f)
                quadToRelative(5f, 17f, -5.5f, 32f)
                reflectiveQuadTo(797f, 251f)
                quadToRelative(-48f, 11f, -98f, 18f)
                reflectiveQuadToRelative(-99f, 11f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 720f)
                close()
                moveTo(320f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 960f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 960f)
                close()
            }
        }.build()
        
        return _Settings_accessibility!!
    }

private var _Settings_accessibility: ImageVector? = null

