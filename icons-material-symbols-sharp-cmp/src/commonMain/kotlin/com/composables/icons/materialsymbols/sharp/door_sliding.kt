package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Door_sliding: ImageVector
    get() {
        if (_Door_sliding != null) return _Door_sliding!!
        
        _Door_sliding = ImageVector.Builder(
            name = "door_sliding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 520f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 520f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-560f)
                horizontalLineTo(240f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-560f)
                horizontalLineTo(520f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-40f, -320f)
                close()
            }
        }.build()
        
        return _Door_sliding!!
    }

private var _Door_sliding: ImageVector? = null

