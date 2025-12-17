package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`3k_plus`: ImageVector
    get() {
        if (_3k_plus != null) return _3k_plus!!
        
        _3k_plus = ImageVector.Builder(
            name = "3k_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(10f, 9f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(5.5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(9f)
                    horizontalLineTo(10f)
                    close()
                    moveTo(16f, 15f)
                    horizontalLineToRelative(-1.75f)
                    lineToRelative(-1.75f, -2.25f)
                    verticalLineTo(15f)
                    horizontalLineTo(11f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.25f)
                    lineTo(14.25f, 9f)
                    horizontalLineTo(16f)
                    lineToRelative(-2.25f, 3f)
                    lineTo(16f, 15f)
                    close()
                    moveTo(19f, 12.5f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(1.5f)
                    horizontalLineTo(19f)
                    verticalLineTo(12.5f)
                    close()
                }
            }
        }.build()
        
        return _3k_plus!!
    }

private var _3k_plus: ImageVector? = null

