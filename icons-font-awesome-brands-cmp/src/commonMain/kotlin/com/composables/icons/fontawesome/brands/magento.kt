package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Magento: ImageVector
    get() {
        if (_Magento != null) return _Magento!!
        
        _Magento = ImageVector.Builder(
            name = "magento",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(445.7f, 127.9f)
                verticalLineTo(384f)
                lineToRelative(-63.4f, 36.5f)
                verticalLineTo(164.7f)
                lineTo(223.8f, 73.1f)
                lineTo(65.2f, 164.7f)
                lineToRelative(0.4f, 255.9f)
                lineTo(2.3f, 384f)
                verticalLineTo(128.1f)
                lineTo(224.2f, 0f)
                lineToRelative(221.5f, 127.9f)
                close()
                moveTo(255.6f, 420.5f)
                lineTo(224f, 438.9f)
                lineToRelative(-31.8f, -18.2f)
                verticalLineToRelative(-256f)
                lineToRelative(-63.3f, 36.6f)
                lineToRelative(0.1f, 255.9f)
                lineToRelative(94.9f, 54.9f)
                lineToRelative(95.1f, -54.9f)
                verticalLineToRelative(-256f)
                lineToRelative(-63.4f, -36.6f)
                verticalLineToRelative(255.9f)
                close()
            }
        }.build()
        
        return _Magento!!
    }

private var _Magento: ImageVector? = null

