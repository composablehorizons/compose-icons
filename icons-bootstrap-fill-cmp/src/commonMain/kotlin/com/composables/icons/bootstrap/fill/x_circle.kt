package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.XCircle: ImageVector
    get() {
        if (_XCircle != null) return _XCircle!!
        
        _XCircle = ImageVector.Builder(
            name = "x-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.354f, 4.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(7.293f, 8f)
                lineToRelative(-2.647f, 2.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(8f, 8.707f)
                lineToRelative(2.646f, 2.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(8.707f, 8f)
                lineToRelative(2.647f, -2.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(8f, 7.293f)
                close()
            }
        }.build()
        
        return _XCircle!!
    }

private var _XCircle: ImageVector? = null

