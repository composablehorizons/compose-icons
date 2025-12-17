package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Laptop_car: ImageVector
    get() {
        if (_Laptop_car != null) return _Laptop_car!!
        
        _Laptop_car = ImageVector.Builder(
            name = "laptop_car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(200f, 174f)
                verticalLineToRelative(-223f)
                lineToRelative(57f, -164f)
                quadToRelative(5f, -12f, 15f, -19.5f)
                reflectiveQuadToRelative(23f, -7.5f)
                horizontalLineToRelative(290f)
                quadToRelative(13f, 0f, 23f, 7.5f)
                reflectiveQuadToRelative(15f, 19.5f)
                lineToRelative(57f, 164f)
                verticalLineToRelative(223f)
                quadToRelative(0f, 11f, -7.5f, 18.5f)
                reflectiveQuadTo(854f, 880f)
                horizontalLineToRelative(-28f)
                quadToRelative(-11f, 0f, -18.5f, -7.5f)
                reflectiveQuadTo(800f, 854f)
                verticalLineToRelative(-34f)
                horizontalLineTo(480f)
                verticalLineToRelative(34f)
                quadToRelative(0f, 11f, -7.5f, 18.5f)
                reflectiveQuadTo(454f, 880f)
                horizontalLineToRelative(-28f)
                quadToRelative(-11f, 0f, -18.5f, -7.5f)
                reflectiveQuadTo(400f, 854f)
                close()
                moveToRelative(74f, -254f)
                horizontalLineToRelative(332f)
                lineToRelative(-35f, -100f)
                horizontalLineTo(509f)
                lineToRelative(-35f, 100f)
                close()
                moveToRelative(66f, 150f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 710f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 670f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 710f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 750f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(780f, 710f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(740f, 670f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(700f, 710f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(740f, 750f)
                close()
                moveToRelative(-280f, 10f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-100f)
                horizontalLineTo(460f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(-360f, 40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(40f, 740f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(100f, 680f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(60f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(320f, 740f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(260f, 800f)
                horizontalLineTo(100f)
                close()
                moveToRelative(360f, -40f)
                verticalLineToRelative(-100f)
                verticalLineToRelative(100f)
                close()
            }
        }.build()
        
        return _Laptop_car!!
    }

private var _Laptop_car: ImageVector? = null

