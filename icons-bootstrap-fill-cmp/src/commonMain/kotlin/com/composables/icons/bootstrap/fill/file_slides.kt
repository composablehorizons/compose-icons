package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileSlides: ImageVector
    get() {
        if (_FileSlides != null) return _FileSlides!!
        
        _FileSlides = ImageVector.Builder(
            name = "file-slides",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 7.78f)
                verticalLineTo(5.22f)
                curveToRelative(0f, -0.096f, 0.106f, -0.156f, 0.19f, -0.106f)
                lineToRelative(2.13f, 1.279f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0f, 0.214f)
                lineToRelative(-2.13f, 1.28f)
                arcTo(0.125f, 0.125f, 0f, false, true, 7f, 7.778f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(5f, 4f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.496f, 0.438f)
                lineToRelative(0.5f, 4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.016f)
                curveToRelative(0.863f, 0.055f, 1.5f, 0.251f, 1.5f, 0.484f)
                curveToRelative(0f, 0.276f, -0.895f, 0.5f, -2f, 0.5f)
                reflectiveCurveToRelative(-2f, -0.224f, -2f, -0.5f)
                curveToRelative(0f, -0.233f, 0.637f, -0.429f, 1.5f, -0.484f)
                verticalLineTo(9f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.496f, -0.562f)
                lineToRelative(0.5f, -4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 4f)
            }
        }.build()
        
        return _FileSlides!!
    }

private var _FileSlides: ImageVector? = null

