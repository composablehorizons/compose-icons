package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Star_rate: ImageVector
    get() {
        if (_Star_rate != null) return _Star_rate!!
        
        _Star_rate = ImageVector.Builder(
            name = "star_rate",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.43f, 10f)
                    lineToRelative(-1.47f, -4.84f)
                    curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0f)
                    lineTo(9.57f, 10f)
                    horizontalLineTo(5.12f)
                    curveToRelative(-0.97f, 0f, -1.37f, 1.25f, -0.58f, 1.81f)
                    lineToRelative(3.64f, 2.6f)
                    lineToRelative(-1.43f, 4.61f)
                    curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f)
                    lineTo(12f, 17.31f)
                    lineToRelative(3.69f, 2.81f)
                    curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f)
                    lineToRelative(-1.43f, -4.61f)
                    lineToRelative(3.64f, -2.6f)
                    curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f)
                    horizontalLineTo(14.43f)
                    close()
                }
            }
        }.build()
        
        return _Star_rate!!
    }

private var _Star_rate: ImageVector? = null

