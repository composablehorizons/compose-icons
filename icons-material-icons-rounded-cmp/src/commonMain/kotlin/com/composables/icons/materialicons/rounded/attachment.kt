package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Attachment: ImageVector
    get() {
        if (_Attachment != null) return _Attachment!!
        
        _Attachment = ImageVector.Builder(
            name = "attachment",
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
                moveTo(17.75f, 16f)
                horizontalLineTo(7.17f)
                curveToRelative(-2.09f, 0f, -3.95f, -1.53f, -4.15f, -3.61f)
                curveTo(2.79f, 10.01f, 4.66f, 8f, 7f, 8f)
                horizontalLineToRelative(12.36f)
                curveToRelative(1.31f, 0f, 2.5f, 0.94f, 2.63f, 2.24f)
                curveToRelative(0.15f, 1.5f, -1.02f, 2.76f, -2.49f, 2.76f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8.75f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineTo(9.14f)
                curveToRelative(-1.31f, 0f, -2.5f, 0.94f, -2.63f, 2.24f)
                curveToRelative(-0.15f, 1.5f, 1.02f, 2.76f, 2.49f, 2.76f)
                horizontalLineToRelative(10.33f)
                curveToRelative(2.09f, 0f, 3.95f, -1.53f, 4.15f, -3.61f)
                curveToRelative(0.23f, -2.39f, -1.64f, -4.39f, -3.98f, -4.39f)
                horizontalLineTo(7.23f)
                curveToRelative(-2.87f, 0f, -5.44f, 2.1f, -5.71f, 4.96f)
                curveToRelative(-0.3f, 3.29f, 2.26f, 6.04f, 5.48f, 6.04f)
                horizontalLineToRelative(10.75f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Attachment!!
    }

private var _Attachment: ImageVector? = null

