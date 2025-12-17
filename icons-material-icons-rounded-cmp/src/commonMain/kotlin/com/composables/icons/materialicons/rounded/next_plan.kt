package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Next_plan: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(18f, 13.97f)
                    horizontalLineToRelative(-5f)
                    lineToRelative(2.26f, -2.26f)
                    curveToRelative(-0.91f, -1.06f, -2.25f, -1.74f, -3.76f, -1.74f)
                    curveToRelative(-2.37f, 0f, -4.35f, 1.66f, -4.86f, 3.88f)
                    lineToRelative(-0.96f, -0.32f)
                    curveToRelative(0.64f, -2.62f, 3f, -4.56f, 5.82f, -4.56f)
                    curveToRelative(1.78f, 0f, 3.37f, 0.79f, 4.47f, 2.03f)
                    lineTo(18f, 8.97f)
                    verticalLineTo(13.97f)
                    close()
                }
            }
        }.build()
        
        return _Next_plan!!
    }

private var _Next_plan: ImageVector? = null

