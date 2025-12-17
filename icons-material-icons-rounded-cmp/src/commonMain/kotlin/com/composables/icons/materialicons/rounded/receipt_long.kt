package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Receipt_long: ImageVector
    get() {
        if (_Receipt_long != null) return _Receipt_long!!
        
        _Receipt_long = ImageVector.Builder(
            name = "receipt_long",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 9f)
                    horizontalLineToRelative(-4f)
                    curveTo(9.45f, 9f, 9f, 8.55f, 9f, 8f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(15f, 8.55f, 14.55f, 9f, 14f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 12f)
                    horizontalLineToRelative(-4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(15f, 11.55f, 14.55f, 12f, 14f, 12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.5f, 3.5f)
                    lineTo(18f, 2f)
                    lineToRelative(-1.5f, 1.5f)
                    lineTo(15f, 2f)
                    lineToRelative(-1.5f, 1.5f)
                    lineTo(12f, 2f)
                    lineToRelative(-1.5f, 1.5f)
                    lineTo(9f, 2f)
                    lineTo(7.5f, 3.5f)
                    lineTo(6f, 2f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                    verticalLineTo(2f)
                    lineTo(19.5f, 3.5f)
                    close()
                    moveTo(15f, 20f)
                    horizontalLineTo(6f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(3f)
                    horizontalLineToRelative(4f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(20f)
                    close()
                    moveTo(19f, 19f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    horizontalLineTo(8f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(19f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 8f)
                    arcTo(1f, 1f, 0f, false, true, 17f, 9f)
                    arcTo(1f, 1f, 0f, false, true, 16f, 8f)
                    arcTo(1f, 1f, 0f, false, true, 18f, 8f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 11f)
                    arcTo(1f, 1f, 0f, false, true, 17f, 12f)
                    arcTo(1f, 1f, 0f, false, true, 16f, 11f)
                    arcTo(1f, 1f, 0f, false, true, 18f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Receipt_long!!
    }

private var _Receipt_long: ImageVector? = null

