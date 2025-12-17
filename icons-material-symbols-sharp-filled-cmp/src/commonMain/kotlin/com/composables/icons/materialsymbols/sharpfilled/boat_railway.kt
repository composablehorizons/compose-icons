package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Boat_railway: ImageVector
    get() {
        if (_Boat_railway != null) return _Boat_railway!!
        
        _Boat_railway = ImageVector.Builder(
            name = "boat_railway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(341f, 756f)
                quadToRelative(33f, 17f, 58.5f, 28.5f)
                reflectiveQuadTo(459f, 799f)
                lineToRelative(-67f, 66f)
                quadToRelative(-13f, -4f, -26f, -9f)
                reflectiveQuadToRelative(-27f, -12f)
                quadToRelative(-45f, 18f, -91.5f, 27f)
                reflectiveQuadTo(152f, 880f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(32f)
                quadToRelative(48f, 0f, 91.5f, -10.5f)
                reflectiveQuadTo(341f, 756f)
                close()
                moveTo(520f, 880f)
                lineToRelative(80f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -71f, 50f, -115.5f)
                reflectiveQuadTo(700f, 400f)
                quadToRelative(80f, 0f, 130f, 44.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                lineToRelative(80f, 80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(180f, -160f)
                quadToRelative(12f, 0f, 21f, -9f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(0f, -12f, -9f, -21f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-12f, 0f, -21f, 9f)
                reflectiveQuadToRelative(-9f, 21f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
                moveTo(580f, 600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -11f, -2f, -21f)
                reflectiveQuadToRelative(-6f, -19f)
                horizontalLineTo(588f)
                quadToRelative(-4f, 9f, -6f, 19f)
                reflectiveQuadToRelative(-2f, 21f)
                verticalLineToRelative(40f)
                close()
                moveTo(380f, 80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(165f)
                quadToRelative(-20f, -4f, -40f, -5f)
                reflectiveQuadToRelative(-40f, 1f)
                verticalLineToRelative(-81f)
                horizontalLineTo(280f)
                verticalLineToRelative(113f)
                lineToRelative(200f, -53f)
                lineToRelative(127f, 34f)
                quadToRelative(-77f, 24f, -122f, 84f)
                reflectiveQuadToRelative(-45f, 141f)
                verticalLineToRelative(155f)
                quadToRelative(-47f, -14f, -78.5f, -44f)
                lineTo(330f, 640f)
                quadToRelative(-28f, 27f, -61f, 46f)
                reflectiveQuadToRelative(-71f, 27f)
                lineToRelative(-98f, -313f)
                lineToRelative(100f, -26f)
                verticalLineToRelative(-214f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Boat_railway!!
    }

private var _Boat_railway: ImageVector? = null

