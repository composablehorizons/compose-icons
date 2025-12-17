package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Desktop_mac: ImageVector
    get() {
        if (_Desktop_mac != null) return _Desktop_mac!!
        
        _Desktop_mac = ImageVector.Builder(
            name = "desktop_mac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 720f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(560f)
                lineToRelative(74f, 74f)
                quadToRelative(2f, 2f, 6f, 14f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineTo(334f)
                quadToRelative(-6f, 0f, -10f, -4f)
                reflectiveQuadToRelative(-4f, -10f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -2f, 4f, -10f)
                lineToRelative(76f, -76f)
                close()
            }
        }.build()
        
        return _Desktop_mac!!
    }

private var _Desktop_mac: ImageVector? = null

