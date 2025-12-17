package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`4k_plus`: ImageVector
    get() {
        if (_4k_plus != null) return _4k_plus!!
        
        _4k_plus = ImageVector.Builder(
            name = "4k_plus",
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
                    moveTo(11f, 13.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(15f)
                    horizontalLineTo(8.5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(9f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(10f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(14.75f, 15f)
                    lineTo(13f, 12.75f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(13f)
                    verticalLineToRelative(2.25f)
                    lineTo(14.75f, 9f)
                    horizontalLineToRelative(1.75f)
                    lineToRelative(-2.25f, 3f)
                    lineToRelative(2.25f, 3f)
                    horizontalLineTo(14.75f)
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
        
        return _4k_plus!!
    }

private var _4k_plus: ImageVector? = null

