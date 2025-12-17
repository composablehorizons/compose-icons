package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Settings_suggest: ImageVector
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17.41f, 6.59f)
                    lineTo(15f, 5.5f)
                    lineToRelative(2.41f, -1.09f)
                    lineTo(18.5f, 2f)
                    lineToRelative(1.09f, 2.41f)
                    lineTo(22f, 5.5f)
                    lineToRelative(-2.41f, 1.09f)
                    lineTo(18.5f, 9f)
                    lineTo(17.41f, 6.59f)
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
                    moveTo(16.24f, 14.37f)
                    lineToRelative(1.94f, 1.47f)
                    lineToRelative(-2.5f, 4.33f)
                    lineToRelative(-2.24f, -0.94f)
                    curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f)
                    lineTo(12.5f, 22f)
                    horizontalLineToRelative(-5f)
                    lineToRelative(-0.3f, -2.41f)
                    curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f)
                    lineToRelative(-2.24f, 0.94f)
                    lineToRelative(-2.5f, -4.33f)
                    lineToRelative(1.94f, -1.47f)
                    curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14f)
                    reflectiveCurveToRelative(0f, -0.25f, 0.01f, -0.37f)
                    lineToRelative(-1.94f, -1.47f)
                    lineToRelative(2.5f, -4.33f)
                    lineToRelative(2.24f, 0.94f)
                    curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f)
                    lineTo(7.5f, 6f)
                    horizontalLineToRelative(5f)
                    lineToRelative(0.3f, 2.41f)
                    curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f)
                    lineToRelative(2.24f, -0.94f)
                    lineToRelative(2.5f, 4.33f)
                    lineToRelative(-1.94f, 1.47f)
                    curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f)
                    reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f)
                    close()
                    moveTo(13f, 14f)
                    curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                    reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                    reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                    reflectiveCurveTo(13f, 15.66f, 13f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Settings_suggest!!
    }

private var _Settings_suggest: ImageVector? = null

