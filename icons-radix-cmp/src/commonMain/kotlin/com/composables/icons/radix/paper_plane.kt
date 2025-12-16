package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.PaperPlane: ImageVector
    get() {
        if (_PaperPlane != null) return _PaperPlane!!
        
        _PaperPlane = ImageVector.Builder(
            name = "paper-plane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.627945f, 1.166f)
                curveTo(0.772731f, 1.00471f, 1.00504f, 0.954914f, 1.20314f, 1.04295f)
                lineTo(14.7031f, 7.04295f)
                curveTo(14.8837f, 7.1232f, 15f, 7.3024f, 15f, 7.49998f)
                curveTo(15f, 7.69758f, 14.8837f, 7.87676f, 14.7031f, 7.95702f)
                lineTo(1.20314f, 13.957f)
                curveTo(1.00503f, 14.0451f, 0.772733f, 13.9953f, 0.627945f, 13.834f)
                curveTo(0.483193f, 13.6724f, 0.459056f, 13.4354f, 0.568375f, 13.248f)
                lineTo(3.92091f, 7.49998f)
                lineTo(0.568375f, 1.75194f)
                curveTo(0.459065f, 1.56453f, 0.483186f, 1.3276f, 0.627945f, 1.166f)
                close()
                moveTo(4.84474f, 7.09959f)
                horizontalLineTo(9.00002f)
                lineTo(9.08107f, 7.10838f)
                curveTo(9.2631f, 7.14586f, 9.40039f, 7.30686f, 9.40041f, 7.49998f)
                curveTo(9.40041f, 7.69311f, 9.26311f, 7.8541f, 9.08107f, 7.89159f)
                lineTo(9.00002f, 7.90037f)
                horizontalLineTo(4.84474f)
                lineTo(2.21193f, 12.4131f)
                lineTo(13.2686f, 7.49998f)
                lineTo(2.21193f, 2.58592f)
                lineTo(4.84474f, 7.09959f)
                close()
            }
        }.build()
        
        return _PaperPlane!!
    }

private var _PaperPlane: ImageVector? = null

