package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Not_accessible: ImageVector
    get() {
        if (_Not_accessible != null) return _Not_accessible!!
        
        _Not_accessible = ImageVector.Builder(
            name = "not_accessible",
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
                    moveTo(10f, 4f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    reflectiveCurveTo(10f, 5.1f, 10f, 4f)
                    close()
                    moveTo(19f, 13f)
                    verticalLineToRelative(-2f)
                    curveToRelative(-1.54f, 0.02f, -3.09f, -0.75f, -4.07f, -1.83f)
                    lineToRelative(-1.29f, -1.43f)
                    curveTo(13.4f, 7.5f, 13.2f, 7.38f, 13.01f, 7.28f)
                    curveToRelative(-0.36f, -0.19f, -0.72f, -0.3f, -1.2f, -0.26f)
                    curveToRelative(-0.49f, 0.04f, -0.91f, 0.27f, -1.23f, 0.61f)
                    lineTo(14f, 11.05f)
                    curveTo(15.29f, 12.12f, 17.25f, 12.99f, 19f, 13f)
                    close()
                    moveTo(10f, 20f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    curveToRelative(0f, -1.31f, 0.84f, -2.41f, 2f, -2.83f)
                    verticalLineTo(12.1f)
                    curveToRelative(-2.28f, 0.46f, -4f, 2.48f, -4f, 4.9f)
                    curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                    curveToRelative(2.42f, 0f, 4.44f, -1.72f, 4.9f, -4f)
                    horizontalLineToRelative(-2.07f)
                    curveTo(12.42f, 19.16f, 11.31f, 20f, 10f, 20f)
                    close()
                    moveTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(10f, 12.83f)
                    verticalLineTo(15f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(2.17f)
                    lineToRelative(5.61f, 5.61f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    close()
                }
            }
        }.build()
        
        return _Not_accessible!!
    }

private var _Not_accessible: ImageVector? = null

