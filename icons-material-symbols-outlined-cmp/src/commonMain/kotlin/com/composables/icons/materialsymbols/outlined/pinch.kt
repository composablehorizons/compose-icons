package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pinch: ImageVector
    get() {
        if (_Pinch != null) return _Pinch!!
        
        _Pinch = ImageVector.Builder(
            name = "pinch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 240f)
                verticalLineToRelative(-98f)
                lineTo(142f, 380f)
                horizontalLineToRelative(98f)
                verticalLineToRelative(60f)
                horizontalLineTo(40f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(98f)
                lineToRelative(238f, -238f)
                horizontalLineToRelative(-98f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(593f, 920f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(304f, 680f)
                lineToRelative(30f, -31f)
                quadToRelative(16f, -16f, 37.5f, -21.5f)
                reflectiveQuadToRelative(42.5f, 0.5f)
                lineToRelative(66f, 19f)
                verticalLineToRelative(-327f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 320f)
                verticalLineToRelative(433f)
                lineToRelative(-97f, -27f)
                lineToRelative(102f, 102f)
                quadToRelative(5f, 5f, 12.5f, 8.5f)
                reflectiveQuadTo(593f, 840f)
                horizontalLineToRelative(167f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 920f)
                horizontalLineTo(593f)
                close()
                moveToRelative(7f, -280f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-20f, 80f)
                close()
            }
        }.build()
        
        return _Pinch!!
    }

private var _Pinch: ImageVector? = null

