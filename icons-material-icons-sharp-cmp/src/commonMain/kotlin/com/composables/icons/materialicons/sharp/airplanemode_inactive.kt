package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airplanemode_inactive: ImageVector
    get() {
        if (_Airplanemode_inactive != null) return _Airplanemode_inactive!!
        
        _Airplanemode_inactive = ImageVector.Builder(
            name = "airplanemode_inactive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10.5f, 7.67f)
                    verticalLineTo(3.5f)
                    curveTo(10.5f, 2.67f, 11.17f, 2f, 12f, 2f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    verticalLineTo(9f)
                    lineToRelative(8.5f, 5f)
                    verticalLineToRelative(2f)
                    lineToRelative(-4.49f, -1.32f)
                    lineTo(10.5f, 7.67f)
                    close()
                    moveTo(19.78f, 22.61f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(13.5f, 13.5f)
                    lineTo(9.56f, 9.56f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(6.38f, 6.38f)
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
                    verticalLineToRelative(-2.67f)
                    lineTo(19.78f, 22.61f)
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
        
        return _Airplanemode_inactive!!
    }

private var _Airplanemode_inactive: ImageVector? = null

