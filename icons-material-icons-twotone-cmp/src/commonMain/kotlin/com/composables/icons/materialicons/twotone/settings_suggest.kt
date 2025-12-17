package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Settings_suggest: ImageVector
    get() {
        if (_Settings_suggest != null) return _Settings_suggest!!
        
        _Settings_suggest = ImageVector.Builder(
            name = "settings_suggest",
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
                moveTo(14.07f, 15.23f)
                curveToRelative(0.12f, -0.39f, 0.18f, -0.8f, 0.18f, -1.23f)
                curveToRelative(0f, -0.43f, -0.06f, -0.84f, -0.18f, -1.23f)
                lineToRelative(1.49f, -1.13f)
                lineToRelative(-0.73f, -1.27f)
                lineToRelative(-1.73f, 0.73f)
                curveToRelative(-0.56f, -0.6f, -1.3f, -1.04f, -2.13f, -1.23f)
                lineTo(10.73f, 8f)
                horizontalLineTo(9.27f)
                lineTo(9.03f, 9.86f)
                curveToRelative(-0.83f, 0.19f, -1.57f, 0.63f, -2.13f, 1.23f)
                lineToRelative(-1.73f, -0.73f)
                lineToRelative(-0.73f, 1.27f)
                lineToRelative(1.49f, 1.13f)
                curveToRelative(-0.12f, 0.39f, -0.18f, 0.8f, -0.18f, 1.23f)
                curveToRelative(0f, 0.43f, 0.06f, 0.84f, 0.18f, 1.23f)
                lineToRelative(-1.49f, 1.13f)
                lineToRelative(0.73f, 1.27f)
                lineToRelative(1.73f, -0.73f)
                curveToRelative(0.56f, 0.6f, 1.3f, 1.04f, 2.13f, 1.23f)
                lineTo(9.27f, 20f)
                horizontalLineToRelative(1.47f)
                lineToRelative(0.23f, -1.86f)
                curveToRelative(0.83f, -0.19f, 1.57f, -0.63f, 2.13f, -1.23f)
                lineToRelative(1.73f, 0.73f)
                lineToRelative(0.73f, -1.27f)
                lineTo(14.07f, 15.23f)
                close()
                moveTo(10f, 17f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveTo(11.66f, 17f, 10f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(9.45f, 13f, 10f, 13f)
                moveTo(10f, 11f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveTo(11.66f, 11f, 10f, 11f)
                lineTo(10f, 11f)
                close()
                moveTo(18.5f, 9f)
                lineToRelative(1.09f, -2.41f)
                lineTo(22f, 5.5f)
                lineToRelative(-2.41f, -1.09f)
                lineTo(18.5f, 2f)
                lineToRelative(-1.09f, 2.41f)
                lineTo(15f, 5.5f)
                lineToRelative(2.41f, 1.09f)
                lineTo(18.5f, 9f)
                close()
                moveTo(21.28f, 12.72f)
                lineTo(20.5f, 11f)
                lineToRelative(-0.78f, 1.72f)
                lineTo(18f, 13.5f)
                lineToRelative(1.72f, 0.78f)
                lineTo(20.5f, 16f)
                lineToRelative(0.78f, -1.72f)
                lineTo(23f, 13.5f)
                lineTo(21.28f, 12.72f)
                close()
                moveTo(16.25f, 14f)
                curveToRelative(0f, -0.12f, 0f, -0.25f, -0.01f, -0.37f)
                lineToRelative(1.94f, -1.47f)
                lineToRelative(-2.5f, -4.33f)
                lineToRelative(-2.24f, 0.94f)
                curveToRelative(-0.2f, -0.13f, -0.42f, -0.26f, -0.64f, -0.37f)
                lineTo(12.5f, 6f)
                horizontalLineToRelative(-5f)
                lineTo(7.2f, 8.41f)
                curveTo(6.98f, 8.52f, 6.77f, 8.65f, 6.56f, 8.78f)
                lineTo(4.32f, 7.83f)
                lineToRelative(-2.5f, 4.33f)
                lineToRelative(1.94f, 1.47f)
                curveTo(3.75f, 13.75f, 3.75f, 13.88f, 3.75f, 14f)
                reflectiveCurveToRelative(0f, 0.25f, 0.01f, 0.37f)
                lineToRelative(-1.94f, 1.47f)
                lineToRelative(2.5f, 4.33f)
                lineToRelative(2.24f, -0.94f)
                curveToRelative(0.2f, 0.13f, 0.42f, 0.26f, 0.64f, 0.37f)
                lineTo(7.5f, 22f)
                horizontalLineToRelative(5f)
                lineToRelative(0.3f, -2.41f)
                curveToRelative(0.22f, -0.11f, 0.43f, -0.23f, 0.64f, -0.37f)
                lineToRelative(2.24f, 0.94f)
                lineToRelative(2.5f, -4.33f)
                lineToRelative(-1.94f, -1.47f)
                curveTo(16.25f, 14.25f, 16.25f, 14.12f, 16.25f, 14f)
                close()
                moveTo(14.83f, 17.64f)
                lineToRelative(-1.73f, -0.73f)
                curveToRelative(-0.56f, 0.6f, -1.3f, 1.04f, -2.13f, 1.23f)
                lineTo(10.73f, 20f)
                horizontalLineTo(9.27f)
                lineToRelative(-0.23f, -1.86f)
                curveToRelative(-0.83f, -0.19f, -1.57f, -0.63f, -2.13f, -1.23f)
                lineToRelative(-1.73f, 0.73f)
                lineToRelative(-0.73f, -1.27f)
                lineToRelative(1.49f, -1.13f)
                curveToRelative(-0.12f, -0.39f, -0.18f, -0.8f, -0.18f, -1.23f)
                curveToRelative(0f, -0.43f, 0.06f, -0.84f, 0.18f, -1.23f)
                lineToRelative(-1.49f, -1.13f)
                lineToRelative(0.73f, -1.27f)
                lineToRelative(1.73f, 0.73f)
                curveToRelative(0.56f, -0.6f, 1.3f, -1.04f, 2.13f, -1.23f)
                lineTo(9.27f, 8f)
                horizontalLineToRelative(1.47f)
                lineToRelative(0.23f, 1.86f)
                curveToRelative(0.83f, 0.19f, 1.57f, 0.63f, 2.13f, 1.23f)
                lineToRelative(1.73f, -0.73f)
                lineToRelative(0.73f, 1.27f)
                lineToRelative(-1.49f, 1.13f)
                curveToRelative(0.12f, 0.39f, 0.18f, 0.8f, 0.18f, 1.23f)
                curveToRelative(0f, 0.43f, -0.06f, 0.84f, -0.18f, 1.23f)
                lineToRelative(1.49f, 1.13f)
                lineTo(14.83f, 17.64f)
                close()
            }
        }.build()
        
        return _Settings_suggest!!
    }

private var _Settings_suggest: ImageVector? = null

