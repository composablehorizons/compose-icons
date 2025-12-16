package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Stack: ImageVector
    get() {
        if (_Stack != null) return _Stack!!
        
        _Stack = ImageVector.Builder(
            name = "stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.8378f, 8.27743f)
                curveTo(13.0576f, 8.20179f, 13.3077f, 8.28825f, 13.4306f, 8.49618f)
                curveTo(13.5531f, 8.70407f, 13.508f, 8.96425f, 13.3358f, 9.12021f)
                lineTo(13.2538f, 9.18075f)
                lineTo(7.75381f, 12.4308f)
                curveTo(7.59714f, 12.5231f, 7.40267f, 12.5231f, 7.246f, 12.4308f)
                lineTo(1.746f, 9.18075f)
                lineTo(1.66397f, 9.12021f)
                curveTo(1.49183f, 8.96425f, 1.44671f, 8.70405f, 1.56924f, 8.49618f)
                curveTo(1.69212f, 8.28825f, 1.94221f, 8.20183f, 2.16202f, 8.27743f)
                lineTo(2.25381f, 8.31942f)
                lineTo(7.49991f, 11.419f)
                lineTo(12.746f, 8.31942f)
                lineTo(12.8378f, 8.27743f)
                close()
                moveTo(7.30557f, 1.78915f)
                curveTo(7.45005f, 1.72821f, 7.6165f, 1.73849f, 7.75381f, 1.81942f)
                lineTo(13.2538f, 5.06942f)
                curveTo(13.4061f, 5.15938f, 13.4999f, 5.32326f, 13.4999f, 5.50009f)
                curveTo(13.4999f, 5.67692f, 13.4061f, 5.8408f, 13.2538f, 5.93075f)
                lineTo(7.75381f, 9.18075f)
                curveTo(7.59714f, 9.2731f, 7.40267f, 9.27312f, 7.246f, 9.18075f)
                lineTo(1.746f, 5.93075f)
                curveTo(1.5938f, 5.84079f, 1.49991f, 5.67689f, 1.49991f, 5.50009f)
                curveTo(1.49991f, 5.32328f, 1.5938f, 5.15939f, 1.746f, 5.06942f)
                lineTo(7.246f, 1.81942f)
                lineTo(7.30557f, 1.78915f)
                close()
                moveTo(2.98233f, 5.50009f)
                lineTo(7.49991f, 8.16903f)
                lineTo(12.0165f, 5.50009f)
                lineTo(7.49991f, 2.83017f)
                lineTo(2.98233f, 5.50009f)
                close()
            }
        }.build()
        
        return _Stack!!
    }

private var _Stack: ImageVector? = null

