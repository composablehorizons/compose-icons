package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Trolley_cable_car: ImageVector
    get() {
        if (_Trolley_cable_car != null) return _Trolley_cable_car!!
        
        _Trolley_cable_car = ImageVector.Builder(
            name = "trolley_cable_car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(305f, 840f)
                quadToRelative(-23f, 0f, -32.5f, -21.5f)
                reflectiveQuadTo(280f, 780f)
                lineToRelative(20f, -20f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 680f)
                verticalLineToRelative(-440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(660f)
                lineToRelative(20f, 20f)
                quadToRelative(17f, 17f, 8f, 38.5f)
                reflectiveQuadTo(655f, 840f)
                quadToRelative(-7f, 0f, -13.5f, -2.5f)
                reflectiveQuadTo(630f, 830f)
                lineToRelative(-70f, -70f)
                horizontalLineTo(400f)
                lineToRelative(-70f, 70f)
                quadToRelative(-5f, 5f, -11.5f, 7.5f)
                reflectiveQuadTo(305f, 840f)
                close()
                moveToRelative(-65f, -160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(280f, -280f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(240f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveTo(240f, 480f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Trolley_cable_car!!
    }

private var _Trolley_cable_car: ImageVector? = null

