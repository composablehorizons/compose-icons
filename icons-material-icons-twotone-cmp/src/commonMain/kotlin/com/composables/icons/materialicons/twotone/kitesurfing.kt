package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Kitesurfing: ImageVector
    get() {
        if (_Kitesurfing != null) return _Kitesurfing!!
        
        _Kitesurfing = ImageVector.Builder(
            name = "kitesurfing",
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
                    moveTo(6f, 3f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveTo(6f, 4.1f, 6f, 3f)
                    close()
                    moveTo(20.06f, 1f)
                    horizontalLineToRelative(-2.12f)
                    lineTo(15.5f, 3.44f)
                    lineToRelative(1.06f, 1.06f)
                    lineTo(20.06f, 1f)
                    close()
                    moveTo(22f, 23f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-1.04f, 0f, -2.08f, -0.35f, -3f, -1f)
                    curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6f, 0f)
                    curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6f, 0f)
                    curveToRelative(-0.91f, 0.65f, -1.96f, 1f, -3f, 1f)
                    horizontalLineTo(2f)
                    lineToRelative(0f, 2f)
                    horizontalLineToRelative(1f)
                    curveToRelative(1.03f, 0f, 2.05f, -0.25f, 3f, -0.75f)
                    curveToRelative(1.89f, 1f, 4.11f, 1f, 6f, 0f)
                    curveToRelative(1.89f, 1f, 4.11f, 1f, 6f, 0f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3f, 0.75f)
                    horizontalLineTo(22f)
                    close()
                    moveTo(21f, 13.28f)
                    curveToRelative(0f, 1.44f, -2.19f, 3.62f, -5.04f, 5.58f)
                    curveTo(15.65f, 18.95f, 15.33f, 19f, 15f, 19f)
                    curveToRelative(-1.2f, 0f, -2.27f, -0.66f, -3f, -1.5f)
                    curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3f, 1.5f)
                    curveToRelative(-0.94f, 0f, -1.81f, -0.41f, -2.49f, -0.99f)
                    curveToRelative(0.46f, -0.39f, 0.96f, -0.78f, 1.49f, -1.17f)
                    lineToRelative(-1.55f, -2.97f)
                    curveTo(6.15f, 13.3f, 6f, 12.64f, 6f, 12f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(3f)
                    curveToRelative(1.38f, 0f, 2.63f, -0.56f, 3.54f, -1.46f)
                    lineToRelative(1.41f, 1.41f)
                    curveTo(14.68f, 7.21f, 12.93f, 8f, 11f, 8f)
                    horizontalLineTo(9.6f)
                    lineToRelative(0f, 3.5f)
                    horizontalLineToRelative(2.8f)
                    lineToRelative(1.69f, 1.88f)
                    curveToRelative(1.95f, -0.84f, 3.77f, -1.38f, 5.06f, -1.38f)
                    curveTo(19.99f, 12f, 21f, 12.25f, 21f, 13.28f)
                    close()
                    moveTo(12.2f, 14.27f)
                    lineToRelative(-0.7f, -0.77f)
                    lineTo(9f, 13.6f)
                    lineToRelative(0.83f, 2.01f)
                    curveTo(10.42f, 15.23f, 11.64f, 14.55f, 12.2f, 14.27f)
                    close()
                }
            }
        }.build()
        
        return _Kitesurfing!!
    }

private var _Kitesurfing: ImageVector? = null

