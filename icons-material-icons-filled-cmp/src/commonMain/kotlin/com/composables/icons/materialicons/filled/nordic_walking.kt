package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Nordic_walking: ImageVector
    get() {
        if (_Nordic_walking != null) return _Nordic_walking!!
        
        _Nordic_walking = ImageVector.Builder(
            name = "nordic_walking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(19f, 23f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-9f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                close()
                moveTo(7.53f, 14f)
                horizontalLineTo(6f)
                lineToRelative(-2f, 9f)
                horizontalLineToRelative(1.53f)
                lineTo(7.53f, 14f)
                close()
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(9.8f, 8.9f)
                lineTo(7f, 23f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.8f, -8f)
                lineToRelative(2.1f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-2.1f, -2f)
                lineToRelative(0.6f, -3f)
                curveTo(14.8f, 12f, 16.8f, 13f, 19f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.9f, 0f, -3.5f, -1f, -4.3f, -2.4f)
                lineToRelative(-1f, -1.6f)
                curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f)
                lineTo(6f, 8.3f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.6f)
                lineTo(9.8f, 8.9f)
                close()
            }
        }.build()
        
        return _Nordic_walking!!
    }

private var _Nordic_walking: ImageVector? = null

