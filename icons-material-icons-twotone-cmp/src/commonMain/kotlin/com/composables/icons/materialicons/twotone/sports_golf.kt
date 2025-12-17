package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sports_golf: ImageVector
    get() {
        if (_Sports_golf != null) return _Sports_golf!!
        
        _Sports_golf = ImageVector.Builder(
            name = "sports_golf",
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
                        moveTo(12f, 14f)
                        curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                        reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                        reflectiveCurveTo(7f, 6.24f, 7f, 9f)
                        reflectiveCurveTo(9.24f, 14f, 12f, 14f)
                        close()
                        moveTo(14f, 7f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        curveTo(13f, 7.45f, 13.45f, 7f, 14f, 7f)
                        close()
                        moveTo(12f, 5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        curveTo(11f, 5.45f, 11.45f, 5f, 12f, 5f)
                        close()
                        moveTo(10f, 7f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveTo(9f, 8.55f, 9f, 8f)
                        curveTo(9f, 7.45f, 9.45f, 7f, 10f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 16f)
                        curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                        curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                        curveTo(8.13f, 2f, 5f, 5.13f, 5f, 9f)
                        curveTo(5f, 12.87f, 8.13f, 16f, 12f, 16f)
                        close()
                        moveTo(12f, 4f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                        reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                        reflectiveCurveTo(9.24f, 4f, 12f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 8f)
                        arcTo(1f, 1f, 0f, false, true, 10f, 9f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 8f)
                        arcTo(1f, 1f, 0f, false, true, 11f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 8f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 9f)
                        arcTo(1f, 1f, 0f, false, true, 13f, 8f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 6f)
                        arcTo(1f, 1f, 0f, false, true, 12f, 7f)
                        arcTo(1f, 1f, 0f, false, true, 11f, 6f)
                        arcTo(1f, 1f, 0f, false, true, 13f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 19f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_golf!!
    }

private var _Sports_golf: ImageVector? = null

