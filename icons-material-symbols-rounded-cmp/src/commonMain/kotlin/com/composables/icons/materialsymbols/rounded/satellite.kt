package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Satellite: ImageVector
    get() {
        if (_Satellite != null) return _Satellite!!
        
        _Satellite = ImageVector.Builder(
            name = "satellite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 480f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                horizontalLineToRelative(-68f)
                quadToRelative(0f, 72f, -50f, 122f)
                reflectiveQuadToRelative(-122f, 50f)
                verticalLineToRelative(68f)
                close()
                moveToRelative(0f, -136f)
                quadToRelative(43f, 0f, 72.5f, -30.5f)
                reflectiveQuadTo(342f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(104f)
                close()
                moveToRelative(-40f, 496f)
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(12f, 0f, 18f, -11f)
                reflectiveQuadToRelative(-2f, -21f)
                lineTo(586f, 501f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineTo(450f, 640f)
                lineToRelative(-74f, -99f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-80f, 107f)
                quadToRelative(-8f, 10f, -2f, 21f)
                reflectiveQuadToRelative(18f, 11f)
                close()
            }
        }.build()
        
        return _Satellite!!
    }

private var _Satellite: ImageVector? = null

