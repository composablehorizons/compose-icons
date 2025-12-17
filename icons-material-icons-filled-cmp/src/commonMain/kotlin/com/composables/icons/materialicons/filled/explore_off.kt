package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Explore_off: ImageVector
    get() {
        if (_Explore_off != null) return _Explore_off!!
        
        _Explore_off = ImageVector.Builder(
            name = "explore_off",
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
                moveTo(14.19f, 14.19f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.56f, -1.56f)
                lineTo(11f, 11f)
                lineTo(9.81f, 9.81f)
                lineTo(4.93f, 4.93f)
                lineTo(2.27f, 2.27f)
                lineTo(1f, 3.54f)
                lineToRelative(2.78f, 2.78f)
                curveToRelative(-0.11f, 0.16f, -0.21f, 0.32f, -0.31f, 0.48f)
                curveToRelative(-0.04f, 0.07f, -0.09f, 0.14f, -0.13f, 0.21f)
                curveToRelative(-0.09f, 0.15f, -0.17f, 0.31f, -0.25f, 0.47f)
                curveToRelative(-0.05f, 0.1f, -0.1f, 0.21f, -0.16f, 0.32f)
                curveToRelative(-0.06f, 0.14f, -0.13f, 0.28f, -0.19f, 0.43f)
                curveToRelative(-0.1f, 0.24f, -0.19f, 0.48f, -0.27f, 0.73f)
                lineToRelative(-0.09f, 0.3f)
                curveToRelative(-0.05f, 0.2f, -0.1f, 0.39f, -0.14f, 0.59f)
                curveToRelative(-0.02f, 0.11f, -0.04f, 0.22f, -0.07f, 0.33f)
                curveToRelative(-0.04f, 0.2f, -0.07f, 0.4f, -0.09f, 0.61f)
                curveToRelative(-0.01f, 0.1f, -0.03f, 0.2f, -0.03f, 0.3f)
                curveToRelative(-0.03f, 0.29f, -0.05f, 0.6f, -0.05f, 0.91f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(0.31f, 0f, 0.62f, -0.02f, 0.92f, -0.05f)
                lineToRelative(0.3f, -0.03f)
                curveToRelative(0.2f, -0.02f, 0.41f, -0.06f, 0.61f, -0.09f)
                curveToRelative(0.11f, -0.02f, 0.22f, -0.04f, 0.33f, -0.07f)
                curveToRelative(0.2f, -0.04f, 0.39f, -0.09f, 0.58f, -0.15f)
                curveToRelative(0.1f, -0.03f, 0.2f, -0.05f, 0.3f, -0.09f)
                curveToRelative(0.25f, -0.08f, 0.49f, -0.17f, 0.73f, -0.27f)
                curveToRelative(0.15f, -0.06f, 0.29f, -0.13f, 0.43f, -0.19f)
                curveToRelative(0.11f, -0.05f, 0.22f, -0.1f, 0.33f, -0.16f)
                curveToRelative(0.16f, -0.08f, 0.31f, -0.16f, 0.46f, -0.25f)
                curveToRelative(0.07f, -0.04f, 0.14f, -0.09f, 0.21f, -0.13f)
                curveToRelative(0.16f, -0.1f, 0.32f, -0.2f, 0.48f, -0.31f)
                lineTo(20.46f, 23f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-2.66f, -2.66f)
                lineToRelative(-4.88f, -4.88f)
                close()
                moveTo(6f, 18f)
                lineToRelative(3f, -6.46f)
                lineTo(12.46f, 15f)
                lineTo(6f, 18f)
                close()
                moveToRelative(16f, -6f)
                curveToRelative(0f, 0.31f, -0.02f, 0.62f, -0.05f, 0.92f)
                lineToRelative(-0.03f, 0.3f)
                curveToRelative(-0.02f, 0.2f, -0.06f, 0.41f, -0.09f, 0.61f)
                curveToRelative(-0.02f, 0.11f, -0.04f, 0.22f, -0.07f, 0.33f)
                curveToRelative(-0.04f, 0.2f, -0.09f, 0.39f, -0.15f, 0.58f)
                curveToRelative(-0.03f, 0.1f, -0.05f, 0.21f, -0.09f, 0.31f)
                curveToRelative(-0.08f, 0.25f, -0.17f, 0.49f, -0.27f, 0.73f)
                curveToRelative(-0.06f, 0.15f, -0.13f, 0.29f, -0.19f, 0.43f)
                curveToRelative(-0.05f, 0.11f, -0.1f, 0.22f, -0.16f, 0.33f)
                curveToRelative(-0.08f, 0.16f, -0.16f, 0.31f, -0.25f, 0.46f)
                curveToRelative(-0.04f, 0.07f, -0.09f, 0.14f, -0.13f, 0.21f)
                curveToRelative(-0.1f, 0.16f, -0.2f, 0.32f, -0.31f, 0.48f)
                lineTo(15f, 12.46f)
                lineTo(18f, 6f)
                lineToRelative(-6.46f, 3f)
                lineToRelative(-5.22f, -5.22f)
                curveToRelative(0.16f, -0.11f, 0.32f, -0.21f, 0.48f, -0.31f)
                curveToRelative(0.07f, -0.04f, 0.14f, -0.09f, 0.21f, -0.13f)
                curveToRelative(0.15f, -0.09f, 0.31f, -0.17f, 0.46f, -0.25f)
                curveToRelative(0.11f, -0.05f, 0.22f, -0.1f, 0.33f, -0.16f)
                curveToRelative(0.14f, -0.06f, 0.28f, -0.13f, 0.43f, -0.19f)
                curveToRelative(0.24f, -0.1f, 0.48f, -0.19f, 0.73f, -0.27f)
                lineToRelative(0.31f, -0.09f)
                curveToRelative(0.19f, -0.05f, 0.38f, -0.11f, 0.58f, -0.15f)
                curveToRelative(0.11f, -0.02f, 0.22f, -0.04f, 0.33f, -0.07f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.07f, 0.61f, -0.09f)
                curveToRelative(0.1f, -0.01f, 0.2f, -0.03f, 0.3f, -0.03f)
                curveToRelative(0.29f, -0.02f, 0.6f, -0.04f, 0.91f, -0.04f)
                curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                close()
            }
        }.build()
        
        return _Explore_off!!
    }

private var _Explore_off: ImageVector? = null

