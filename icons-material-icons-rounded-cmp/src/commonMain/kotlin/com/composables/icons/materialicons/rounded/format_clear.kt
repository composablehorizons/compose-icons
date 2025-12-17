package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Format_clear: ImageVector
    get() {
        if (_Format_clear != null) return _Format_clear!!
        
        _Format_clear = ImageVector.Builder(
            name = "format_clear",
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
                moveTo(18.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(19.33f, 5f, 18.5f, 5f)
                horizontalLineTo(6.39f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(1.83f)
                lineToRelative(-0.55f, 1.28f)
                lineToRelative(2.09f, 2.09f)
                lineTo(14.21f, 8f)
                horizontalLineToRelative(4.29f)
                close()
                moveToRelative(-1.06f, 10.88f)
                lineTo(4.12f, 5.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-1.65f, 3.84f)
                curveToRelative(-0.39f, 0.92f, 0.28f, 1.93f, 1.27f, 1.93f)
                curveToRelative(0.55f, 0f, 1.05f, -0.33f, 1.27f, -0.84f)
                lineToRelative(1.21f, -2.83f)
                lineToRelative(4.95f, 4.95f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.01f, -1.4f)
                close()
            }
        }.build()
        
        return _Format_clear!!
    }

private var _Format_clear: ImageVector? = null

