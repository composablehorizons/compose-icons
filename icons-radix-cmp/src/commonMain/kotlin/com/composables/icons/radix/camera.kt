package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 2f)
                curveTo(14.1046f, 2f, 15f, 2.89543f, 15f, 4f)
                verticalLineTo(11f)
                curveTo(15f, 12.1046f, 14.1046f, 13f, 13f, 13f)
                horizontalLineTo(2f)
                curveTo(0.964349f, 13f, 0.113005f, 12.2128f, 0.0107422f, 11.2041f)
                lineTo(0f, 11f)
                verticalLineTo(4f)
                curveTo(0f, 2.89543f, 0.895431f, 2f, 2f, 2f)
                horizontalLineTo(13f)
                close()
                moveTo(2f, 3f)
                curveTo(1.44772f, 3f, 1f, 3.44772f, 1f, 4f)
                verticalLineTo(11f)
                lineTo(1.00488f, 11.1025f)
                curveTo(1.05621f, 11.6067f, 1.48232f, 12f, 2f, 12f)
                horizontalLineTo(13f)
                curveTo(13.5523f, 12f, 14f, 11.5523f, 14f, 11f)
                verticalLineTo(4f)
                curveTo(14f, 3.44772f, 13.5523f, 3f, 13f, 3f)
                horizontalLineTo(2f)
                close()
                moveTo(9.68555f, 3.98828f)
                curveTo(11.588f, 4.08486f, 13.1013f, 5.65763f, 13.1016f, 7.58398f)
                lineTo(13.0967f, 7.76953f)
                curveTo(13.0002f, 9.67206f, 11.4264f, 11.1853f, 9.5f, 11.1855f)
                lineTo(9.31543f, 11.1807f)
                curveTo(7.47401f, 11.0875f, 5.99766f, 9.61091f, 5.9043f, 7.76953f)
                lineTo(5.89941f, 7.58398f)
                curveTo(5.89967f, 5.59555f, 7.51156f, 3.98365f, 9.5f, 3.9834f)
                lineTo(9.68555f, 3.98828f)
                close()
                moveTo(9.5f, 4.9834f)
                curveTo(8.06385f, 4.98365f, 6.89967f, 6.14783f, 6.89941f, 7.58398f)
                curveTo(6.89955f, 9.02024f, 8.06377f, 10.1853f, 9.5f, 10.1855f)
                curveTo(10.9362f, 10.1853f, 12.1014f, 9.02023f, 12.1016f, 7.58398f)
                curveTo(12.1013f, 6.14784f, 10.9361f, 4.98366f, 9.5f, 4.9834f)
                close()
                moveTo(4.75f, 4f)
                curveTo(4.88807f, 4f, 5f, 4.11193f, 5f, 4.25f)
                verticalLineTo(5.75488f)
                curveTo(4.99982f, 5.8928f, 4.88796f, 6.00488f, 4.75f, 6.00488f)
                horizontalLineTo(2.25f)
                curveTo(2.11204f, 6.00488f, 2.00018f, 5.8928f, 2f, 5.75488f)
                verticalLineTo(4.25f)
                curveTo(2f, 4.11193f, 2.11193f, 4f, 2.25f, 4f)
                horizontalLineTo(4.75f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

