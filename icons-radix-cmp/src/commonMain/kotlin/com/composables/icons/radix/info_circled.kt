package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.InfoCircled: ImageVector
    get() {
        if (_InfoCircled != null) return _InfoCircled!!
        
        _InfoCircled = ImageVector.Builder(
            name = "info-circled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49915f, 0.876907f)
                curveTo(11.1566f, 0.876907f, 14.1218f, 3.84164f, 14.1222f, 7.49898f)
                curveTo(14.1222f, 11.1566f, 11.1568f, 14.122f, 7.49915f, 14.122f)
                curveTo(3.84181f, 14.1216f, 0.877075f, 11.1564f, 0.877075f, 7.49898f)
                curveTo(0.877487f, 3.8419f, 3.84206f, 0.877318f, 7.49915f, 0.876907f)
                close()
                moveTo(7.49915f, 1.82613f)
                curveTo(4.36673f, 1.82654f, 1.82671f, 4.36657f, 1.82629f, 7.49898f)
                curveTo(1.82629f, 10.6317f, 4.36648f, 13.1714f, 7.49915f, 13.1718f)
                curveTo(10.6321f, 13.1718f, 13.172f, 10.632f, 13.172f, 7.49898f)
                curveTo(13.1716f, 4.36631f, 10.6319f, 1.82613f, 7.49915f, 1.82613f)
                close()
                moveTo(7.60071f, 6.00972f)
                curveTo(7.82862f, 6.05627f, 8.0001f, 6.25829f, 8.00012f, 6.49995f)
                verticalLineTo(9.99995f)
                horizontalLineTo(9.00012f)
                verticalLineTo(11f)
                horizontalLineTo(6.00012f)
                verticalLineTo(9.99995f)
                horizontalLineTo(7.00012f)
                verticalLineTo(6.99995f)
                horizontalLineTo(6.00012f)
                verticalLineTo(5.99995f)
                horizontalLineTo(7.50012f)
                lineTo(7.60071f, 6.00972f)
                close()
                moveTo(7.50012f, 3.74995f)
                curveTo(7.91423f, 3.75006f, 8.2501f, 4.08583f, 8.25012f, 4.49995f)
                curveTo(8.25012f, 4.9141f, 7.91424f, 5.24985f, 7.50012f, 5.24995f)
                curveTo(7.08591f, 5.24995f, 6.75012f, 4.91417f, 6.75012f, 4.49995f)
                curveTo(6.75015f, 4.08576f, 7.08592f, 3.74995f, 7.50012f, 3.74995f)
                close()
            }
        }.build()
        
        return _InfoCircled!!
    }

private var _InfoCircled: ImageVector? = null

