package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dry: ImageVector
    get() {
        if (_Dry != null) return _Dry!!
        
        _Dry = ImageVector.Builder(
            name = "dry",
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
                    moveTo(1f, 12.68f)
                    verticalLineTo(23f)
                    horizontalLineToRelative(18f)
                    verticalLineToRelative(-2.5f)
                    horizontalLineToRelative(-7f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(9f)
                    verticalLineTo(17f)
                    horizontalLineToRelative(-9f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-2.5f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(10f)
                    horizontalLineTo(8.86f)
                    lineToRelative(1.88f, -3.3f)
                    lineTo(9.12f, 5f)
                    lineTo(1f, 12.68f)
                    close()
                    moveTo(15.65f, 4.86f)
                    lineToRelative(-0.07f, -0.07f)
                    curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                    lineTo(15f, 2f)
                    horizontalLineToRelative(-1.89f)
                    lineToRelative(-0.06f, 0.43f)
                    curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                    lineToRelative(0.07f, 0.06f)
                    curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                    lineTo(14.98f, 9f)
                    horizontalLineToRelative(1.91f)
                    lineToRelative(0.06f, -0.43f)
                    curveTo(17.16f, 7.21f, 16.68f, 5.86f, 15.65f, 4.86f)
                    close()
                    moveTo(19.65f, 4.86f)
                    lineToRelative(-0.07f, -0.07f)
                    curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                    lineTo(19f, 2f)
                    horizontalLineToRelative(-1.89f)
                    lineToRelative(-0.06f, 0.43f)
                    curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                    lineToRelative(0.07f, 0.06f)
                    curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                    lineTo(18.98f, 9f)
                    horizontalLineToRelative(1.91f)
                    lineToRelative(0.06f, -0.43f)
                    curveTo(21.16f, 7.21f, 20.68f, 5.86f, 19.65f, 4.86f)
                    close()
                }
            }
        }.build()
        
        return _Dry!!
    }

private var _Dry: ImageVector? = null

