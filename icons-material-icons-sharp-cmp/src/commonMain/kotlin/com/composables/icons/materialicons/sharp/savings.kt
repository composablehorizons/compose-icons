package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Savings: ImageVector
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
                    moveTo(19.83f, 7.5f)
                    lineToRelative(-2.27f, -2.27f)
                    curveToRelative(0.07f, -0.42f, 0.18f, -0.81f, 0.32f, -1.15f)
                    curveToRelative(0.23f, -0.56f, 0.56f, -1.06f, 0.97f, -1.5f)
                    curveTo(18.15f, 2.21f, 17.35f, 2f, 16.5f, 2f)
                    curveToRelative(-1.64f, 0f, -3.09f, 0.79f, -4f, 2f)
                    lineToRelative(-5f, 0f)
                    curveTo(4.46f, 4f, 2f, 6.46f, 2f, 9.5f)
                    reflectiveCurveTo(4.5f, 21f, 4.5f, 21f)
                    lineToRelative(5.5f, 0f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    lineToRelative(5.5f, 0f)
                    lineToRelative(1.68f, -5.59f)
                    lineTo(22f, 14.47f)
                    verticalLineTo(7.5f)
                    horizontalLineTo(19.83f)
                    close()
                    moveTo(13f, 9f)
                    horizontalLineTo(8f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(9f)
                    close()
                    moveTo(16f, 11f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveTo(17f, 10.55f, 16.55f, 11f, 16f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Savings!!
    }

private var _Savings: ImageVector? = null

