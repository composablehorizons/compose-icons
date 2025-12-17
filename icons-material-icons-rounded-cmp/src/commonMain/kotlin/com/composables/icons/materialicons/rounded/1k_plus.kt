package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`1k_plus`: ImageVector
    get() {
        if (_1k_plus != null) return _1k_plus!!
        
        _1k_plus = ImageVector.Builder(
            name = "1k_plus",
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
                    moveTo(8.25f, 15f)
                    lineTo(8.25f, 15f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(6.75f)
                    curveTo(6.34f, 10.5f, 6f, 10.16f, 6f, 9.75f)
                    verticalLineToRelative(0f)
                    curveTo(6f, 9.34f, 6.34f, 9f, 6.75f, 9f)
                    horizontalLineTo(8f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4.25f)
                    curveTo(9f, 14.66f, 8.66f, 15f, 8.25f, 15f)
                    close()
                    moveTo(13.54f, 14.73f)
                    lineTo(12f, 12.75f)
                    verticalLineToRelative(1.55f)
                    curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                    horizontalLineTo(11.2f)
                    curveToRelative(-0.39f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                    verticalLineTo(9.7f)
                    curveToRelative(0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f)
                    horizontalLineToRelative(0.09f)
                    curveTo(11.69f, 9f, 12f, 9.31f, 12f, 9.7f)
                    verticalLineToRelative(1.55f)
                    lineToRelative(1.54f, -1.98f)
                    curveTo(13.67f, 9.1f, 13.88f, 9f, 14.09f, 9f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.58f, 0f, 0.91f, 0.66f, 0.56f, 1.12f)
                    lineTo(13.25f, 12f)
                    lineToRelative(1.41f, 1.88f)
                    curveTo(15f, 14.34f, 14.67f, 15f, 14.09f, 15f)
                    horizontalLineToRelative(0f)
                    curveTo(13.88f, 15f, 13.67f, 14.9f, 13.54f, 14.73f)
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
        
        return _1k_plus!!
    }

private var _1k_plus: ImageVector? = null

