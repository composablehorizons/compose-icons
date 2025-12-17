package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Update: ImageVector
    get() {
        if (_Update != null) return _Update!!
        
        _Update = ImageVector.Builder(
            name = "update",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(82f, 0f, 155.5f, 35f)
                reflectiveQuadTo(760f, 254f)
                verticalLineToRelative(-94f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(110f)
                quadToRelative(-41f, -56f, -101f, -88f)
                reflectiveQuadToRelative(-129f, -32f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(105f, 0f, 183.5f, -68f)
                reflectiveQuadTo(756f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(-15f, 137f, -117.5f, 228.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(112f, -192f)
                lineTo(440f, 496f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(128f, 128f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Update!!
    }

private var _Update: ImageVector? = null

