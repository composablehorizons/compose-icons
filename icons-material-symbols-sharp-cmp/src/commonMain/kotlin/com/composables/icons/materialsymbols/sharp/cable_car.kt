package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cable_car: ImageVector
    get() {
        if (_Cable_car != null) return _Cable_car!!
        
        _Cable_car = ImageVector.Builder(
            name = "cable_car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                verticalLineToRelative(-40f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(133f)
                lineToRelative(27f, -80f)
                horizontalLineToRelative(400f)
                lineToRelative(27f, 80f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-40f, -120f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(240f, -40f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(240f, 440f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 240f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 300f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 300f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 240f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 300f)
                verticalLineToRelative(140f)
                close()
                moveToRelative(-360f, 80f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Cable_car!!
    }

private var _Cable_car: ImageVector? = null

