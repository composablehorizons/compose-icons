package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bathroom: ImageVector
    get() {
        if (_Bathroom != null) return _Bathroom!!
        
        _Bathroom = ImageVector.Builder(
            name = "bathroom",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(4f, 20f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(4f)
                        horizontalLineTo(4f)
                        verticalLineTo(20f)
                        close()
                        moveTo(9f, 18f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(9.55f, 18f, 9f, 18f)
                        close()
                        moveTo(9f, 15f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(9.55f, 15f, 9f, 15f)
                        close()
                        moveTo(12f, 18f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(12.55f, 18f, 12f, 18f)
                        close()
                        moveTo(12f, 15f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(12.55f, 15f, 12f, 15f)
                        close()
                        moveTo(15f, 18f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(15.55f, 18f, 15f, 18f)
                        close()
                        moveTo(15f, 15f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(15.55f, 15f, 15f, 15f)
                        close()
                        moveTo(7f, 11f)
                        curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                        reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(7f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 15f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 12f, 15f)
                        arcTo(1f, 1f, 0f, false, true, 11f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 13f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 18f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineTo(4f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 11f)
                        curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                        reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(11f)
                        close()
                        moveTo(8.54f, 10.5f)
                        curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                        reflectiveCurveToRelative(3.22f, 1.31f, 3.47f, 3f)
                        horizontalLineTo(8.54f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 18f)
                        arcTo(1f, 1f, 0f, false, true, 8f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 10f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 15f)
                        arcTo(1f, 1f, 0f, false, true, 8f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 10f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 12f, 18f)
                        arcTo(1f, 1f, 0f, false, true, 11f, 17f)
                        arcTo(1f, 1f, 0f, false, true, 13f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bathroom!!
    }

private var _Bathroom: ImageVector? = null

