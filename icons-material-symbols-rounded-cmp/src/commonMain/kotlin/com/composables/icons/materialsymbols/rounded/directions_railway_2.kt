package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Directions_railway_2: ImageVector
    get() {
        if (_Directions_railway_2 != null) return _Directions_railway_2!!
        
        _Directions_railway_2 = ImageVector.Builder(
            name = "directions_railway_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(208f, 880f)
                quadToRelative(-14f, 0f, -19f, -12f)
                reflectiveQuadToRelative(5f, -22f)
                lineToRelative(46f, -46f)
                horizontalLineToRelative(480f)
                lineToRelative(46f, 46f)
                quadToRelative(10f, 10f, 5f, 22f)
                reflectiveQuadToRelative(-19f, 12f)
                horizontalLineTo(208f)
                close()
                moveToRelative(72f, -120f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(-20f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-260f)
                quadToRelative(0f, -129f, 92.5f, -204.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(135f, 0f, 227.5f, 75.5f)
                reflectiveQuadTo(800f, 320f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineToRelative(-20f)
                lineToRelative(40f, 40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(20f, -120f)
                horizontalLineToRelative(360f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 580f)
                verticalLineToRelative(-140f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 640f)
                close()
                moveToRelative(180f, -40f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveTo(240f, 360f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -23f, -4.5f, -42.5f)
                reflectiveQuadTo(703f, 240f)
                horizontalLineTo(257f)
                quadToRelative(-8f, 18f, -12.5f, 37.5f)
                reflectiveQuadTo(240f, 320f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(89f, -200f)
                horizontalLineToRelative(302f)
                quadToRelative(-31f, -20f, -69.5f, -30f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-43f, 0f, -81.5f, 10f)
                reflectiveQuadTo(329f, 160f)
                close()
                moveToRelative(151f, 280f)
                close()
                moveToRelative(0f, -280f)
                close()
            }
        }.build()
        
        return _Directions_railway_2!!
    }

private var _Directions_railway_2: ImageVector? = null

