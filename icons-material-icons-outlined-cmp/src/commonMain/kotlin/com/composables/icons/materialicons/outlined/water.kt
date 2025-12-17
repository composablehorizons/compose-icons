package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Water: ImageVector
    get() {
        if (_Water != null) return _Water!!
        
        _Water = ImageVector.Builder(
            name = "water",
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
                        moveTo(21.98f, 14f)
                        horizontalLineTo(22f)
                        horizontalLineTo(21.98f)
                        close()
                        moveTo(5.35f, 13f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.4f, 0.98f, 3.31f, 1f)
                        verticalLineToRelative(-2f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveTo(3.38f, 11f, 3.24f, 12f, 2f, 12f)
                        verticalLineToRelative(2f)
                        curveTo(3.9f, 14f, 4.17f, 13f, 5.35f, 13f)
                        close()
                        moveTo(18.67f, 15f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.1f, 1f, -3.34f, 1f)
                        curveToRelative(-1.24f, 0f, -1.38f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.1f, 1f, -3.34f, 1f)
                        verticalLineToRelative(2f)
                        curveToRelative(1.95f, 0f, 2.11f, -1f, 3.34f, -1f)
                        curveToRelative(1.24f, 0f, 1.38f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.1f, -1f, 3.34f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.94f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        verticalLineToRelative(-2f)
                        curveTo(20.76f, 16f, 20.62f, 15f, 18.67f, 15f)
                        close()
                        moveTo(5.35f, 9f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.4f, 0.98f, 3.31f, 1f)
                        verticalLineTo(8f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveTo(10.04f, 7f, 9.9f, 8f, 8.66f, 8f)
                        curveTo(7.47f, 8f, 7.24f, 7f, 5.33f, 7f)
                        curveTo(3.38f, 7f, 3.24f, 8f, 2f, 8f)
                        verticalLineToRelative(2f)
                        curveTo(3.9f, 10f, 4.17f, 9f, 5.35f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Water!!
    }

private var _Water: ImageVector? = null

