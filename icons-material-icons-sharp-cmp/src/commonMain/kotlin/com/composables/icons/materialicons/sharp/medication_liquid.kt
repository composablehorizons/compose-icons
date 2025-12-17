package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Medication_liquid: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 3f)
                        horizontalLineTo(15f)
                        verticalLineTo(5f)
                        horizontalLineTo(3f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.5f, 17.5f)
                        lineTo(10.5f, 17.5f)
                        lineTo(10.5f, 15f)
                        lineTo(13f, 15f)
                        lineTo(13f, 12f)
                        lineTo(10.5f, 12f)
                        lineTo(10.5f, 9.5f)
                        lineTo(7.5f, 9.5f)
                        lineTo(7.5f, 12f)
                        lineTo(5f, 12f)
                        lineTo(5f, 15f)
                        lineTo(7.5f, 15f)
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
                        moveTo(14f, 19f)
                        horizontalLineTo(4f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(19f)
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
                        moveTo(20f, 12f)
                        curveToRelative(-0.41f, 0f, -1f, -0.78f, -1f, -2f)
                        reflectiveCurveToRelative(0.59f, -2f, 1f, -2f)
                        reflectiveCurveToRelative(1f, 0.78f, 1f, 2f)
                        reflectiveCurveTo(20.41f, 12f, 20f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Medication_liquid!!
    }

private var _Medication_liquid: ImageVector? = null

