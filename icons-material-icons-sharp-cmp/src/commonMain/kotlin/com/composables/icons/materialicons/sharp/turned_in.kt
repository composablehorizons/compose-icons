package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Turned_in: ImageVector
    get() {
        if (_Turned_in != null) return _Turned_in!!
        
        _Turned_in = ImageVector.Builder(
            name = "turned_in",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                verticalLineToRelative(18f)
                lineToRelative(7f, -3f)
                lineToRelative(7f, 3f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Turned_in!!
    }

private var _Turned_in: ImageVector? = null

