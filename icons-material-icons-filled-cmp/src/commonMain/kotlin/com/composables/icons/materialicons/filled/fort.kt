package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fort: ImageVector
    get() {
        if (_Fort != null) return _Fort!!
        
        _Fort = ImageVector.Builder(
            name = "fort",
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
                        moveTo(21f, 3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(4f)
                        lineToRelative(2f, 2f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(9f)
                        verticalLineTo(9f)
                        lineToRelative(2f, -2f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(3f)
                        verticalLineTo(3f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(4f)
                        lineToRelative(2f, 2f)
                        verticalLineToRelative(6f)
                        lineToRelative(-2f, 2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-4f)
                        lineToRelative(-2f, -2f)
                        verticalLineTo(9f)
                        lineToRelative(2f, -2f)
                        verticalLineTo(3f)
                        horizontalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fort!!
    }

private var _Fort: ImageVector? = null

