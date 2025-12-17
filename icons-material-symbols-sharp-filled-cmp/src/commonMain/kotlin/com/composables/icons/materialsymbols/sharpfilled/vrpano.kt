package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Vrpano: ImageVector
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
                moveTo(81f, 820f)
                verticalLineToRelative(-681f)
                quadToRelative(75f, 35f, 180f, 58f)
                reflectiveQuadToRelative(220f, 23f)
                quadToRelative(115f, 0f, 220f, -23f)
                reflectiveQuadToRelative(180f, -58f)
                verticalLineToRelative(681f)
                quadToRelative(-75f, -35f, -180f, -57.5f)
                reflectiveQuadTo(481f, 740f)
                quadToRelative(-115f, 0f, -220f, 22.5f)
                reflectiveQuadTo(81f, 820f)
                close()
                moveToRelative(139f, -204f)
                quadToRelative(65f, -8f, 129.5f, -12f)
                reflectiveQuadToRelative(130.5f, -4f)
                quadToRelative(66f, 0f, 130.5f, 4f)
                reflectiveQuadTo(740f, 616f)
                lineTo(560f, 400f)
                lineTo(446f, 536f)
                lineToRelative(-80f, -96f)
                lineToRelative(-146f, 176f)
                close()
            }
        }.build()
        
        return _Vrpano!!
    }

private var _Vrpano: ImageVector? = null

