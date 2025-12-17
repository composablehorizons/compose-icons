package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.BracketError: ImageVector
    get() {
        if (_BracketError != null) return _BracketError!!
        
        _BracketError = ImageVector.Builder(
            name = "bracket-error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 10f)
                curveTo(10.343f, 10f, 8.99995f, 11.343f, 8.99995f, 13f)
                curveTo(8.99995f, 14.657f, 10.343f, 16f, 12f, 16f)
                curveTo(13.657f, 16f, 15f, 14.657f, 15f, 13f)
                curveTo(15f, 11.343f, 13.657f, 10f, 12f, 10f)
                close()
                moveTo(13.479f, 13.771f)
                curveTo(13.674f, 13.966f, 13.674f, 14.283f, 13.479f, 14.478f)
                curveTo(13.381f, 14.576f, 13.253f, 14.624f, 13.125f, 14.624f)
                curveTo(12.997f, 14.624f, 12.869f, 14.575f, 12.771f, 14.478f)
                lineTo(12f, 13.707f)
                lineTo(11.229f, 14.478f)
                curveTo(11.131f, 14.576f, 11.003f, 14.624f, 10.875f, 14.624f)
                curveTo(10.747f, 14.624f, 10.619f, 14.575f, 10.521f, 14.478f)
                curveTo(10.326f, 14.283f, 10.326f, 13.966f, 10.521f, 13.771f)
                lineTo(11.292f, 13f)
                lineTo(10.521f, 12.229f)
                curveTo(10.326f, 12.034f, 10.326f, 11.717f, 10.521f, 11.522f)
                curveTo(10.716f, 11.327f, 11.033f, 11.327f, 11.228f, 11.522f)
                lineTo(11.999f, 12.293f)
                lineTo(12.77f, 11.522f)
                curveTo(12.965f, 11.327f, 13.282f, 11.327f, 13.477f, 11.522f)
                curveTo(13.672f, 11.717f, 13.672f, 12.034f, 13.477f, 12.229f)
                lineTo(12.706f, 13f)
                lineTo(13.477f, 13.771f)
                horizontalLineTo(13.479f)
                close()
                moveTo(10.5f, 2.5f)
                curveTo(10.5f, 2.224f, 10.724f, 2f, 11f, 2f)
                curveTo(12.105f, 2f, 13f, 2.895f, 13f, 4f)
                verticalLineTo(6.005f)
                curveTo(13f, 6.535f, 13.008f, 6.799f, 13.089f, 7.002f)
                curveTo(13.152f, 7.158f, 13.284f, 7.333f, 13.723f, 7.553f)
                curveTo(13.892f, 7.638f, 13.999f, 7.811f, 13.999f, 8f)
                curveTo(13.999f, 8.189f, 13.892f, 8.363f, 13.723f, 8.447f)
                curveTo(13.284f, 8.667f, 13.151f, 8.841f, 13.089f, 8.998f)
                curveTo(13.072f, 9.041f, 13.058f, 9.088f, 13.046f, 9.139f)
                curveTo(12.729f, 9.053f, 12.397f, 9.005f, 12.055f, 9.001f)
                curveTo(12.079f, 8.872f, 12.112f, 8.747f, 12.16f, 8.627f)
                curveTo(12.257f, 8.384f, 12.403f, 8.18f, 12.598f, 8f)
                curveTo(12.402f, 7.821f, 12.257f, 7.616f, 12.16f, 7.374f)
                curveTo(11.998f, 6.971f, 11.999f, 6.51f, 11.999f, 6.063f)
                verticalLineTo(4f)
                curveTo(11.999f, 3.448f, 11.551f, 3f, 10.999f, 3f)
                curveTo(10.723f, 3f, 10.5f, 2.776f, 10.5f, 2.5f)
                close()
                moveTo(3.40095f, 8f)
                curveTo(3.59695f, 8.18f, 3.74195f, 8.384f, 3.83995f, 8.627f)
                curveTo(4.00095f, 9.031f, 4.00095f, 9.493f, 4.00095f, 9.942f)
                verticalLineTo(12.001f)
                curveTo(4.00095f, 12.553f, 4.44895f, 13.001f, 5.00095f, 13.001f)
                curveTo(5.27695f, 13.001f, 5.50095f, 13.225f, 5.50095f, 13.501f)
                curveTo(5.50095f, 13.777f, 5.27695f, 14.001f, 5.00095f, 14.001f)
                curveTo(3.89595f, 14.001f, 3.00095f, 13.106f, 3.00095f, 12.001f)
                verticalLineTo(10.001f)
                curveTo(3.00095f, 9.468f, 2.99295f, 9.203f, 2.91195f, 8.999f)
                curveTo(2.84895f, 8.842f, 2.71695f, 8.668f, 2.27795f, 8.448f)
                curveTo(2.10895f, 8.363f, 2.00195f, 8.19f, 2.00195f, 8.001f)
                curveTo(2.00195f, 7.812f, 2.10895f, 7.639f, 2.27795f, 7.554f)
                curveTo(2.71695f, 7.334f, 2.84995f, 7.16f, 2.91195f, 7.003f)
                curveTo(2.99295f, 6.8f, 3.00095f, 6.536f, 3.00095f, 6.006f)
                verticalLineTo(4.001f)
                curveTo(3.00095f, 2.896f, 3.89595f, 2.001f, 5.00095f, 2.001f)
                curveTo(5.27695f, 2.001f, 5.50095f, 2.225f, 5.50095f, 2.501f)
                curveTo(5.50095f, 2.777f, 5.27695f, 3.001f, 5.00095f, 3.001f)
                curveTo(4.44895f, 3.001f, 4.00095f, 3.449f, 4.00095f, 4.001f)
                verticalLineTo(6.064f)
                curveTo(4.00095f, 6.511f, 4.00095f, 6.972f, 3.83995f, 7.375f)
                curveTo(3.74295f, 7.617f, 3.59695f, 7.821f, 3.40195f, 8.001f)
                lineTo(3.40095f, 8f)
                close()
            }
        }.build()
        
        return _BracketError!!
    }

private var _BracketError: ImageVector? = null

