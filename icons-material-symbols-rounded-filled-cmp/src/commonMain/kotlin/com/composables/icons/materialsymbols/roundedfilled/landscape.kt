package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Landscape: ImageVector
    get() {
        if (_Landscape != null) return _Landscape!!
        
        _Landscape = ImageVector.Builder(
            name = "landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(88f, 656f)
                lineToRelative(160f, -213f)
                quadToRelative(6f, -8f, 14.5f, -12f)
                reflectiveQuadToRelative(17.5f, -4f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(136f, 181f)
                quadToRelative(6f, 8f, 14f, 12f)
                reflectiveQuadToRelative(18f, 4f)
                quadToRelative(25f, 0f, 36f, -22.5f)
                reflectiveQuadToRelative(-4f, -42.5f)
                lineToRelative(-84f, -111f)
                quadToRelative(-8f, -11f, -8f, -24f)
                reflectiveQuadToRelative(8f, -24f)
                lineToRelative(100f, -133f)
                quadToRelative(6f, -8f, 14.5f, -12f)
                reflectiveQuadToRelative(17.5f, -4f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(280f, 373f)
                quadToRelative(15f, 20f, 4f, 42f)
                reflectiveQuadToRelative(-36f, 22f)
                horizontalLineTo(120f)
                quadToRelative(-25f, 0f, -36f, -22f)
                reflectiveQuadToRelative(4f, -42f)
                close()
            }
        }.build()
        
        return _Landscape!!
    }

private var _Landscape: ImageVector? = null

