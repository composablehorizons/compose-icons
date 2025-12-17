package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Satellite_alt: ImageVector
    get() {
        if (_Satellite_alt != null) return _Satellite_alt!!
        
        _Satellite_alt = ImageVector.Builder(
            name = "satellite_alt",
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
                    moveTo(21f, 14f)
                    lineToRelative(2f, 0f)
                    curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
                    lineToRelative(0f, -2f)
                    curveTo(17.87f, 21f, 21f, 17.87f, 21f, 14f)
                    close()
                    moveTo(14f, 17f)
                    lineToRelative(0f, 2f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    lineToRelative(-2f, 0f)
                    curveTo(17f, 15.66f, 15.66f, 17f, 14f, 17f)
                    close()
                    moveTo(18.26f, 0.59f)
                    lineToRelative(3.54f, 3.54f)
                    curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                    lineToRelative(-3.18f, 3.18f)
                    curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                    lineToRelative(-1.24f, -1.24f)
                    lineTo(13.84f, 9.6f)
                    lineToRelative(1.24f, 1.24f)
                    curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                    lineToRelative(-1.41f, 1.41f)
                    curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                    lineTo(9.6f, 13.84f)
                    lineToRelative(-0.71f, 0.71f)
                    lineToRelative(1.24f, 1.24f)
                    curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                    lineTo(6.95f, 21.8f)
                    curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                    lineToRelative(-3.54f, -3.54f)
                    curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                    lineToRelative(3.18f, -3.18f)
                    curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                    lineToRelative(1.24f, 1.24f)
                    lineToRelative(0.71f, -0.71f)
                    lineTo(7.3f, 11.55f)
                    curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                    lineTo(8.72f, 7.3f)
                    curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                    lineToRelative(1.24f, 1.24f)
                    lineToRelative(0.71f, -0.71f)
                    lineTo(12.25f, 6.6f)
                    curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                    lineToRelative(3.18f, -3.18f)
                    curveTo(16.22f, -0.2f, 17.48f, -0.2f, 18.26f, 0.59f)
                    close()
                    moveTo(3.06f, 15.79f)
                    lineTo(2f, 16.85f)
                    lineToRelative(3.54f, 3.54f)
                    lineToRelative(1.06f, -1.06f)
                    lineTo(3.06f, 15.79f)
                    close()
                    moveTo(5.18f, 13.67f)
                    lineToRelative(-1.06f, 1.06f)
                    lineToRelative(3.54f, 3.54f)
                    lineToRelative(1.06f, -1.06f)
                    lineTo(5.18f, 13.67f)
                    close()
                    moveTo(10.13f, 8.72f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(3.54f, 3.54f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(10.13f, 8.72f)
                    close()
                    moveTo(14.73f, 4.12f)
                    lineToRelative(-1.06f, 1.06f)
                    lineToRelative(3.54f, 3.54f)
                    lineToRelative(1.06f, -1.06f)
                    lineTo(14.73f, 4.12f)
                    close()
                    moveTo(16.85f, 2f)
                    lineToRelative(-1.06f, 1.06f)
                    lineToRelative(3.54f, 3.54f)
                    lineToRelative(1.06f, -1.06f)
                    lineTo(16.85f, 2f)
                    close()
                }
            }
        }.build()
        
        return _Satellite_alt!!
    }

private var _Satellite_alt: ImageVector? = null

