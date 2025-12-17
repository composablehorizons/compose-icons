package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Signal_cellular_nodata: ImageVector
    get() {
        if (_Signal_cellular_nodata != null) return _Signal_cellular_nodata!!
        
        _Signal_cellular_nodata = ImageVector.Builder(
            name = "signal_cellular_nodata",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(676f, 860f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
                moveTo(80f, 880f)
                lineToRelative(800f, -800f)
                verticalLineToRelative(428f)
                quadToRelative(-27f, -16f, -58f, -23.5f)
                reflectiveQuadToRelative(-62f, -7.5f)
                quadToRelative(-101f, 0f, -172f, 71f)
                reflectiveQuadToRelative(-71f, 172f)
                quadToRelative(0f, 46f, 15f, 85.5f)
                reflectiveQuadTo(577f, 880f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Signal_cellular_nodata!!
    }

private var _Signal_cellular_nodata: ImageVector? = null

