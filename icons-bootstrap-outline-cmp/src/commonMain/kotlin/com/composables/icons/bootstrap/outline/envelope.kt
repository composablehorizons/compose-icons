package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Envelope: ImageVector
    get() {
        if (_Envelope != null) return _Envelope!!
        
        _Envelope = ImageVector.Builder(
            name = "envelope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.217f)
                lineToRelative(7f, 4.2f)
                lineToRelative(7f, -4.2f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(13f, 2.383f)
                lineToRelative(-4.708f, 2.825f)
                lineTo(15f, 11.105f)
                close()
                moveToRelative(-0.034f, 6.876f)
                lineToRelative(-5.64f, -3.471f)
                lineTo(8f, 9.583f)
                lineToRelative(-1.326f, -0.795f)
                lineToRelative(-5.64f, 3.47f)
                arcTo(1f, 1f, 0f, false, false, 2f, 13f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.966f, -0.741f)
                moveTo(1f, 11.105f)
                lineToRelative(4.708f, -2.897f)
                lineTo(1f, 5.383f)
                close()
            }
        }.build()
        
        return _Envelope!!
    }

private var _Envelope: ImageVector? = null

