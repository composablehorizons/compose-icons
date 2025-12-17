package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Undo: ImageVector
    get() {
        if (_Undo != null) return _Undo!!
        
        _Undo = ImageVector.Builder(
            name = "undo",
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
                moveTo(12.5f, 8f)
                curveToRelative(-2.65f, 0f, -5.05f, 0.99f, -6.9f, 2.6f)
                lineTo(3.71f, 8.71f)
                curveTo(3.08f, 8.08f, 2f, 8.52f, 2f, 9.41f)
                verticalLineTo(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.59f)
                curveToRelative(0.89f, 0f, 1.34f, -1.08f, 0.71f, -1.71f)
                lineToRelative(-1.91f, -1.91f)
                curveToRelative(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f)
                curveToRelative(3.16f, 0f, 5.89f, 1.84f, 7.19f, 4.5f)
                curveToRelative(0.27f, 0.56f, 0.91f, 0.84f, 1.5f, 0.64f)
                curveToRelative(0.71f, -0.23f, 1.07f, -1.04f, 0.75f, -1.72f)
                curveTo(20.23f, 10.42f, 16.65f, 8f, 12.5f, 8f)
                close()
            }
        }.build()
        
        return _Undo!!
    }

private var _Undo: ImageVector? = null

