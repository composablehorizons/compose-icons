package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                quadToRelative(0f, -111f, 29.5f, -189.5f)
                reflectiveQuadTo(185f, 560f)
                quadToRelative(46f, -52f, 103f, -80.5f)
                reflectiveQuadTo(400f, 440f)
                verticalLineToRelative(-120f)
                quadToRelative(-137f, -17f, -228.5f, -84.5f)
                reflectiveQuadTo(80f, 80f)
                horizontalLineToRelative(800f)
                quadToRelative(0f, 88f, -91.5f, 155.5f)
                reflectiveQuadTo(560f, 320f)
                verticalLineToRelative(120f)
                quadToRelative(55f, 11f, 112f, 39.5f)
                reflectiveQuadTo(775f, 560f)
                quadToRelative(46f, 52f, 75.5f, 130.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(155f)
                quadToRelative(-18f, -152f, -113.5f, -220f)
                reflectiveQuadTo(480f, 512f)
                quadToRelative(-106f, 0f, -201.5f, 68f)
                reflectiveQuadTo(165f, 800f)
                horizontalLineToRelative(155f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(0f, -17f, 6.5f, -31f)
                reflectiveQuadToRelative(17.5f, -25f)
                quadToRelative(24f, -24f, 81f, -50.5f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(-28f, 78f, -54f, 135f)
                reflectiveQuadToRelative(-50f, 81f)
                quadToRelative(-11f, 11f, -25f, 17.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

