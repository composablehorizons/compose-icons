package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Savings: ImageVector
    get() {
        if (_Savings != null) return _Savings!!
        
        _Savings = ImageVector.Builder(
            name = "savings",
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
                    moveTo(15f, 10f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveTo(15f, 10.55f, 15f, 10f)
                    close()
                    moveTo(8f, 9f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(7f)
                    horizontalLineTo(8f)
                    verticalLineTo(9f)
                    close()
                    moveTo(22f, 7.5f)
                    verticalLineToRelative(6.97f)
                    lineToRelative(-2.82f, 0.94f)
                    lineTo(17.5f, 21f)
                    lineTo(12f, 21f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    lineToRelative(-5.5f, 0f)
                    curveTo(4.5f, 21f, 2f, 12.54f, 2f, 9.5f)
                    reflectiveCurveTo(4.46f, 4f, 7.5f, 4f)
                    lineToRelative(5f, 0f)
                    curveToRelative(0.91f, -1.21f, 2.36f, -2f, 4f, -2f)
                    curveTo(17.33f, 2f, 18f, 2.67f, 18f, 3.5f)
                    curveToRelative(0f, 0.21f, -0.04f, 0.4f, -0.12f, 0.58f)
                    curveToRelative(-0.14f, 0.34f, -0.26f, 0.73f, -0.32f, 1.15f)
                    lineToRelative(2.27f, 2.27f)
                    horizontalLineTo(22f)
                    close()
                    moveTo(20f, 9.5f)
                    horizontalLineToRelative(-1f)
                    lineTo(15.5f, 6f)
                    curveToRelative(0f, -0.65f, 0.09f, -1.29f, 0.26f, -1.91f)
                    curveTo(14.79f, 4.34f, 14f, 5.06f, 13.67f, 6f)
                    lineTo(7.5f, 6f)
                    curveTo(5.57f, 6f, 4f, 7.57f, 4f, 9.5f)
                    curveToRelative(0f, 1.88f, 1.22f, 6.65f, 2.01f, 9.5f)
                    lineTo(8f, 19f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(2f)
                    lineToRelative(2.01f, 0f)
                    lineToRelative(1.55f, -5.15f)
                    lineTo(20f, 13.03f)
                    verticalLineTo(9.5f)
                    close()
                }
            }
        }.build()
        
        return _Savings!!
    }

private var _Savings: ImageVector? = null

