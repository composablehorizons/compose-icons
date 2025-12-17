package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`6k_plus`: ImageVector
    get() {
        if (_6k_plus != null) return _6k_plus!!
        
        _6k_plus = ImageVector.Builder(
            name = "6k_plus",
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
                    moveTo(7.5f, 12.5f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(12.5f)
                    close()
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
                    moveTo(9.25f, 10.5f)
                    horizontalLineTo(7.5f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(9f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2.25f)
                    curveTo(9.66f, 9f, 10f, 9.34f, 10f, 9.75f)
                    verticalLineToRelative(0f)
                    curveTo(10f, 10.16f, 9.66f, 10.5f, 9.25f, 10.5f)
                    close()
                    moveTo(14.59f, 15f)
                    lineTo(14.59f, 15f)
                    curveToRelative(-0.22f, 0f, -0.42f, -0.1f, -0.55f, -0.27f)
                    lineToRelative(-1.54f, -1.98f)
                    verticalLineToRelative(1.55f)
                    curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                    horizontalLineTo(11.7f)
                    curveToRelative(-0.39f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                    verticalLineTo(9.7f)
                    curveTo(11f, 9.31f, 11.31f, 9f, 11.7f, 9f)
                    horizontalLineToRelative(0.09f)
                    curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                    verticalLineToRelative(1.55f)
                    lineToRelative(1.54f, -1.98f)
                    curveTo(14.17f, 9.1f, 14.38f, 9f, 14.59f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.58f, 0f, 0.91f, 0.66f, 0.56f, 1.12f)
                    lineTo(13.75f, 12f)
                    lineToRelative(1.41f, 1.88f)
                    curveTo(15.5f, 14.34f, 15.17f, 15f, 14.59f, 15f)
                    close()
                    moveTo(18.5f, 12.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineToRelative(0f)
                    curveTo(19f, 12.28f, 18.78f, 12.5f, 18.5f, 12.5f)
                    close()
                }
            }
        }.build()
        
        return _6k_plus!!
    }

private var _6k_plus: ImageVector? = null

