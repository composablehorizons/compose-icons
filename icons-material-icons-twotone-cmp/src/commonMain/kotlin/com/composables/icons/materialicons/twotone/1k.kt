package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.`1k`: ImageVector
    get() {
        if (_1k != null) return _1k!!
        
        _1k = ImageVector.Builder(
            name = "1k",
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
                        moveTo(5f, 19f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        verticalLineTo(19f)
                        close()
                        moveTo(12f, 9f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(2.25f)
                        lineTo(15.25f, 9f)
                        horizontalLineTo(17f)
                        lineToRelative(-2.25f, 3f)
                        lineTo(17f, 15f)
                        horizontalLineToRelative(-1.75f)
                        lineToRelative(-1.75f, -2.25f)
                        verticalLineTo(15f)
                        horizontalLineTo(12f)
                        verticalLineTo(9f)
                        close()
                        moveTo(7f, 9f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(-4.5f)
                        horizontalLineTo(7f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(19f, 19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.5f, 15f)
                        lineTo(10f, 15f)
                        lineTo(10f, 9f)
                        lineTo(7f, 9f)
                        lineTo(7f, 10.5f)
                        lineTo(8.5f, 10.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.5f, 12.75f)
                        lineTo(15.25f, 15f)
                        lineTo(17f, 15f)
                        lineTo(14.75f, 12f)
                        lineTo(17f, 9f)
                        lineTo(15.25f, 9f)
                        lineTo(13.5f, 11.25f)
                        lineTo(13.5f, 9f)
                        lineTo(12f, 9f)
                        lineTo(12f, 15f)
                        lineTo(13.5f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _1k!!
    }

private var _1k: ImageVector? = null

