package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Call_end: ImageVector
    get() {
        if (_Call_end != null) return _Call_end!!
        
        _Call_end = ImageVector.Builder(
            name = "call_end",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.68f, 16.07f)
                lineToRelative(3.92f, -3.11f)
                verticalLineTo(9.59f)
                curveToRelative(2.85f, -0.93f, 5.94f, -0.93f, 8.8f, 0f)
                verticalLineToRelative(3.38f)
                lineToRelative(3.91f, 3.1f)
                lineTo(24f, 12.39f)
                curveToRelative(-6.41f, -7.19f, -17.59f, -7.19f, -24f, 0f)
                lineToRelative(3.68f, 3.68f)
                close()
            }
        }.build()
        
        return _Call_end!!
    }

private var _Call_end: ImageVector? = null

