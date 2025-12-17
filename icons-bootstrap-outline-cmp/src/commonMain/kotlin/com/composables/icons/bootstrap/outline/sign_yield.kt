package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignYield: ImageVector
    get() {
        if (_SignYield != null) return _SignYield!!
        
        _SignYield = ImageVector.Builder(
            name = "sign-yield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.506f, 6.232f)
                verticalLineTo(7f)
                horizontalLineTo(5.11f)
                verticalLineToRelative(-0.76f)
                lineTo(4.44f, 5f)
                horizontalLineToRelative(0.44f)
                lineToRelative(0.424f, 0.849f)
                horizontalLineToRelative(0.016f)
                lineTo(5.748f, 5f)
                horizontalLineToRelative(0.428f)
                close()
                moveTo(6.628f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.396f)
                verticalLineTo(5f)
                close()
                moveToRelative(0.684f, 1.676f)
                horizontalLineToRelative(0.895f)
                verticalLineTo(7f)
                horizontalLineTo(6.919f)
                verticalLineTo(5f)
                horizontalLineToRelative(1.288f)
                verticalLineToRelative(0.324f)
                horizontalLineToRelative(-0.895f)
                verticalLineToRelative(0.513f)
                horizontalLineToRelative(0.842f)
                verticalLineToRelative(0.303f)
                horizontalLineToRelative(-0.842f)
                close()
                moveToRelative(1.521f, -0.013f)
                horizontalLineToRelative(0.848f)
                verticalLineTo(7f)
                horizontalLineTo(8.437f)
                verticalLineTo(5f)
                horizontalLineToRelative(0.396f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.804f, 7f)
                verticalLineTo(5f)
                horizontalLineToRelative(0.73f)
                curveToRelative(0.607f, 0f, 0.894f, 0.364f, 0.894f, 0.995f)
                curveToRelative(0f, 0.636f, -0.291f, 1.005f, -0.895f, 1.005f)
                close()
                moveToRelative(0.676f, -1.677f)
                horizontalLineToRelative(-0.28f)
                verticalLineToRelative(1.353f)
                horizontalLineToRelative(0.28f)
                curveToRelative(0.372f, 0f, 0.54f, -0.222f, 0.54f, -0.674f)
                curveToRelative(0f, -0.45f, -0.169f, -0.68f, -0.54f, -0.68f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.022f, 14.434f)
                arcToRelative(1.131f, 1.131f, 0f, false, false, 1.96f, 0f)
                lineToRelative(6.857f, -11.667f)
                curveToRelative(0.457f, -0.778f, -0.092f, -1.767f, -0.98f, -1.767f)
                horizontalLineTo(1.144f)
                curveToRelative(-0.889f, 0f, -1.437f, 0.99f, -0.98f, 1.767f)
                close()
                moveToRelative(0.98f, -0.434f)
                arcToRelative(0.13f, 0.13f, 0f, false, true, -0.064f, -0.016f)
                arcToRelative(0.15f, 0.15f, 0f, false, true, -0.054f, -0.057f)
                lineTo(1.027f, 2.26f)
                arcToRelative(0.18f, 0.18f, 0f, false, true, -0.002f, -0.183f)
                arcToRelative(0.2f, 0.2f, 0f, false, true, 0.054f, -0.06f)
                arcTo(0.1f, 0.1f, 0f, false, true, 1.145f, 2f)
                horizontalLineToRelative(13.713f)
                arcToRelative(0.12f, 0.12f, 0f, false, true, 0.066f, 0.017f)
                quadToRelative(0.028f, 0.015f, 0.055f, 0.06f)
                arcToRelative(0.18f, 0.18f, 0f, false, true, -0.003f, 0.183f)
                lineTo(8.12f, 13.927f)
                arcToRelative(0.15f, 0.15f, 0f, false, true, -0.054f, 0.057f)
                arcToRelative(0.13f, 0.13f, 0f, false, true, -0.063f, 0.016f)
                close()
            }
        }.build()
        
        return _SignYield!!
    }

private var _SignYield: ImageVector? = null

