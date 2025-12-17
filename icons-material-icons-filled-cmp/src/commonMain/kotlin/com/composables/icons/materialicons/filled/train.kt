package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Train: ImageVector
    get() {
        if (_Train != null) return _Train!!
        
        _Train = ImageVector.Builder(
            name = "train",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(-4f, 0f, -8f, 0.5f, -8f, 4f)
                verticalLineToRelative(9.5f)
                curveTo(4f, 17.43f, 5.57f, 19f, 7.5f, 19f)
                lineTo(6f, 20.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.23f)
                lineToRelative(2f, -2f)
                horizontalLineTo(14f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                lineTo(16.5f, 19f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(6f)
                curveToRelative(0f, -3.5f, -3.58f, -4f, -8f, -4f)
                close()
                moveTo(7.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(6.67f, 14f, 7.5f, 14f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(8.33f, 17f, 7.5f, 17f)
                close()
                moveToRelative(3.5f, -7f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(2f, 0f)
                verticalLineTo(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                close()
                moveToRelative(3.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _Train!!
    }

private var _Train: ImageVector? = null

