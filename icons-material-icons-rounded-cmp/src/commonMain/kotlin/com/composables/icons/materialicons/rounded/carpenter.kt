package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Carpenter: ImageVector
    get() {
        if (_Carpenter != null) return _Carpenter!!
        
        _Carpenter = ImageVector.Builder(
            name = "carpenter",
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
                moveTo(19.73f, 14.23f)
                lineTo(7.71f, 2.21f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(3.7f, 4.8f)
                curveTo(3.36f, 5.14f, 3.31f, 5.68f, 3.59f, 6.08f)
                lineToRelative(7.65f, 10.98f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                lineToRelative(4.24f, -4.24f)
                curveTo(20.51f, 16.28f, 20.51f, 15.01f, 19.73f, 14.23f)
                close()
                moveTo(14.07f, 19.88f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.07f, 19.88f)
                close()
            }
        }.build()
        
        return _Carpenter!!
    }

private var _Carpenter: ImageVector? = null

