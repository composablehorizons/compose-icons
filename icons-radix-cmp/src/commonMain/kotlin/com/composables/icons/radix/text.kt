package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Text: ImageVector
    get() {
        if (_Text != null) return _Text!!
        
        _Text = ImageVector.Builder(
            name = "text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5793f, 2.05685f)
                curveTo(11.5826f, 2.05744f, 11.5858f, 2.05815f, 11.5891f, 2.05881f)
                lineTo(11.591f, 2.05978f)
                curveTo(11.5963f, 2.06087f, 11.6014f, 2.06242f, 11.6066f, 2.06369f)
                curveTo(11.6243f, 2.06801f, 11.6416f, 2.07297f, 11.6584f, 2.07932f)
                curveTo(11.6711f, 2.08411f, 11.6833f, 2.09003f, 11.6955f, 2.09592f)
                curveTo(11.705f, 2.10052f, 11.7147f, 2.10436f, 11.7238f, 2.10959f)
                lineTo(11.7336f, 2.11545f)
                curveTo(11.739f, 2.11873f, 11.744f, 2.12269f, 11.7492f, 2.12619f)
                curveTo(11.7837f, 2.14933f, 11.8151f, 2.17666f, 11.842f, 2.20822f)
                curveTo(11.9093f, 2.28675f, 11.9504f, 2.38867f, 11.9504f, 2.50021f)
                verticalLineTo(4.50021f)
                curveTo(11.9503f, 4.74857f, 11.7485f, 4.95031f, 11.5002f, 4.95041f)
                curveTo(11.2517f, 4.95041f, 11.0501f, 4.74863f, 11.05f, 4.50021f)
                verticalLineTo(2.95041f)
                horizontalLineTo(8.04999f)
                verticalLineTo(12.05f)
                horizontalLineTo(9.25409f)
                curveTo(9.50262f, 12.05f, 9.70428f, 12.2517f, 9.70428f, 12.5002f)
                curveTo(9.7042f, 12.7175f, 9.54981f, 12.8986f, 9.34491f, 12.9406f)
                lineTo(9.25409f, 12.9504f)
                horizontalLineTo(5.75409f)
                lineTo(5.66327f, 12.9406f)
                curveTo(5.45848f, 12.8985f, 5.30398f, 12.7174f, 5.30389f, 12.5002f)
                curveTo(5.30389f, 12.2829f, 5.45845f, 12.1019f, 5.66327f, 12.0598f)
                lineTo(5.75409f, 12.05f)
                horizontalLineTo(6.95038f)
                verticalLineTo(2.95041f)
                horizontalLineTo(3.95038f)
                verticalLineTo(4.50021f)
                curveTo(3.95025f, 4.74857f, 3.74854f, 4.9503f, 3.50018f, 4.95041f)
                curveTo(3.25173f, 4.95041f, 3.05011f, 4.74863f, 3.04999f, 4.50021f)
                verticalLineTo(2.50021f)
                curveTo(3.04999f, 2.4456f, 3.06047f, 2.39339f, 3.07831f, 2.34494f)
                curveTo(3.07994f, 2.3405f, 3.08045f, 2.33564f, 3.08221f, 2.33127f)
                curveTo(3.08731f, 2.31866f, 3.09459f, 2.30714f, 3.10077f, 2.29514f)
                curveTo(3.10725f, 2.2825f, 3.11368f, 2.26993f, 3.12128f, 2.25803f)
                curveTo(3.12798f, 2.24757f, 3.13524f, 2.2376f, 3.14276f, 2.22775f)
                curveTo(3.14853f, 2.22018f, 3.15411f, 2.21248f, 3.16034f, 2.20529f)
                lineTo(3.18182f, 2.18185f)
                curveTo(3.18639f, 2.17728f, 3.19171f, 2.17353f, 3.19647f, 2.16916f)
                curveTo(3.20838f, 2.15819f, 3.22054f, 2.14755f, 3.23358f, 2.13791f)
                curveTo(3.24267f, 2.13121f, 3.25231f, 2.12537f, 3.2619f, 2.11935f)
                curveTo(3.27449f, 2.11144f, 3.28758f, 2.10453f, 3.30096f, 2.09787f)
                curveTo(3.31229f, 2.09225f, 3.3233f, 2.08594f, 3.33514f, 2.08127f)
                curveTo(3.3506f, 2.07516f, 3.36675f, 2.07101f, 3.383f, 2.06662f)
                curveTo(3.3934f, 2.06382f, 3.40356f, 2.05989f, 3.41425f, 2.05783f)
                curveTo(3.44199f, 2.05247f, 3.47087f, 2.05002f, 3.50018f, 2.05002f)
                horizontalLineTo(11.5002f)
                lineTo(11.5793f, 2.05685f)
                close()
            }
        }.build()
        
        return _Text!!
    }

private var _Text: ImageVector? = null

