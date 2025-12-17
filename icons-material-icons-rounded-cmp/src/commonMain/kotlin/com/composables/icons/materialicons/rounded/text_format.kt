package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_format: ImageVector
    get() {
        if (_Text_format != null) return _Text_format!!
        
        _Text_format = ImageVector.Builder(
            name = "text_format",
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
                moveTo(5f, 18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveToRelative(4.5f, -5.2f)
                horizontalLineToRelative(5f)
                lineToRelative(0.66f, 1.6f)
                curveToRelative(0.15f, 0.36f, 0.5f, 0.6f, 0.89f, 0.6f)
                curveToRelative(0.69f, 0f, 1.15f, -0.71f, 0.88f, -1.34f)
                lineToRelative(-3.88f, -8.97f)
                curveTo(12.87f, 4.27f, 12.46f, 4f, 12f, 4f)
                curveToRelative(-0.46f, 0f, -0.87f, 0.27f, -1.05f, 0.69f)
                lineToRelative(-3.88f, 8.97f)
                curveToRelative(-0.27f, 0.63f, 0.2f, 1.34f, 0.89f, 1.34f)
                curveToRelative(0.39f, 0f, 0.74f, -0.24f, 0.89f, -0.6f)
                lineToRelative(0.65f, -1.6f)
                close()
                moveTo(12f, 5.98f)
                lineTo(13.87f, 11f)
                horizontalLineToRelative(-3.74f)
                lineTo(12f, 5.98f)
                close()
            }
        }.build()
        
        return _Text_format!!
    }

private var _Text_format: ImageVector? = null

