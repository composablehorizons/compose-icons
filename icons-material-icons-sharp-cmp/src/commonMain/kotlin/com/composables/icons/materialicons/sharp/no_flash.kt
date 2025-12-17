package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_flash: ImageVector
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(2.45f, 2.45f)
                    lineTo(1.04f, 3.87f)
                    lineToRelative(5.3f, 5.3f)
                    lineTo(6.14f, 9.4f)
                    horizontalLineTo(2f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-1.17f)
                    lineToRelative(2.13f, 2.13f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.45f, 2.45f)
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
                    horizontalLineTo(18f)
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
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

