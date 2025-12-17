package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_cellular_null: ImageVector
    get() {
        if (_Signal_cellular_null != null) return _Signal_cellular_null!!
        
        _Signal_cellular_null = ImageVector.Builder(
            name = "signal_cellular_null",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 6.83f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(6.83f)
                lineTo(20f, 6.83f)
                moveToRelative(0.29f, -3.12f)
                lineTo(3.71f, 20.29f)
                curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f)
                horizontalLineTo(20f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4.41f)
                curveToRelative(0f, -0.89f, -1.08f, -1.33f, -1.71f, -0.7f)
                close()
            }
        }.build()
        
        return _Signal_cellular_null!!
    }

private var _Signal_cellular_null: ImageVector? = null

