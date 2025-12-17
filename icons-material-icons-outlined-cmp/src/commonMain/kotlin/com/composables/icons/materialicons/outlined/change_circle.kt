package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Change_circle: ImageVector
    get() {
        if (_Change_circle != null) return _Change_circle!!
        
        _Change_circle = ImageVector.Builder(
            name = "change_circle",
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                close()
                moveTo(16.17f, 14.76f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f)
                curveTo(13.79f, 8.84f, 12.9f, 8.5f, 12f, 8.5f)
                curveToRelative(-0.03f, 0f, -0.06f, 0.01f, -0.09f, 0.01f)
                lineTo(13f, 9.6f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(9.11f, 7.83f)
                lineTo(11.94f, 5f)
                lineTo(13f, 6.06f)
                lineToRelative(-0.96f, 0.96f)
                curveToRelative(1.27f, 0.01f, 2.53f, 0.48f, 3.5f, 1.44f)
                curveTo(17.24f, 10.17f, 17.45f, 12.82f, 16.17f, 14.76f)
                close()
                moveTo(14.89f, 16.17f)
                lineTo(12.06f, 19f)
                lineTo(11f, 17.94f)
                lineToRelative(0.95f, -0.95f)
                curveToRelative(-1.26f, -0.01f, -2.52f, -0.5f, -3.48f, -1.46f)
                curveToRelative(-1.71f, -1.71f, -1.92f, -4.35f, -0.64f, -6.29f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(-0.71f, 1.33f, -0.53f, 3.01f, 0.59f, 4.13f)
                curveToRelative(0.7f, 0.7f, 1.63f, 1.04f, 2.56f, 1.01f)
                lineTo(11f, 14.4f)
                lineToRelative(1.06f, -1.06f)
                lineTo(14.89f, 16.17f)
                close()
            }
        }.build()
        
        return _Change_circle!!
    }

private var _Change_circle: ImageVector? = null

