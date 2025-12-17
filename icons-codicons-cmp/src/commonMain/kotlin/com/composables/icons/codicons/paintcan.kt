package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Paintcan: ImageVector
    get() {
        if (_Paintcan != null) return _Paintcan!!
        
        _Paintcan = ImageVector.Builder(
            name = "paintcan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49998f, 1f)
                curveTo(7.77613f, 1f, 7.99998f, 1.22386f, 7.99998f, 1.5f)
                verticalLineTo(2.42763f)
                curveTo(8.15702f, 2.4998f, 8.30415f, 2.60053f, 8.43355f, 2.72983f)
                lineTo(12.1458f, 6.43921f)
                curveTo(12.7319f, 7.02493f, 12.7321f, 7.97499f, 12.1462f, 8.56093f)
                lineTo(7.0781f, 13.629f)
                curveTo(6.48218f, 14.2249f, 5.51243f, 14.2131f, 4.93123f, 13.6028f)
                lineTo(1.31095f, 9.80152f)
                curveTo(0.749447f, 9.21194f, 0.760786f, 8.28209f, 1.3365f, 7.70638f)
                lineTo(6.31263f, 2.73023f)
                curveTo(6.50977f, 2.53309f, 6.74814f, 2.4023f, 6.99998f, 2.33785f)
                verticalLineTo(1.5f)
                curveTo(6.99998f, 1.22386f, 7.22384f, 1f, 7.49998f, 1f)
                close()
                moveTo(6.99998f, 4.5f)
                verticalLineTo(3.4571f)
                lineTo(2.45709f, 8f)
                horizontalLineTo(11.2929f)
                lineTo(11.4391f, 7.85383f)
                curveTo(11.6344f, 7.65851f, 11.6343f, 7.34182f, 11.4389f, 7.14658f)
                lineTo(7.99998f, 3.71027f)
                verticalLineTo(4.5f)
                curveTo(7.99998f, 4.77614f, 7.77613f, 5f, 7.49998f, 5f)
                curveTo(7.22384f, 5f, 6.99998f, 4.77614f, 6.99998f, 4.5f)
                close()
                moveTo(1.95461f, 9f)
                curveTo(1.97565f, 9.03992f, 2.00247f, 9.07761f, 2.03509f, 9.11187f)
                lineTo(5.65537f, 12.9132f)
                curveTo(5.8491f, 13.1166f, 6.17235f, 13.1205f, 6.37099f, 12.9219f)
                lineTo(10.2929f, 9f)
                horizontalLineTo(1.95461f)
                close()
                moveTo(12.9211f, 10.222f)
                curveTo(12.6981f, 9.96719f, 12.3018f, 9.96719f, 12.0789f, 10.222f)
                lineTo(10.9285f, 11.5367f)
                curveTo(9.74705f, 12.8869f, 10.7059f, 15f, 12.5f, 15f)
                curveTo(14.2941f, 15f, 15.2529f, 12.8869f, 14.0715f, 11.5367f)
                lineTo(12.9211f, 10.222f)
                close()
                moveTo(11.681f, 12.1952f)
                lineTo(12.5f, 11.2593f)
                lineTo(13.3189f, 12.1952f)
                curveTo(13.9346f, 12.8989f, 13.4349f, 14f, 12.5f, 14f)
                curveTo(11.5651f, 14f, 11.0654f, 12.8989f, 11.681f, 12.1952f)
                close()
            }
        }.build()
        
        return _Paintcan!!
    }

private var _Paintcan: ImageVector? = null

