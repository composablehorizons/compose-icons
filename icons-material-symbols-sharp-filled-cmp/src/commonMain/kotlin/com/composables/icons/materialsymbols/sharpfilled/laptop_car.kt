package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Laptop_car: ImageVector
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
                moveTo(400f, 880f)
                verticalLineToRelative(-249f)
                lineToRelative(66f, -191f)
                horizontalLineToRelative(348f)
                lineToRelative(66f, 191f)
                verticalLineToRelative(249f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-60f)
                horizontalLineTo(480f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(74f, -280f)
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
                moveTo(40f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(200f)
                horizontalLineTo(409f)
                lineToRelative(-89f, 252f)
                verticalLineToRelative(188f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Laptop_car!!
    }

private var _Laptop_car: ImageVector? = null

