package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Signpost2: ImageVector
    get() {
        if (_Signpost2 != null) return _Signpost2!!
        
        _Signpost2 = ImageVector.Builder(
            name = "signpost-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.293f, 0.707f)
                arcTo(1f, 1f, 0f, false, false, 7f, 1.414f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineTo(2.5f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, 0.4f)
                lineTo(0.725f, 8.7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.6f)
                lineToRelative(0.975f, 1.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.8f, 0.4f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.8f, -0.4f)
                lineToRelative(0.975f, -1.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.6f)
                lineTo(14.3f, 2.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, -0.4f)
                horizontalLineTo(9f)
                verticalLineToRelative(-0.586f)
                arcTo(1f, 1f, 0f, false, false, 7.293f, 0.707f)
            }
        }.build()
        
        return _Signpost2!!
    }

private var _Signpost2: ImageVector? = null

