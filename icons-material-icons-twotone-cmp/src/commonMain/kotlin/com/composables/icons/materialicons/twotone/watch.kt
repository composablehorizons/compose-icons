package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Watch: ImageVector
    get() {
        if (_Watch != null) return _Watch!!
        
        _Watch = ImageVector.Builder(
            name = "watch",
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
                moveTo(14.72f, 4.48f)
                lineTo(14.31f, 2f)
                horizontalLineTo(9.7f)
                lineToRelative(-0.41f, 2.47f)
                curveTo(10.13f, 4.17f, 11.05f, 4f, 12f, 4f)
                curveToRelative(0.96f, 0f, 1.87f, 0.17f, 2.72f, 0.48f)
                close()
                moveTo(9.29f, 19.53f)
                lineTo(9.7f, 22f)
                horizontalLineToRelative(4.61f)
                lineToRelative(0.41f, -2.48f)
                curveToRelative(-0.85f, 0.31f, -1.76f, 0.48f, -2.72f, 0.48f)
                curveToRelative(-0.95f, 0f, -1.87f, -0.17f, -2.71f, -0.47f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.96f, 5.73f)
                lineTo(16f, 0f)
                horizontalLineTo(8f)
                lineToRelative(-0.95f, 5.73f)
                curveTo(5.19f, 7.19f, 4f, 9.45f, 4f, 12f)
                reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f)
                lineTo(8f, 24f)
                horizontalLineToRelative(8f)
                lineToRelative(0.96f, -5.73f)
                curveTo(18.81f, 16.81f, 20f, 14.54f, 20f, 12f)
                reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f)
                close()
                moveTo(9.7f, 2f)
                horizontalLineToRelative(4.61f)
                lineToRelative(0.41f, 2.48f)
                curveTo(13.87f, 4.17f, 12.96f, 4f, 12f, 4f)
                curveToRelative(-0.95f, 0f, -1.87f, 0.17f, -2.71f, 0.47f)
                lineTo(9.7f, 2f)
                close()
                moveToRelative(4.61f, 20f)
                horizontalLineTo(9.7f)
                lineToRelative(-0.41f, -2.47f)
                curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f)
                curveToRelative(0.96f, 0f, 1.87f, -0.17f, 2.72f, -0.48f)
                lineTo(14.31f, 22f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.build()
        
        return _Watch!!
    }

private var _Watch: ImageVector? = null

