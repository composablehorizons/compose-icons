package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Assistant_photo: ImageVector
    get() {
        if (_Assistant_photo != null) return _Assistant_photo!!
        
        _Assistant_photo = ImageVector.Builder(
            name = "assistant_photo",
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
                moveTo(14.4f, 6f)
                lineToRelative(-0.24f, -1.2f)
                curveToRelative(-0.09f, -0.46f, -0.5f, -0.8f, -0.98f, -0.8f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5.6f)
                lineToRelative(0.24f, 1.2f)
                curveToRelative(0.09f, 0.47f, 0.5f, 0.8f, 0.98f, 0.8f)
                horizontalLineTo(19f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.6f)
                close()
            }
        }.build()
        
        return _Assistant_photo!!
    }

private var _Assistant_photo: ImageVector? = null

