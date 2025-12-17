package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mop: ImageVector
    get() {
        if (_Mop != null) return _Mop!!
        
        _Mop = ImageVector.Builder(
            name = "mop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                verticalLineToRelative(280f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-58f, 240f)
                horizontalLineToRelative(98f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(98f)
                lineToRelative(-40f, -160f)
                horizontalLineTo(182f)
                lineToRelative(-40f, 160f)
                close()
                moveTo(40f, 920f)
                lineToRelative(80f, -320f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                lineToRelative(80f, 320f)
                horizontalLineTo(40f)
                close()
                moveToRelative(720f, -400f)
                horizontalLineTo(200f)
                horizontalLineToRelative(560f)
                close()
                moveToRelative(-240f, -80f)
                horizontalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Mop!!
    }

private var _Mop: ImageVector? = null

