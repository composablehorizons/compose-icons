package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Spa: ImageVector
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
                moveTo(8.55f, 12f)
                curveToRelative(-1.07f, -0.71f, -2.25f, -1.27f, -3.53f, -1.61f)
                curveToRelative(1.28f, 0.34f, 2.46f, 0.9f, 3.53f, 1.61f)
                close()
                moveToRelative(10.43f, -1.61f)
                curveToRelative(-1.29f, 0.34f, -2.49f, 0.91f, -3.57f, 1.64f)
                curveToRelative(1.08f, -0.73f, 2.28f, -1.3f, 3.57f, -1.64f)
                close()
                moveToRelative(-3.49f, -0.76f)
                curveToRelative(-0.18f, -2.79f, -1.31f, -5.51f, -3.43f, -7.63f)
                curveToRelative(-2.14f, 2.14f, -3.32f, 4.86f, -3.55f, 7.63f)
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
                curveTo(9.85f, 12.17f, 6.18f, 10f, 2f, 10f)
                curveToRelative(0f, 5.32f, 3.36f, 9.82f, 8.03f, 11.49f)
                curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f)
                curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f)
                curveTo(18.64f, 19.82f, 22f, 15.32f, 22f, 10f)
                curveToRelative(-4.18f, 0f, -7.85f, 2.17f, -10f, 5.45f)
                close()
            }
        }.build()
        
        return _Spa!!
    }

private var _Spa: ImageVector? = null

