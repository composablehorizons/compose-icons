package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Label: ImageVector
    get() {
        if (_Label != null) return _Label!!
        
        _Label = ImageVector.Builder(
            name = "label",
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
                moveTo(17.63f, 5.84f)
                curveTo(17.27f, 5.33f, 16.67f, 5f, 16f, 5f)
                lineTo(5f, 5.01f)
                curveTo(3.9f, 5.01f, 3f, 5.9f, 3f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 1.99f, 2f, 1.99f)
                lineTo(16f, 19f)
                curveToRelative(0.67f, 0f, 1.27f, -0.33f, 1.63f, -0.84f)
                lineToRelative(3.96f, -5.58f)
                curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0f, -1.16f)
                lineToRelative(-3.96f, -5.58f)
                close()
            }
        }.build()
        
        return _Label!!
    }

private var _Label: ImageVector? = null

