package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AllSides: ImageVector
    get() {
        if (_AllSides != null) return _AllSides!!
        
        _AllSides = ImageVector.Builder(
            name = "all-sides",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 14.25f)
                lineTo(5.25f, 12f)
                horizontalLineTo(9.75f)
                lineTo(7.5f, 14.25f)
                close()
                moveTo(3f, 9.75f)
                lineTo(0.75f, 7.5f)
                lineTo(3f, 5.25f)
                verticalLineTo(9.75f)
                close()
                moveTo(14.25f, 7.5f)
                lineTo(12f, 9.75f)
                verticalLineTo(5.25f)
                lineTo(14.25f, 7.5f)
                close()
                moveTo(9.75f, 3f)
                horizontalLineTo(5.25f)
                lineTo(7.5f, 0.75f)
                lineTo(9.75f, 3f)
                close()
            }
        }.build()
        
        return _AllSides!!
    }

private var _AllSides: ImageVector? = null

