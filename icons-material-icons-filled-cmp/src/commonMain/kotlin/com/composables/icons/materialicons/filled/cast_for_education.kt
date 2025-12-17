package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Cast_for_education: ImageVector
    get() {
        if (_Cast_for_education != null) return _Cast_for_education!!
        
        _Cast_for_education = ImageVector.Builder(
            name = "cast_for_education",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(18f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(-7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(7f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(23f, 3.9f, 22.1f, 3f, 21f, 3f)
                    close()
                    moveTo(1f, 18f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(3f)
                    curveTo(4f, 19.34f, 2.66f, 18f, 1f, 18f)
                    close()
                    moveTo(1f, 14f)
                    verticalLineToRelative(2f)
                    curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                    horizontalLineToRelative(2f)
                    curveTo(8f, 17.13f, 4.87f, 14f, 1f, 14f)
                    close()
                    moveTo(1f, 10f)
                    verticalLineToRelative(2f)
                    curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
                    horizontalLineToRelative(2f)
                    curveTo(12f, 14.92f, 7.07f, 10f, 1f, 10f)
                    close()
                    moveTo(11f, 11.09f)
                    verticalLineToRelative(2f)
                    lineTo(14.5f, 15f)
                    lineToRelative(3.5f, -1.91f)
                    verticalLineToRelative(-2f)
                    lineTo(14.5f, 13f)
                    lineTo(11f, 11.09f)
                    close()
                    moveTo(14.5f, 6f)
                    lineTo(9f, 9f)
                    lineToRelative(5.5f, 3f)
                    lineTo(20f, 9f)
                    lineTo(14.5f, 6f)
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
        
        return _Cast_for_education!!
    }

private var _Cast_for_education: ImageVector? = null

