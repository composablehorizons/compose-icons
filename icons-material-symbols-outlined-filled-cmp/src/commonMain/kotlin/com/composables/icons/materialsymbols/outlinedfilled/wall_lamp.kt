package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wall_lamp: ImageVector
    get() {
        if (_Wall_lamp != null) return _Wall_lamp!!
        
        _Wall_lamp = ImageVector.Builder(
            name = "wall_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                quadToRelative(-20f, 0f, -32f, -15.5f)
                reflectiveQuadToRelative(-6f, -35.5f)
                lineToRelative(96f, -320f)
                quadToRelative(4f, -13f, 14f, -21f)
                reflectiveQuadToRelative(24f, -8f)
                horizontalLineToRelative(288f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 21f)
                lineToRelative(96f, 320f)
                quadToRelative(6f, 20f, -6f, 35.5f)
                reflectiveQuadTo(760f, 520f)
                horizontalLineTo(560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Wall_lamp!!
    }

private var _Wall_lamp: ImageVector? = null

