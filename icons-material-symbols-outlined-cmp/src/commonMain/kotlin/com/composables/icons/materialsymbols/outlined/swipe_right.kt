package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Swipe_right: ImageVector
    get() {
        if (_Swipe_right != null) return _Swipe_right!!
        
        _Swipe_right = ImageVector.Builder(
            name = "swipe_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(473f, 880f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(184f, 640f)
                lineToRelative(30f, -31f)
                quadToRelative(16f, -16f, 37.5f, -21.5f)
                reflectiveQuadToRelative(42.5f, 0.5f)
                lineToRelative(66f, 19f)
                verticalLineToRelative(-327f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 280f)
                verticalLineToRelative(433f)
                lineToRelative(-97f, -27f)
                lineToRelative(102f, 102f)
                quadToRelative(5f, 5f, 12.5f, 8.5f)
                reflectiveQuadTo(473f, 800f)
                horizontalLineToRelative(167f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(473f)
                close()
                moveToRelative(7f, -280f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 440f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 280f)
                quadToRelative(30f, -106f, 142f, -173f)
                reflectiveQuadToRelative(258f, -67f)
                quadToRelative(94f, 0f, 181f, 31f)
                reflectiveQuadToRelative(159f, 90f)
                verticalLineToRelative(-81f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(116f)
                quadToRelative(-66f, -58f, -147f, -89f)
                reflectiveQuadToRelative(-169f, -31f)
                quadToRelative(-118f, 0f, -208.5f, 48f)
                reflectiveQuadTo(143f, 280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(500f, 400f)
                close()
            }
        }.build()
        
        return _Swipe_right!!
    }

private var _Swipe_right: ImageVector? = null

