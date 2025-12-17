package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandsWash: ImageVector
    get() {
        if (_HandsWash != null) return _HandsWash!!
        
        _HandsWash = ImageVector.Builder(
            name = "hands-wash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 224f)
                arcToRelative(48f, 48f, 0f, true, false, -48f, -48f)
                arcTo(48f, 48f, 0f, false, false, 496f, 224f)
                close()
                moveTo(311.47f, 178.45f)
                arcTo(56.77f, 56.77f, 0f, false, true, 328f, 176f)
                arcToRelative(56f, 56f, 0f, false, true, 19f, 3.49f)
                lineToRelative(15.35f, -48.61f)
                arcTo(24f, 24f, 0f, false, false, 342f, 99.74f)
                curveToRelative(-11.53f, -1.35f, -22.21f, 6.44f, -25.71f, 17.51f)
                lineToRelative(-20.9f, 66.17f)
                close()
                moveTo(93.65f, 386.33f)
                curveToRelative(0.8f, -0.19f, 1.54f, -0.54f, 2.35f, -0.71f)
                verticalLineTo(359.93f)
                arcToRelative(156f, 156f, 0f, false, true, 107.06f, -148f)
                lineToRelative(73.7f, -22.76f)
                lineTo(310.92f, 81.05f)
                arcToRelative(24f, 24f, 0f, false, false, -20.33f, -31.11f)
                curveToRelative(-11.53f, -1.34f, -22.22f, 6.45f, -25.72f, 17.52f)
                lineTo(231.42f, 173.88f)
                arcToRelative(8f, 8f, 0f, false, true, -15.26f, -4.83f)
                lineTo(259.53f, 31.26f)
                arcTo(24f, 24f, 0f, false, false, 239.2f, 0.15f)
                curveTo(227.67f, -1.19f, 217f, 6.6f, 213.49f, 17.66f)
                lineTo(165.56f, 169.37f)
                arcToRelative(8f, 8f, 0f, true, true, -15.26f, -4.82f)
                lineToRelative(38.56f, -122f)
                arcToRelative(24f, 24f, 0f, false, false, -20.33f, -31.11f)
                curveTo(157f, 10f, 146.32f, 17.83f, 142.82f, 28.9f)
                lineToRelative(-60f, 189.85f)
                lineTo(80.76f, 168.7f)
                arcTo(24f, 24f, 0f, false, false, 56.9f, 144.55f)
                curveToRelative(-13.23f, -0.05f, -24.72f, 10.54f, -24.9f, 23.86f)
                verticalLineTo(281.14f)
                arcTo(123.69f, 123.69f, 0f, false, false, 93.65f, 386.33f)
                close()
                moveTo(519.1f, 336f)
                horizontalLineTo(360f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, -16f)
                horizontalLineTo(488f)
                arcToRelative(24f, 24f, 0f, false, false, 23.54f, -28.76f)
                curveTo(509.35f, 279.84f, 498.71f, 272f, 487.1f, 272f)
                horizontalLineTo(288f)
                lineToRelative(47.09f, -17.06f)
                arcToRelative(24f, 24f, 0f, false, false, -14.18f, -45.88f)
                lineTo(213.19f, 242.31f)
                arcTo(123.88f, 123.88f, 0f, false, false, 128f, 360f)
                verticalLineToRelative(25.65f)
                arcToRelative(79.78f, 79.78f, 0f, false, true, 58f, 108.63f)
                arcTo(118.9f, 118.9f, 0f, false, false, 248f, 512f)
                horizontalLineTo(456f)
                arcToRelative(24f, 24f, 0f, false, false, 23.54f, -28.76f)
                curveTo(477.35f, 471.84f, 466.71f, 464f, 455.1f, 464f)
                horizontalLineTo(360f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, -16f)
                horizontalLineTo(488f)
                arcToRelative(24f, 24f, 0f, false, false, 23.54f, -28.76f)
                curveTo(509.35f, 407.84f, 498.71f, 400f, 487.1f, 400f)
                horizontalLineTo(360f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, -16f)
                horizontalLineTo(520f)
                arcToRelative(24f, 24f, 0f, false, false, 23.54f, -28.76f)
                curveTo(541.35f, 343.84f, 530.71f, 336f, 519.1f, 336f)
                close()
                moveTo(416f, 64f)
                arcToRelative(32f, 32f, 0f, true, false, -32f, -32f)
                arcTo(32f, 32f, 0f, false, false, 416f, 64f)
                close()
                moveTo(112f, 416f)
                arcToRelative(48f, 48f, 0f, true, false, 48f, 48f)
                arcTo(48f, 48f, 0f, false, false, 112f, 416f)
                close()
            }
        }.build()
        
        return _HandsWash!!
    }

private var _HandsWash: ImageVector? = null

