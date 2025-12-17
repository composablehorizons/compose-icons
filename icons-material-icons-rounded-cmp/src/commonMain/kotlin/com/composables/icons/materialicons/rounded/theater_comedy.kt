package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Theater_comedy: ImageVector
    get() {
        if (_Theater_comedy != null) return _Theater_comedy!!
        
        _Theater_comedy = ImageVector.Builder(
            name = "theater_comedy",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 2f)
                        horizontalLineToRelative(-8f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(3.5f)
                        horizontalLineToRelative(1.5f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(4.95f)
                        curveToRelative(1.04f, 0.48f, 2.24f, 0.68f, 3.5f, 0.47f)
                        curveToRelative(2.93f, -0.49f, 5f, -3.17f, 5f, -6.14f)
                        verticalLineTo(4f)
                        curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                        close()
                        moveTo(14f, 6.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        reflectiveCurveTo(14f, 7.05f, 14f, 6.5f)
                        close()
                        moveTo(18.85f, 10.88f)
                        horizontalLineToRelative(-3.72f)
                        curveToRelative(-0.38f, 0f, -0.63f, -0.41f, -0.44f, -0.75f)
                        curveTo(15.08f, 9.47f, 15.96f, 9f, 16.99f, 9f)
                        reflectiveCurveToRelative(1.91f, 0.47f, 2.3f, 1.14f)
                        curveTo(19.48f, 10.47f, 19.23f, 10.88f, 18.85f, 10.88f)
                        close()
                        moveTo(19f, 7.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(19.55f, 7.5f, 19f, 7.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 9f)
                        horizontalLineTo(3f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(4.79f)
                        curveToRelative(0f, 3.05f, 2.19f, 5.77f, 5.21f, 6.16f)
                        curveTo(9.87f, 22.42f, 13f, 19.57f, 13f, 16f)
                        verticalLineToRelative(-5f)
                        curveTo(13f, 9.9f, 12.1f, 9f, 11f, 9f)
                        close()
                        moveTo(4f, 13.5f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        reflectiveCurveTo(4f, 14.05f, 4f, 13.5f)
                        close()
                        moveTo(9.3f, 16.75f)
                        curveToRelative(-0.38f, 0.67f, -1.27f, 1.14f, -2.3f, 1.14f)
                        reflectiveCurveToRelative(-1.91f, -0.47f, -2.3f, -1.14f)
                        curveTo(4.51f, 16.41f, 4.76f, 16f, 5.14f, 16f)
                        horizontalLineToRelative(3.72f)
                        curveTo(9.24f, 16f, 9.49f, 16.41f, 9.3f, 16.75f)
                        close()
                        moveTo(9f, 14.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(9.55f, 14.5f, 9f, 14.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Theater_comedy!!
    }

private var _Theater_comedy: ImageVector? = null

