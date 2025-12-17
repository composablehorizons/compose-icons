package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Library_add_check: ImageVector
    get() {
        if (_Library_add_check != null) return _Library_add_check!!
        
        _Library_add_check = ImageVector.Builder(
            name = "library_add_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(2f)
                    close()
                    moveTo(12.47f, 14f)
                    lineTo(9f, 10.5f)
                    lineToRelative(1.4f, -1.41f)
                    lineToRelative(2.07f, 2.08f)
                    lineTo(17.6f, 6f)
                    lineTo(19f, 7.41f)
                    lineTo(12.47f, 14f)
                    close()
                    moveTo(4f, 6f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    close()
                }
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
            }
        }.build()
        
        return _Library_add_check!!
    }

private var _Library_add_check: ImageVector? = null

