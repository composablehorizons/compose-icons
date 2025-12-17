package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Savings: ImageVector
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
                    curveToRelative(0.11f, -0.26f, 0.15f, -0.56f, 0.09f, -0.87f)
                    curveTo(17.84f, 2.49f, 17.14f, 1.99f, 16.4f, 2f)
                    curveToRelative(-1.59f, 0.03f, -3f, 0.81f, -3.9f, 2f)
                    lineToRelative(-5f, 0f)
                    curveTo(4.46f, 4f, 2f, 6.46f, 2f, 9.5f)
                    curveToRelative(0f, 2.25f, 1.37f, 7.48f, 2.08f, 10.04f)
                    curveTo(4.32f, 20.4f, 5.11f, 21f, 6.01f, 21f)
                    lineTo(8f, 21f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(0f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    lineToRelative(2.01f, 0f)
                    curveToRelative(0.88f, 0f, 1.66f, -0.58f, 1.92f, -1.43f)
                    lineToRelative(1.25f, -4.16f)
                    lineToRelative(2.14f, -0.72f)
                    curveToRelative(0.41f, -0.14f, 0.68f, -0.52f, 0.68f, -0.95f)
                    verticalLineTo(8.5f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(19.83f)
                    close()
                    moveTo(12f, 9f)
                    horizontalLineTo(9f)
                    curveTo(8.45f, 9f, 8f, 8.55f, 8f, 8f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(13f, 8.55f, 12.55f, 9f, 12f, 9f)
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

