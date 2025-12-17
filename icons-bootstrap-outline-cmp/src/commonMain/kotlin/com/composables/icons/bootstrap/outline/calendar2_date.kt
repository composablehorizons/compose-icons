package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Calendar2Date: ImageVector
    get() {
        if (_Calendar2Date != null) return _Calendar2Date!!
        
        _Calendar2Date = ImageVector.Builder(
            name = "calendar2-date",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.445f, 12.688f)
                verticalLineTo(7.354f)
                horizontalLineToRelative(-0.633f)
                arcTo(13f, 13f, 0f, false, false, 4.5f, 8.16f)
                verticalLineToRelative(0.695f)
                curveToRelative(0.375f, -0.257f, 0.969f, -0.62f, 1.258f, -0.777f)
                horizontalLineToRelative(0.012f)
                verticalLineToRelative(4.61f)
                close()
                moveToRelative(1.188f, -1.305f)
                curveToRelative(0.047f, 0.64f, 0.594f, 1.406f, 1.703f, 1.406f)
                curveToRelative(1.258f, 0f, 2f, -1.066f, 2f, -2.871f)
                curveToRelative(0f, -1.934f, -0.781f, -2.668f, -1.953f, -2.668f)
                curveToRelative(-0.926f, 0f, -1.797f, 0.672f, -1.797f, 1.809f)
                curveToRelative(0f, 1.16f, 0.824f, 1.77f, 1.676f, 1.77f)
                curveToRelative(0.746f, 0f, 1.23f, -0.376f, 1.383f, -0.79f)
                horizontalLineToRelative(0.027f)
                curveToRelative(-0.004f, 1.316f, -0.461f, 2.164f, -1.305f, 2.164f)
                curveToRelative(-0.664f, 0f, -1.008f, -0.45f, -1.05f, -0.82f)
                close()
                moveToRelative(2.953f, -2.317f)
                curveToRelative(0f, 0.696f, -0.559f, 1.18f, -1.184f, 1.18f)
                curveToRelative(-0.601f, 0f, -1.144f, -0.383f, -1.144f, -1.2f)
                curveToRelative(0f, -0.823f, 0.582f, -1.21f, 1.168f, -1.21f)
                curveToRelative(0.633f, 0f, 1.16f, 0.398f, 1.16f, 1.23f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(8f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(1f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(2f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Calendar2Date!!
    }

private var _Calendar2Date: ImageVector? = null

