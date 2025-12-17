package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Navigation: ImageVector
    get() {
        if (_Navigation != null) return _Navigation!!
        
        _Navigation = ImageVector.Builder(
            name = "navigation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                lineTo(222f, 830f)
                quadToRelative(-13f, 5f, -24.5f, 2.5f)
                reflectiveQuadTo(178f, 822f)
                quadToRelative(-8f, -8f, -10.5f, -20f)
                reflectiveQuadToRelative(2.5f, -25f)
                lineToRelative(273f, -615f)
                quadToRelative(5f, -12f, 15.5f, -18f)
                reflectiveQuadToRelative(21.5f, -6f)
                quadToRelative(11f, 0f, 21.5f, 6f)
                reflectiveQuadToRelative(15.5f, 18f)
                lineToRelative(273f, 615f)
                quadToRelative(5f, 13f, 2.5f, 25f)
                reflectiveQuadTo(782f, 822f)
                quadToRelative(-8f, 8f, -19.5f, 10.5f)
                reflectiveQuadTo(738f, 830f)
                lineTo(480f, 720f)
                close()
            }
        }.build()
        
        return _Navigation!!
    }

private var _Navigation: ImageVector? = null

