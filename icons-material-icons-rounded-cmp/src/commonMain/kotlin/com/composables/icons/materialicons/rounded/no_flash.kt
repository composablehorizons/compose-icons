package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_flash: ImageVector
    get() {
        if (_No_flash != null) return _No_flash!!
        
        _No_flash = ImageVector.Builder(
            name = "no_flash",
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
                    moveTo(3.16f, 3.16f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(4.6f, 4.6f)
                    lineTo(6.14f, 9.4f)
                    horizontalLineTo(3.6f)
                    curveTo(2.72f, 9.4f, 2f, 10.12f, 2f, 11f)
                    verticalLineToRelative(9.4f)
                    curveTo(2f, 21.28f, 2.72f, 22f, 3.6f, 22f)
                    horizontalLineToRelative(12.8f)
                    curveToRelative(0.75f, 0f, 1.38f, -0.52f, 1.55f, -1.22f)
                    lineToRelative(1.47f, 1.47f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(3.16f, 3.16f)
                    close()
                    moveTo(10f, 20f)
                    curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                    curveToRelative(0f, -1.95f, 1.4f, -3.57f, 3.25f, -3.92f)
                    lineToRelative(1.57f, 1.57f)
                    curveToRelative(-0.26f, -0.09f, -0.53f, -0.15f, -0.82f, -0.15f)
                    curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                    curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                    curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                    curveToRelative(0f, -0.29f, -0.06f, -0.56f, -0.15f, -0.82f)
                    lineToRelative(1.57f, 1.57f)
                    curveTo(13.57f, 18.6f, 11.95f, 20f, 10f, 20f)
                    close()
                    moveTo(18f, 15.17f)
                    lineTo(10.83f, 8f)
                    horizontalLineToRelative(0.87f)
                    curveToRelative(0.56f, 0f, 1.1f, 0.24f, 1.48f, 0.65f)
                    lineToRelative(0.69f, 0.75f)
                    horizontalLineToRelative(2.54f)
                    curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                    verticalLineTo(15.17f)
                    close()
                    moveTo(20.4f, 5.6f)
                    horizontalLineToRelative(0.75f)
                    curveToRelative(0.38f, 0f, 0.62f, 0.41f, 0.44f, 0.74f)
                    lineTo(19f, 11f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-0.5f)
                    curveTo(18.22f, 7f, 18f, 6.78f, 18f, 6.5f)
                    verticalLineToRelative(-4f)
                    curveTo(18f, 2.22f, 18.22f, 2f, 18.5f, 2f)
                    horizontalLineToRelative(2.73f)
                    curveToRelative(0.36f, 0f, 0.6f, 0.37f, 0.46f, 0.7f)
                    lineTo(20.4f, 5.6f)
                    close()
                }
            }
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

