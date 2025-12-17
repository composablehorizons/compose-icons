package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Do_not_step: ImageVector
    get() {
        if (_Do_not_step != null) return _Do_not_step!!
        
        _Do_not_step = ImageVector.Builder(
            name = "do_not_step",
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
                    moveTo(1.39f, 4.22f)
                    lineToRelative(8.24f, 8.24f)
                    lineToRelative(-0.69f, 0.72f)
                    lineTo(6.87f, 11.1f)
                    curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f)
                    lineToRelative(1.75f, 1.75f)
                    lineToRelative(-0.69f, 0.72f)
                    lineToRelative(-1.63f, -1.63f)
                    curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f)
                    lineToRelative(1.63f, 1.63f)
                    lineToRelative(-0.7f, 0.72f)
                    lineToRelative(-1.74f, -1.74f)
                    curveTo(2.83f, 15.43f, 1.34f, 15.82f, 1f, 15.92f)
                    lineTo(1f, 20f)
                    horizontalLineToRelative(9.5f)
                    lineToRelative(3.33f, -3.33f)
                    lineToRelative(5.94f, 5.94f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    close()
                    moveTo(18.51f, 15.68f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(4.48f, -4.48f)
                    lineTo(23f, 11.2f)
                    lineTo(18.51f, 15.68f)
                    close()
                    moveTo(20.88f, 9.08f)
                    lineToRelative(-4.48f, 4.48f)
                    lineTo(9.3f, 6.47f)
                    lineTo(13.8f, 2f)
                    lineTo(20.88f, 9.08f)
                    close()
                }
            }
        }.build()
        
        return _Do_not_step!!
    }

private var _Do_not_step: ImageVector? = null

