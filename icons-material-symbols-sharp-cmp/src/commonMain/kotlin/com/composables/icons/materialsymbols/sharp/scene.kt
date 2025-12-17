package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Scene: ImageVector
    get() {
        if (_Scene != null) return _Scene!!
        
        _Scene = ImageVector.Builder(
            name = "scene",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 880f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(52f)
                quadToRelative(0f, 12f, -8f, 20f)
                reflectiveQuadToRelative(-20f, 8f)
                horizontalLineTo(428f)
                quadToRelative(-14f, 0f, -22.5f, -15f)
                reflectiveQuadToRelative(-1.5f, -29f)
                lineToRelative(76f, -164f)
                quadToRelative(7f, -15f, 20.5f, -23.5f)
                reflectiveQuadTo(532f, 40f)
                horizontalLineToRelative(92f)
                quadToRelative(24f, 0f, 40f, 18f)
                reflectiveQuadToRelative(16f, 42f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(40f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(508f, 200f)
                horizontalLineToRelative(92f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-56f)
                lineToRelative(-36f, 80f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -33f, 22f, -61.5f)
                reflectiveQuadToRelative(58f, -34.5f)
                verticalLineToRelative(-84f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 400f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 480f)
                verticalLineToRelative(84f)
                quadToRelative(36f, 6f, 58f, 33f)
                reflectiveQuadToRelative(22f, 63f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 51f, -34.5f, 85.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(40f, -400f)
                verticalLineToRelative(100f)
                quadToRelative(18f, 15f, 29f, 35.5f)
                reflectiveQuadToRelative(11f, 44.5f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -24f, 11f, -44.5f)
                reflectiveQuadToRelative(29f, -35.5f)
                verticalLineToRelative(-100f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-40f, 320f)
                horizontalLineToRelative(400f)
                quadToRelative(18f, 0f, 29f, -12.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -9f, -5.5f, -14.5f)
                reflectiveQuadTo(620f, 640f)
                quadToRelative(-9f, 0f, -14.5f, 5.5f)
                reflectiveQuadTo(600f, 660f)
                verticalLineToRelative(100f)
                horizontalLineTo(200f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -9f, -5.5f, -14.5f)
                reflectiveQuadTo(180f, 640f)
                quadToRelative(-9f, 0f, -14.5f, 5.5f)
                reflectiveQuadTo(160f, 660f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 15f, 11f, 27.5f)
                reflectiveQuadToRelative(29f, 12.5f)
                close()
                moveToRelative(320f, -120f)
                horizontalLineTo(280f)
                horizontalLineToRelative(240f)
                close()
                moveTo(240f, 480f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-320f)
                close()
                moveToRelative(-40f, 320f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Scene!!
    }

private var _Scene: ImageVector? = null

