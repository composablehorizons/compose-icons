package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Medication_liquid: ImageVector
    get() {
        if (_Medication_liquid != null) return _Medication_liquid!!
        
        _Medication_liquid = ImageVector.Builder(
            name = "medication_liquid",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 5f)
                        horizontalLineToRelative(10f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 3f, 3f, 3.45f, 3f, 4f)
                        reflectiveCurveTo(3.45f, 5f, 4f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 6f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 6f, 2f, 6.9f, 2f, 8f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        curveTo(16f, 6.9f, 15.1f, 6f, 14f, 6f)
                        close()
                        moveTo(11.5f, 15f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        reflectiveCurveTo(7.5f, 16.83f, 7.5f, 16f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-1f)
                        curveTo(5.67f, 15f, 5f, 14.33f, 5f, 13.5f)
                        curveTo(5f, 12.67f, 5.67f, 12f, 6.5f, 12f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        curveTo(13f, 14.33f, 12.33f, 15f, 11.5f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 6f)
                        curveToRelative(-1.68f, 0f, -3f, 1.76f, -3f, 4f)
                        curveToRelative(0f, 1.77f, 0.83f, 3.22f, 2f, 3.76f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-6.24f)
                        curveToRelative(1.17f, -0.54f, 2f, -1.99f, 2f, -3.76f)
                        curveTo(23f, 7.76f, 21.68f, 6f, 20f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Medication_liquid!!
    }

private var _Medication_liquid: ImageVector? = null

