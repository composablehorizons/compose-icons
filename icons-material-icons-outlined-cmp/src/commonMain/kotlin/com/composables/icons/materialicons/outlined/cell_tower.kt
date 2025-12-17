package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Cell_tower: ImageVector
    get() {
        if (_Cell_tower != null) return _Cell_tower!!
        
        _Cell_tower = ImageVector.Builder(
            name = "cell_tower",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.3f, 14.7f)
                        lineToRelative(1.2f, -1.2f)
                        curveToRelative(-1f, -1f, -1.5f, -2.3f, -1.5f, -3.5f)
                        curveToRelative(0f, -1.3f, 0.5f, -2.6f, 1.5f, -3.5f)
                        lineTo(7.3f, 5.3f)
                        curveToRelative(-1.3f, 1.3f, -2f, 3f, -2f, 4.7f)
                        reflectiveCurveTo(6f, 13.4f, 7.3f, 14.7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.1f, 2.9f)
                        lineToRelative(-1.2f, 1.2f)
                        curveToRelative(1.6f, 1.6f, 2.4f, 3.8f, 2.4f, 5.9f)
                        curveToRelative(0f, 2.1f, -0.8f, 4.3f, -2.4f, 5.9f)
                        lineToRelative(1.2f, 1.2f)
                        curveToRelative(2f, -2f, 2.9f, -4.5f, 2.9f, -7.1f)
                        curveTo(22f, 7.4f, 21f, 4.9f, 19.1f, 2.9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.1f, 4.1f)
                        lineTo(4.9f, 2.9f)
                        curveTo(3f, 4.9f, 2f, 7.4f, 2f, 10f)
                        curveToRelative(0f, 2.6f, 1f, 5.1f, 2.9f, 7.1f)
                        lineToRelative(1.2f, -1.2f)
                        curveToRelative(-1.6f, -1.6f, -2.4f, -3.8f, -2.4f, -5.9f)
                        curveTo(3.7f, 7.9f, 4.5f, 5.7f, 6.1f, 4.1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.7f, 14.7f)
                        curveToRelative(1.3f, -1.3f, 2f, -3f, 2f, -4.7f)
                        curveToRelative(-0.1f, -1.7f, -0.7f, -3.4f, -2f, -4.7f)
                        lineToRelative(-1.2f, 1.2f)
                        curveToRelative(1f, 1f, 1.5f, 2.3f, 1.5f, 3.5f)
                        curveToRelative(0f, 1.3f, -0.5f, 2.6f, -1.5f, 3.5f)
                        lineTo(16.7f, 14.7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.5f, 10f)
                        curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                        reflectiveCurveTo(9.5f, 8.62f, 9.5f, 10f)
                        curveToRelative(0f, 0.76f, 0.34f, 1.42f, 0.87f, 1.88f)
                        lineTo(7f, 22f)
                        horizontalLineToRelative(2f)
                        lineToRelative(0.67f, -2f)
                        horizontalLineToRelative(4.67f)
                        lineTo(15f, 22f)
                        horizontalLineToRelative(2f)
                        lineToRelative(-3.37f, -10.12f)
                        curveTo(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10f)
                        close()
                        moveTo(10.33f, 18f)
                        lineTo(12f, 13f)
                        lineToRelative(1.67f, 5f)
                        horizontalLineTo(10.33f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cell_tower!!
    }

private var _Cell_tower: ImageVector? = null

