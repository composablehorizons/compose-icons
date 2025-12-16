package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Mirror: ImageVector
    get() {
        if (_Mirror != null) return _Mirror!!
        
        _Mirror = ImageVector.Builder(
            name = "mirror",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.293f, 2.91448f)
                lineTo(8.293f, 1.06648f)
                curveTo(8.196f, 1.03748f, 8.097f, 1.02148f, 7.998f, 1.02148f)
                curveTo(7.9f, 1.02148f, 7.801f, 1.03648f, 7.705f, 1.06748f)
                lineTo(1.707f, 2.91448f)
                curveTo(1.284f, 3.04348f, 1f, 3.42848f, 1f, 3.86948f)
                verticalLineTo(14.0005f)
                curveTo(1f, 14.5705f, 1.467f, 15.0005f, 1.997f, 15.0005f)
                curveTo(2.096f, 15.0005f, 2.196f, 14.9855f, 2.294f, 14.9555f)
                lineTo(8f, 13.1995f)
                lineTo(13.706f, 14.9555f)
                curveTo(13.804f, 14.9855f, 13.904f, 15.0005f, 14.003f, 15.0005f)
                curveTo(14.527f, 15.0005f, 15f, 14.5765f, 15f, 14.0005f)
                verticalLineTo(3.86948f)
                curveTo(15f, 3.42848f, 14.716f, 3.04348f, 14.293f, 2.91448f)
                close()
                moveTo(14f, 14.0005f)
                lineTo(8.5f, 12.3075f)
                verticalLineTo(10.5015f)
                curveTo(8.5f, 10.2255f, 8.276f, 10.0015f, 8f, 10.0015f)
                curveTo(7.724f, 10.0015f, 7.5f, 10.2255f, 7.5f, 10.5015f)
                verticalLineTo(12.3085f)
                lineTo(2f, 14.0005f)
                verticalLineTo(3.86948f)
                lineTo(7.5f, 2.17648f)
                verticalLineTo(4.50048f)
                curveTo(7.5f, 4.77648f, 7.724f, 5.00048f, 8f, 5.00048f)
                curveTo(8.276f, 5.00048f, 8.5f, 4.77648f, 8.5f, 4.50048f)
                verticalLineTo(2.17648f)
                lineTo(14f, 3.86948f)
                verticalLineTo(14.0005f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 5.50048f)
                curveTo(10f, 5.62848f, 10.049f, 5.75648f, 10.146f, 5.85448f)
                lineTo(11.292f, 7.00048f)
                horizontalLineTo(4.706f)
                lineTo(5.852f, 5.85448f)
                curveTo(5.95f, 5.75648f, 5.998f, 5.62848f, 5.998f, 5.50048f)
                curveTo(5.998f, 5.22448f, 5.774f, 5.00048f, 5.498f, 5.00048f)
                curveTo(5.37f, 5.00048f, 5.242f, 5.04948f, 5.144f, 5.14648f)
                lineTo(3.144f, 7.14648f)
                curveTo(3.046f, 7.24448f, 2.998f, 7.37248f, 2.998f, 7.50048f)
                curveTo(2.998f, 7.62848f, 3.047f, 7.75648f, 3.144f, 7.85448f)
                lineTo(5.144f, 9.85448f)
                curveTo(5.242f, 9.95248f, 5.37f, 10.0005f, 5.498f, 10.0005f)
                curveTo(5.774f, 10.0005f, 5.998f, 9.77648f, 5.998f, 9.50048f)
                curveTo(5.998f, 9.37248f, 5.949f, 9.24448f, 5.852f, 9.14648f)
                lineTo(4.706f, 8.00048f)
                horizontalLineTo(11.292f)
                lineTo(10.146f, 9.14648f)
                curveTo(10.048f, 9.24448f, 10f, 9.37248f, 10f, 9.50048f)
                curveTo(10f, 9.77648f, 10.224f, 10.0005f, 10.5f, 10.0005f)
                curveTo(10.628f, 10.0005f, 10.756f, 9.95148f, 10.854f, 9.85448f)
                lineTo(12.854f, 7.85448f)
                curveTo(12.952f, 7.75648f, 13f, 7.62848f, 13f, 7.50048f)
                curveTo(13f, 7.37248f, 12.951f, 7.24448f, 12.854f, 7.14648f)
                lineTo(10.854f, 5.14648f)
                curveTo(10.756f, 5.04848f, 10.628f, 5.00048f, 10.5f, 5.00048f)
                curveTo(10.224f, 5.00048f, 10f, 5.22448f, 10f, 5.50048f)
                close()
            }
        }.build()
        
        return _Mirror!!
    }

private var _Mirror: ImageVector? = null

