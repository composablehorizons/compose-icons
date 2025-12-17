package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Not_listed_location: ImageVector
    get() {
        if (_Not_listed_location != null) return _Not_listed_location!!
        
        _Not_listed_location = ImageVector.Builder(
            name = "not_listed_location",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                    curveToRelative(0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.22f)
                    curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0f)
                    curveTo(17.55f, 17.12f, 20f, 13.38f, 20f, 10.2f)
                    curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                    close()
                    moveTo(12.01f, 16f)
                    curveToRelative(-0.59f, 0f, -1.05f, -0.47f, -1.05f, -1.05f)
                    curveToRelative(0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                    curveToRelative(0.59f, 0f, 1.04f, 0.45f, 1.04f, 1.04f)
                    curveTo(13.05f, 15.53f, 12.61f, 16f, 12.01f, 16f)
                    close()
                    moveTo(14.52f, 9.83f)
                    curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                    curveToRelative(-0.08f, 0.14f, -0.13f, 0.26f, -0.16f, 0.49f)
                    curveToRelative(-0.05f, 0.39f, -0.36f, 0.68f, -0.75f, 0.68f)
                    horizontalLineToRelative(-0.03f)
                    curveToRelative(-0.44f, 0f, -0.79f, -0.38f, -0.75f, -0.82f)
                    curveToRelative(0.03f, -0.27f, 0.09f, -0.57f, 0.25f, -0.84f)
                    curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                    curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                    curveToRelative(-0.61f, 0f, -1.01f, 0.32f, -1.26f, 0.7f)
                    curveToRelative(-0.19f, 0.29f, -0.57f, 0.39f, -0.89f, 0.25f)
                    curveToRelative(-0.42f, -0.18f, -0.6f, -0.7f, -0.34f, -1.07f)
                    curveTo(10.03f, 6.55f, 10.88f, 6f, 12f, 6f)
                    curveToRelative(1.23f, 0f, 2.08f, 0.56f, 2.51f, 1.26f)
                    curveTo(14.87f, 7.87f, 15.09f, 8.99f, 14.52f, 9.83f)
                    close()
                }
            }
        }.build()
        
        return _Not_listed_location!!
    }

private var _Not_listed_location: ImageVector? = null

