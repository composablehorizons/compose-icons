package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ClipboardCheck: ImageVector
    get() {
        if (_ClipboardCheck != null) return _ClipboardCheck!!
        
        _ClipboardCheck = ImageVector.Builder(
            name = "clipboard-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 64f)
                horizontalLineToRelative(-80f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.7f, -64f, 64f)
                horizontalLineTo(48f)
                curveTo(21.5f, 64f, 0f, 85.5f, 0f, 112f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(192f, 40f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(121.2f, 231.8f)
                lineToRelative(-143f, 141.8f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.6f, -17f, -0.1f)
                lineToRelative(-82.6f, -83.3f)
                curveToRelative(-4.7f, -4.7f, -4.6f, -12.3f, 0.1f, -17f)
                lineTo(99.1f, 285f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.6f, 17f, 0.1f)
                lineToRelative(46f, 46.4f)
                lineToRelative(106f, -105.2f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.6f, 17f, 0.1f)
                lineToRelative(28.2f, 28.4f)
                curveToRelative(4.7f, 4.8f, 4.6f, 12.3f, -0.1f, 17f)
                close()
            }
        }.build()
        
        return _ClipboardCheck!!
    }

private var _ClipboardCheck: ImageVector? = null

