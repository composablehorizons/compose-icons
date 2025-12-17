package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GraphLeft: ImageVector
    get() {
        if (_GraphLeft != null) return _GraphLeft!!
        
        _GraphLeft = ImageVector.Builder(
            name = "graph-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.25001f, 4.99998f)
                horizontalLineTo(4.75001f)
                curveTo(4.33601f, 4.99998f, 4.00001f, 5.33598f, 4.00001f, 5.74998f)
                verticalLineTo(14.25f)
                curveTo(4.00001f, 14.663f, 4.33601f, 15f, 4.75001f, 15f)
                horizontalLineTo(6.25001f)
                curveTo(6.66401f, 15f, 7.00001f, 14.663f, 7.00001f, 14.25f)
                verticalLineTo(5.74998f)
                curveTo(7.00001f, 5.33598f, 6.66401f, 4.99998f, 6.25001f, 4.99998f)
                close()
                moveTo(6.00001f, 14f)
                horizontalLineTo(5.00001f)
                verticalLineTo(5.99998f)
                horizontalLineTo(6.00001f)
                verticalLineTo(14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.25f, 4.99998f)
                horizontalLineTo(8.75001f)
                curveTo(8.33601f, 4.99998f, 8.00001f, 5.33598f, 8.00001f, 5.74998f)
                verticalLineTo(12.25f)
                curveTo(8.00001f, 12.663f, 8.33601f, 13f, 8.75001f, 13f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 13f, 11f, 12.663f, 11f, 12.25f)
                verticalLineTo(5.74998f)
                curveTo(11f, 5.33598f, 10.664f, 4.99998f, 10.25f, 4.99998f)
                close()
                moveTo(10f, 12f)
                horizontalLineTo(9.00001f)
                verticalLineTo(5.99998f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.25f, 4.99998f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 4.99998f, 12f, 5.33598f, 12f, 5.74998f)
                verticalLineTo(10.25f)
                curveTo(12f, 10.663f, 12.336f, 11f, 12.75f, 11f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 11f, 15f, 10.663f, 15f, 10.25f)
                verticalLineTo(5.74998f)
                curveTo(15f, 5.33598f, 14.664f, 4.99998f, 14.25f, 4.99998f)
                close()
                moveTo(14f, 9.99998f)
                horizontalLineTo(13f)
                verticalLineTo(5.99998f)
                horizontalLineTo(14f)
                verticalLineTo(9.99998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.70701f, 2.99998f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 2.99998f, 15f, 2.77598f, 15f, 2.49998f)
                curveTo(15f, 2.22398f, 14.776f, 1.99998f, 14.5f, 1.99998f)
                horizontalLineTo(2.70701f)
                lineTo(3.35301f, 1.35398f)
                curveTo(3.54801f, 1.15898f, 3.54801f, 0.841982f, 3.35301f, 0.646982f)
                curveTo(3.15801f, 0.451982f, 2.84101f, 0.451982f, 2.64601f, 0.646982f)
                lineTo(1.14601f, 2.14698f)
                curveTo(0.951006f, 2.34198f, 0.951006f, 2.65898f, 1.14601f, 2.85398f)
                lineTo(2.64601f, 4.35398f)
                curveTo(2.74401f, 4.45198f, 2.87201f, 4.49998f, 3.00001f, 4.49998f)
                curveTo(3.12801f, 4.49998f, 3.25601f, 4.45098f, 3.35401f, 4.35398f)
                curveTo(3.54901f, 4.15898f, 3.54901f, 3.84198f, 3.35401f, 3.64698f)
                lineTo(2.70701f, 2.99998f)
                close()
            }
        }.build()
        
        return _GraphLeft!!
    }

private var _GraphLeft: ImageVector? = null

