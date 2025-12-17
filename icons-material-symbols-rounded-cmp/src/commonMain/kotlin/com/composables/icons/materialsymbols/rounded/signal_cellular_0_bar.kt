package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Signal_cellular_0_bar: ImageVector
    get() {
        if (_Signal_cellular_0_bar != null) return _Signal_cellular_0_bar!!
        
        _Signal_cellular_0_bar = ImageVector.Builder(
            name = "signal_cellular_0_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(177f, 880f)
                quadToRelative(-27f, 0f, -37.5f, -24.5f)
                reflectiveQuadTo(148f, 812f)
                lineToRelative(664f, -664f)
                quadToRelative(19f, -19f, 43.5f, -8.5f)
                reflectiveQuadTo(880f, 177f)
                verticalLineToRelative(643f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(177f)
                close()
                moveToRelative(96f, -80f)
                horizontalLineToRelative(527f)
                verticalLineToRelative(-526f)
                lineTo(273f, 800f)
                close()
            }
        }.build()
        
        return _Signal_cellular_0_bar!!
    }

private var _Signal_cellular_0_bar: ImageVector? = null

