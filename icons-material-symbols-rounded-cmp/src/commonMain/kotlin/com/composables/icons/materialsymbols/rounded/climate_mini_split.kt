package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Climate_mini_split: ImageVector
    get() {
        if (_Climate_mini_split != null) return _Climate_mini_split!!
        
        _Climate_mini_split = ImageVector.Builder(
            name = "climate_mini_split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 480f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 480f)
                close()
                moveTo(440f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 760f)
                close()
                moveToRelative(360f, -360f)
                horizontalLineTo(160f)
                horizontalLineToRelative(640f)
                close()
                moveToRelative(-560f, 0f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 240f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 680f)
                quadToRelative(24f, 0f, 46f, -9f)
                reflectiveQuadToRelative(39f, -26f)
                quadToRelative(10f, -10f, 17f, -21.5f)
                reflectiveQuadToRelative(12f, -25.5f)
                quadToRelative(5f, -16f, 17f, -27f)
                reflectiveQuadToRelative(29f, -11f)
                quadToRelative(15f, 0f, 26f, 10f)
                reflectiveQuadToRelative(11f, 23f)
                quadToRelative(0f, 26f, -19f, 58f)
                reflectiveQuadToRelative(-37f, 50f)
                quadToRelative(-28f, 28f, -64.5f, 43.5f)
                reflectiveQuadTo(160f, 760f)
                close()
                moveToRelative(637f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(837f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(797f, 680f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                quadToRelative(-10f, -10f, -17f, -21.5f)
                reflectiveQuadTo(683f, 598f)
                quadToRelative(-5f, -16f, -17f, -27f)
                reflectiveQuadToRelative(-29f, -11f)
                quadToRelative(-15f, 0f, -26f, 10f)
                reflectiveQuadToRelative(-11f, 23f)
                quadToRelative(0f, 26f, 19f, 58f)
                reflectiveQuadToRelative(37f, 50f)
                quadToRelative(28f, 28f, 64.5f, 43.5f)
                reflectiveQuadTo(797f, 760f)
                close()
            }
        }.build()
        
        return _Climate_mini_split!!
    }

private var _Climate_mini_split: ImageVector? = null

