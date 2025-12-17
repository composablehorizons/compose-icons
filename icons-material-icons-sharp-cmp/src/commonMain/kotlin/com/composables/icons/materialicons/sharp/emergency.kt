package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Emergency: ImageVector
    get() {
        if (_Emergency != null) return _Emergency!!
        
        _Emergency = ImageVector.Builder(
            name = "emergency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(20.79f, 9.23f)
                lineTo(18.79f, 5.77f)
                lineTo(14f, 8.54f)
                lineTo(14f, 3f)
                lineTo(10f, 3f)
                lineTo(10f, 8.54f)
                lineTo(5.21f, 5.77f)
                lineTo(3.21f, 9.23f)
                lineTo(8f, 12f)
                lineTo(3.21f, 14.77f)
                lineTo(5.21f, 18.23f)
                lineTo(10f, 15.46f)
                lineTo(10f, 21f)
                lineTo(14f, 21f)
                lineTo(14f, 15.46f)
                lineTo(18.79f, 18.23f)
                lineTo(20.79f, 14.77f)
                lineTo(16f, 12f)
                close()
            }
        }.build()
        
        return _Emergency!!
    }

private var _Emergency: ImageVector? = null

