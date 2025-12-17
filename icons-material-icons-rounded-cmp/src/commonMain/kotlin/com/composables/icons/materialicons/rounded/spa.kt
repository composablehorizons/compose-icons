package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Spa: ImageVector
    get() {
        if (_Spa != null) return _Spa!!
        
        _Spa = ImageVector.Builder(
            name = "spa",
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
                moveTo(15.49f, 9.63f)
                curveToRelative(-0.16f, -2.42f, -1.03f, -4.79f, -2.64f, -6.76f)
                curveToRelative(-0.41f, -0.5f, -1.16f, -0.5f, -1.57f, 0f)
                curveToRelative(-1.65f, 1.98f, -2.57f, 4.35f, -2.77f, 6.76f)
                curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f)
                curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f)
                close()
                moveToRelative(-6.5f, 2.65f)
                curveToRelative(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f)
                curveToRelative(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f)
                close()
                moveToRelative(6.42f, -0.25f)
                curveToRelative(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f)
                curveToRelative(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f)
                close()
                moveTo(12f, 15.45f)
                curveToRelative(-1.95f, -2.97f, -5.14f, -5.03f, -8.83f, -5.39f)
                curveToRelative(-0.64f, -0.06f, -1.17f, 0.47f, -1.11f, 1.11f)
                curveToRelative(0.45f, 4.8f, 3.65f, 8.78f, 7.98f, 10.33f)
                curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f)
                curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f)
                curveToRelative(4.33f, -1.55f, 7.53f, -5.52f, 7.98f, -10.33f)
                curveToRelative(0.06f, -0.64f, -0.48f, -1.17f, -1.11f, -1.11f)
                curveToRelative(-3.71f, 0.36f, -6.9f, 2.42f, -8.85f, 5.39f)
                close()
            }
        }.build()
        
        return _Spa!!
    }

private var _Spa: ImageVector? = null

