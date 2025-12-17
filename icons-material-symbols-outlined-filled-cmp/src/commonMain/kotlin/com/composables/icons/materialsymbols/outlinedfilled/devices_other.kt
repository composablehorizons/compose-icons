package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Devices_other: ImageVector
    get() {
        if (_Devices_other != null) return _Devices_other!!
        
        _Devices_other = ImageVector.Builder(
            name = "devices_other",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, -100f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(500f, 640f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(440f, 580f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(380f, 640f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(440f, 700f)
                close()
                moveToRelative(-80f, 100f)
                verticalLineToRelative(-71f)
                quadToRelative(-19f, -17f, -29.5f, -40f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, -26f, 10.5f, -49f)
                reflectiveQuadToRelative(29.5f, -40f)
                verticalLineToRelative(-71f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(71f)
                quadToRelative(19f, 17f, 29.5f, 40f)
                reflectiveQuadToRelative(10.5f, 49f)
                quadToRelative(0f, 26f, -10.5f, 49f)
                reflectiveQuadTo(520f, 729f)
                verticalLineToRelative(71f)
                horizontalLineTo(360f)
                close()
                moveToRelative(480f, 0f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 360f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                close()
            }
        }.build()
        
        return _Devices_other!!
    }

private var _Devices_other: ImageVector? = null

