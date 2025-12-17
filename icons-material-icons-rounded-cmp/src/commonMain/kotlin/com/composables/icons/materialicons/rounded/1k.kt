package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`1k`: ImageVector
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
                    moveTo(9.25f, 15f)
                    lineTo(9.25f, 15f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(7.75f)
                    curveTo(7.34f, 10.5f, 7f, 10.16f, 7f, 9.75f)
                    verticalLineToRelative(0f)
                    curveTo(7f, 9.34f, 7.34f, 9f, 7.75f, 9f)
                    horizontalLineTo(9f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4.25f)
                    curveTo(10f, 14.66f, 9.66f, 15f, 9.25f, 15f)
                    close()
                    moveTo(15.59f, 15f)
                    lineTo(15.59f, 15f)
                    curveToRelative(-0.22f, 0f, -0.42f, -0.1f, -0.55f, -0.27f)
                    lineToRelative(-1.54f, -1.98f)
                    verticalLineToRelative(1.5f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineToRelative(0f)
                    curveTo(12.34f, 15f, 12f, 14.66f, 12f, 14.25f)
                    verticalLineToRelative(-4.5f)
                    curveTo(12f, 9.34f, 12.34f, 9f, 12.75f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(1.5f)
                    lineToRelative(1.54f, -1.98f)
                    curveTo(15.17f, 9.1f, 15.38f, 9f, 15.59f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.58f, 0f, 0.91f, 0.66f, 0.56f, 1.12f)
                    lineTo(14.75f, 12f)
                    lineToRelative(1.41f, 1.88f)
                    curveTo(16.5f, 14.34f, 16.17f, 15f, 15.59f, 15f)
                    close()
                }
            }
        }.build()
        
        return _1k!!
    }

private var _1k: ImageVector? = null

