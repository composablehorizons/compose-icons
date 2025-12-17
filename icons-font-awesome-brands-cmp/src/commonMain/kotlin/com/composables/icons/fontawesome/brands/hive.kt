package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Hive: ImageVector
    get() {
        if (_Hive != null) return _Hive!!
        
        _Hive = ImageVector.Builder(
            name = "hive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260.353f, 254.878f)
                lineTo(131.538f, 33.1f)
                arcToRelative(2.208f, 2.208f, 0f, false, false, -3.829f, 0.009f)
                lineTo(0.3f, 254.887f)
                arcTo(2.234f, 2.234f, 0f, false, false, 0.3f, 257.122f)
                lineTo(129.116f, 478.9f)
                arcToRelative(2.208f, 2.208f, 0f, false, false, 3.83f, -0.009f)
                lineTo(260.358f, 257.113f)
                arcTo(2.239f, 2.239f, 0f, false, false, 260.353f, 254.878f)
                close()
                moveToRelative(39.078f, -25.713f)
                arcToRelative(2.19f, 2.19f, 0f, false, false, 1.9f, 1.111f)
                horizontalLineToRelative(66.509f)
                arcToRelative(2.226f, 2.226f, 0f, false, false, 1.9f, -3.341f)
                lineTo(259.115f, 33.111f)
                arcToRelative(2.187f, 2.187f, 0f, false, false, -1.9f, -1.111f)
                horizontalLineTo(190.707f)
                arcToRelative(2.226f, 2.226f, 0f, false, false, -1.9f, 3.341f)
                close()
                moveTo(511.7f, 254.886f)
                lineTo(384.9f, 33.112f)
                arcTo(2.2f, 2.2f, 0f, false, false, 382.99f, 32f)
                horizontalLineToRelative(-66.6f)
                arcToRelative(2.226f, 2.226f, 0f, false, false, -1.906f, 3.34f)
                lineTo(440.652f, 256f)
                lineTo(314.481f, 476.66f)
                arcToRelative(2.226f, 2.226f, 0f, false, false, 1.906f, 3.34f)
                horizontalLineToRelative(66.6f)
                arcToRelative(2.2f, 2.2f, 0f, false, false, 1.906f, -1.112f)
                lineTo(511.7f, 257.114f)
                arcTo(2.243f, 2.243f, 0f, false, false, 511.7f, 254.886f)
                close()
                moveTo(366.016f, 284.917f)
                horizontalLineTo(299.508f)
                arcToRelative(2.187f, 2.187f, 0f, false, false, -1.9f, 1.111f)
                lineToRelative(-108.8f, 190.631f)
                arcToRelative(2.226f, 2.226f, 0f, false, false, 1.9f, 3.341f)
                horizontalLineToRelative(66.509f)
                arcToRelative(2.187f, 2.187f, 0f, false, false, 1.9f, -1.111f)
                lineToRelative(108.8f, -190.631f)
                arcTo(2.226f, 2.226f, 0f, false, false, 366.016f, 284.917f)
                close()
            }
        }.build()
        
        return _Hive!!
    }

private var _Hive: ImageVector? = null

