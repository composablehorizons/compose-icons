package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Superscript: ImageVector
    get() {
        if (_Superscript != null) return _Superscript!!
        
        _Superscript = ImageVector.Builder(
            name = "superscript",
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
                    moveTo(10.51f, 12.73f)
                    lineTo(7.3f, 7.72f)
                    curveTo(6.82f, 6.97f, 7.35f, 6f, 8.23f, 6f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.39f, 0f, 0.74f, 0.2f, 0.95f, 0.53f)
                    lineToRelative(2.76f, 4.46f)
                    horizontalLineToRelative(0.12f)
                    lineToRelative(2.74f, -4.45f)
                    curveTo(15f, 6.2f, 15.36f, 6f, 15.75f, 6f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.88f, 0f, 1.42f, 0.98f, 0.94f, 1.72f)
                    lineToRelative(-3.23f, 5f)
                    lineToRelative(3.55f, 5.55f)
                    curveTo(17.5f, 19.02f, 16.96f, 20f, 16.08f, 20f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.38f, 0f, -0.74f, -0.2f, -0.95f, -0.52f)
                    lineToRelative(-3.07f, -4.89f)
                    horizontalLineToRelative(-0.12f)
                    lineToRelative(-3.07f, 4.89f)
                    curveTo(8.66f, 19.8f, 8.31f, 20f, 7.92f, 20f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.88f, 0f, -1.42f, -0.97f, -0.94f, -1.72f)
                    lineTo(10.51f, 12.73f)
                    close()
                    moveTo(23f, 8.5f)
                    lineTo(23f, 8.5f)
                    curveTo(23f, 8.22f, 22.78f, 8f, 22.5f, 8f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    horizontalLineTo(20f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2.5f)
                    curveTo(19.22f, 4f, 19f, 4.22f, 19f, 4.5f)
                    verticalLineToRelative(0f)
                    curveTo(19f, 4.78f, 19.22f, 5f, 19.5f, 5f)
                    horizontalLineTo(22f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2.5f)
                    curveTo(22.78f, 9f, 23f, 8.78f, 23f, 8.5f)
                    close()
                }
            }
        }.build()
        
        return _Superscript!!
    }

private var _Superscript: ImageVector? = null

