package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Point_of_sale: ImageVector
    get() {
        if (_Point_of_sale != null) return _Point_of_sale!!
        
        _Point_of_sale = ImageVector.Builder(
            name = "point_of_sale",
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
                    moveTo(17f, 2f)
                    horizontalLineTo(7f)
                    curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(19f, 2.9f, 18.1f, 2f, 17f, 2f)
                    close()
                    moveTo(16.5f, 6f)
                    horizontalLineToRelative(-9f)
                    curveTo(7.22f, 6f, 7f, 5.78f, 7f, 5.5f)
                    verticalLineToRelative(-1f)
                    curveTo(7f, 4.22f, 7.22f, 4f, 7.5f, 4f)
                    horizontalLineToRelative(9f)
                    curveTo(16.78f, 4f, 17f, 4.22f, 17f, 4.5f)
                    verticalLineToRelative(1f)
                    curveTo(17f, 5.78f, 16.78f, 6f, 16.5f, 6f)
                    close()
                    moveTo(20f, 22f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(20f)
                    verticalLineToRelative(1f)
                    curveTo(22f, 21.1f, 21.1f, 22f, 20f, 22f)
                    close()
                    moveTo(18.53f, 10.19f)
                    curveTo(18.21f, 9.47f, 17.49f, 9f, 16.7f, 9f)
                    horizontalLineTo(7.3f)
                    curveToRelative(-0.79f, 0f, -1.51f, 0.47f, -1.83f, 1.19f)
                    lineTo(2f, 18f)
                    horizontalLineToRelative(20f)
                    lineTo(18.53f, 10.19f)
                    close()
                    moveTo(9.5f, 16f)
                    horizontalLineToRelative(-1f)
                    curveTo(8.22f, 16f, 8f, 15.78f, 8f, 15.5f)
                    curveTo(8f, 15.22f, 8.22f, 15f, 8.5f, 15f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(10f, 15.78f, 9.78f, 16f, 9.5f, 16f)
                    close()
                    moveTo(9.5f, 14f)
                    horizontalLineToRelative(-1f)
                    curveTo(8.22f, 14f, 8f, 13.78f, 8f, 13.5f)
                    curveTo(8f, 13.22f, 8.22f, 13f, 8.5f, 13f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(10f, 13.78f, 9.78f, 14f, 9.5f, 14f)
                    close()
                    moveTo(9.5f, 12f)
                    horizontalLineToRelative(-1f)
                    curveTo(8.22f, 12f, 8f, 11.78f, 8f, 11.5f)
                    curveTo(8f, 11.22f, 8.22f, 11f, 8.5f, 11f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(10f, 11.78f, 9.78f, 12f, 9.5f, 12f)
                    close()
                    moveTo(12.5f, 16f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(13f, 15.78f, 12.78f, 16f, 12.5f, 16f)
                    close()
                    moveTo(12.5f, 14f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(13f, 13.78f, 12.78f, 14f, 12.5f, 14f)
                    close()
                    moveTo(12.5f, 12f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(13f, 11.78f, 12.78f, 12f, 12.5f, 12f)
                    close()
                    moveTo(15.5f, 16f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(16f, 15.78f, 15.78f, 16f, 15.5f, 16f)
                    close()
                    moveTo(15.5f, 14f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(16f, 13.78f, 15.78f, 14f, 15.5f, 14f)
                    close()
                    moveTo(15.5f, 12f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    curveTo(16f, 11.78f, 15.78f, 12f, 15.5f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Point_of_sale!!
    }

private var _Point_of_sale: ImageVector? = null

