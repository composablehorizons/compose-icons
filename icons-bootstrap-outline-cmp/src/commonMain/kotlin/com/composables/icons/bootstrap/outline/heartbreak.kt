package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Heartbreak: ImageVector
    get() {
        if (_Heartbreak != null) return _Heartbreak!!
        
        _Heartbreak = ImageVector.Builder(
            name = "heartbreak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.867f, 14.41f)
                curveToRelative(13.308f, -9.322f, 4.79f, -16.563f, 0.064f, -13.824f)
                lineTo(7f, 3f)
                lineToRelative(1.5f, 4f)
                lineToRelative(-2f, 3f)
                lineTo(8f, 15f)
                arcToRelative(38f, 38f, 0f, false, false, 0.867f, -0.59f)
                moveToRelative(-0.303f, -1.01f)
                lineToRelative(-0.971f, -3.237f)
                lineToRelative(1.74f, -2.608f)
                arcToRelative(1f, 1f, 0f, false, false, 0.103f, -0.906f)
                lineToRelative(-1.3f, -3.468f)
                lineToRelative(1.45f, -1.813f)
                curveToRelative(1.861f, -0.948f, 4.446f, 0.002f, 5.197f, 2.11f)
                curveToRelative(0.691f, 1.94f, -0.055f, 5.521f, -6.219f, 9.922f)
                moveToRelative(-1.25f, 1.137f)
                arcToRelative(36f, 36f, 0f, false, true, -1.522f, -1.116f)
                curveTo(-5.077f, 4.97f, 1.842f, -1.472f, 6.454f, 0.293f)
                curveToRelative(0.314f, 0.12f, 0.618f, 0.279f, 0.904f, 0.477f)
                lineTo(5.5f, 3f)
                lineTo(7f, 7f)
                lineToRelative(-1.5f, 3f)
                close()
                moveToRelative(-2.3f, -3.06f)
                lineToRelative(-0.442f, -1.106f)
                arcToRelative(1f, 1f, 0f, false, true, 0.034f, -0.818f)
                lineToRelative(1.305f, -2.61f)
                lineTo(4.564f, 3.35f)
                arcToRelative(1f, 1f, 0f, false, true, 0.168f, -0.991f)
                lineToRelative(1.032f, -1.24f)
                curveToRelative(-1.688f, -0.449f, -3.7f, 0.398f, -4.456f, 2.128f)
                curveToRelative(-0.711f, 1.627f, -0.413f, 4.55f, 3.706f, 8.229f)
                close()
            }
        }.build()
        
        return _Heartbreak!!
    }

private var _Heartbreak: ImageVector? = null

