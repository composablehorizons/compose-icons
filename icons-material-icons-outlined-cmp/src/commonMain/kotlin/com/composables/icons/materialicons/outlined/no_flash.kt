package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_flash: ImageVector
    get() {
        if (_No_flash != null) return _No_flash!!
        
        _No_flash = ImageVector.Builder(
            name = "no_flash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20.4f, 5.6f)
                    horizontalLineTo(22f)
                    lineTo(19f, 11f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(4f)
                    lineTo(20.4f, 5.6f)
                    close()
                    moveTo(16f, 11.4f)
                    lineToRelative(0f, 1.77f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(11f)
                    curveToRelative(0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f)
                    horizontalLineToRelative(-2.54f)
                    lineTo(12.58f, 8f)
                    horizontalLineToRelative(-1.75f)
                    lineToRelative(3.4f, 3.4f)
                    horizontalLineTo(16f)
                    close()
                    moveTo(2.1f, 2.1f)
                    lineTo(0.69f, 3.51f)
                    lineToRelative(5.66f, 5.66f)
                    lineTo(6.14f, 9.4f)
                    horizontalLineTo(3.6f)
                    curveTo(2.72f, 9.4f, 2f, 10.12f, 2f, 11f)
                    verticalLineToRelative(9.4f)
                    curveTo(2f, 21.28f, 2.72f, 22f, 3.6f, 22f)
                    horizontalLineToRelative(12.8f)
                    curveToRelative(0.75f, 0f, 1.38f, -0.52f, 1.55f, -1.22f)
                    lineToRelative(2.54f, 2.54f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.1f, 2.1f)
                    close()
                    moveTo(11.5f, 15.5f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveTo(9.17f, 14f, 10f, 14f)
                    reflectiveCurveTo(11.5f, 14.67f, 11.5f, 15.5f)
                    close()
                    moveTo(15.96f, 20f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-8.6f)
                    horizontalLineToRelative(2.14f)
                    horizontalLineToRelative(0.88f)
                    lineToRelative(0.59f, -0.65f)
                    lineToRelative(0.15f, -0.16f)
                    lineToRelative(1.5f, 1.5f)
                    curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f)
                    curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                    curveToRelative(1.68f, 0f, 3.07f, -1.18f, 3.42f, -2.76f)
                    lineToRelative(2.55f, 2.55f)
                    lineTo(15.96f, 20f)
                    close()
                }
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
            }
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

