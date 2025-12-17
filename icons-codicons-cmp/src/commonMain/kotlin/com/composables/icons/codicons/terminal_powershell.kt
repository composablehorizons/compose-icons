package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TerminalPowershell: ImageVector
    get() {
        if (_TerminalPowershell != null) return _TerminalPowershell!!
        
        _TerminalPowershell = ImageVector.Builder(
            name = "terminal-powershell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.82499f, 8.882f)
                lineTo(4.46199f, 10.882f)
                curveTo(4.36799f, 10.961f, 4.25299f, 11f, 4.13899f, 11f)
                curveTo(3.99699f, 11f, 3.85599f, 10.939f, 3.75699f, 10.823f)
                curveTo(3.57799f, 10.612f, 3.60499f, 10.297f, 3.81599f, 10.118f)
                lineTo(5.80399f, 8.436f)
                lineTo(4.47899f, 6.817f)
                curveTo(4.30399f, 6.603f, 4.33499f, 6.288f, 4.54899f, 6.113f)
                curveTo(4.76199f, 5.938f, 5.07799f, 5.969f, 5.25199f, 6.183f)
                lineTo(6.88799f, 8.183f)
                curveTo(7.06099f, 8.394f, 7.03299f, 8.705f, 6.82499f, 8.882f)
                close()
                moveTo(11f, 10f)
                horizontalLineTo(7.49999f)
                curveTo(7.22399f, 10f, 6.99999f, 10.224f, 6.99999f, 10.5f)
                curveTo(6.99999f, 10.776f, 7.22399f, 11f, 7.49999f, 11f)
                horizontalLineTo(11f)
                curveTo(11.276f, 11f, 11.5f, 10.776f, 11.5f, 10.5f)
                curveTo(11.5f, 10.224f, 11.276f, 10f, 11f, 10f)
                close()
                moveTo(15.784f, 3.973f)
                lineTo(14.053f, 12.973f)
                curveTo(13.827f, 14.148f, 12.795f, 15f, 11.598f, 15f)
                horizontalLineTo(2.67099f)
                curveTo(1.92299f, 15f, 1.21999f, 14.669f, 0.742988f, 14.092f)
                curveTo(0.265988f, 13.515f, 0.0739875f, 12.763f, 0.215988f, 12.028f)
                lineTo(1.94699f, 3.027f)
                curveTo(2.17299f, 1.852f, 3.20499f, 1f, 4.40199f, 1f)
                horizontalLineTo(13.329f)
                curveTo(14.077f, 1f, 14.78f, 1.331f, 15.257f, 1.908f)
                curveTo(15.734f, 2.485f, 15.926f, 3.237f, 15.784f, 3.972f)
                verticalLineTo(3.973f)
                close()
                moveTo(14.485f, 2.545f)
                curveTo(14.199f, 2.198f, 13.778f, 2f, 13.329f, 2f)
                horizontalLineTo(4.40199f)
                curveTo(3.68399f, 2f, 3.06399f, 2.512f, 2.92899f, 3.217f)
                lineTo(1.19799f, 12.217f)
                curveTo(1.11299f, 12.657f, 1.22799f, 13.11f, 1.51399f, 13.455f)
                curveTo(1.79999f, 13.802f, 2.22099f, 14f, 2.66999f, 14f)
                horizontalLineTo(11.597f)
                curveTo(12.315f, 14f, 12.935f, 13.488f, 13.07f, 12.783f)
                lineTo(14.801f, 3.783f)
                curveTo(14.886f, 3.343f, 14.771f, 2.89f, 14.485f, 2.545f)
                close()
            }
        }.build()
        
        return _TerminalPowershell!!
    }

private var _TerminalPowershell: ImageVector? = null

