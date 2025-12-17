package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Code: ImageVector
    get() {
        if (_Code != null) return _Code!!
        
        _Code = ImageVector.Builder(
            name = "code",
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
                moveTo(8.7f, 15.9f)
                lineTo(4.8f, 12f)
                lineToRelative(3.9f, -3.9f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0f, -1.4f)
                curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0f)
                lineToRelative(-4.59f, 4.59f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.59f, 4.6f)
                curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0f, -1.4f)
                close()
                moveToRelative(6.6f, 0f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(-3.9f, -3.9f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.01f, 0f, -1.4f)
                curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0f)
                lineToRelative(4.59f, 4.59f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-4.59f, 4.6f)
                curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.01f, 0f, -1.4f)
                close()
            }
        }.build()
        
        return _Code!!
    }

private var _Code: ImageVector? = null

