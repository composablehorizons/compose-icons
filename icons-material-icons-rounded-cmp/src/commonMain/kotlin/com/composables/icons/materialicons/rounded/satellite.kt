package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Satellite: ImageVector
    get() {
        if (_Satellite != null) return _Satellite!!
        
        _Satellite = ImageVector.Builder(
            name = "satellite",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                verticalLineTo(5f)
                close()
                moveToRelative(0f, 5.91f)
                curveToRelative(0f, -0.49f, 0.36f, -0.9f, 0.85f, -0.98f)
                curveToRelative(2.08f, -0.36f, 3.72f, -2f, 4.08f, -4.08f)
                curveToRelative(0.08f, -0.49f, 0.49f, -0.85f, 0.98f, -0.85f)
                curveToRelative(0.61f, 0f, 1.09f, 0.53f, 1f, 1.13f)
                curveToRelative(-0.48f, 2.96f, -2.81f, 5.3f, -5.77f, 5.78f)
                curveToRelative(-0.6f, 0.1f, -1.14f, -0.39f, -1.14f, -1f)
                close()
                moveToRelative(0.63f, 6.28f)
                lineToRelative(2.49f, -3.2f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f)
                lineToRelative(2.1f, 2.53f)
                lineToRelative(3.1f, -3.99f)
                curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0.01f)
                lineToRelative(3.51f, 4.68f)
                curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                horizontalLineTo(6.02f)
                curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f)
                close()
            }
        }.build()
        
        return _Satellite!!
    }

private var _Satellite: ImageVector? = null

