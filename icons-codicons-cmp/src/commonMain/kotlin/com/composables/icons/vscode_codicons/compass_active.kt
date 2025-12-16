package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CompassActive: ImageVector
    get() {
        if (_CompassActive != null) return _CompassActive!!
        
        _CompassActive = ImageVector.Builder(
            name = "compass-active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.88f, 9.53049f)
                lineTo(9.88f, 7.60049f)
                curveTo(9.54f, 6.97049f, 9.02f, 6.44049f, 8.38f, 6.11049f)
                lineTo(6.47f, 5.12049f)
                curveTo(5.61f, 4.68049f, 4.68f, 5.61049f, 5.12f, 6.47049f)
                lineTo(6.11f, 8.38049f)
                curveTo(6.44f, 9.02049f, 6.97f, 9.54049f, 7.6f, 9.88049f)
                lineTo(9.53f, 10.8805f)
                curveTo(9.55f, 10.8905f, 9.58f, 10.9005f, 9.6f, 10.9105f)
                curveTo(9.92f, 10.3705f, 10.37f, 9.92049f, 10.91f, 9.60049f)
                curveTo(10.9f, 9.58049f, 10.89f, 9.55049f, 10.88f, 9.53049f)
                close()
                moveTo(8.07f, 8.99049f)
                curveTo(7.61f, 8.75049f, 7.24f, 8.38049f, 7f, 7.92049f)
                lineTo(6.01f, 6.01049f)
                lineTo(7.92f, 7.00049f)
                curveTo(8.38f, 7.24049f, 8.75f, 7.61049f, 8.99f, 8.07049f)
                lineTo(9.99f, 9.99049f)
                lineTo(8.07f, 8.99049f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1.00049f)
                curveTo(4.13f, 1.00049f, 1f, 4.13049f, 1f, 8.00049f)
                curveTo(1f, 11.8705f, 4.13f, 15.0005f, 8f, 15.0005f)
                curveTo(8.5f, 15.0005f, 8.99f, 14.9505f, 9.46f, 14.8505f)
                curveTo(9.3f, 14.5605f, 9.18f, 14.2405f, 9.1f, 13.9005f)
                curveTo(8.75f, 13.9705f, 8.38f, 14.0005f, 8f, 14.0005f)
                curveTo(4.69f, 14.0005f, 2f, 11.3105f, 2f, 8.00049f)
                curveTo(2f, 4.69049f, 4.69f, 2.00049f, 8f, 2.00049f)
                curveTo(11.31f, 2.00049f, 14f, 4.69049f, 14f, 8.00049f)
                curveTo(14f, 8.38049f, 13.97f, 8.75049f, 13.9f, 9.10049f)
                curveTo(14.24f, 9.18049f, 14.56f, 9.30049f, 14.85f, 9.46049f)
                curveTo(14.95f, 8.99049f, 15f, 8.50049f, 15f, 8.00049f)
                curveTo(15f, 4.13049f, 11.87f, 1.00049f, 8f, 1.00049f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 10.0005f)
                curveTo(11.343f, 10.0005f, 10f, 11.3435f, 10f, 13.0005f)
                curveTo(10f, 14.6575f, 11.343f, 16.0005f, 13f, 16.0005f)
                curveTo(14.657f, 16.0005f, 16f, 14.6575f, 16f, 13.0005f)
                curveTo(16f, 11.3435f, 14.657f, 10.0005f, 13f, 10.0005f)
                close()
                moveTo(14.604f, 12.6045f)
                lineTo(12.854f, 14.3545f)
                curveTo(12.756f, 14.4525f, 12.628f, 14.5005f, 12.5f, 14.5005f)
                curveTo(12.372f, 14.5005f, 12.244f, 14.4515f, 12.146f, 14.3545f)
                lineTo(11.146f, 13.3545f)
                curveTo(10.951f, 13.1595f, 10.951f, 12.8425f, 11.146f, 12.6475f)
                curveTo(11.341f, 12.4525f, 11.658f, 12.4525f, 11.853f, 12.6475f)
                lineTo(12.499f, 13.2935f)
                lineTo(13.895f, 11.8975f)
                curveTo(14.09f, 11.7025f, 14.407f, 11.7025f, 14.602f, 11.8975f)
                curveTo(14.797f, 12.0925f, 14.797f, 12.4095f, 14.602f, 12.6045f)
                horizontalLineTo(14.604f)
                close()
            }
        }.build()
        
        return _CompassActive!!
    }

private var _CompassActive: ImageVector? = null

