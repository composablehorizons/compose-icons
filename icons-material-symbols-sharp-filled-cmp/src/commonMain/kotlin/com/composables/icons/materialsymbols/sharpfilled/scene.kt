package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Scene: ImageVector
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
                moveToRelative(-600f, 0f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 600f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(200f, 660f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(660f, 600f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 660f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 51f, -34.5f, 85.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(40f, -160f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -32f, -21f, -61f)
                reflectiveQuadToRelative(-59f, -37f)
                verticalLineToRelative(-82f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 400f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 480f)
                verticalLineToRelative(82f)
                quadToRelative(-38f, 8f, -59f, 37f)
                reflectiveQuadToRelative(-21f, 61f)
                verticalLineToRelative(60f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Scene!!
    }

private var _Scene: ImageVector? = null

