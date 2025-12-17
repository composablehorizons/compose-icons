package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Point_of_sale: ImageVector
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
                    moveTo(19f, 2f)
                    horizontalLineTo(5f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    verticalLineToRelative(6f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    lineTo(19f, 2f)
                    curveTo(19f, 2f, 19f, 2f, 19f, 2f)
                    close()
                    moveTo(17f, 6f)
                    horizontalLineTo(7f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(6f)
                    close()
                    moveTo(22f, 22f)
                    horizontalLineTo(2f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(20f)
                    lineTo(22f, 22f)
                    curveTo(22f, 22f, 22f, 22f, 22f, 22f)
                    close()
                    moveTo(18f, 9f)
                    horizontalLineTo(6f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    lineToRelative(-4f, 9f)
                    horizontalLineToRelative(20f)
                    lineTo(18f, 9f)
                    close()
                    moveTo(10f, 16f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(16f)
                    close()
                    moveTo(10f, 14f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(10f, 12f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(13f, 16f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(16f)
                    close()
                    moveTo(13f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(13f, 12f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(16f, 16f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(16f)
                    close()
                    moveTo(16f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(16f, 12f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Point_of_sale!!
    }

private var _Point_of_sale: ImageVector? = null

