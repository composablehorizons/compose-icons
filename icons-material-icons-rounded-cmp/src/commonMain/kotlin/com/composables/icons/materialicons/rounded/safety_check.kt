package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Safety_check: ImageVector
    get() {
        if (_Safety_check != null) return _Safety_check!!
        
        _Safety_check = ImageVector.Builder(
            name = "safety_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11.3f, 2.26f)
                    lineToRelative(-6f, 2.25f)
                    curveTo(4.52f, 4.81f, 4f, 5.55f, 4f, 6.39f)
                    verticalLineToRelative(4.7f)
                    curveToRelative(0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f)
                    curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0f)
                    curveToRelative(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f)
                    verticalLineToRelative(-4.7f)
                    curveToRelative(0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f)
                    lineToRelative(-6f, -2.25f)
                    curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f)
                    close()
                    moveTo(12f, 17f)
                    curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                    reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                    reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                    reflectiveCurveTo(14.76f, 17f, 12f, 17f)
                    close()
                    moveTo(14f, 14f)
                    curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                    lineToRelative(-1.65f, -1.65f)
                    curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                    verticalLineTo(9.5f)
                    curveTo(11.5f, 9.22f, 11.72f, 9f, 12f, 9f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineToRelative(2.29f)
                    lineToRelative(1.5f, 1.5f)
                    curveTo(14.2f, 13.49f, 14.2f, 13.8f, 14f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Safety_check!!
    }

private var _Safety_check: ImageVector? = null

