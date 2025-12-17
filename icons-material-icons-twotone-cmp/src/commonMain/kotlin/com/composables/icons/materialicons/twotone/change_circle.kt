package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Change_circle: ImageVector
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
                moveTo(12f, 4f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                moveTo(12.06f, 13.34f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f)
                curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f)
                curveTo(9.44f, 16.51f, 10.72f, 17f, 12f, 17f)
                curveToRelative(0.02f, 0f, 0.04f, 0f, 0.06f, 0f)
                verticalLineTo(19f)
                lineToRelative(2.83f, -2.83f)
                lineTo(12.06f, 13.34f)
                close()
                moveTo(15.54f, 8.46f)
                curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f)
                verticalLineTo(5f)
                lineTo(9.11f, 7.83f)
                lineToRelative(2.83f, 2.83f)
                verticalLineTo(8.51f)
                curveToRelative(0.02f, 0f, 0.04f, 0f, 0.06f, 0f)
                curveToRelative(0.9f, 0f, 1.79f, 0.34f, 2.48f, 1.02f)
                curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f)
                lineToRelative(1.1f, 1.1f)
                curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                lineTo(12f, 2f)
                close()
                moveTo(12.06f, 13.34f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f)
                curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f)
                curveTo(9.44f, 16.51f, 10.72f, 17f, 12f, 17f)
                curveToRelative(0.02f, 0f, 0.04f, 0f, 0.06f, 0f)
                verticalLineTo(19f)
                lineToRelative(2.83f, -2.83f)
                lineTo(12.06f, 13.34f)
                close()
                moveTo(15.54f, 8.46f)
                curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f)
                verticalLineTo(5f)
                lineTo(9.11f, 7.83f)
                lineToRelative(2.83f, 2.83f)
                verticalLineTo(8.51f)
                curveToRelative(0.02f, 0f, 0.04f, 0f, 0.06f, 0f)
                curveToRelative(0.9f, 0f, 1.79f, 0.34f, 2.48f, 1.02f)
                curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f)
                lineToRelative(1.1f, 1.1f)
                curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f)
                close()
            }
        }.build()
        
        return _Change_circle!!
    }

private var _Change_circle: ImageVector? = null

