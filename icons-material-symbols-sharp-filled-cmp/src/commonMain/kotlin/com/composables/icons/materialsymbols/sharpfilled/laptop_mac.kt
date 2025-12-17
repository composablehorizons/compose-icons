package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Laptop_mac: ImageVector
    get() {
        if (_Laptop_mac != null) return _Laptop_mac!!
        
        _Laptop_mac = ImageVector.Builder(
            name = "laptop_mac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(560f)
                lineToRelative(-40f, 40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(0f)
                close()
                moveToRelative(480f, -40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 760f)
                close()
            }
        }.build()
        
        return _Laptop_mac!!
    }

private var _Laptop_mac: ImageVector? = null

