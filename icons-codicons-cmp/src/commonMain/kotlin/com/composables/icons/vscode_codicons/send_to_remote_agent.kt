package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SendToRemoteAgent: ImageVector
    get() {
        if (_SendToRemoteAgent != null) return _SendToRemoteAgent!!
        
        _SendToRemoteAgent = ImageVector.Builder(
            name = "send-to-remote-agent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50098f, 7f)
                curveTo(7.57684f, 7f, 7.65374f, 7.01689f, 7.72363f, 7.05176f)
                lineTo(15.7236f, 11.0518f)
                curveTo(15.8926f, 11.1368f, 16f, 11.31f, 16f, 11.499f)
                curveTo(16f, 11.688f, 15.8926f, 11.8613f, 15.7236f, 11.9463f)
                lineTo(7.72363f, 15.9463f)
                curveTo(7.65275f, 15.9812f, 7.57585f, 15.999f, 7.5f, 15.999f)
                curveTo(7.23201f, 15.999f, 7.00001f, 15.783f, 7f, 15.499f)
                curveTo(7f, 15.45f, 7.00844f, 15.3986f, 7.02344f, 15.3496f)
                lineTo(8.07031f, 11.999f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 11.999f, 13f, 11.775f, 13f, 11.499f)
                curveTo(13f, 11.223f, 12.776f, 10.999f, 12.5f, 10.999f)
                horizontalLineTo(8.07031f)
                lineTo(7.02344f, 7.64844f)
                curveTo(7.00744f, 7.59945f, 7f, 7.54902f, 7f, 7.49902f)
                curveTo(7f, 7.28503f, 7.16399f, 7.00001f, 7.50098f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                curveTo(10.0419f, 2f, 11.7266f, 3.52993f, 11.9697f, 5.50684f)
                curveTo(13.6617f, 5.61984f, 15f, 7.029f, 15f, 8.75f)
                curveTo(15f, 9.017f, 14.9594f, 9.27348f, 14.8984f, 9.52148f)
                lineTo(13.9688f, 9.05664f)
                curveTo(13.9827f, 8.95575f, 14f, 8.85489f, 14f, 8.75f)
                curveTo(14f, 7.507f, 12.993f, 6.5f, 11.75f, 6.5f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 6.5f, 11f, 6.276f, 11f, 6f)
                curveTo(11f, 4.343f, 9.657f, 3f, 8f, 3f)
                curveTo(6.343f, 3f, 5f, 4.343f, 5f, 6f)
                curveTo(5f, 6.276f, 4.776f, 6.5f, 4.5f, 6.5f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 6.5f, 2f, 7.507f, 2f, 8.75f)
                curveTo(2f, 9.993f, 3.007f, 11f, 4.25f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(4.25f)
                curveTo(2.455f, 12f, 1f, 10.545f, 1f, 8.75f)
                curveTo(1f, 7.029f, 2.33827f, 5.61984f, 4.03027f, 5.50684f)
                curveTo(4.27336f, 3.53093f, 5.95807f, 2f, 8f, 2f)
                close()
            }
        }.build()
        
        return _SendToRemoteAgent!!
    }

private var _SendToRemoteAgent: ImageVector? = null

