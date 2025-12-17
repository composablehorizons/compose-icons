package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dynamic_form: ImageVector
    get() {
        if (_Dynamic_form != null) return _Dynamic_form!!
        
        _Dynamic_form = ImageVector.Builder(
            name = "dynamic_form",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.68f, 9.71f)
                    lineToRelative(-3.72f, 8.19f)
                    curveTo(17.73f, 18.39f, 17f, 18.23f, 17f, 17.69f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(-1.5f)
                    curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                    verticalLineToRelative(-6f)
                    curveTo(15f, 4.22f, 15.22f, 4f, 15.5f, 4f)
                    horizontalLineToRelative(5.76f)
                    curveToRelative(0.35f, 0f, 0.6f, 0.36f, 0.46f, 0.69f)
                    lineTo(20f, 9f)
                    horizontalLineToRelative(1.22f)
                    curveTo(21.59f, 9f, 21.83f, 9.38f, 21.68f, 9.71f)
                    close()
                    moveTo(15f, 13f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(6.25f, 16.5f)
                    curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                    reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                    curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                    reflectiveCurveTo(6.25f, 16.91f, 6.25f, 16.5f)
                    close()
                    moveTo(13f, 4f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(6.25f, 7.5f)
                    curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                    reflectiveCurveTo(4.75f, 7.09f, 4.75f, 7.5f)
                    curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                    reflectiveCurveTo(6.25f, 7.91f, 6.25f, 7.5f)
                    close()
                }
            }
        }.build()
        
        return _Dynamic_form!!
    }

private var _Dynamic_form: ImageVector? = null

