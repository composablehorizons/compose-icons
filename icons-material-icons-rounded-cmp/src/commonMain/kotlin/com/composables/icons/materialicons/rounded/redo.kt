package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Redo: ImageVector
    get() {
        if (_Redo != null) return _Redo!!
        
        _Redo = ImageVector.Builder(
            name = "redo",
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
                moveTo(18.4f, 10.6f)
                curveTo(16.55f, 8.99f, 14.15f, 8f, 11.5f, 8f)
                curveToRelative(-4.16f, 0f, -7.74f, 2.42f, -9.44f, 5.93f)
                curveToRelative(-0.32f, 0.67f, 0.04f, 1.47f, 0.75f, 1.71f)
                curveToRelative(0.59f, 0.2f, 1.23f, -0.08f, 1.5f, -0.64f)
                curveToRelative(1.3f, -2.66f, 4.03f, -4.5f, 7.19f, -4.5f)
                curveToRelative(1.95f, 0f, 3.73f, 0.72f, 5.12f, 1.88f)
                lineToRelative(-1.91f, 1.91f)
                curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(9.41f)
                curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineToRelative(-1.89f, 1.9f)
                close()
            }
        }.build()
        
        return _Redo!!
    }

private var _Redo: ImageVector? = null

