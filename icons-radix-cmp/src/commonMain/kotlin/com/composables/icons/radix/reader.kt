package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Reader: ImageVector
    get() {
        if (_Reader != null) return _Reader!!
        
        _Reader = ImageVector.Builder(
            name = "reader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.7998f, 1f)
                curveTo(11.1175f, 1f, 11.3914f, 0.999318f, 11.6143f, 1.02051f)
                curveTo(11.8445f, 1.04243f, 12.0723f, 1.09085f, 12.2842f, 1.22071f)
                lineTo(12.4287f, 1.32227f)
                curveTo(12.5674f, 1.43161f, 12.6865f, 1.56449f, 12.7793f, 1.71582f)
                lineTo(12.8623f, 1.87793f)
                curveTo(12.9317f, 2.04202f, 12.9631f, 2.21314f, 12.9795f, 2.38574f)
                curveTo(13.0007f, 2.60863f, 13f, 2.88254f, 13f, 3.2002f)
                verticalLineTo(11.7998f)
                curveTo(13f, 12.1175f, 13.0007f, 12.3914f, 12.9795f, 12.6143f)
                curveTo(12.9631f, 12.7869f, 12.9317f, 12.958f, 12.8623f, 13.1221f)
                lineTo(12.7793f, 13.2842f)
                curveTo(12.6865f, 13.4355f, 12.5674f, 13.5684f, 12.4287f, 13.6777f)
                lineTo(12.2842f, 13.7793f)
                curveTo(12.0723f, 13.9092f, 11.8445f, 13.9576f, 11.6143f, 13.9795f)
                curveTo(11.3914f, 14.0007f, 11.1175f, 14f, 10.7998f, 14f)
                horizontalLineTo(4.2002f)
                curveTo(3.88254f, 14f, 3.60863f, 14.0007f, 3.38574f, 13.9795f)
                curveTo(3.21314f, 13.9631f, 3.04202f, 13.9317f, 2.87793f, 13.8623f)
                lineTo(2.71582f, 13.7793f)
                curveTo(2.56449f, 13.6865f, 2.43161f, 13.5674f, 2.32227f, 13.4287f)
                lineTo(2.22071f, 13.2842f)
                curveTo(2.09085f, 13.0723f, 2.04243f, 12.8445f, 2.02051f, 12.6143f)
                curveTo(1.99932f, 12.3914f, 2f, 12.1175f, 2f, 11.7998f)
                verticalLineTo(3.2002f)
                curveTo(2f, 2.88254f, 1.99932f, 2.60863f, 2.02051f, 2.38574f)
                curveTo(2.04243f, 2.15553f, 2.09085f, 1.92772f, 2.22071f, 1.71582f)
                lineTo(2.32227f, 1.57129f)
                curveTo(2.43161f, 1.43264f, 2.56449f, 1.31347f, 2.71582f, 1.22071f)
                lineTo(2.87793f, 1.1377f)
                curveTo(3.04202f, 1.06828f, 3.21314f, 1.03694f, 3.38574f, 1.02051f)
                curveTo(3.60863f, 0.999318f, 3.88254f, 1f, 4.2002f, 1f)
                horizontalLineTo(10.7998f)
                close()
                moveTo(4.2002f, 2f)
                curveTo(3.86317f, 2f, 3.64504f, 2.00096f, 3.48047f, 2.0166f)
                curveTo(3.4021f, 2.02407f, 3.34877f, 2.03364f, 3.31153f, 2.04395f)
                lineTo(3.23828f, 2.07324f)
                curveTo(3.2047f, 2.09384f, 3.17415f, 2.11882f, 3.14649f, 2.14649f)
                lineTo(3.07324f, 2.23828f)
                curveTo(3.05581f, 2.26673f, 3.03155f, 2.32358f, 3.0166f, 2.48047f)
                curveTo(3.00096f, 2.64504f, 3f, 2.86317f, 3f, 3.2002f)
                verticalLineTo(11.7998f)
                curveTo(3f, 12.1368f, 3.00096f, 12.355f, 3.0166f, 12.5195f)
                curveTo(3.03155f, 12.6764f, 3.05581f, 12.7333f, 3.07324f, 12.7617f)
                lineTo(3.14649f, 12.8535f)
                curveTo(3.17415f, 12.8812f, 3.2047f, 12.9062f, 3.23828f, 12.9268f)
                lineTo(3.31153f, 12.9561f)
                curveTo(3.34877f, 12.9664f, 3.4021f, 12.9759f, 3.48047f, 12.9834f)
                curveTo(3.64504f, 12.999f, 3.86317f, 13f, 4.2002f, 13f)
                horizontalLineTo(10.7998f)
                curveTo(11.1368f, 13f, 11.355f, 12.999f, 11.5195f, 12.9834f)
                curveTo(11.6764f, 12.9685f, 11.7333f, 12.9442f, 11.7617f, 12.9268f)
                lineTo(11.8535f, 12.8535f)
                curveTo(11.8812f, 12.8259f, 11.9062f, 12.7953f, 11.9268f, 12.7617f)
                lineTo(11.9561f, 12.6885f)
                curveTo(11.9664f, 12.6512f, 11.9759f, 12.5979f, 11.9834f, 12.5195f)
                curveTo(11.999f, 12.355f, 12f, 12.1368f, 12f, 11.7998f)
                verticalLineTo(3.2002f)
                curveTo(12f, 2.86317f, 11.999f, 2.64504f, 11.9834f, 2.48047f)
                curveTo(11.9759f, 2.4021f, 11.9664f, 2.34877f, 11.9561f, 2.31153f)
                lineTo(11.9268f, 2.23828f)
                curveTo(11.9062f, 2.2047f, 11.8812f, 2.17415f, 11.8535f, 2.14649f)
                lineTo(11.7617f, 2.07324f)
                curveTo(11.7333f, 2.05581f, 11.6764f, 2.03155f, 11.5195f, 2.0166f)
                curveTo(11.355f, 2.00096f, 11.1368f, 2f, 10.7998f, 2f)
                horizontalLineTo(4.2002f)
                close()
                moveTo(8f, 10f)
                curveTo(8.27614f, 10f, 8.5f, 10.2239f, 8.5f, 10.5f)
                curveTo(8.5f, 10.7761f, 8.27614f, 11f, 8f, 11f)
                horizontalLineTo(5f)
                curveTo(4.72386f, 11f, 4.5f, 10.7761f, 4.5f, 10.5f)
                curveTo(4.5f, 10.2239f, 4.72386f, 10f, 5f, 10f)
                horizontalLineTo(8f)
                close()
                moveTo(10f, 7f)
                curveTo(10.2761f, 7f, 10.5f, 7.22386f, 10.5f, 7.5f)
                curveTo(10.5f, 7.77614f, 10.2761f, 8f, 10f, 8f)
                horizontalLineTo(5f)
                curveTo(4.72386f, 8f, 4.5f, 7.77614f, 4.5f, 7.5f)
                curveTo(4.5f, 7.22386f, 4.72386f, 7f, 5f, 7f)
                horizontalLineTo(10f)
                close()
                moveTo(10.1006f, 4.00977f)
                curveTo(10.3286f, 4.05629f, 10.5f, 4.25829f, 10.5f, 4.5f)
                curveTo(10.5f, 4.74172f, 10.3286f, 4.94371f, 10.1006f, 4.99024f)
                lineTo(10f, 5f)
                horizontalLineTo(5f)
                curveTo(4.72386f, 5f, 4.5f, 4.77614f, 4.5f, 4.5f)
                curveTo(4.5f, 4.22386f, 4.72386f, 4f, 5f, 4f)
                horizontalLineTo(10f)
                lineTo(10.1006f, 4.00977f)
                close()
            }
        }.build()
        
        return _Reader!!
    }

private var _Reader: ImageVector? = null

