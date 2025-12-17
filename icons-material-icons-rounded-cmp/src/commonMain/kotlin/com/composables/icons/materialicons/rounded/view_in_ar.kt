package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.View_in_ar: ImageVector
    get() {
        if (_View_in_ar != null) return _View_in_ar!!
        
        _View_in_ar = ImageVector.Builder(
            name = "view_in_ar",
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
                        moveTo(2f, 6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(5.55f, 1f, 5f, 1f)
                        horizontalLineTo(4f)
                        curveTo(2.34f, 1f, 1f, 2.34f, 1f, 4f)
                        verticalLineToRelative(1f)
                        curveTo(1f, 5.55f, 1.45f, 6f, 2f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 21f)
                        horizontalLineTo(4f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(5.55f, 21f, 5f, 21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 1f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(4f)
                        curveTo(23f, 2.34f, 21.66f, 1f, 20f, 1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 18f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        verticalLineToRelative(-1f)
                        curveTo(23f, 18.45f, 22.55f, 18f, 22f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 14.87f)
                        verticalLineTo(9.13f)
                        curveToRelative(0f, -0.72f, -0.38f, -1.38f, -1f, -1.73f)
                        lineToRelative(-5f, -2.88f)
                        curveToRelative(-0.31f, -0.18f, -0.65f, -0.27f, -1f, -0.27f)
                        reflectiveCurveToRelative(-0.69f, 0.09f, -1f, 0.27f)
                        lineTo(6f, 7.39f)
                        curveTo(5.38f, 7.75f, 5f, 8.41f, 5f, 9.13f)
                        verticalLineToRelative(5.74f)
                        curveToRelative(0f, 0.72f, 0.38f, 1.38f, 1f, 1.73f)
                        lineToRelative(5f, 2.88f)
                        curveToRelative(0.31f, 0.18f, 0.65f, 0.27f, 1f, 0.27f)
                        reflectiveCurveToRelative(0.69f, -0.09f, 1f, -0.27f)
                        lineToRelative(5f, -2.88f)
                        curveTo(18.62f, 16.25f, 19f, 15.59f, 19f, 14.87f)
                        close()
                        moveTo(11f, 17.17f)
                        lineToRelative(-4f, -2.3f)
                        verticalLineToRelative(-4.63f)
                        lineToRelative(4f, 2.33f)
                        verticalLineTo(17.17f)
                        close()
                        moveTo(12f, 10.84f)
                        lineTo(8.04f, 8.53f)
                        lineTo(12f, 6.25f)
                        lineToRelative(3.96f, 2.28f)
                        lineTo(12f, 10.84f)
                        close()
                        moveTo(17f, 14.87f)
                        lineToRelative(-4f, 2.3f)
                        verticalLineToRelative(-4.6f)
                        lineToRelative(4f, -2.33f)
                        verticalLineTo(14.87f)
                        close()
                    }
                }
            }
        }.build()
        
        return _View_in_ar!!
    }

private var _View_in_ar: ImageVector? = null

