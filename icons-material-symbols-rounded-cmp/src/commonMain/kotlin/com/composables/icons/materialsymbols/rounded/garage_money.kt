package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Garage_money: ImageVector
    get() {
        if (_Garage_money != null) return _Garage_money!!
        
        _Garage_money = ImageVector.Builder(
            name = "garage_money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 440f)
                verticalLineToRelative(-280f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(72f, -140f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 23f, -9f)
                reflectiveQuadToRelative(9f, -23f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(40f)
                quadToRelative(20f, 0f, 30f, -12.5f)
                reflectiveQuadToRelative(10f, -27.5f)
                quadToRelative(0f, -15f, -10f, -27.5f)
                reflectiveQuadTo(320f, 580f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(429f)
                quadToRelative(20f, 0f, 32.5f, -16.5f)
                reflectiveQuadTo(747f, 407f)
                lineToRelative(-53f, -155f)
                quadToRelative(-5f, -14f, -16.5f, -23f)
                reflectiveQuadToRelative(-25.5f, -9f)
                horizontalLineTo(308f)
                quadToRelative(-14f, 0f, -25.5f, 9f)
                reflectiveQuadTo(266f, 252f)
                lineToRelative(-62f, 179f)
                quadToRelative(-2f, 6f, -3f, 12.5f)
                reflectiveQuadToRelative(-1f, 13.5f)
                verticalLineToRelative(251f)
                quadToRelative(0f, 14f, 9f, 23f)
                reflectiveQuadToRelative(23f, 9f)
                close()
                moveToRelative(74f, -360f)
                lineToRelative(28f, -80f)
                horizontalLineToRelative(292f)
                lineToRelative(28f, 80f)
                horizontalLineTo(306f)
                close()
                moveToRelative(54f, 180f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(197f, 260f)
                horizontalLineToRelative(246f)
                quadToRelative(5f, -21f, 20.5f, -36.5f)
                reflectiveQuadTo(860f, 763f)
                verticalLineToRelative(-86f)
                quadToRelative(-21f, -5f, -36.5f, -20.5f)
                reflectiveQuadTo(803f, 620f)
                horizontalLineTo(557f)
                quadToRelative(-5f, 21f, -20.5f, 36.5f)
                reflectiveQuadTo(500f, 677f)
                verticalLineToRelative(86f)
                quadToRelative(21f, 5f, 36.5f, 20.5f)
                reflectiveQuadTo(557f, 820f)
                close()
                moveToRelative(123f, -40f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 720f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 660f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(620f, 720f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(680f, 780f)
                close()
                moveTo(520f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(520f, 560f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 880f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Garage_money!!
    }

private var _Garage_money: ImageVector? = null

