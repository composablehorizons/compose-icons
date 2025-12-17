package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Subscript: ImageVector
    get() {
        if (_Subscript != null) return _Subscript!!
        
        _Subscript = ImageVector.Builder(
            name = "subscript",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10.52f, 10.73f)
                    lineTo(7.3f, 5.72f)
                    curveTo(6.82f, 4.97f, 7.35f, 4f, 8.23f, 4f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.39f, 0f, 0.74f, 0.2f, 0.95f, 0.53f)
                    lineToRelative(2.76f, 4.46f)
                    horizontalLineToRelative(0.12f)
                    lineToRelative(2.74f, -4.45f)
                    curveTo(15.01f, 4.2f, 15.37f, 4f, 15.76f, 4f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.88f, 0f, 1.42f, 0.98f, 0.94f, 1.72f)
                    lineToRelative(-3.23f, 5f)
                    lineToRelative(3.55f, 5.55f)
                    curveTo(17.5f, 17.02f, 16.96f, 18f, 16.08f, 18f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.38f, 0f, -0.74f, -0.2f, -0.95f, -0.52f)
                    lineToRelative(-3.07f, -4.89f)
                    horizontalLineToRelative(-0.12f)
                    lineToRelative(-3.07f, 4.89f)
                    curveTo(8.67f, 17.8f, 8.31f, 18f, 7.92f, 18f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.88f, 0f, -1.42f, -0.97f, -0.94f, -1.72f)
                    lineTo(10.52f, 10.73f)
                    close()
                    moveTo(23f, 19.5f)
                    lineTo(23f, 19.5f)
                    curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    horizontalLineTo(20f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                    horizontalLineTo(22f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.5f)
                    curveTo(22.78f, 20f, 23f, 19.78f, 23f, 19.5f)
                    close()
                }
            }
        }.build()
        
        return _Subscript!!
    }

private var _Subscript: ImageVector? = null

