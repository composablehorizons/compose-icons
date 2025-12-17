package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Door_back: ImageVector
    get() {
        if (_Door_back != null) return _Door_back!!
        
        _Door_back = ImageVector.Builder(
            name = "door_back",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-560f)
                horizontalLineTo(280f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(120f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                close()
                moveTo(280f, 200f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Door_back!!
    }

private var _Door_back: ImageVector? = null

