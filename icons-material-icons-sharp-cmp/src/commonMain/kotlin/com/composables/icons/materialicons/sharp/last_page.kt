package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Last_page: ImageVector
    get() {
        if (_Last_page != null) return _Last_page!!
        
        _Last_page = ImageVector.Builder(
            name = "last_page",
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
                moveTo(5.59f, 7.41f)
                lineTo(10.18f, 12f)
                lineToRelative(-4.59f, 4.59f)
                lineTo(7f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Last_page!!
    }

private var _Last_page: ImageVector? = null

