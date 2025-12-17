package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
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
                    moveTo(12f, 17.27f)
                    lineToRelative(4.15f, 2.51f)
                    curveToRelative(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f)
                    lineToRelative(-1.1f, -4.72f)
                    lineToRelative(3.67f, -3.18f)
                    curveToRelative(0.67f, -0.58f, 0.31f, -1.68f, -0.57f, -1.75f)
                    lineToRelative(-4.83f, -0.41f)
                    lineToRelative(-1.89f, -4.46f)
                    curveToRelative(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0f)
                    lineTo(9.19f, 8.63f)
                    lineTo(4.36f, 9.04f)
                    curveToRelative(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f)
                    lineToRelative(3.67f, 3.18f)
                    lineToRelative(-1.1f, 4.72f)
                    curveToRelative(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f)
                    lineTo(12f, 17.27f)
                    close()
                }
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

