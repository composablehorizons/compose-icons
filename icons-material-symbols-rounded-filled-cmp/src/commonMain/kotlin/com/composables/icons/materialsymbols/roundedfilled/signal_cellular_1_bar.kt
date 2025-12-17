package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_cellular_1_bar: ImageVector
    get() {
        if (_Signal_cellular_1_bar != null) return _Signal_cellular_1_bar!!
        
        _Signal_cellular_1_bar = ImageVector.Builder(
            name = "signal_cellular_1_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(177f, 880f)
                quadToRelative(-18f, 0f, -29.5f, -12f)
                reflectiveQuadTo(136f, 840f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(664f, -664f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(15f, -3f)
                quadToRelative(16f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(12f, 29.5f)
                verticalLineToRelative(643f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(177f)
                close()
                moveToRelative(223f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-526f)
                lineTo(400f, 674f)
                verticalLineToRelative(126f)
                close()
            }
        }.build()
        
        return _Signal_cellular_1_bar!!
    }

private var _Signal_cellular_1_bar: ImageVector? = null

