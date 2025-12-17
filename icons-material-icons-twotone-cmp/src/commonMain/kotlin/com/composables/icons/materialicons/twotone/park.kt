package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Park: ImageVector
    get() {
        if (_Park != null) return _Park!!
        
        _Park = ImageVector.Builder(
            name = "park",
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
                        moveTo(13.26f, 10f)
                        lineTo(15.16f, 10f)
                        lineTo(12.01f, 5.5f)
                        lineTo(8.88f, 10f)
                        lineTo(10.69f, 10f)
                        lineTo(6.79f, 16f)
                        lineTo(17.26f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 12f)
                        horizontalLineToRelative(2f)
                        lineTo(12f, 2f)
                        lineTo(5.05f, 12f)
                        horizontalLineTo(7f)
                        lineToRelative(-3.9f, 6f)
                        horizontalLineToRelative(6.92f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(3.95f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(21f)
                        lineTo(17f, 12f)
                        close()
                        moveTo(6.79f, 16f)
                        lineToRelative(3.9f, -6f)
                        horizontalLineTo(8.88f)
                        lineToRelative(3.13f, -4.5f)
                        lineToRelative(3.15f, 4.5f)
                        horizontalLineToRelative(-1.9f)
                        lineToRelative(4f, 6f)
                        horizontalLineTo(6.79f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Park!!
    }

private var _Park: ImageVector? = null

