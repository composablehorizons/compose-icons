package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Next_plan: ImageVector
    get() {
        if (_Next_plan != null) return _Next_plan!!
        
        _Next_plan = ImageVector.Builder(
            name = "next_plan",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                        reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                        reflectiveCurveTo(16.42f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.97f, 11.03f)
                        curveTo(14.87f, 9.79f, 13.28f, 9f, 11.5f, 9f)
                        curveToRelative(-2.82f, 0f, -5.18f, 1.95f, -5.82f, 4.56f)
                        lineToRelative(0.96f, 0.32f)
                        curveTo(7.15f, 11.66f, 9.13f, 10f, 11.5f, 10f)
                        curveToRelative(1.51f, 0f, 2.85f, 0.68f, 3.76f, 1.74f)
                        lineTo(13f, 14f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(9f)
                        lineTo(15.97f, 11.03f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Next_plan!!
    }

private var _Next_plan: ImageVector? = null

