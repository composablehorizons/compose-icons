package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Coffee_maker: ImageVector
    get() {
        if (_Coffee_maker != null) return _Coffee_maker!!
        
        _Coffee_maker = ImageVector.Builder(
            name = "coffee_maker",
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
                        moveTo(18f, 6f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-4.03f)
                        curveTo(17.2f, 19.09f, 18f, 17.64f, 18f, 16f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.64f, 0.81f, 3.09f, 2.03f, 4f)
                        horizontalLineTo(6f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(8f)
                        curveTo(17.55f, 7f, 18f, 6.55f, 18f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 9f)
                        arcTo(1f, 1f, 0f, false, true, 13f, 10f)
                        arcTo(1f, 1f, 0f, false, true, 12f, 9f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Coffee_maker!!
    }

private var _Coffee_maker: ImageVector? = null

