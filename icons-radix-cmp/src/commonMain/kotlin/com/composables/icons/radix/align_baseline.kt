package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AlignBaseline: ImageVector
    get() {
        if (_AlignBaseline != null) return _AlignBaseline!!
        
        _AlignBaseline = ImageVector.Builder(
            name = "align-baseline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5809f, 13.1084f)
                curveTo(14.763f, 13.1459f, 14.9003f, 13.3069f, 14.9003f, 13.5f)
                curveTo(14.9003f, 13.6932f, 14.763f, 13.8541f, 14.5809f, 13.8916f)
                lineTo(14.4999f, 13.9004f)
                horizontalLineTo(0.499878f)
                curveTo(0.279006f, 13.9004f, 0.0994873f, 13.7209f, 0.0994873f, 13.5f)
                curveTo(0.0995038f, 13.2792f, 0.279016f, 13.0997f, 0.499878f, 13.0996f)
                horizontalLineTo(14.4999f)
                lineTo(14.5809f, 13.1084f)
                close()
                moveTo(7.97058f, 10.7393f)
                curveTo(7.8769f, 10.999f, 7.5897f, 11.1337f, 7.32996f, 11.0401f)
                curveTo(7.0706f, 10.9463f, 6.93592f, 10.6599f, 7.02917f, 10.4004f)
                lineTo(7.97058f, 10.7393f)
                close()
                moveTo(10.4999f, 1.75003f)
                curveTo(10.7105f, 1.75005f, 10.899f, 1.88199f, 10.9706f, 2.08011f)
                lineTo(13.9706f, 10.4004f)
                curveTo(14.0639f, 10.66f, 13.9292f, 10.9463f, 13.6698f, 11.0401f)
                curveTo(13.4101f, 11.1337f, 13.1228f, 10.999f, 13.0292f, 10.7393f)
                lineTo(12.0468f, 8.01566f)
                horizontalLineTo(8.953f)
                lineTo(7.97058f, 10.7393f)
                lineTo(7.49988f, 10.5694f)
                lineTo(7.02917f, 10.4004f)
                lineTo(10.0292f, 2.08011f)
                lineTo(10.0614f, 2.00882f)
                curveTo(10.1482f, 1.85093f, 10.3156f, 1.75008f, 10.4999f, 1.75003f)
                close()
                moveTo(2.49988f, 2.09964f)
                curveTo(2.72061f, 2.09985f, 2.90027f, 2.27925f, 2.90027f, 2.50003f)
                verticalLineTo(9.53323f)
                lineTo(4.21667f, 8.21683f)
                curveTo(4.3729f, 8.06078f, 4.62693f, 8.06067f, 4.78308f, 8.21683f)
                curveTo(4.93901f, 8.373f, 4.93905f, 8.62709f, 4.78308f, 8.78323f)
                lineTo(2.78308f, 10.7832f)
                curveTo(2.70816f, 10.8582f, 2.60582f, 10.9003f, 2.49988f, 10.9004f)
                curveTo(2.3939f, 10.9004f, 2.29167f, 10.8581f, 2.21667f, 10.7832f)
                lineTo(0.216675f, 8.78323f)
                lineTo(0.165894f, 8.71976f)
                curveTo(0.0635299f, 8.56452f, 0.0800509f, 8.35345f, 0.216675f, 8.21683f)
                curveTo(0.353304f, 8.08036f, 0.564425f, 8.06372f, 0.719604f, 8.16605f)
                lineTo(0.783081f, 8.21683f)
                lineTo(2.09949f, 9.53323f)
                verticalLineTo(2.50003f)
                curveTo(2.09949f, 2.27912f, 2.27896f, 2.09964f, 2.49988f, 2.09964f)
                close()
                moveTo(9.25867f, 7.16605f)
                horizontalLineTo(11.7411f)
                lineTo(10.4999f, 3.72464f)
                lineTo(9.25867f, 7.16605f)
                close()
            }
        }.build()
        
        return _AlignBaseline!!
    }

private var _AlignBaseline: ImageVector? = null

