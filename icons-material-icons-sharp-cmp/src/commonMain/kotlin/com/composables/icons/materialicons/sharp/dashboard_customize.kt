package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dashboard_customize: ImageVector
    get() {
        if (_Dashboard_customize != null) return _Dashboard_customize!!
        
        _Dashboard_customize = ImageVector.Builder(
            name = "dashboard_customize",
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
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(3f, 3f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(3f)
                    verticalLineTo(3f)
                    close()
                    moveTo(13f, 3f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(-8f)
                    verticalLineTo(3f)
                    close()
                    moveTo(3f, 13f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(3f)
                    verticalLineTo(13f)
                    close()
                    moveTo(18f, 13f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Dashboard_customize!!
    }

private var _Dashboard_customize: ImageVector? = null

