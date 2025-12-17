package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tablet_mac: ImageVector
    get() {
        if (_Tablet_mac != null) return _Tablet_mac!!
        
        _Tablet_mac = ImageVector.Builder(
            name = "tablet_mac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, -480f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(280f, 100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 780f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 780f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 820f)
                close()
            }
        }.build()
        
        return _Tablet_mac!!
    }

private var _Tablet_mac: ImageVector? = null

