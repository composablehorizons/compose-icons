package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Podcasts: ImageVector
    get() {
        if (_Podcasts != null) return _Podcasts!!
        
        _Podcasts = ImageVector.Builder(
            name = "podcasts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 12f)
                    curveToRelative(0f, 0.74f, -0.4f, 1.38f, -1f, 1.72f)
                    verticalLineTo(21f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-7.28f)
                    curveToRelative(-0.6f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                    close()
                    moveTo(10.75f, 6.13f)
                    curveToRelative(-2.27f, 0.46f, -4.12f, 2.28f, -4.61f, 4.55f)
                    curveToRelative(-0.4f, 1.86f, 0.07f, 3.62f, 1.08f, 4.94f)
                    curveToRelative(0.35f, 0.45f, 1.03f, 0.47f, 1.43f, 0.07f)
                    lineToRelative(0.07f, -0.07f)
                    curveToRelative(0.34f, -0.34f, 0.34f, -0.87f, 0.06f, -1.25f)
                    curveToRelative(-0.68f, -0.9f, -0.98f, -2.1f, -0.66f, -3.37f)
                    curveToRelative(0.35f, -1.42f, 1.52f, -2.57f, 2.95f, -2.88f)
                    curveTo(13.69f, 7.52f, 16f, 9.49f, 16f, 12f)
                    curveToRelative(0f, 0.87f, -0.28f, 1.67f, -0.76f, 2.32f)
                    curveToRelative(-0.3f, 0.41f, -0.29f, 0.97f, 0.07f, 1.33f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.44f, 0.44f, 1.17f, 0.37f, 1.54f, -0.14f)
                    curveTo(17.57f, 14.53f, 18f, 13.31f, 18f, 12f)
                    curveTo(18f, 8.28f, 14.61f, 5.35f, 10.75f, 6.13f)
                    close()
                    moveTo(10.83f, 2.07f)
                    curveTo(6.3f, 2.58f, 2.61f, 6.25f, 2.07f, 10.78f)
                    curveToRelative(-0.35f, 2.95f, 0.59f, 5.67f, 2.32f, 7.7f)
                    curveToRelative(0.37f, 0.43f, 1.03f, 0.46f, 1.43f, 0.06f)
                    lineToRelative(0.05f, -0.05f)
                    curveToRelative(0.35f, -0.35f, 0.38f, -0.92f, 0.05f, -1.3f)
                    curveToRelative(-1.56f, -1.83f, -2.33f, -4.37f, -1.7f, -7.06f)
                    curveToRelative(0.7f, -3.01f, 3.18f, -5.39f, 6.22f, -5.97f)
                    curveTo(15.53f, 3.18f, 20f, 7.08f, 20f, 12f)
                    curveToRelative(0f, 1.96f, -0.72f, 3.76f, -1.9f, 5.16f)
                    curveToRelative(-0.34f, 0.4f, -0.31f, 0.98f, 0.05f, 1.35f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.42f, 0.42f, 1.11f, 0.39f, 1.49f, -0.07f)
                    curveTo(21.11f, 16.7f, 22f, 14.46f, 22f, 12f)
                    curveTo(22f, 6.09f, 16.87f, 1.38f, 10.83f, 2.07f)
                    close()
                }
            }
        }.build()
        
        return _Podcasts!!
    }

private var _Podcasts: ImageVector? = null

