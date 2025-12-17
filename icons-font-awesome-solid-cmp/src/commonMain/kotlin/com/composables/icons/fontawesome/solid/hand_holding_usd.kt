package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandHoldingUsd: ImageVector
    get() {
        if (_HandHoldingUsd != null) return _HandHoldingUsd!!
        
        _HandHoldingUsd = ImageVector.Builder(
            name = "hand-holding-usd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(271.06f, 144.3f)
                lineToRelative(54.27f, 14.3f)
                arcToRelative(8.59f, 8.59f, 0f, false, true, 6.63f, 8.1f)
                curveToRelative(0f, 4.6f, -4.09f, 8.4f, -9.12f, 8.4f)
                horizontalLineToRelative(-35.6f)
                arcToRelative(30f, 30f, 0f, false, true, -11.19f, -2.2f)
                curveToRelative(-5.24f, -2.2f, -11.28f, -1.7f, -15.3f, 2f)
                lineToRelative(-19f, 17.5f)
                arcToRelative(11.68f, 11.68f, 0f, false, false, -2.25f, 2.66f)
                arcToRelative(11.42f, 11.42f, 0f, false, false, 3.88f, 15.74f)
                arcToRelative(83.77f, 83.77f, 0f, false, false, 34.51f, 11.5f)
                verticalLineTo(240f)
                curveToRelative(0f, 8.8f, 7.83f, 16f, 17.37f, 16f)
                horizontalLineToRelative(17.37f)
                curveToRelative(9.55f, 0f, 17.38f, -7.2f, 17.38f, -16f)
                verticalLineTo(222.4f)
                curveToRelative(32.93f, -3.6f, 57.84f, -31f, 53.5f, -63f)
                curveToRelative(-3.15f, -23f, -22.46f, -41.3f, -46.56f, -47.7f)
                lineTo(282.68f, 97.4f)
                arcToRelative(8.59f, 8.59f, 0f, false, true, -6.63f, -8.1f)
                curveToRelative(0f, -4.6f, 4.09f, -8.4f, 9.12f, -8.4f)
                horizontalLineToRelative(35.6f)
                arcTo(30f, 30f, 0f, false, true, 332f, 83.1f)
                curveToRelative(5.23f, 2.2f, 11.28f, 1.7f, 15.3f, -2f)
                lineToRelative(19f, -17.5f)
                arcTo(11.31f, 11.31f, 0f, false, false, 368.47f, 61f)
                arcToRelative(11.43f, 11.43f, 0f, false, false, -3.84f, -15.78f)
                arcToRelative(83.82f, 83.82f, 0f, false, false, -34.52f, -11.5f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.82f, -16f, -17.37f, -16f)
                horizontalLineTo(295.37f)
                curveTo(285.82f, 0f, 278f, 7.2f, 278f, 16f)
                verticalLineTo(33.6f)
                curveToRelative(-32.89f, 3.6f, -57.85f, 31f, -53.51f, 63f)
                curveTo(227.63f, 119.6f, 247f, 137.9f, 271.06f, 144.3f)
                close()
                moveTo(565.27f, 328.1f)
                curveToRelative(-11.8f, -10.7f, -30.2f, -10f, -42.6f, 0f)
                lineTo(430.27f, 402f)
                arcToRelative(63.64f, 63.64f, 0f, false, true, -40f, 14f)
                horizontalLineTo(272f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, -32f)
                horizontalLineToRelative(78.29f)
                curveToRelative(15.9f, 0f, 30.71f, -10.9f, 33.25f, -26.6f)
                arcToRelative(31.2f, 31.2f, 0f, false, false, 0.46f, -5.46f)
                arcTo(32f, 32f, 0f, false, false, 352f, 320f)
                horizontalLineTo(192f)
                arcToRelative(117.66f, 117.66f, 0f, false, false, -74.1f, 26.29f)
                lineTo(71.4f, 384f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 400f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineTo(372.77f)
                arcToRelative(64f, 64f, 0f, false, false, 40f, -14f)
                lineTo(564f, 377f)
                arcToRelative(32f, 32f, 0f, false, false, 1.28f, -48.9f)
                close()
            }
        }.build()
        
        return _HandHoldingUsd!!
    }

private var _HandHoldingUsd: ImageVector? = null

