package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Network_cell: ImageVector
    get() {
        if (_Network_cell != null) return _Network_cell!!
        
        _Network_cell = ImageVector.Builder(
            name = "network_cell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(800f, -800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(600f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-526f)
                lineTo(680f, 394f)
                verticalLineToRelative(406f)
                close()
            }
        }.build()
        
        return _Network_cell!!
    }

private var _Network_cell: ImageVector? = null

