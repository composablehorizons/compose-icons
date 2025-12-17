package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Batch_prediction: ImageVector
    get() {
        if (_Batch_prediction != null) return _Batch_prediction!!
        
        _Batch_prediction = ImageVector.Builder(
            name = "batch_prediction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 8f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(8f)
                    close()
                    moveTo(13f, 20.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(20.5f)
                    close()
                    moveTo(13f, 18f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, -1.5f, -2.5f, -3f, -2.5f, -5f)
                    curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                    curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                    curveTo(15.5f, 15f, 13f, 16.5f, 13f, 18f)
                    close()
                    moveTo(18f, 6.5f)
                    horizontalLineTo(6f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(6.5f)
                    close()
                    moveTo(17f, 3.5f)
                    horizontalLineTo(7f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(3.5f)
                    close()
                }
            }
        }.build()
        
        return _Batch_prediction!!
    }

private var _Batch_prediction: ImageVector? = null

