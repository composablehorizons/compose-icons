package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Vrpano: ImageVector
    get() {
        if (_Vrpano != null) return _Vrpano!!
        
        _Vrpano = ImageVector.Builder(
            name = "vrpano",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 616f)
                quadToRelative(65f, -8f, 129.5f, -12f)
                reflectiveQuadToRelative(130.5f, -4f)
                quadToRelative(66f, 0f, 130.5f, 4f)
                reflectiveQuadTo(740f, 616f)
                lineTo(560f, 400f)
                lineTo(446f, 536f)
                lineToRelative(-80f, -96f)
                lineToRelative(-146f, 176f)
                close()
                moveTo(120f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                quadToRelative(8f, 0f, 35.5f, 9.5f)
                reflectiveQuadTo(229f, 190f)
                quadToRelative(46f, 11f, 108.5f, 20.5f)
                reflectiveQuadTo(480f, 220f)
                quadToRelative(80f, 0f, 142.5f, -9.5f)
                reflectiveQuadTo(731f, 190f)
                quadToRelative(46f, -11f, 73.5f, -20.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(-8f, 0f, -35.5f, -9.5f)
                reflectiveQuadTo(731f, 770f)
                quadToRelative(-46f, -11f, -108.5f, -20.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(-80f, 0f, -142.5f, 9.5f)
                reflectiveQuadTo(229f, 770f)
                quadToRelative(-46f, 11f, -73.5f, 20.5f)
                reflectiveQuadTo(120f, 800f)
                close()
            }
        }.build()
        
        return _Vrpano!!
    }

private var _Vrpano: ImageVector? = null

