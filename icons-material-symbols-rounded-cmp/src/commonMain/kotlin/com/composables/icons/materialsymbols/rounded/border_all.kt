package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Border_all: ImageVector
    get() {
        if (_Border_all != null) return _Border_all!!
        
        _Border_all = ImageVector.Builder(
            name = "border_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
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
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                close()
                moveToRelative(400f, -240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(0f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Border_all!!
    }

private var _Border_all: ImageVector? = null

