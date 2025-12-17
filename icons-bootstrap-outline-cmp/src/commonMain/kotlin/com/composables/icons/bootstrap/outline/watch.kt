package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Watch: ImageVector
    get() {
        if (_Watch != null) return _Watch!!
        
        _Watch = ImageVector.Builder(
            name = "watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.667f, 16f)
                curveTo(4.747f, 16f, 4f, 15.254f, 4f, 14.333f)
                verticalLineToRelative(-1.86f)
                arcTo(6f, 6f, 0f, false, true, 2f, 8f)
                curveToRelative(0f, -1.777f, 0.772f, -3.374f, 2f, -4.472f)
                verticalLineTo(1.667f)
                curveTo(4f, 0.747f, 4.746f, 0f, 5.667f, 0f)
                horizontalLineToRelative(4.666f)
                curveTo(11.253f, 0f, 12f, 0.746f, 12f, 1.667f)
                verticalLineToRelative(1.86f)
                arcToRelative(6f, 6f, 0f, false, true, 1.918f, 3.48f)
                arcToRelative(0.502f, 0.502f, 0f, false, true, 0.582f, 0.493f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.582f, 0.493f)
                arcTo(6f, 6f, 0f, false, true, 12f, 12.473f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 0.92f, -0.746f, 1.667f, -1.667f, 1.667f)
                close()
                moveTo(13f, 8f)
                arcTo(5f, 5f, 0f, true, false, 3f, 8f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
            }
        }.build()
        
        return _Watch!!
    }

private var _Watch: ImageVector? = null

