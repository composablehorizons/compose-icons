package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Cases: ImageVector
    get() {
        if (_Cases != null) return _Cases!!
        
        _Cases = ImageVector.Builder(
            name = "cases",
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
                    moveTo(18f, 5f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(-8f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(13f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(5f)
                    horizontalLineTo(18f)
                    close()
                    moveTo(16f, 5f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(5f)
                    close()
                    moveTo(3f, 9f)
                    horizontalLineTo(1f)
                    verticalLineToRelative(13f)
                    horizontalLineToRelative(18f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Cases!!
    }

private var _Cases: ImageVector? = null

