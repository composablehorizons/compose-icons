package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Signal: ImageVector
    get() {
        if (_Signal != null) return _Signal!!
        
        _Signal = ImageVector.Builder(
            name = "signal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.08f, 0.234f)
                lineToRelative(0.179f, 0.727f)
                arcToRelative(7.3f, 7.3f, 0f, false, false, -2.01f, 0.832f)
                lineToRelative(-0.383f, -0.643f)
                arcTo(7.9f, 7.9f, 0f, false, true, 6.079f, 0.234f)
                close()
                moveToRelative(3.84f, 0f)
                lineTo(9.742f, 0.96f)
                arcToRelative(7.3f, 7.3f, 0f, false, true, 2.01f, 0.832f)
                lineToRelative(0.388f, -0.643f)
                arcTo(8f, 8f, 0f, false, false, 9.92f, 0.234f)
                moveToRelative(-8.77f, 3.63f)
                arcToRelative(8f, 8f, 0f, false, false, -0.916f, 2.215f)
                lineToRelative(0.727f, 0.18f)
                arcToRelative(7.3f, 7.3f, 0f, false, true, 0.832f, -2.01f)
                lineToRelative(-0.643f, -0.386f)
                close()
                moveTo(0.75f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 0.081f, -1.086f)
                lineTo(0.091f, 6.8f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 2.398f)
                lineToRelative(0.74f, -0.112f)
                arcTo(7f, 7f, 0f, false, true, 0.75f, 8f)
                moveToRelative(11.384f, 6.848f)
                lineToRelative(-0.384f, -0.64f)
                arcToRelative(7.2f, 7.2f, 0f, false, true, -2.007f, 0.831f)
                lineToRelative(0.18f, 0.728f)
                arcToRelative(8f, 8f, 0f, false, false, 2.211f, -0.919f)
                moveTo(15.251f, 8f)
                quadToRelative(0f, 0.547f, -0.082f, 1.086f)
                lineToRelative(0.74f, 0.112f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, -2.398f)
                lineToRelative(-0.74f, 0.114f)
                quadToRelative(0.082f, 0.54f, 0.082f, 1.086f)
                moveToRelative(0.516f, 1.918f)
                lineToRelative(-0.728f, -0.18f)
                arcToRelative(7.3f, 7.3f, 0f, false, true, -0.832f, 2.012f)
                lineToRelative(0.643f, 0.387f)
                arcToRelative(8f, 8f, 0f, false, false, 0.917f, -2.219f)
                moveToRelative(-6.68f, 5.25f)
                curveToRelative(-0.72f, 0.11f, -1.453f, 0.11f, -2.173f, 0f)
                lineToRelative(-0.112f, 0.742f)
                arcToRelative(8f, 8f, 0f, false, false, 2.396f, 0f)
                lineToRelative(-0.112f, -0.741f)
                close()
                moveToRelative(4.75f, -2.868f)
                arcToRelative(7.2f, 7.2f, 0f, false, true, -1.537f, 1.534f)
                lineToRelative(0.446f, 0.605f)
                arcToRelative(8f, 8f, 0f, false, false, 1.695f, -1.689f)
                close()
                moveTo(12.3f, 2.163f)
                curveToRelative(0.587f, 0.432f, 1.105f, 0.95f, 1.537f, 1.537f)
                lineToRelative(0.604f, -0.45f)
                arcToRelative(8f, 8f, 0f, false, false, -1.69f, -1.691f)
                close()
                moveTo(2.163f, 3.7f)
                arcTo(7.2f, 7.2f, 0f, false, true, 3.7f, 2.163f)
                lineToRelative(-0.45f, -0.604f)
                arcToRelative(8f, 8f, 0f, false, false, -1.691f, 1.69f)
                lineToRelative(0.604f, 0.45f)
                close()
                moveToRelative(12.688f, 0.163f)
                lineToRelative(-0.644f, 0.387f)
                curveToRelative(0.377f, 0.623f, 0.658f, 1.3f, 0.832f, 2.007f)
                lineToRelative(0.728f, -0.18f)
                arcToRelative(8f, 8f, 0f, false, false, -0.916f, -2.214f)
                moveTo(6.913f, 0.831f)
                arcToRelative(7.3f, 7.3f, 0f, false, true, 2.172f, 0f)
                lineToRelative(0.112f, -0.74f)
                arcToRelative(8f, 8f, 0f, false, false, -2.396f, 0f)
                close()
                moveTo(2.547f, 14.64f)
                lineTo(1f, 15f)
                lineToRelative(0.36f, -1.549f)
                lineToRelative(-0.729f, -0.17f)
                lineToRelative(-0.361f, 1.548f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.9f, 0.902f)
                lineToRelative(1.548f, -0.357f)
                close()
                moveTo(0.786f, 12.612f)
                lineToRelative(0.732f, 0.168f)
                lineToRelative(0.25f, -1.073f)
                arcTo(7.2f, 7.2f, 0f, false, true, 0.96f, 9.74f)
                lineToRelative(-0.727f, 0.18f)
                arcToRelative(8f, 8f, 0f, false, false, 0.736f, 1.902f)
                lineToRelative(-0.184f, 0.79f)
                close()
                moveToRelative(3.5f, 1.623f)
                lineToRelative(-1.073f, 0.25f)
                lineToRelative(0.17f, 0.731f)
                lineToRelative(0.79f, -0.184f)
                curveToRelative(0.6f, 0.327f, 1.239f, 0.574f, 1.902f, 0.737f)
                lineToRelative(0.18f, -0.728f)
                arcToRelative(7.2f, 7.2f, 0f, false, true, -1.962f, -0.811f)
                close()
                moveTo(8f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, -6.498f, 6.502f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 0.998f, 3.455f)
                lineToRelative(-0.625f, 2.668f)
                lineTo(4.54f, 13.5f)
                arcToRelative(6.502f, 6.502f, 0f, false, false, 6.93f, -11f)
                arcTo(6.5f, 6.5f, 0f, false, false, 8f, 1.5f)
            }
        }.build()
        
        return _Signal!!
    }

private var _Signal: ImageVector? = null

