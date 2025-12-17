package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Battery_saver: ImageVector
    get() {
        if (_Battery_saver != null) return _Battery_saver!!
        
        _Battery_saver = ImageVector.Builder(
            name = "battery_saver",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 4f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(8f)
                        curveTo(7.45f, 4f, 7f, 4.45f, 7f, 5f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(8f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(5f)
                        curveTo(17f, 4.45f, 16.55f, 4f, 16f, 4f)
                        close()
                        moveTo(15f, 14f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Battery_saver!!
    }

private var _Battery_saver: ImageVector? = null

