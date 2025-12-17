package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Signal_cellular_add: ImageVector
    get() {
        if (_Signal_cellular_add != null) return _Signal_cellular_add!!
        
        _Signal_cellular_add = ImageVector.Builder(
            name = "signal_cellular_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(799f, -799f)
                verticalLineToRelative(425f)
                quadToRelative(-18f, -11f, -38f, -17.5f)
                reflectiveQuadTo(799f, 478f)
                verticalLineToRelative(-204f)
                lineTo(273f, 800f)
                horizontalLineToRelative(255f)
                quadToRelative(8f, 23f, 20f, 43f)
                reflectiveQuadToRelative(27f, 37f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-447f, -80f)
                lineToRelative(526f, -526f)
                lineToRelative(-136.5f, 136.5f)
                lineToRelative(-121f, 121f)
                lineTo(418f, 655f)
                lineTo(273f, 800f)
                close()
            }
        }.build()
        
        return _Signal_cellular_add!!
    }

private var _Signal_cellular_add: ImageVector? = null

