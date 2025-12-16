package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DragHandleHorizontal: ImageVector
    get() {
        if (_DragHandleHorizontal != null) return _DragHandleHorizontal!!
        
        _DragHandleHorizontal = ImageVector.Builder(
            name = "drag-handle-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5814f, 10.1088f)
                curveTo(12.7632f, 10.1465f, 12.9008f, 10.3074f, 12.9008f, 10.5004f)
                curveTo(12.9006f, 10.6932f, 12.7632f, 10.8544f, 12.5814f, 10.892f)
                lineTo(12.5004f, 10.9008f)
                horizontalLineTo(2.50037f)
                curveTo(2.27958f, 10.9008f, 2.10019f, 10.7211f, 2.09998f, 10.5004f)
                curveTo(2.09998f, 10.2795f, 2.27945f, 10.1f, 2.50037f, 10.1f)
                horizontalLineTo(12.5004f)
                lineTo(12.5814f, 10.1088f)
                close()
                moveTo(12.5814f, 8.1088f)
                curveTo(12.7632f, 8.14645f, 12.9008f, 8.30743f, 12.9008f, 8.5004f)
                curveTo(12.9006f, 8.69325f, 12.7632f, 8.85443f, 12.5814f, 8.892f)
                lineTo(12.5004f, 8.90079f)
                horizontalLineTo(2.50037f)
                curveTo(2.27958f, 8.90079f, 2.10019f, 8.72113f, 2.09998f, 8.5004f)
                curveTo(2.09998f, 8.27948f, 2.27945f, 8.10001f, 2.50037f, 8.10001f)
                horizontalLineTo(12.5004f)
                lineTo(12.5814f, 8.1088f)
                close()
                moveTo(12.5814f, 6.1088f)
                curveTo(12.7632f, 6.14645f, 12.9008f, 6.30743f, 12.9008f, 6.5004f)
                curveTo(12.9006f, 6.69325f, 12.7632f, 6.85443f, 12.5814f, 6.892f)
                lineTo(12.5004f, 6.90079f)
                horizontalLineTo(2.50037f)
                curveTo(2.27958f, 6.90079f, 2.10019f, 6.72113f, 2.09998f, 6.5004f)
                curveTo(2.09998f, 6.27948f, 2.27945f, 6.10001f, 2.50037f, 6.10001f)
                horizontalLineTo(12.5004f)
                lineTo(12.5814f, 6.1088f)
                close()
                moveTo(12.5814f, 4.1088f)
                curveTo(12.7632f, 4.14645f, 12.9008f, 4.30743f, 12.9008f, 4.5004f)
                curveTo(12.9006f, 4.69325f, 12.7632f, 4.85443f, 12.5814f, 4.892f)
                lineTo(12.5004f, 4.90079f)
                horizontalLineTo(2.50037f)
                curveTo(2.27958f, 4.90079f, 2.10019f, 4.72113f, 2.09998f, 4.5004f)
                curveTo(2.09998f, 4.27948f, 2.27945f, 4.10001f, 2.50037f, 4.10001f)
                horizontalLineTo(12.5004f)
                lineTo(12.5814f, 4.1088f)
                close()
            }
        }.build()
        
        return _DragHandleHorizontal!!
    }

private var _DragHandleHorizontal: ImageVector? = null

