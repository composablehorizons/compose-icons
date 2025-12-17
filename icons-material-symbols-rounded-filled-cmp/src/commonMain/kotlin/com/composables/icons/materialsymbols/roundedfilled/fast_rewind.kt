package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Fast_rewind: ImageVector
    get() {
        if (_Fast_rewind != null) return _Fast_rewind!!
        
        _Fast_rewind = ImageVector.Builder(
            name = "fast_rewind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(798f, 679f)
                lineTo(550f, 513f)
                quadToRelative(-9f, -6f, -13.5f, -14.5f)
                reflectiveQuadTo(532f, 480f)
                quadToRelative(0f, -10f, 4.5f, -18.5f)
                reflectiveQuadTo(550f, 447f)
                lineToRelative(248f, -166f)
                quadToRelative(5f, -4f, 11f, -5f)
                reflectiveQuadToRelative(11f, -1f)
                quadToRelative(16f, 0f, 28f, 11f)
                reflectiveQuadToRelative(12f, 29f)
                verticalLineToRelative(330f)
                quadToRelative(0f, 18f, -12f, 29f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-5f, 0f, -11f, -1f)
                reflectiveQuadToRelative(-11f, -5f)
                close()
                moveToRelative(-400f, 0f)
                lineTo(150f, 513f)
                quadToRelative(-9f, -6f, -13.5f, -14.5f)
                reflectiveQuadTo(132f, 480f)
                quadToRelative(0f, -10f, 4.5f, -18.5f)
                reflectiveQuadTo(150f, 447f)
                lineToRelative(248f, -166f)
                quadToRelative(5f, -4f, 11f, -5f)
                reflectiveQuadToRelative(11f, -1f)
                quadToRelative(16f, 0f, 28f, 11f)
                reflectiveQuadToRelative(12f, 29f)
                verticalLineToRelative(330f)
                quadToRelative(0f, 18f, -12f, 29f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-5f, 0f, -11f, -1f)
                reflectiveQuadToRelative(-11f, -5f)
                close()
            }
        }.build()
        
        return _Fast_rewind!!
    }

private var _Fast_rewind: ImageVector? = null

