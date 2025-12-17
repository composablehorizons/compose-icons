package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Thumbs_up_down: ImageVector
    get() {
        if (_Thumbs_up_down != null) return _Thumbs_up_down!!
        
        _Thumbs_up_down = ImageVector.Builder(
            name = "thumbs_up_down",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.06f, 5f)
                horizontalLineTo(5.82f)
                lineToRelative(0.66f, -3.18f)
                curveToRelative(0.08f, -0.37f, -0.04f, -0.75f, -0.3f, -1.02f)
                curveTo(5.74f, 0.36f, 5.03f, 0.36f, 4.6f, 0.8f)
                lineToRelative(-4f, 4f)
                curveToRelative(-0.39f, 0.37f, -0.6f, 0.88f, -0.6f, 1.41f)
                verticalLineTo(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5.92f)
                curveToRelative(0.8f, 0f, 1.52f, -0.48f, 1.84f, -1.21f)
                lineToRelative(2.14f, -5f)
                curveTo(12.46f, 6.47f, 11.49f, 5f, 10.06f, 5f)
                close()
                moveTo(22f, 10f)
                horizontalLineToRelative(-5.92f)
                curveToRelative(-0.8f, 0f, -1.52f, 0.48f, -1.84f, 1.21f)
                lineToRelative(-2.14f, 5f)
                curveToRelative(-0.56f, 1.32f, 0.4f, 2.79f, 1.84f, 2.79f)
                horizontalLineToRelative(4.24f)
                lineToRelative(-0.66f, 3.18f)
                curveToRelative(-0.08f, 0.37f, 0.04f, 0.75f, 0.3f, 1.02f)
                curveToRelative(0.44f, 0.44f, 1.15f, 0.44f, 1.58f, 0f)
                lineToRelative(4f, -4f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f)
                verticalLineTo(12f)
                curveToRelative(0.01f, -1.1f, -0.89f, -2f, -1.99f, -2f)
                close()
            }
        }.build()
        
        return _Thumbs_up_down!!
    }

private var _Thumbs_up_down: ImageVector? = null

