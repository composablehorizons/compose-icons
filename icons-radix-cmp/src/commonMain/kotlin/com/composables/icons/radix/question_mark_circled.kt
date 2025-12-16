package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.QuestionMarkCircled: ImageVector
    get() {
        if (_QuestionMarkCircled != null) return _QuestionMarkCircled!!
        
        _QuestionMarkCircled = ImageVector.Builder(
            name = "question-mark-circled",
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
                curveTo(0.877487f, 3.8419f, 3.84206f, 0.877319f, 7.49915f, 0.876907f)
                close()
                moveTo(7.49915f, 1.82613f)
                curveTo(4.36674f, 1.82654f, 1.82671f, 4.36657f, 1.82629f, 7.49898f)
                curveTo(1.82629f, 10.6317f, 4.36648f, 13.1714f, 7.49915f, 13.1718f)
                curveTo(10.6321f, 13.1718f, 13.172f, 10.632f, 13.172f, 7.49898f)
                curveTo(13.1716f, 4.36631f, 10.6319f, 1.82613f, 7.49915f, 1.82613f)
                close()
                moveTo(7.50012f, 9.74995f)
                curveTo(7.91423f, 9.75006f, 8.25009f, 10.0858f, 8.25012f, 10.5f)
                curveTo(8.25012f, 10.9141f, 7.91425f, 11.2498f, 7.50012f, 11.25f)
                curveTo(7.08591f, 11.25f, 6.75012f, 10.9142f, 6.75012f, 10.5f)
                curveTo(6.75015f, 10.0858f, 7.08593f, 9.74995f, 7.50012f, 9.74995f)
                close()
                moveTo(7.50012f, 3.82515f)
                curveTo(8.93513f, 3.82519f, 10.0499f, 4.9279f, 10.0499f, 6.24995f)
                curveTo(10.0499f, 7.35371f, 9.31972f, 7.89011f, 8.78528f, 8.2148f)
                curveTo(8.48593f, 8.39664f, 8.30488f, 8.48614f, 8.15051f, 8.6064f)
                curveTo(8.08554f, 8.65705f, 8.05977f, 8.68922f, 8.0509f, 8.70308f)
                lineTo(8.04895f, 8.70406f)
                curveTo(8.04674f, 9.00589f, 7.80247f, 9.24991f, 7.50012f, 9.24995f)
                curveTo(7.19643f, 9.24995f, 6.95042f, 9.00382f, 6.95032f, 8.70015f)
                curveTo(6.95034f, 8.23216f, 7.2324f, 7.92706f, 7.47473f, 7.73824f)
                curveTo(7.6953f, 7.56644f, 8.01457f, 7.39708f, 8.21497f, 7.27534f)
                curveTo(8.6804f, 6.99257f, 8.95032f, 6.74107f, 8.95032f, 6.24995f)
                curveTo(8.95028f, 5.57211f, 8.36497f, 4.9248f, 7.50012f, 4.92476f)
                curveTo(6.63522f, 4.92476f, 6.04996f, 5.57208f, 6.04993f, 6.24995f)
                curveTo(6.04993f, 6.55368f, 5.80384f, 6.79971f, 5.50012f, 6.79976f)
                curveTo(5.19637f, 6.79976f, 4.95032f, 6.55371f, 4.95032f, 6.24995f)
                curveTo(4.95035f, 4.92787f, 6.06507f, 3.82515f, 7.50012f, 3.82515f)
                close()
            }
        }.build()
        
        return _QuestionMarkCircled!!
    }

private var _QuestionMarkCircled: ImageVector? = null

