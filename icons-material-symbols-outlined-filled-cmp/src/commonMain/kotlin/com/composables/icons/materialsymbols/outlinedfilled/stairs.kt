package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Stairs: ImageVector
    get() {
        if (_Stairs != null) return _Stairs!!
        
        _Stairs = ImageVector.Builder(
            name = "stairs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                horizontalLineToRelative(177f)
                verticalLineToRelative(-133f)
                horizontalLineToRelative(103f)
                verticalLineToRelative(-133f)
                horizontalLineToRelative(103f)
                verticalLineToRelative(-134f)
                horizontalLineToRelative(97f)
                verticalLineToRelative(-80f)
                horizontalLineTo(543f)
                verticalLineToRelative(133f)
                horizontalLineTo(440f)
                verticalLineToRelative(133f)
                horizontalLineTo(337f)
                verticalLineToRelative(134f)
                horizontalLineToRelative(-97f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-40f, 120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Stairs!!
    }

private var _Stairs: ImageVector? = null

