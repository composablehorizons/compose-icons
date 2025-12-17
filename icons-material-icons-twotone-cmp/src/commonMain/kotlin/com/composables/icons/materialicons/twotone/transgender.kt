package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Transgender: ImageVector
    get() {
        if (_Transgender != null) return _Transgender!!
        
        _Transgender = ImageVector.Builder(
            name = "transgender",
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
                moveTo(12f, 8f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(13.93f, 15f, 12f, 15f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveTo(10.07f, 8f, 12f, 8f)
                close()
                moveTo(16.53f, 8.38f)
                lineToRelative(3.97f, -3.96f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-3.97f, 3.97f)
                curveTo(14.23f, 6.36f, 13.16f, 6f, 12f, 6f)
                curveToRelative(-1.16f, 0f, -2.23f, 0.36f, -3.11f, 0.97f)
                lineTo(8.24f, 6.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(8.24f, 3.49f)
                lineTo(6.82f, 4.9f)
                lineTo(4.92f, 3f)
                horizontalLineTo(7.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(4.42f)
                lineToRelative(1.91f, 1.9f)
                lineTo(3.99f, 7.74f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.65f, 0.65f)
                curveTo(6.86f, 9.27f, 6.5f, 10.34f, 6.5f, 11.5f)
                curveToRelative(0f, 2.7f, 1.94f, 4.94f, 4.5f, 5.41f)
                lineTo(11f, 19f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineToRelative(0f, -2.09f)
                curveToRelative(2.56f, -0.47f, 4.5f, -2.71f, 4.5f, -5.41f)
                curveTo(17.5f, 10.34f, 17.14f, 9.27f, 16.53f, 8.38f)
                close()
            }
        }.build()
        
        return _Transgender!!
    }

private var _Transgender: ImageVector? = null

