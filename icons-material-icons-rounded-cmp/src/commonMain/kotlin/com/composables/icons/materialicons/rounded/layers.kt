package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
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
                moveTo(12.6f, 18.06f)
                curveToRelative(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0f)
                lineToRelative(-6.15f, -4.78f)
                curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0f)
                curveToRelative(-0.51f, 0.4f, -0.51f, 1.17f, 0f, 1.57f)
                lineToRelative(6.76f, 5.26f)
                curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0f)
                lineToRelative(6.76f, -5.26f)
                curveToRelative(0.51f, -0.4f, 0.51f, -1.17f, 0f, -1.57f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0f)
                lineToRelative(-6.15f, 4.79f)
                close()
                moveToRelative(0.63f, -3.02f)
                lineToRelative(6.76f, -5.26f)
                curveToRelative(0.51f, -0.4f, 0.51f, -1.18f, 0f, -1.58f)
                lineToRelative(-6.76f, -5.26f)
                curveToRelative(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0f)
                lineTo(4.01f, 8.21f)
                curveToRelative(-0.51f, 0.4f, -0.51f, 1.18f, 0f, 1.58f)
                lineToRelative(6.76f, 5.26f)
                curveToRelative(0.72f, 0.56f, 1.74f, 0.56f, 2.46f, -0.01f)
                close()
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null

