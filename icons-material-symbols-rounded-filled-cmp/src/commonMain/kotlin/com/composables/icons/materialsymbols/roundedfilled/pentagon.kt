package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) return _Pentagon!!
        
        _Pentagon = ImageVector.Builder(
            name = "pentagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298f, 840f)
                quadToRelative(-26f, 0f, -47f, -15f)
                reflectiveQuadToRelative(-29f, -40f)
                lineTo(99f, 417f)
                quadToRelative(-8f, -26f, 0f, -51f)
                reflectiveQuadToRelative(30f, -40f)
                lineToRelative(305f, -214f)
                quadToRelative(21f, -14f, 46f, -14f)
                reflectiveQuadToRelative(46f, 14f)
                lineToRelative(305f, 214f)
                quadToRelative(22f, 15f, 30f, 40f)
                reflectiveQuadToRelative(0f, 51f)
                lineTo(738f, 785f)
                quadToRelative(-8f, 25f, -29f, 40f)
                reflectiveQuadToRelative(-47f, 15f)
                horizontalLineTo(298f)
                close()
            }
        }.build()
        
        return _Pentagon!!
    }

private var _Pentagon: ImageVector? = null

