package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Devices_other: ImageVector
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
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(720f)
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
                moveToRelative(440f, 100f)
                horizontalLineTo(600f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(-520f, 0f)
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
            }
        }.build()
        
        return _Devices_other!!
    }

private var _Devices_other: ImageVector? = null

