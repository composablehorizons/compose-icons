package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Build_circle: ImageVector
    get() {
        if (_Build_circle != null) return _Build_circle!!
        
        _Build_circle = ImageVector.Builder(
            name = "build_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(408f, 548f)
                quadToRelative(13f, 0f, 24.5f, -2f)
                reflectiveQuadToRelative(22.5f, -6f)
                lineToRelative(151f, 150f)
                lineToRelative(84f, -84f)
                lineToRelative(-150f, -151f)
                quadToRelative(4f, -11f, 6f, -22f)
                reflectiveQuadToRelative(2f, -25f)
                quadToRelative(0f, -57f, -40.5f, -97.5f)
                reflectiveQuadTo(410f, 270f)
                quadToRelative(-17f, 0f, -34f, 4.5f)
                reflectiveQuadTo(343f, 287f)
                lineToRelative(94f, 94f)
                lineToRelative(-56f, 56f)
                lineToRelative(-94f, -94f)
                quadToRelative(-8f, 16f, -12.5f, 33f)
                reflectiveQuadToRelative(-4.5f, 34f)
                quadToRelative(0f, 57f, 40.5f, 97.5f)
                reflectiveQuadTo(408f, 548f)
                close()
                moveToRelative(72f, 332f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Build_circle!!
    }

private var _Build_circle: ImageVector? = null

