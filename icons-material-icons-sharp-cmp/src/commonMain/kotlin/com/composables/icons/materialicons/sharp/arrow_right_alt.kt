package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Arrow_right_alt: ImageVector
    get() {
        if (_Arrow_right_alt != null) return _Arrow_right_alt!!
        
        _Arrow_right_alt = ImageVector.Builder(
            name = "arrow_right_alt",
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
                moveTo(16.01f, 11f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12.01f)
                verticalLineToRelative(3f)
                lineTo(20f, 12f)
                lineToRelative(-3.99f, -4f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Arrow_right_alt!!
    }

private var _Arrow_right_alt: ImageVector? = null

