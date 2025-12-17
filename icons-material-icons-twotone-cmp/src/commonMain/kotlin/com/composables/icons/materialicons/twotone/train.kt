package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Train: ImageVector
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
                moveTo(12f, 4f)
                curveToRelative(-3.51f, 0f, -4.96f, 0.48f, -5.57f, 1f)
                horizontalLineToRelative(11.13f)
                curveToRelative(-0.6f, -0.52f, -2.05f, -1f, -5.56f, -1f)
                close()
                moveTo(6f, 15.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineToRelative(3.5f)
                close()
                moveToRelative(9.5f, -2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveToRelative(-7f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.33f, 16f, 8.5f, 16f)
                reflectiveCurveTo(7f, 15.33f, 7f, 14.5f)
                reflectiveCurveTo(7.67f, 13f, 8.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 14.5f)
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
                horizontalLineToRelative(2f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                lineTo(16.5f, 19f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(6f)
                curveToRelative(0f, -3.5f, -4f, -4f, -8f, -4f)
                close()
                moveToRelative(0f, 2f)
                curveToRelative(3.51f, 0f, 4.96f, 0.48f, 5.57f, 1f)
                horizontalLineTo(6.43f)
                curveToRelative(0.61f, -0.52f, 2.06f, -1f, 5.57f, -1f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                close()
                moveToRelative(12f, 8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.5f)
                close()
                moveToRelative(0f, -5.5f)
                horizontalLineToRelative(-5f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Train!!
    }

private var _Train: ImageVector? = null

