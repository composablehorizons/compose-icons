package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Church: ImageVector
    get() {
        if (_Church != null) return _Church!!
        
        _Church = ImageVector.Builder(
            name = "church",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-320f)
                lineToRelative(160f, -71f)
                verticalLineToRelative(-129f)
                lineToRelative(200f, -100f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                lineToRelative(200f, 100f)
                verticalLineToRelative(129f)
                lineToRelative(160f, 71f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-204f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(204f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-192f)
                lineToRelative(-160f, -72f)
                verticalLineToRelative(-134f)
                lineToRelative(-160f, -82f)
                lineToRelative(-160f, 82f)
                verticalLineToRelative(134f)
                lineToRelative(-160f, 72f)
                verticalLineToRelative(192f)
                close()
                moveToRelative(320f, -260f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(0f, 20f)
                close()
            }
        }.build()
        
        return _Church!!
    }

private var _Church: ImageVector? = null

