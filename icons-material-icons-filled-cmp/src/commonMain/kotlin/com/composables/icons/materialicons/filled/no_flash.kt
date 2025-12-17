package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_flash: ImageVector
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
                    moveTo(13.93f, 13.93f)
                    lineTo(2.45f, 2.45f)
                    lineTo(1.04f, 3.87f)
                    lineToRelative(5.3f, 5.3f)
                    lineTo(6.14f, 9.4f)
                    horizontalLineTo(3.6f)
                    curveTo(2.72f, 9.4f, 2f, 10.12f, 2f, 11f)
                    verticalLineToRelative(9.4f)
                    curveTo(2f, 21.28f, 2.72f, 22f, 3.6f, 22f)
                    horizontalLineToRelative(12.8f)
                    curveToRelative(0.75f, 0f, 1.38f, -0.52f, 1.55f, -1.22f)
                    lineToRelative(2.18f, 2.18f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(18f, 18f)
                    lineTo(13.93f, 13.93f)
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
                    horizontalLineToRelative(1.75f)
                    lineToRelative(1.28f, 1.4f)
                    horizontalLineToRelative(2.54f)
                    curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                    verticalLineTo(15.17f)
                    close()
                    moveTo(20.4f, 5.6f)
                    horizontalLineTo(22f)
                    lineTo(19f, 11f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(4f)
                    lineTo(20.4f, 5.6f)
                    close()
                }
            }
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

