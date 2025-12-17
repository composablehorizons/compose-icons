package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Subway_walk: ImageVector
    get() {
        if (_Subway_walk != null) return _Subway_walk!!
        
        _Subway_walk = ImageVector.Builder(
            name = "subway_walk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(220f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(160f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(220f, 640f)
                close()
                moveToRelative(-40f, 120f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -83f, 77f, -121.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(40f, 0f, 77f, 1.5f)
                reflectiveQuadToRelative(70f, 6.5f)
                quadToRelative(18f, 2f, 28.5f, 16.5f)
                reflectiveQuadTo(546f, 137f)
                quadToRelative(0f, 16f, -12.5f, 25.5f)
                reflectiveQuadTo(505f, 169f)
                quadToRelative(-29f, -5f, -64.5f, -7f)
                reflectiveQuadToRelative(-80.5f, -2f)
                quadToRelative(-86f, 0f, -142.5f, 10f)
                reflectiveQuadTo(137f, 200f)
                horizontalLineToRelative(175f)
                quadToRelative(32f, 0f, 39f, 32f)
                reflectiveQuadToRelative(-23f, 45f)
                quadToRelative(-4f, 2f, -8f, 2.5f)
                reflectiveQuadToRelative(-8f, 0.5f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 480f)
                horizontalLineTo(120f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(180f, 680f)
                horizontalLineToRelative(221f)
                lineToRelative(-34f, 160f)
                horizontalLineTo(126f)
                quadToRelative(-15f, 0f, -19f, -14.5f)
                reflectiveQuadToRelative(8f, -22.5f)
                lineToRelative(65f, -43f)
                close()
                moveToRelative(416f, -200f)
                lineToRelative(-65f, 288f)
                quadToRelative(-3f, 14f, -14f, 23f)
                reflectiveQuadToRelative(-26f, 9f)
                quadToRelative(-20f, 0f, -32f, -15f)
                reflectiveQuadToRelative(-8f, -35f)
                lineToRelative(101f, -474f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(56f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 440f)
                verticalLineToRelative(-82f)
                quadToRelative(0f, -12f, 6.5f, -21.5f)
                reflectiveQuadTo(424f, 322f)
                lineToRelative(178f, -76f)
                quadToRelative(29f, -12f, 59f, -2.5f)
                reflectiveQuadToRelative(47f, 36.5f)
                lineToRelative(40f, 64f)
                quadToRelative(20f, 34f, 39f, 58.5f)
                reflectiveQuadToRelative(54f, 33.5f)
                quadToRelative(17f, 4f, 28f, 15.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadToRelative(-27.5f, 9f)
                quadToRelative(-48f, -8f, -79f, -35f)
                reflectiveQuadToRelative(-62f, -62f)
                lineToRelative(-24f, 80f)
                lineToRelative(59f, 56f)
                quadToRelative(12f, 11f, 18.5f, 26f)
                reflectiveQuadToRelative(6.5f, 32f)
                verticalLineToRelative(226f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-200f)
                lineToRelative(-84f, -80f)
                close()
                moveToRelative(104f, -340f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(700f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(780f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(700f, 220f)
                close()
            }
        }.build()
        
        return _Subway_walk!!
    }

private var _Subway_walk: ImageVector? = null

