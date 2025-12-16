package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Angle: ImageVector
    get() {
        if (_Angle != null) return _Angle!!
        
        _Angle = ImageVector.Builder(
            name = "angle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.26075f, 2.23278f)
                curveTo(8.43141f, 2.07478f, 8.69525f, 2.05291f, 8.89161f, 2.19372f)
                curveTo(9.08772f, 2.33448f, 9.15128f, 2.5909f, 9.05665f, 2.80309f)
                lineTo(9.00587f, 2.89098f)
                lineTo(2.47364f, 12.0004f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 12.0101f)
                curveTo(13.8285f, 12.0567f, 14f, 12.2587f, 14f, 12.5004f)
                curveTo(13.9998f, 12.7419f, 13.8284f, 12.9431f, 13.6006f, 12.9896f)
                lineTo(13.5f, 13.0004f)
                horizontalLineTo(1.50001f)
                curveTo(1.31254f, 13.0004f, 1.14129f, 12.8947f, 1.05567f, 12.7279f)
                curveTo(0.970155f, 12.5612f, 0.984544f, 12.3606f, 1.09376f, 12.2084f)
                lineTo(8.19337f, 2.30895f)
                lineTo(8.26075f, 2.23278f)
                close()
                moveTo(13.4004f, 10.0004f)
                curveTo(13.6764f, 10.0006f, 13.9004f, 10.2243f, 13.9004f, 10.5004f)
                curveTo(13.9002f, 10.7762f, 13.6763f, 11.0002f, 13.4004f, 11.0004f)
                curveTo(13.1244f, 11.0004f, 12.9006f, 10.7763f, 12.9004f, 10.5004f)
                curveTo(12.9004f, 10.2242f, 13.1243f, 10.0004f, 13.4004f, 10.0004f)
                close()
                moveTo(12.5996f, 8.00036f)
                curveTo(12.8758f, 8.00036f, 13.0996f, 8.22422f, 13.0996f, 8.50036f)
                curveTo(13.0994f, 8.77634f, 12.8756f, 9.00036f, 12.5996f, 9.00036f)
                curveTo(12.3238f, 9.00016f, 12.0998f, 8.77622f, 12.0996f, 8.50036f)
                curveTo(12.0996f, 8.22434f, 12.3236f, 8.00056f, 12.5996f, 8.00036f)
                close()
                moveTo(11.5996f, 6.00036f)
                curveTo(11.8758f, 6.00036f, 12.0996f, 6.22422f, 12.0996f, 6.50036f)
                curveTo(12.0994f, 6.77634f, 11.8756f, 7.00036f, 11.5996f, 7.00036f)
                curveTo(11.3238f, 7.00016f, 11.0998f, 6.77622f, 11.0996f, 6.50036f)
                curveTo(11.0996f, 6.22434f, 11.3236f, 6.00056f, 11.5996f, 6.00036f)
                close()
                moveTo(10.4004f, 4.00036f)
                curveTo(10.6764f, 4.00056f, 10.9004f, 4.22434f, 10.9004f, 4.50036f)
                curveTo(10.9002f, 4.77622f, 10.6763f, 5.00016f, 10.4004f, 5.00036f)
                curveTo(10.1244f, 5.00036f, 9.90059f, 4.77634f, 9.9004f, 4.50036f)
                curveTo(9.9004f, 4.22422f, 10.1243f, 4.00036f, 10.4004f, 4.00036f)
                close()
            }
        }.build()
        
        return _Angle!!
    }

private var _Angle: ImageVector? = null

