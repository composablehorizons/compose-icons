package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Filter_alt: ImageVector
    get() {
        if (_Filter_alt != null) return _Filter_alt!!
        
        _Filter_alt = ImageVector.Builder(
            name = "filter_alt",
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
                    horizontalLineToRelative(24f)
                    moveTo(24f, 24f)
                    horizontalLineTo(0f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(3f, 4f)
                    curveToRelative(2.01f, 2.59f, 7f, 9f, 7f, 9f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-7f)
                    curveToRelative(0f, 0f, 4.98f, -6.41f, 7f, -9f)
                    horizontalLineTo(3f)
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
        
        return _Filter_alt!!
    }

private var _Filter_alt: ImageVector? = null

