package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Transit_enterexit: ImageVector
    get() {
        if (_Transit_enterexit != null) return _Transit_enterexit!!
        
        _Transit_enterexit = ImageVector.Builder(
            name = "transit_enterexit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(190f)
                lineToRelative(272f, -272f)
                lineToRelative(88f, 88f)
                lineToRelative(-274f, 274f)
                horizontalLineToRelative(194f)
                verticalLineToRelative(120f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Transit_enterexit!!
    }

private var _Transit_enterexit: ImageVector? = null

