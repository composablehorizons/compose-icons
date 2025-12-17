package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Tty: ImageVector
    get() {
        if (_Tty != null) return _Tty!!
        
        _Tty = ImageVector.Builder(
            name = "tty",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15f, 4f)
                    lineTo(15f, 4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(14f, 4.45f, 14.45f, 4f, 15f, 4f)
                    close()
                    moveTo(14f, 7f)
                    lineTo(14f, 7f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(13f, 7.45f, 13.45f, 7f, 14f, 7f)
                    close()
                    moveTo(12f, 4f)
                    lineTo(12f, 4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 4.45f, 11.45f, 4f, 12f, 4f)
                    close()
                    moveTo(17f, 9f)
                    lineTo(17f, 9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(18f, 8.55f, 17.55f, 9f, 17f, 9f)
                    close()
                    moveTo(18f, 6f)
                    lineTo(18f, 6f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(19f, 5.55f, 18.55f, 6f, 18f, 6f)
                    close()
                    moveTo(20f, 9f)
                    lineTo(20f, 9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(21f, 8.55f, 20.55f, 9f, 20f, 9f)
                    close()
                    moveTo(21f, 6f)
                    lineTo(21f, 6f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(22f, 5.55f, 21.55f, 6f, 21f, 6f)
                    close()
                    moveTo(14.62f, 14.38f)
                    lineTo(12.1f, 16.9f)
                    curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6f, -6f)
                    lineToRelative(2.52f, -2.52f)
                    curveTo(8.86f, 8.14f, 8.96f, 7.8f, 8.9f, 7.48f)
                    lineTo(8.16f, 3.8f)
                    curveTo(8.07f, 3.34f, 7.66f, 3f, 7.18f, 3f)
                    horizontalLineTo(3.03f)
                    curveTo(2.47f, 3f, 2f, 3.47f, 2.03f, 4.03f)
                    curveTo(2.2f, 6.92f, 3.05f, 9.63f, 4.43f, 12f)
                    curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f)
                    curveToRelative(2.37f, 1.37f, 5.08f, 2.23f, 7.97f, 2.4f)
                    curveToRelative(0.56f, 0.03f, 1.03f, -0.44f, 1.03f, -1f)
                    verticalLineToRelative(-4.15f)
                    curveToRelative(0f, -0.48f, -0.34f, -0.89f, -0.8f, -0.98f)
                    lineToRelative(-3.67f, -0.73f)
                    curveTo(15.2f, 14.04f, 14.86f, 14.14f, 14.62f, 14.38f)
                    close()
                    moveTo(15f, 10f)
                    lineTo(15f, 10f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(14f, 10.45f, 14.45f, 10f, 15f, 10f)
                    close()
                    moveTo(12f, 10f)
                    lineTo(12f, 10f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(11f, 10.45f, 11.45f, 10f, 12f, 10f)
                    close()
                    moveTo(18f, 12f)
                    lineTo(18f, 12f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(19f, 11.55f, 18.55f, 12f, 18f, 12f)
                    close()
                    moveTo(21f, 12f)
                    lineTo(21f, 12f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(22f, 11.55f, 21.55f, 12f, 21f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Tty!!
    }

private var _Tty: ImageVector? = null

