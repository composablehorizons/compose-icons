package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkSlides: ImageVector
    get() {
        if (_FileEarmarkSlides != null) return _FileEarmarkSlides!!
        
        _FileEarmarkSlides = ImageVector.Builder(
            name = "file-earmark-slides",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 9.78f)
                verticalLineTo(7.22f)
                curveToRelative(0f, -0.096f, 0.106f, -0.156f, 0.19f, -0.106f)
                lineToRelative(2.13f, 1.279f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0f, 0.214f)
                lineToRelative(-2.13f, 1.28f)
                arcTo(0.125f, 0.125f, 0f, false, true, 7f, 9.778f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.293f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4.707f)
                arcTo(1f, 1f, 0f, false, false, 13.707f, 4f)
                lineTo(10f, 0.293f)
                arcTo(1f, 1f, 0f, false, false, 9.293f, 0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveTo(5f, 6f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.496f, 0.438f)
                lineToRelative(0.5f, 4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.016f)
                curveToRelative(0.863f, 0.055f, 1.5f, 0.251f, 1.5f, 0.484f)
                curveToRelative(0f, 0.276f, -0.895f, 0.5f, -2f, 0.5f)
                reflectiveCurveToRelative(-2f, -0.224f, -2f, -0.5f)
                curveToRelative(0f, -0.233f, 0.637f, -0.429f, 1.5f, -0.484f)
                verticalLineTo(11f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.496f, -0.562f)
                lineToRelative(0.5f, -4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 6f)
            }
        }.build()
        
        return _FileEarmarkSlides!!
    }

private var _FileEarmarkSlides: ImageVector? = null

