package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PencilAlt: ImageVector
    get() {
        if (_PencilAlt != null) return _PencilAlt!!
        
        _PencilAlt = ImageVector.Builder(
            name = "pencil-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(497.9f, 142.1f)
                lineToRelative(-46.1f, 46.1f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17f, 0f)
                lineToRelative(-111f, -111f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0f, -17f)
                lineToRelative(46.1f, -46.1f)
                curveToRelative(18.7f, -18.7f, 49.1f, -18.7f, 67.9f, 0f)
                lineToRelative(60.1f, 60.1f)
                curveToRelative(18.8f, 18.7f, 18.8f, 49.1f, 0f, 67.9f)
                close()
                moveTo(284.2f, 99.8f)
                lineTo(21.6f, 362.4f)
                lineTo(0.4f, 483.9f)
                curveToRelative(-2.9f, 16.4f, 11.4f, 30.6f, 27.8f, 27.8f)
                lineToRelative(121.5f, -21.3f)
                lineToRelative(262.6f, -262.6f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                lineToRelative(-111f, -111f)
                curveToRelative(-4.8f, -4.7f, -12.4f, -4.7f, -17.1f, 0f)
                close()
                moveTo(124.1f, 339.9f)
                curveToRelative(-5.5f, -5.5f, -5.5f, -14.3f, 0f, -19.8f)
                lineToRelative(154f, -154f)
                curveToRelative(5.5f, -5.5f, 14.3f, -5.5f, 19.8f, 0f)
                reflectiveCurveToRelative(5.5f, 14.3f, 0f, 19.8f)
                lineToRelative(-154f, 154f)
                curveToRelative(-5.5f, 5.5f, -14.3f, 5.5f, -19.8f, 0f)
                close()
                moveTo(88f, 424f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(36.3f)
                lineToRelative(-64.5f, 11.3f)
                lineToRelative(-31.1f, -31.1f)
                lineTo(51.7f, 376f)
                horizontalLineTo(88f)
                verticalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _PencilAlt!!
    }

private var _PencilAlt: ImageVector? = null

