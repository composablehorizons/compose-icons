package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Image: ImageVector
    get() {
        if (_Image != null) return _Image!!
        
        _Image = ImageVector.Builder(
            name = "image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 448f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                close()
                moveTo(112f, 120f)
                curveToRelative(-30.928f, 0f, -56f, 25.072f, -56f, 56f)
                reflectiveCurveToRelative(25.072f, 56f, 56f, 56f)
                reflectiveCurveToRelative(56f, -25.072f, 56f, -56f)
                reflectiveCurveToRelative(-25.072f, -56f, -56f, -56f)
                close()
                moveTo(64f, 384f)
                horizontalLineToRelative(384f)
                verticalLineTo(272f)
                lineToRelative(-87.515f, -87.515f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineTo(208f, 320f)
                lineToRelative(-55.515f, -55.515f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineTo(64f, 336f)
                verticalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _Image!!
    }

private var _Image: ImageVector? = null

