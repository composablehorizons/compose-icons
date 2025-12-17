package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Label_off: ImageVector
    get() {
        if (_Label_off != null) return _Label_off!!
        
        _Label_off = ImageVector.Builder(
            name = "label_off",
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
                moveTo(21.59f, 12.58f)
                curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0f, -1.16f)
                lineToRelative(-3.96f, -5.58f)
                curveTo(17.27f, 5.33f, 16.67f, 5f, 16f, 5f)
                horizontalLineTo(8.66f)
                lineToRelative(10.7f, 10.73f)
                lineToRelative(2.23f, -3.15f)
                close()
                moveTo(2.72f, 4.72f)
                lineToRelative(0.87f, 0.87f)
                curveTo(3.23f, 5.95f, 3f, 6.45f, 3f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(4.14f, 3.31f)
                curveToRelative(-0.38f, -0.38f, -1.01f, -0.39f, -1.4f, -0.01f)
                curveToRelative(-0.41f, 0.38f, -0.41f, 1.03f, -0.02f, 1.42f)
                close()
            }
        }.build()
        
        return _Label_off!!
    }

private var _Label_off: ImageVector? = null

