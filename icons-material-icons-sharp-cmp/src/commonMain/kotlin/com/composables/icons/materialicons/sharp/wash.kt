package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wash: ImageVector
    get() {
        if (_Wash != null) return _Wash!!
        
        _Wash = ImageVector.Builder(
            name = "wash",
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
                    moveTo(9.12f, 5f)
                    lineTo(1f, 12.68f)
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
                    lineTo(9.12f, 5f)
                    close()
                    moveTo(13.5f, 9f)
                    curveTo(14.33f, 9f, 15f, 8.33f, 15f, 7.5f)
                    curveTo(15f, 6.66f, 13.5f, 5f, 13.5f, 5f)
                    reflectiveCurveTo(12f, 6.66f, 12f, 7.5f)
                    curveTo(12f, 8.33f, 12.67f, 9f, 13.5f, 9f)
                    close()
                    moveTo(18.5f, 1f)
                    curveToRelative(0f, 0f, -2.5f, 2.83f, -2.5f, 4.5f)
                    curveTo(16f, 6.88f, 17.12f, 8f, 18.5f, 8f)
                    reflectiveCurveTo(21f, 6.88f, 21f, 5.5f)
                    curveTo(21f, 3.83f, 18.5f, 1f, 18.5f, 1f)
                    close()
                }
            }
        }.build()
        
        return _Wash!!
    }

private var _Wash: ImageVector? = null

