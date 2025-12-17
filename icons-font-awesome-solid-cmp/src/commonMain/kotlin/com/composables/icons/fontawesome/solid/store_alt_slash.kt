package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StoreAltSlash: ImageVector
    get() {
        if (_StoreAltSlash != null) return _StoreAltSlash!!
        
        _StoreAltSlash = ImageVector.Builder(
            name = "store-alt-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.89f, 123.62f)
                lineTo(5.51f, 142.2f)
                curveToRelative(-14.2f, 21.3f, 1f, 49.8f, 26.59f, 49.8f)
                horizontalLineToRelative(74.26f)
                close()
                moveTo(576f, 413.42f)
                verticalLineTo(224f)
                horizontalLineTo(512f)
                verticalLineTo(364f)
                lineTo(384f, 265f)
                verticalLineTo(224f)
                horizontalLineTo(330.92f)
                lineToRelative(-41.4f, -32f)
                horizontalLineTo(608f)
                curveToRelative(25.5f, 0f, 40.7f, -28.5f, 26.59f, -49.8f)
                lineToRelative(-85.29f, -128f)
                arcTo(32.18f, 32.18f, 0f, false, false, 522.6f, 0f)
                horizontalLineTo(117.42f)
                arcTo(31.87f, 31.87f, 0f, false, false, 90.81f, 14.2f)
                lineToRelative(-10.66f, 16f)
                lineTo(45.46f, 3.38f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.19f)
                lineTo(3.37f, 31.46f)
                arcTo(16f, 16f, 0f, false, false, 6.18f, 53.91f)
                lineTo(594.53f, 508.63f)
                arcTo(16f, 16f, 0f, false, false, 617f, 505.81f)
                lineToRelative(19.64f, -25.26f)
                arcToRelative(16f, 16f, 0f, false, false, -2.81f, -22.45f)
                close()
                moveTo(320f, 384f)
                horizontalLineTo(128f)
                verticalLineTo(224f)
                horizontalLineTo(64f)
                verticalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineTo(352f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(406.59f)
                lineToRelative(-64f, -49.47f)
                close()
            }
        }.build()
        
        return _StoreAltSlash!!
    }

private var _StoreAltSlash: ImageVector? = null

