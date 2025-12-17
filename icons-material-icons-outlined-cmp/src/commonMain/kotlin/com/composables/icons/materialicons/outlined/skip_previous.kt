package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Skip_previous: ImageVector
    get() {
        if (_Skip_previous != null) return _Skip_previous!!
        
        _Skip_previous = ImageVector.Builder(
            name = "skip_previous",
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
                moveTo(6f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineTo(6f)
                close()
                moveToRelative(3.5f, 6f)
                lineToRelative(8.5f, 6f)
                verticalLineTo(6f)
                lineToRelative(-8.5f, 6f)
                close()
                moveToRelative(6.5f, 2.14f)
                lineTo(12.97f, 12f)
                lineTo(16f, 9.86f)
                verticalLineToRelative(4.28f)
                close()
            }
        }.build()
        
        return _Skip_previous!!
    }

private var _Skip_previous: ImageVector? = null

