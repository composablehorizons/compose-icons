package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) return _Clipboard!!
        
        _Clipboard = ImageVector.Builder(
            name = "clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 112f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(80f)
                curveToRelative(0f, -35.29f, 28.71f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.71f, 64f, 64f)
                horizontalLineToRelative(80f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                close()
                moveTo(192f, 40f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                reflectiveCurveToRelative(10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                reflectiveCurveToRelative(-10.745f, -24f, -24f, -24f)
                moveToRelative(96f, 114f)
                verticalLineToRelative(-20f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                horizontalLineTo(102f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(20f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(180f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                close()
            }
        }.build()
        
        return _Clipboard!!
    }

private var _Clipboard: ImageVector? = null

