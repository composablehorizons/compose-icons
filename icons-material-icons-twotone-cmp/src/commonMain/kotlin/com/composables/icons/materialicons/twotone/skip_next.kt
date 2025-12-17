package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Skip_next: ImageVector
    get() {
        if (_Skip_next != null) return _Skip_next!!
        
        _Skip_next = ImageVector.Builder(
            name = "skip_next",
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
                moveTo(8f, 9.86f)
                verticalLineToRelative(4.28f)
                lineTo(11.03f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 12f)
                lineTo(6f, 6f)
                verticalLineToRelative(12f)
                lineToRelative(8.5f, -6f)
                close()
                moveTo(8f, 9.86f)
                lineTo(11.03f, 12f)
                lineTo(8f, 14.14f)
                verticalLineTo(9.86f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Skip_next!!
    }

private var _Skip_next: ImageVector? = null

