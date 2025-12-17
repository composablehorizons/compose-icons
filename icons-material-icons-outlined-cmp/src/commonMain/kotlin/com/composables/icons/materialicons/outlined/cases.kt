package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cases: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 9f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                        horizontalLineToRelative(17f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(3f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 5f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(12f, 3f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(3f)
                        close()
                        moveTo(21f, 16f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cases!!
    }

private var _Cases: ImageVector? = null

