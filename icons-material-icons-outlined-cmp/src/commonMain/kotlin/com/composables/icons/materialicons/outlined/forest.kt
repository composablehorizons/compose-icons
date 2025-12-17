package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Forest: ImageVector
    get() {
        if (_Forest != null) return _Forest!!
        
        _Forest = ImageVector.Builder(
            name = "forest",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(24f, 18f)
                        lineToRelative(-3.86f, -6f)
                        horizontalLineTo(22f)
                        lineTo(15f, 2f)
                        lineToRelative(-3f, 4.29f)
                        lineTo(9f, 2f)
                        lineTo(2f, 12f)
                        horizontalLineToRelative(1.86f)
                        lineTo(0f, 18f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(24f)
                        close()
                        moveTo(15f, 5.49f)
                        lineTo(18.16f, 10f)
                        horizontalLineToRelative(-1.68f)
                        lineToRelative(3.86f, 6f)
                        horizontalLineToRelative(-3.62f)
                        lineToRelative(-2.57f, -4f)
                        horizontalLineTo(16f)
                        lineToRelative(-2.78f, -3.97f)
                        lineTo(15f, 5.49f)
                        close()
                        moveTo(3.66f, 16f)
                        lineToRelative(3.86f, -6f)
                        horizontalLineTo(5.84f)
                        lineTo(9f, 5.49f)
                        lineTo(12.16f, 10f)
                        horizontalLineToRelative(-1.68f)
                        lineToRelative(3.86f, 6f)
                        horizontalLineTo(3.66f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Forest!!
    }

private var _Forest: ImageVector? = null

