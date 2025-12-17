package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_airport: ImageVector
    get() {
        if (_Local_airport != null) return _Local_airport!!
        
        _Local_airport = ImageVector.Builder(
            name = "local_airport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 16f)
                    verticalLineToRelative(-2f)
                    lineToRelative(-8.5f, -5f)
                    verticalLineTo(3.5f)
                    curveTo(13.5f, 2.67f, 12.83f, 2f, 12f, 2f)
                    reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                    verticalLineTo(9f)
                    lineTo(2f, 14f)
                    verticalLineToRelative(2f)
                    lineToRelative(8.5f, -2.5f)
                    verticalLineTo(19f)
                    lineTo(8f, 20.5f)
                    lineTo(8f, 22f)
                    lineToRelative(4f, -1f)
                    lineToRelative(4f, 1f)
                    lineToRelative(0f, -1.5f)
                    lineTo(13.5f, 19f)
                    verticalLineToRelative(-5.5f)
                    lineTo(22f, 16f)
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
        
        return _Local_airport!!
    }

private var _Local_airport: ImageVector? = null

