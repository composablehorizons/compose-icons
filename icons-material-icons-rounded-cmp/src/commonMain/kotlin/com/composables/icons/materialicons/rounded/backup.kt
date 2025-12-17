package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Backup: ImageVector
    get() {
        if (_Backup != null) return _Backup!!
        
        _Backup = ImageVector.Builder(
            name = "backup",
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
                    moveTo(19f, 11f)
                    curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                    curveTo(8.78f, 4f, 6.07f, 6.18f, 5.26f, 9.15f)
                    curveTo(2.82f, 9.71f, 1f, 11.89f, 1f, 14.5f)
                    curveTo(1f, 17.54f, 3.46f, 20f, 6.5f, 20f)
                    curveToRelative(1.76f, 0f, 10.25f, 0f, 12f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(2.49f, -0.01f, 4.5f, -2.03f, 4.5f, -4.52f)
                    curveTo(23f, 13.15f, 21.25f, 11.26f, 19f, 11f)
                    close()
                    moveTo(13f, 13f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(9.21f)
                    curveToRelative(-0.45f, 0f, -0.67f, -0.54f, -0.35f, -0.85f)
                    lineToRelative(2.79f, -2.79f)
                    curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                    lineToRelative(2.79f, 2.79f)
                    curveToRelative(0.31f, 0.31f, 0.09f, 0.85f, -0.35f, 0.85f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Backup!!
    }

private var _Backup: ImageVector? = null

