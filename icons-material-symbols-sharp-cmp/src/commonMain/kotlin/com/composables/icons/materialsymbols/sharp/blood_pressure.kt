package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Blood_pressure: ImageVector
    get() {
        if (_Blood_pressure != null) return _Blood_pressure!!
        
        _Blood_pressure = ImageVector.Builder(
            name = "blood_pressure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 360f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-220f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(347f, 440f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(243f)
                quadToRelative(3f, 21f, 9f, 41f)
                reflectiveQuadToRelative(15f, 39f)
                close()
                moveToRelative(53f, -320f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(8f, -180f)
                lineToRelative(91f, -91f)
                lineToRelative(-28f, -28f)
                lineToRelative(-91f, 91f)
                lineToRelative(28f, 28f)
                close()
                moveTo(80f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(144f)
                lineToRelative(56f, 111f)
                lineToRelative(134f, -271f)
                horizontalLineToRelative(51f)
                lineToRelative(78f, 156f)
                quadToRelative(-18f, 11f, -34.5f, 23f)
                reflectiveQuadTo(478f, 486f)
                lineToRelative(-38f, -76f)
                lineToRelative(-135f, 270f)
                horizontalLineToRelative(-50f)
                lineToRelative(-80f, -160f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Blood_pressure!!
    }

private var _Blood_pressure: ImageVector? = null

