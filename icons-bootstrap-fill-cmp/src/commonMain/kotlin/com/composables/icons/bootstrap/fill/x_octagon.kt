package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.XOctagon: ImageVector
    get() {
        if (_XOctagon != null) return _XOctagon!!
        
        _XOctagon = ImageVector.Builder(
            name = "x-octagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.46f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11.107f, 0f)
                horizontalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.353f, 0.146f)
                lineTo(0.146f, 4.54f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0f, 4.893f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.146f, 0.353f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.353f, 0.146f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.353f, -0.146f)
                lineToRelative(4.394f, -4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.146f, -0.353f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.146f, -0.353f)
                close()
                moveToRelative(-6.106f, 4.5f)
                lineTo(8f, 7.293f)
                lineToRelative(2.646f, -2.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineTo(8.707f, 8f)
                lineToRelative(2.647f, 2.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 8.707f)
                lineToRelative(-2.646f, 2.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(7.293f, 8f)
                lineTo(4.646f, 5.354f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
            }
        }.build()
        
        return _XOctagon!!
    }

private var _XOctagon: ImageVector? = null

