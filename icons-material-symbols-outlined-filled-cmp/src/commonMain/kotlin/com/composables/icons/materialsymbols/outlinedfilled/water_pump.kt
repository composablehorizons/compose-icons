package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Water_pump: ImageVector
    get() {
        if (_Water_pump != null) return _Water_pump!!
        
        _Water_pump = ImageVector.Builder(
            name = "water_pump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 360f)
                lineToRelative(-34f, 50f)
                quadToRelative(-27f, 42f, -36.5f, 64.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -23f, -9.5f, -45.5f)
                reflectiveQuadTo(514f, 410f)
                lineToRelative(-34f, -50f)
                close()
                moveToRelative(0f, 370f)
                quadToRelative(-104f, 0f, -177f, -73f)
                reflectiveQuadToRelative(-73f, -177f)
                quadToRelative(0f, -104f, 73f, -177f)
                reflectiveQuadToRelative(177f, -73f)
                quadToRelative(104f, 0f, 177f, 73f)
                reflectiveQuadToRelative(73f, 177f)
                quadToRelative(0f, 104f, -73f, 177f)
                reflectiveQuadToRelative(-177f, 73f)
                close()
                moveToRelative(360f, -250f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-53f)
                quadToRelative(-11f, -80f, -57.5f, -143.5f)
                reflectiveQuadTo(613f, 200f)
                horizontalLineToRelative(227f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(53f)
                quadToRelative(11f, 80f, 57.5f, 143.5f)
                reflectiveQuadTo(347f, 760f)
                horizontalLineTo(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Water_pump!!
    }

private var _Water_pump: ImageVector? = null

