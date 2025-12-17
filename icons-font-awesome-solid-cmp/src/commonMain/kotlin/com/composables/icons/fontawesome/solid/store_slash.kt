package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StoreSlash: ImageVector
    get() {
        if (_StoreSlash != null) return _StoreSlash!!
        
        _StoreSlash = ImageVector.Builder(
            name = "store-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(121.51f, 384f)
                verticalLineTo(284.2f)
                arcToRelative(119.43f, 119.43f, 0f, false, true, -28f, 3.8f)
                arcToRelative(123.46f, 123.46f, 0f, false, true, -17.1f, -1.2f)
                arcToRelative(114.88f, 114.88f, 0f, false, true, -15.58f, -3.6f)
                verticalLineTo(480f)
                curveToRelative(0f, 17.7f, 13.59f, 32f, 30.4f, 32f)
                horizontalLineTo(505.75f)
                lineTo(348.42f, 384f)
                close()
                moveToRelative(-28f, -128.09f)
                curveToRelative(25.1f, 0f, 47.29f, -10.72f, 64f, -27.24f)
                lineTo(24f, 120.05f)
                curveToRelative(-30.52f, 53.39f, -2.45f, 126.53f, 56.49f, 135f)
                arcTo(95.68f, 95.68f, 0f, false, false, 93.48f, 255.91f)
                close()
                moveTo(602.13f, 458.09f)
                lineTo(547.2f, 413.41f)
                verticalLineTo(283.2f)
                arcToRelative(93.5f, 93.5f, 0f, false, true, -15.57f, 3.6f)
                arcToRelative(127.31f, 127.31f, 0f, false, true, -17.29f, 1.2f)
                arcToRelative(114.89f, 114.89f, 0f, false, true, -28f, -3.8f)
                verticalLineToRelative(79.68f)
                lineTo(348.52f, 251.77f)
                arcToRelative(88.06f, 88.06f, 0f, false, false, 25.41f, 4.14f)
                curveToRelative(28.11f, 0f, 53f, -13f, 70.11f, -33.11f)
                curveToRelative(17.19f, 20.11f, 42.08f, 33.11f, 70.11f, 33.11f)
                arcToRelative(94.31f, 94.31f, 0f, false, false, 13f, -0.91f)
                curveToRelative(59.66f, -8.41f, 88f, -82.8f, 56.06f, -136.4f)
                lineTo(521.55f, 15f)
                arcTo(30.1f, 30.1f, 0f, false, false, 495.81f, 0f)
                horizontalLineTo(112f)
                arcTo(30.11f, 30.11f, 0f, false, false, 86.27f, 15f)
                lineTo(76.88f, 30.78f)
                lineTo(43.19f, 3.38f)
                arcTo(14.68f, 14.68f, 0f, false, false, 21.86f, 6.19f)
                lineTo(3.2f, 31.45f)
                arcTo(16.58f, 16.58f, 0f, false, false, 5.87f, 53.91f)
                lineTo(564.81f, 508.63f)
                arcToRelative(14.69f, 14.69f, 0f, false, false, 21.33f, -2.82f)
                lineToRelative(18.66f, -25.26f)
                arcTo(16.58f, 16.58f, 0f, false, false, 602.13f, 458.09f)
                close()
            }
        }.build()
        
        return _StoreSlash!!
    }

private var _StoreSlash: ImageVector? = null

