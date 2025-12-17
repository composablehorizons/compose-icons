package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Castle: ImageVector
    get() {
        if (_Castle != null) return _Castle!!
        
        _Castle = ImageVector.Builder(
            name = "castle",
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
                        moveTo(21f, 9f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(8f)
                        horizontalLineTo(3f)
                        verticalLineTo(9f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(9f)
                        verticalLineTo(9f)
                        horizontalLineTo(21f)
                        close()
                        moveTo(11f, 12f)
                        horizontalLineTo(9f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(12f)
                        close()
                        moveTo(15f, 12f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Castle!!
    }

private var _Castle: ImageVector? = null

