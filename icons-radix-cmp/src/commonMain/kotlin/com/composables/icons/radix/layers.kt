package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.8378f, 10.2774f)
                curveTo(13.0576f, 10.2018f, 13.3077f, 10.2882f, 13.4306f, 10.4962f)
                curveTo(13.5531f, 10.7041f, 13.508f, 10.9642f, 13.3358f, 11.1202f)
                lineTo(13.2538f, 11.1808f)
                lineTo(7.75381f, 14.4308f)
                curveTo(7.59714f, 14.5231f, 7.40267f, 14.5231f, 7.246f, 14.4308f)
                lineTo(1.746f, 11.1808f)
                lineTo(1.66397f, 11.1202f)
                curveTo(1.49183f, 10.9643f, 1.44671f, 10.704f, 1.56924f, 10.4962f)
                curveTo(1.69212f, 10.2882f, 1.94221f, 10.2018f, 2.16202f, 10.2774f)
                lineTo(2.25381f, 10.3194f)
                lineTo(7.49991f, 13.419f)
                lineTo(12.746f, 10.3194f)
                lineTo(12.8378f, 10.2774f)
                close()
                moveTo(12.8378f, 7.27743f)
                curveTo(13.0576f, 7.20179f, 13.3077f, 7.28825f, 13.4306f, 7.49618f)
                curveTo(13.5531f, 7.70407f, 13.508f, 7.96425f, 13.3358f, 8.12021f)
                lineTo(13.2538f, 8.18075f)
                lineTo(7.75381f, 11.4308f)
                curveTo(7.59714f, 11.5231f, 7.40267f, 11.5231f, 7.246f, 11.4308f)
                lineTo(1.746f, 8.18075f)
                lineTo(1.66397f, 8.12021f)
                curveTo(1.49183f, 7.96425f, 1.44671f, 7.70405f, 1.56924f, 7.49618f)
                curveTo(1.69212f, 7.28825f, 1.94221f, 7.20183f, 2.16202f, 7.27743f)
                lineTo(2.25381f, 7.31942f)
                lineTo(7.49991f, 10.419f)
                lineTo(12.746f, 7.31942f)
                lineTo(12.8378f, 7.27743f)
                close()
                moveTo(7.30557f, 0.789151f)
                curveTo(7.45005f, 0.728211f, 7.6165f, 0.738495f, 7.75381f, 0.819425f)
                lineTo(13.2538f, 4.06942f)
                curveTo(13.4061f, 4.15938f, 13.4999f, 4.32326f, 13.4999f, 4.50009f)
                curveTo(13.4999f, 4.67692f, 13.4061f, 4.8408f, 13.2538f, 4.93075f)
                lineTo(7.75381f, 8.18075f)
                curveTo(7.59714f, 8.2731f, 7.40267f, 8.27312f, 7.246f, 8.18075f)
                lineTo(1.746f, 4.93075f)
                curveTo(1.5938f, 4.84079f, 1.49991f, 4.67689f, 1.49991f, 4.50009f)
                curveTo(1.49991f, 4.32328f, 1.5938f, 4.15939f, 1.746f, 4.06942f)
                lineTo(7.246f, 0.819425f)
                lineTo(7.30557f, 0.789151f)
                close()
                moveTo(2.98233f, 4.50009f)
                lineTo(7.49991f, 7.16903f)
                lineTo(12.0165f, 4.50009f)
                lineTo(7.49991f, 1.83017f)
                lineTo(2.98233f, 4.50009f)
                close()
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null

