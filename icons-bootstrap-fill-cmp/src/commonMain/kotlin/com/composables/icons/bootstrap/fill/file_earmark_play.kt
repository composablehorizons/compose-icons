package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEarmarkPlay: ImageVector
    get() {
        if (_FileEarmarkPlay != null) return _FileEarmarkPlay!!
        
        _FileEarmarkPlay = ImageVector.Builder(
            name = "file-earmark-play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
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
                moveTo(6f, 6.883f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.757f, -0.429f)
                lineToRelative(3.528f, 2.117f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.858f)
                lineToRelative(-3.528f, 2.117f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.757f, -0.43f)
                verticalLineTo(6.884f)
                close()
            }
        }.build()
        
        return _FileEarmarkPlay!!
    }

private var _FileEarmarkPlay: ImageVector? = null

