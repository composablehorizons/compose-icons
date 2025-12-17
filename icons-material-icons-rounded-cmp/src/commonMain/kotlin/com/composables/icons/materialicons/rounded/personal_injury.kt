package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Personal_injury: ImageVector
    get() {
        if (_Personal_injury != null) return _Personal_injury!!
        
        _Personal_injury = ImageVector.Builder(
            name = "personal_injury",
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
                    moveTo(8f, 6f)
                    curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                    reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                    curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                    reflectiveCurveTo(8f, 8.21f, 8f, 6f)
                    close()
                    moveTo(17f, 22f)
                    horizontalLineToRelative(1f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    lineToRelative(0f, -4.78f)
                    curveToRelative(0f, -1.12f, -0.61f, -2.15f, -1.61f, -2.66f)
                    curveToRelative(-0.43f, -0.22f, -0.9f, -0.43f, -1.39f, -0.62f)
                    lineTo(17f, 22f)
                    close()
                    moveTo(12.34f, 17f)
                    lineTo(15f, 11.33f)
                    curveTo(14.07f, 11.12f, 13.07f, 11f, 12f, 11f)
                    curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                    curveTo(4.61f, 13.07f, 4f, 14.1f, 4f, 15.22f)
                    lineTo(4f, 22f)
                    horizontalLineToRelative(2.34f)
                    curveTo(6.12f, 21.55f, 6f, 21.04f, 6f, 20.5f)
                    curveTo(6f, 18.57f, 7.57f, 17f, 9.5f, 17f)
                    horizontalLineTo(12.34f)
                    close()
                    moveTo(10f, 22f)
                    lineToRelative(1.41f, -3f)
                    horizontalLineTo(9.5f)
                    curveTo(8.67f, 19f, 8f, 19.67f, 8f, 20.5f)
                    reflectiveCurveTo(8.67f, 22f, 9.5f, 22f)
                    horizontalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Personal_injury!!
    }

private var _Personal_injury: ImageVector? = null

