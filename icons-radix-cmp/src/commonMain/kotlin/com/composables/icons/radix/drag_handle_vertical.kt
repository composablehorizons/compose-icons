package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DragHandleVertical: ImageVector
    get() {
        if (_DragHandleVertical != null) return _DragHandleVertical!!
        
        _DragHandleVertical = ImageVector.Builder(
            name = "drag-handle-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.1088f, 2.41855f)
                curveTo(10.1464f, 2.23674f, 10.3074f, 2.09921f, 10.5004f, 2.09921f)
                curveTo(10.6932f, 2.0994f, 10.8544f, 2.23678f, 10.892f, 2.41855f)
                lineTo(10.9008f, 2.4996f)
                lineTo(10.9008f, 12.4996f)
                curveTo(10.9008f, 12.7204f, 10.7211f, 12.8998f, 10.5004f, 12.9f)
                curveTo(10.2795f, 12.9f, 10.1f, 12.7205f, 10.1f, 12.4996f)
                lineTo(10.1f, 2.4996f)
                lineTo(10.1088f, 2.41855f)
                close()
                moveTo(8.10876f, 2.41855f)
                curveTo(8.14642f, 2.23674f, 8.30739f, 2.09921f, 8.50037f, 2.09921f)
                curveTo(8.69322f, 2.0994f, 8.8544f, 2.23678f, 8.89197f, 2.41855f)
                lineTo(8.90076f, 2.4996f)
                lineTo(8.90076f, 12.4996f)
                curveTo(8.90076f, 12.7204f, 8.7211f, 12.8998f, 8.50037f, 12.9f)
                curveTo(8.27945f, 12.9f, 8.09998f, 12.7205f, 8.09998f, 12.4996f)
                lineTo(8.09998f, 2.4996f)
                lineTo(8.10876f, 2.41855f)
                close()
                moveTo(6.10876f, 2.41855f)
                curveTo(6.14642f, 2.23674f, 6.30739f, 2.09921f, 6.50037f, 2.09921f)
                curveTo(6.69322f, 2.0994f, 6.8544f, 2.23678f, 6.89197f, 2.41855f)
                lineTo(6.90076f, 2.4996f)
                lineTo(6.90076f, 12.4996f)
                curveTo(6.90076f, 12.7204f, 6.7211f, 12.8998f, 6.50037f, 12.9f)
                curveTo(6.27945f, 12.9f, 6.09998f, 12.7205f, 6.09998f, 12.4996f)
                lineTo(6.09998f, 2.4996f)
                lineTo(6.10876f, 2.41855f)
                close()
                moveTo(4.10876f, 2.41855f)
                curveTo(4.14642f, 2.23674f, 4.30739f, 2.09921f, 4.50037f, 2.09921f)
                curveTo(4.69322f, 2.0994f, 4.8544f, 2.23678f, 4.89197f, 2.41855f)
                lineTo(4.90076f, 2.4996f)
                lineTo(4.90076f, 12.4996f)
                curveTo(4.90076f, 12.7204f, 4.7211f, 12.8998f, 4.50037f, 12.9f)
                curveTo(4.27945f, 12.9f, 4.09998f, 12.7205f, 4.09998f, 12.4996f)
                lineTo(4.09998f, 2.4996f)
                lineTo(4.10876f, 2.41855f)
                close()
            }
        }.build()
        
        return _DragHandleVertical!!
    }

private var _DragHandleVertical: ImageVector? = null

