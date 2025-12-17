package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Clipboard: ImageVector
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
                moveToRelative(144f, 418f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                horizontalLineTo(54f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineTo(118f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                horizontalLineToRelative(42f)
                verticalLineToRelative(36f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(168f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-36f)
                horizontalLineToRelative(42f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                close()
            }
        }.build()
        
        return _Clipboard!!
    }

private var _Clipboard: ImageVector? = null

