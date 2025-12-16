package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CopilotNotConnected: ImageVector
    get() {
        if (_CopilotNotConnected != null) return _CopilotNotConnected!!
        
        _CopilotNotConnected = ImageVector.Builder(
            name = "copilot-not-connected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.357f, 6.11455f)
                curveTo(14.341f, 6.10455f, 14.324f, 6.09455f, 14.308f, 6.08455f)
                curveTo(13.888f, 5.83555f, 13.434f, 5.63655f, 12.957f, 5.49555f)
                curveTo(12.987f, 5.30655f, 13.004f, 5.07355f, 13.004f, 4.78755f)
                curveTo(13.004f, 4.02155f, 12.881f, 3.54555f, 12.634f, 3.23255f)
                curveTo(12.4f, 2.93655f, 11.941f, 2.64655f, 10.921f, 2.53255f)
                curveTo(9.87695f, 2.41655f, 9.43295f, 2.62355f, 9.23995f, 2.83055f)
                curveTo(9.03595f, 3.04855f, 8.88095f, 3.50855f, 8.99795f, 4.44455f)
                curveTo(9.05595f, 4.90655f, 9.16195f, 5.27855f, 9.31395f, 5.57155f)
                curveTo(8.92695f, 5.70355f, 8.55695f, 5.87455f, 8.20995f, 6.07955f)
                curveTo(7.48695f, 6.50555f, 6.86095f, 7.07955f, 6.37395f, 7.76055f)
                curveTo(5.90195f, 7.94655f, 5.35895f, 8.03855f, 4.75095f, 8.03855f)
                curveTo(4.09895f, 8.03855f, 3.51395f, 7.95655f, 3.02395f, 7.74755f)
                lineTo(3.00095f, 7.86355f)
                verticalLineTo(12.1186f)
                curveTo(3.26595f, 12.3236f, 4.28595f, 12.8436f, 5.57795f, 13.1966f)
                curveTo(5.69995f, 13.5526f, 5.85495f, 13.8946f, 6.03895f, 14.2176f)
                curveTo(6.18195f, 14.4676f, 6.34195f, 14.7076f, 6.51795f, 14.9336f)
                curveTo(2.65595f, 14.3976f, 0.00195312f, 11.9236f, 0.00195312f, 11.2416f)
                verticalLineTo(9.36855f)
                curveTo(0.0709531f, 8.74455f, 0.668953f, 7.65955f, 1.59295f, 7.27455f)
                curveTo(1.60595f, 7.20455f, 1.61795f, 7.13155f, 1.62895f, 7.05655f)
                curveTo(1.65795f, 6.87355f, 1.68895f, 6.67255f, 1.75595f, 6.44455f)
                curveTo(1.55495f, 5.93655f, 1.50195f, 5.36155f, 1.50195f, 4.78955f)
                curveTo(1.50195f, 3.91855f, 1.62895f, 3.02055f, 2.19495f, 2.30455f)
                curveTo(2.77395f, 1.57155f, 3.68895f, 1.18055f, 4.91895f, 1.04355f)
                curveTo(6.12495f, 0.909553f, 7.18095f, 1.07755f, 7.86295f, 1.80855f)
                curveTo(7.91195f, 1.86155f, 7.95895f, 1.91655f, 8.00195f, 1.97355f)
                curveTo(8.04495f, 1.91755f, 8.09495f, 1.86155f, 8.14495f, 1.80855f)
                curveTo(8.82695f, 1.07755f, 9.88295f, 0.909553f, 11.089f, 1.04355f)
                curveTo(12.319f, 1.18055f, 13.234f, 1.57155f, 13.813f, 2.30455f)
                curveTo(14.378f, 3.02055f, 14.506f, 3.91855f, 14.506f, 4.78955f)
                curveTo(14.506f, 5.24155f, 14.473f, 5.69555f, 14.36f, 6.11655f)
                lineTo(14.357f, 6.11455f)
                close()
                moveTo(6.76595f, 2.83055f)
                curveTo(6.57295f, 2.62355f, 6.12895f, 2.41655f, 5.08495f, 2.53255f)
                curveTo(4.06495f, 2.64555f, 3.60495f, 2.93655f, 3.37195f, 3.23255f)
                curveTo(3.12495f, 3.54555f, 3.00195f, 4.02155f, 3.00195f, 4.78755f)
                curveTo(3.00195f, 5.57955f, 3.13095f, 5.95855f, 3.30995f, 6.15755f)
                curveTo(3.47195f, 6.33855f, 3.82895f, 6.53755f, 4.75195f, 6.53755f)
                curveTo(5.60595f, 6.53755f, 6.09095f, 6.30155f, 6.38995f, 5.99655f)
                curveTo(6.70495f, 5.67455f, 6.91695f, 5.17055f, 7.00795f, 4.44455f)
                curveTo(7.12495f, 3.50855f, 6.96995f, 3.04855f, 6.76595f, 2.83055f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.254f, 7.75055f)
                curveTo(12.189f, 7.75055f, 13.068f, 8.11455f, 13.729f, 8.77555f)
                curveTo(15.094f, 10.1406f, 15.094f, 12.3606f, 13.729f, 13.7256f)
                curveTo(13.068f, 14.3866f, 12.189f, 14.7506f, 11.254f, 14.7506f)
                curveTo(10.319f, 14.7506f, 9.43995f, 14.3866f, 8.77895f, 13.7256f)
                curveTo(7.41395f, 12.3606f, 7.41395f, 10.1406f, 8.77895f, 8.77555f)
                curveTo(9.43995f, 8.11455f, 10.319f, 7.75055f, 11.254f, 7.75055f)
                close()
                moveTo(11.254f, 6.75055f)
                curveTo(10.102f, 6.75055f, 8.95095f, 7.18955f, 8.07195f, 8.06855f)
                curveTo(6.31495f, 9.82555f, 6.31495f, 12.6756f, 8.07195f, 14.4326f)
                curveTo(8.95095f, 15.3116f, 10.102f, 15.7506f, 11.254f, 15.7506f)
                curveTo(12.406f, 15.7506f, 13.557f, 15.3116f, 14.436f, 14.4326f)
                curveTo(16.193f, 12.6756f, 16.193f, 9.82555f, 14.436f, 8.06855f)
                curveTo(13.557f, 7.18955f, 12.406f, 6.75055f, 11.254f, 6.75055f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.668f, 9.08655f)
                curveTo(12.476f, 9.08655f, 12.284f, 9.15955f, 12.138f, 9.30655f)
                lineTo(11.254f, 10.1906f)
                lineTo(10.37f, 9.30655f)
                curveTo(10.224f, 9.16055f, 10.032f, 9.08655f, 9.83995f, 9.08655f)
                curveTo(9.64795f, 9.08655f, 9.45595f, 9.15955f, 9.30995f, 9.30655f)
                curveTo(9.01695f, 9.59955f, 9.01695f, 10.0746f, 9.30995f, 10.3676f)
                lineTo(10.194f, 11.2516f)
                lineTo(9.30995f, 12.1356f)
                curveTo(9.01695f, 12.4286f, 9.01695f, 12.9036f, 9.30995f, 13.1966f)
                curveTo(9.45595f, 13.3426f, 9.64795f, 13.4166f, 9.83995f, 13.4166f)
                curveTo(10.032f, 13.4166f, 10.224f, 13.3436f, 10.37f, 13.1966f)
                lineTo(11.254f, 12.3126f)
                lineTo(12.138f, 13.1966f)
                curveTo(12.284f, 13.3426f, 12.476f, 13.4166f, 12.668f, 13.4166f)
                curveTo(12.86f, 13.4166f, 13.052f, 13.3436f, 13.198f, 13.1966f)
                curveTo(13.491f, 12.9036f, 13.491f, 12.4286f, 13.198f, 12.1356f)
                lineTo(12.314f, 11.2516f)
                lineTo(13.198f, 10.3676f)
                curveTo(13.491f, 10.0746f, 13.491f, 9.59955f, 13.198f, 9.30655f)
                curveTo(13.052f, 9.16055f, 12.86f, 9.08655f, 12.668f, 9.08655f)
                close()
            }
        }.build()
        
        return _CopilotNotConnected!!
    }

private var _CopilotNotConnected: ImageVector? = null

