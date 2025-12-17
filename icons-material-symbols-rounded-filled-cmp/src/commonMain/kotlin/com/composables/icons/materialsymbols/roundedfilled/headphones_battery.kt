package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Headphones_battery: ImageVector
    get() {
        if (_Headphones_battery != null) return _Headphones_battery!!
        
        _Headphones_battery = ImageVector.Builder(
            name = "headphones_battery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 720f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 720f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 680f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 520f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(320f, 300f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(140f, 480f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 720f)
                close()
                moveToRelative(520f, -440f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(40f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 720f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Headphones_battery!!
    }

private var _Headphones_battery: ImageVector? = null

