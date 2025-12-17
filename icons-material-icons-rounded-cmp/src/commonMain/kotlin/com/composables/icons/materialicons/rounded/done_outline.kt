package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Done_outline: ImageVector
    get() {
        if (_Done_outline != null) return _Done_outline!!
        
        _Done_outline = ImageVector.Builder(
            name = "done_outline",
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
                moveTo(20.47f, 5.63f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.01f, 0f, 1.4f)
                lineTo(9.13f, 18.37f)
                curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0f)
                lineToRelative(-4.2f, -4.2f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.01f, 0f, -1.4f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
                lineToRelative(3.5f, 3.5f)
                lineTo(19.07f, 5.63f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
                close()
                moveToRelative(-2.11f, -2.12f)
                lineToRelative(-9.93f, 9.93f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-1.4f, 1.4f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(5.6f, 5.6f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                lineTo(22.59f, 7.74f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(-1.4f, -1.4f)
                curveToRelative(-0.79f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                close()
            }
        }.build()
        
        return _Done_outline!!
    }

private var _Done_outline: ImageVector? = null

