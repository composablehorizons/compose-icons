package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tablet_mac: ImageVector
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
                moveToRelative(80f, -280f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(280f, 180f)
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

