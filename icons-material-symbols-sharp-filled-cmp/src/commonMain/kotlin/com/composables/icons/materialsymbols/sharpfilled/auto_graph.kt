package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_graph: ImageVector
    get() {
        if (_Auto_graph != null) return _Auto_graph!!
        
        _Auto_graph = ImageVector.Builder(
            name = "auto_graph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 9f)
                lineTo(7.4f, 6.6f)
                lineTo(5f, 5.5f)
                lineToRelative(2.4f, -1.1f)
                lineTo(8.5f, 2f)
                lineToRelative(1.1f, 2.4f)
                lineTo(12f, 5.5f)
                lineTo(9.6f, 6.6f)
                close()
                moveToRelative(6.5f, 3f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(12f, 9f)
                lineToRelative(2.05f, -0.95f)
                lineTo(15f, 6f)
                lineToRelative(0.95f, 2.05f)
                lineTo(18f, 9f)
                lineToRelative(-2.05f, 0.95f)
                close()
                moveTo(4f, 14f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(1f, 11f)
                lineToRelative(2.05f, -0.95f)
                lineTo(4f, 8f)
                lineToRelative(0.95f, 2.05f)
                lineTo(7f, 11f)
                lineToRelative(-2.05f, 0.95f)
                close()
                moveToRelative(0.5f, 6.5f)
                lineTo(3f, 19f)
                lineToRelative(7.5f, -7.5f)
                lineToRelative(4f, 4f)
                lineToRelative(7.1f, -7.975f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(-8.5f, 9.575f)
                lineToRelative(-4f, -4f)
                close()
            }
        }.build()
        
        return _Auto_graph!!
    }

private var _Auto_graph: ImageVector? = null

