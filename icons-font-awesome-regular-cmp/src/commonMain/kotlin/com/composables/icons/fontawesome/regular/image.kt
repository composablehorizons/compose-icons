package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Image: ImageVector
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
                moveTo(464f, 64f)
                horizontalLineTo(48f)
                curveTo(21.49f, 64f, 0f, 85.49f, 0f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(-6f, 336f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(118f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(404f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(276f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
                moveTo(128f, 152f)
                curveToRelative(-22.091f, 0f, -40f, 17.909f, -40f, 40f)
                reflectiveCurveToRelative(17.909f, 40f, 40f, 40f)
                reflectiveCurveToRelative(40f, -17.909f, 40f, -40f)
                reflectiveCurveToRelative(-17.909f, -40f, -40f, -40f)
                close()
                moveTo(96f, 352f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                lineToRelative(-87.515f, -87.515f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineTo(192f, 304f)
                lineToRelative(-39.515f, -39.515f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineTo(96f, 304f)
                verticalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _Image!!
    }

private var _Image: ImageVector? = null

