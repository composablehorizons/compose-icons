package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 5.1f)
                lineTo(9f, 3f)
                lineTo(3f, 5.02f)
                verticalLineToRelative(16.2f)
                lineToRelative(6f, -2.33f)
                lineToRelative(6f, 2.1f)
                lineToRelative(6f, -2.02f)
                verticalLineTo(2.77f)
                lineTo(15f, 5.1f)
                close()
                moveToRelative(0f, 13.79f)
                lineToRelative(-6f, -2.11f)
                verticalLineTo(5.11f)
                lineToRelative(6f, 2.11f)
                verticalLineToRelative(11.67f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

