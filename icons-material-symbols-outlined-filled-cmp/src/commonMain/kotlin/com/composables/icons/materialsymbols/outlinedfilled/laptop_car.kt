package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Laptop_car: ImageVector
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
                moveTo(40f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(120f)
                horizontalLineTo(494f)
                quadToRelative(-37f, 0f, -68.5f, 19.5f)
                reflectiveQuadTo(382f, 434f)
                lineToRelative(-62f, 178f)
                verticalLineToRelative(188f)
                horizontalLineTo(40f)
                close()
                moveToRelative(386f, 80f)
                quadToRelative(-11f, 0f, -18.5f, -7.5f)
                reflectiveQuadTo(400f, 854f)
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
                close()
                moveToRelative(48f, -280f)
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
            }
        }.build()
        
        return _Laptop_car!!
    }

private var _Laptop_car: ImageVector? = null

