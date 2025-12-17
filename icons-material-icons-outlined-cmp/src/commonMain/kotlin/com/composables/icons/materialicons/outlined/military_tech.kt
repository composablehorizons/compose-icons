package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Military_tech: ImageVector
    get() {
        if (_Military_tech != null) return _Military_tech!!
        
        _Military_tech = ImageVector.Builder(
            name = "military_tech",
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
                        moveTo(17f, 10.43f)
                        verticalLineTo(2f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(8.43f)
                        curveToRelative(0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f)
                        lineToRelative(4.18f, 2.51f)
                        lineToRelative(-0.99f, 2.34f)
                        lineToRelative(-3.41f, 0.29f)
                        lineToRelative(2.59f, 2.24f)
                        lineTo(9.07f, 22f)
                        lineTo(12f, 20.23f)
                        lineTo(14.93f, 22f)
                        lineToRelative(-0.78f, -3.33f)
                        lineToRelative(2.59f, -2.24f)
                        lineToRelative(-3.41f, -0.29f)
                        lineToRelative(-0.99f, -2.34f)
                        lineToRelative(4.18f, -2.51f)
                        curveTo(16.82f, 11.11f, 17f, 10.79f, 17f, 10.43f)
                        close()
                        moveTo(11f, 11.07f)
                        lineToRelative(-2f, -1.2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11.07f)
                        close()
                        moveTo(15f, 9.87f)
                        lineToRelative(-2f, 1.2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9.87f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Military_tech!!
    }

private var _Military_tech: ImageVector? = null

