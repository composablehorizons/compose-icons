package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Spa: ImageVector
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.94f, 12.25f)
                curveToRelative(0f, -0.01f, 0f, -0.01f, 0f, 0f)
                curveToRelative(-0.13f, -0.09f, -0.27f, -0.17f, -0.4f, -0.26f)
                curveToRelative(0.13f, 0.1f, 0.27f, 0.17f, 0.4f, 0.26f)
                close()
                moveToRelative(4.41f, -3.67f)
                curveToRelative(-0.22f, -1.21f, -0.66f, -2.35f, -1.3f, -3.38f)
                curveToRelative(-0.66f, 1.04f, -1.12f, 2.19f, -1.37f, 3.39f)
                curveToRelative(0.46f, 0.3f, 0.9f, 0.62f, 1.33f, 0.97f)
                curveToRelative(0.42f, -0.35f, 0.87f, -0.68f, 1.34f, -0.98f)
                close()
                moveToRelative(3.19f, 5.08f)
                lineToRelative(0.01f, 0.02f)
                curveToRelative(-0.09f, 0.06f, -0.18f, 0.12f, -0.27f, 0.17f)
                lineToRelative(-0.07f, 0.05f)
                curveToRelative(-0.98f, 0.71f, -1.84f, 1.61f, -2.53f, 2.66f)
                lineTo(12f, 19.1f)
                lineToRelative(-1.67f, -2.55f)
                curveToRelative(-0.68f, -1.03f, -1.52f, -1.92f, -2.51f, -2.65f)
                lineToRelative(-0.07f, -0.04f)
                curveToRelative(-0.13f, -0.08f, -0.26f, -0.16f, -0.39f, -0.25f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(-0.96f, -0.63f, -2.01f, -1.07f, -3.12f, -1.33f)
                curveToRelative(0.75f, 3.36f, 3.16f, 6.17f, 6.45f, 7.35f)
                curveToRelative(0.42f, 0.15f, 0.84f, 0.27f, 1.28f, 0.36f)
                curveToRelative(0.45f, -0.09f, 0.89f, -0.21f, 1.33f, -0.37f)
                curveToRelative(3.27f, -1.17f, 5.67f, -3.98f, 6.43f, -7.34f)
                curveToRelative(-1.14f, 0.26f, -2.23f, 0.73f, -3.2f, 1.39f)
                close()
                moveToRelative(-7.55f, -1.38f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 15.45f)
                curveToRelative(-0.82f, -1.25f, -1.86f, -2.34f, -3.06f, -3.2f)
                curveToRelative(-0.13f, -0.09f, -0.27f, -0.16f, -0.4f, -0.26f)
                curveToRelative(0.13f, 0.09f, 0.27f, 0.17f, 0.39f, 0.25f)
                curveTo(6.98f, 10.83f, 4.59f, 10f, 2f, 10f)
                curveToRelative(0f, 5.32f, 3.36f, 9.82f, 8.03f, 11.49f)
                curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f)
                curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f)
                curveTo(18.64f, 19.82f, 22f, 15.32f, 22f, 10f)
                curveToRelative(-4.18f, 0f, -7.85f, 2.17f, -10f, 5.45f)
                close()
                moveToRelative(1.32f, 4.15f)
                curveToRelative(-0.44f, 0.15f, -0.88f, 0.27f, -1.33f, 0.37f)
                curveToRelative(-0.44f, -0.09f, -0.87f, -0.21f, -1.28f, -0.36f)
                curveToRelative(-3.29f, -1.18f, -5.7f, -3.99f, -6.45f, -7.35f)
                curveToRelative(1.1f, 0.26f, 2.15f, 0.71f, 3.12f, 1.33f)
                lineToRelative(-0.02f, 0.01f)
                curveToRelative(0.13f, 0.09f, 0.26f, 0.18f, 0.39f, 0.25f)
                lineToRelative(0.07f, 0.04f)
                curveToRelative(0.99f, 0.72f, 1.84f, 1.61f, 2.51f, 2.65f)
                lineTo(12f, 19.1f)
                lineToRelative(1.67f, -2.55f)
                curveToRelative(0.69f, -1.05f, 1.55f, -1.95f, 2.53f, -2.66f)
                lineToRelative(0.07f, -0.05f)
                curveToRelative(0.09f, -0.05f, 0.18f, -0.11f, 0.27f, -0.17f)
                lineToRelative(-0.01f, -0.02f)
                curveToRelative(0.98f, -0.65f, 2.07f, -1.13f, 3.21f, -1.4f)
                curveToRelative(-0.75f, 3.37f, -3.15f, 6.18f, -6.42f, 7.35f)
                close()
                moveToRelative(2.17f, -9.97f)
                curveToRelative(-0.18f, -2.79f, -1.31f, -5.51f, -3.43f, -7.63f)
                curveToRelative(-2.14f, 2.14f, -3.32f, 4.86f, -3.55f, 7.63f)
                curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f)
                curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f)
                close()
                moveToRelative(-3.44f, -4.44f)
                curveToRelative(0.63f, 1.03f, 1.07f, 2.18f, 1.3f, 3.38f)
                curveToRelative(-0.47f, 0.3f, -0.91f, 0.63f, -1.34f, 0.98f)
                curveToRelative(-0.42f, -0.34f, -0.87f, -0.67f, -1.33f, -0.97f)
                curveToRelative(0.25f, -1.2f, 0.71f, -2.35f, 1.37f, -3.39f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.99f, 12.28f)
                curveToRelative(-0.02f, -0.01f, -0.04f, -0.03f, -0.05f, -0.04f)
                curveToRelative(0f, 0f, 0.01f, 0f, 0.01f, 0.01f)
                curveToRelative(0.01f, 0.01f, 0.02f, 0.02f, 0.04f, 0.03f)
                close()
            }
        }.build()
        
        return _Spa!!
    }

private var _Spa: ImageVector? = null

