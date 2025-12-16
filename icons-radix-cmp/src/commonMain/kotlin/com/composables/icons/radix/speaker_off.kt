package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.SpeakerOff: ImageVector
    get() {
        if (_SpeakerOff != null) return _SpeakerOff!!
        
        _SpeakerOff = ImageVector.Builder(
            name = "speaker-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25867f, 1.06171f)
                curveTo(7.40129f, 0.983222f, 7.57527f, 0.978808f, 7.72351f, 1.05292f)
                curveTo(7.8929f, 1.13762f, 7.99987f, 1.3108f, 7.99987f, 1.50018f)
                verticalLineTo(13.5f)
                curveTo(7.99987f, 13.6894f, 7.8929f, 13.8626f, 7.72351f, 13.9472f)
                curveTo(7.55423f, 14.0319f, 7.35155f, 14.0138f, 7.20008f, 13.9004f)
                lineTo(3.33295f, 11f)
                horizontalLineTo(1.49998f)
                curveTo(0.723325f, 11f, 0.0846083f, 10.4098f, 0.00781237f, 9.65337f)
                lineTo(0f, 9.50005f)
                verticalLineTo(5.50012f)
                curveTo(1.61061E-6f, 4.67171f, 0.671563f, 4.00014f, 1.49998f, 4.00014f)
                horizontalLineTo(3.33295f)
                lineTo(7.20008f, 1.0998f)
                lineTo(7.25867f, 1.06171f)
                close()
                moveTo(3.79974f, 4.90052f)
                curveTo(3.71326f, 4.96528f, 3.608f, 5.00013f, 3.49994f, 5.00013f)
                horizontalLineTo(1.49998f)
                curveTo(1.22384f, 5.00013f, 0.999985f, 5.22398f, 0.999984f, 5.50012f)
                verticalLineTo(9.50005f)
                lineTo(1.00975f, 9.60064f)
                curveTo(1.05627f, 9.8286f, 1.25827f, 10f, 1.49998f, 10f)
                horizontalLineTo(3.49994f)
                curveTo(3.608f, 10f, 3.71326f, 10.0349f, 3.79974f, 10.0997f)
                lineTo(6.99989f, 12.499f)
                verticalLineTo(2.50017f)
                lineTo(3.79974f, 4.90052f)
                close()
                moveTo(14.1463f, 5.14661f)
                curveTo(14.3415f, 4.95135f, 14.658f, 4.95135f, 14.8533f, 5.14661f)
                curveTo(15.0485f, 5.34187f, 15.0485f, 5.65837f, 14.8533f, 5.85363f)
                lineTo(13.2068f, 7.50008f)
                lineTo(14.8533f, 9.14654f)
                lineTo(14.9177f, 9.22467f)
                curveTo(15.0459f, 9.41874f, 15.0241f, 9.6827f, 14.8533f, 9.85356f)
                curveTo(14.6824f, 10.0244f, 14.4185f, 10.0462f, 14.2244f, 9.91801f)
                lineTo(14.1463f, 9.85356f)
                lineTo(12.4998f, 8.2071f)
                lineTo(10.8533f, 9.85356f)
                curveTo(10.6581f, 10.0488f, 10.3416f, 10.0488f, 10.1463f, 9.85356f)
                curveTo(9.95106f, 9.6583f, 9.95106f, 9.3418f, 10.1463f, 9.14654f)
                lineTo(11.7928f, 7.50008f)
                lineTo(10.1463f, 5.85363f)
                lineTo(10.0819f, 5.7755f)
                curveTo(9.9537f, 5.58143f, 9.97546f, 5.31747f, 10.1463f, 5.14661f)
                curveTo(10.3172f, 4.97575f, 10.5811f, 4.95399f, 10.7752f, 5.08216f)
                lineTo(10.8533f, 5.14661f)
                lineTo(12.4998f, 6.79307f)
                lineTo(14.1463f, 5.14661f)
                close()
            }
        }.build()
        
        return _SpeakerOff!!
    }

private var _SpeakerOff: ImageVector? = null

