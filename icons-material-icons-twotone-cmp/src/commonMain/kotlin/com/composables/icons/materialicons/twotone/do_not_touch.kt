package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Do_not_touch: ImageVector
    get() {
        if (_Do_not_touch != null) return _Do_not_touch!!
        
        _Do_not_touch = ImageVector.Builder(
            name = "do_not_touch",
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
                    moveTo(18f, 15.17f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(-2.17f)
                    lineTo(18f, 15.17f)
                    close()
                    moveTo(9f, 11.83f)
                    lineToRelative(8.14f, 8.14f)
                    curveTo(17.09f, 19.98f, 17.05f, 20f, 17f, 20f)
                    horizontalLineToRelative(-6f)
                    curveToRelative(-0.39f, 0f, -0.64f, -0.23f, -0.75f, -0.36f)
                    lineTo(6.87f, 16f)
                    horizontalLineTo(9f)
                    lineTo(9f, 11.83f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(7f, 9.83f)
                    lineToRelative(0f, 4.3f)
                    lineToRelative(-2.6f, -1.48f)
                    curveToRelative(-0.17f, -0.09f, -0.34f, -0.14f, -0.54f, -0.14f)
                    curveToRelative(-0.26f, 0f, -0.5f, 0.09f, -0.7f, 0.26f)
                    lineTo(2f, 13.88f)
                    lineToRelative(6.8f, 7.18f)
                    curveToRelative(0.57f, 0.6f, 1.35f, 0.94f, 2.18f, 0.94f)
                    horizontalLineTo(17f)
                    curveToRelative(0.62f, 0f, 1.18f, -0.19f, 1.66f, -0.52f)
                    lineToRelative(1.12f, 1.12f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.81f, 2.81f)
                    close()
                    moveTo(17f, 20f)
                    horizontalLineToRelative(-6f)
                    curveToRelative(-0.39f, 0f, -0.64f, -0.23f, -0.75f, -0.36f)
                    lineTo(6.87f, 16f)
                    horizontalLineTo(9f)
                    lineToRelative(0f, -4.17f)
                    lineToRelative(8.14f, 8.14f)
                    curveTo(17.09f, 19.98f, 17.05f, 20f, 17f, 20f)
                    close()
                    moveTo(13.83f, 11f)
                    horizontalLineTo(14f)
                    verticalLineTo(3.25f)
                    curveTo(14f, 2.56f, 14.56f, 2f, 15.25f, 2f)
                    reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                    verticalLineTo(11f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(5.25f)
                    curveTo(17.5f, 4.56f, 18.06f, 4f, 18.75f, 4f)
                    reflectiveCurveTo(20f, 4.56f, 20f, 5.25f)
                    verticalLineToRelative(11.92f)
                    lineToRelative(-2f, -2f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(-2.17f)
                    lineTo(13.83f, 11f)
                    close()
                    moveTo(13f, 10.17f)
                    verticalLineTo(2.25f)
                    curveTo(13f, 1.56f, 12.44f, 1f, 11.75f, 1f)
                    reflectiveCurveTo(10.5f, 1.56f, 10.5f, 2.25f)
                    verticalLineToRelative(5.42f)
                    lineTo(13f, 10.17f)
                    close()
                    moveTo(9.5f, 6.67f)
                    verticalLineTo(4.25f)
                    curveTo(9.5f, 3.56f, 8.94f, 3f, 8.25f, 3f)
                    curveToRelative(-0.67f, 0f, -1.2f, 0.53f, -1.24f, 1.18f)
                    verticalLineToRelative(0f)
                    lineTo(9.5f, 6.67f)
                    close()
                }
            }
        }.build()
        
        return _Do_not_touch!!
    }

private var _Do_not_touch: ImageVector? = null

