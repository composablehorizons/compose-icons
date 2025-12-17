package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Layers_clear: ImageVector
    get() {
        if (_Layers_clear != null) return _Layers_clear!!
        
        _Layers_clear = ImageVector.Builder(
            name = "layers_clear",
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
                moveTo(19.99f, 9.79f)
                curveToRelative(0.51f, -0.4f, 0.51f, -1.18f, 0f, -1.58f)
                lineToRelative(-6.76f, -5.26f)
                curveToRelative(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0f)
                lineTo(9.41f, 4.02f)
                lineToRelative(7.88f, 7.88f)
                lineToRelative(2.7f, -2.11f)
                close()
                moveToRelative(0f, 3.49f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0f)
                lineToRelative(-0.05f, 0.04f)
                lineToRelative(1.4f, 1.4f)
                curveToRelative(0.37f, -0.41f, 0.34f, -1.07f, -0.12f, -1.43f)
                close()
                moveToRelative(1.45f, 5.6f)
                lineTo(4.12f, 1.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(-2.22f, 1.72f)
                curveToRelative(-0.51f, 0.4f, -0.51f, 1.18f, 0f, 1.58f)
                lineToRelative(6.76f, 5.26f)
                curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0f)
                lineToRelative(0.87f, -0.68f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(-2.92f, 2.27f)
                curveToRelative(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0f)
                lineToRelative(-6.15f, -4.78f)
                curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0f)
                curveToRelative(-0.51f, 0.4f, -0.51f, 1.17f, 0f, 1.57f)
                lineToRelative(6.76f, 5.26f)
                curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0f)
                lineToRelative(3.72f, -2.89f)
                lineToRelative(3.07f, 3.07f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.41f, -0.39f, 0.41f, -1.02f, 0.02f, -1.41f)
                close()
            }
        }.build()
        
        return _Layers_clear!!
    }

private var _Layers_clear: ImageVector? = null

