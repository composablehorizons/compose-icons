package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Light_group: ImageVector
    get() {
        if (_Light_group != null) return _Light_group!!
        
        _Light_group = ImageVector.Builder(
            name = "light_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(560f, -40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 760f)
                horizontalLineTo(440f)
                verticalLineToRelative(-39f)
                quadToRelative(0f, -90f, 57f, -156.5f)
                reflectiveQuadTo(640f, 484f)
                verticalLineToRelative(-404f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(404f)
                quadToRelative(87f, 14f, 143.5f, 80.5f)
                reflectiveQuadTo(920f, 721f)
                verticalLineToRelative(39f)
                horizontalLineTo(760f)
                quadToRelative(0f, 33f, -23f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                close()
                moveToRelative(-440f, -80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(28f)
                lineToRelative(96f, -360f)
                horizontalLineToRelative(312f)
                lineToRelative(96f, 360f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(284f, -80f)
                horizontalLineToRelative(312f)
                quadToRelative(-12f, -54f, -56f, -87f)
                reflectiveQuadToRelative(-100f, -33f)
                quadToRelative(-55f, 0f, -99f, 33f)
                reflectiveQuadToRelative(-57f, 87f)
                close()
                moveTo(132f, 360f)
                horizontalLineToRelative(296f)
                lineToRelative(-53f, -200f)
                horizontalLineTo(186f)
                lineToRelative(-54f, 200f)
                close()
                moveToRelative(148f, -100f)
                close()
                moveToRelative(400f, 360f)
                close()
            }
        }.build()
        
        return _Light_group!!
    }

private var _Light_group: ImageVector? = null

