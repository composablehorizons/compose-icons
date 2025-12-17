package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ClipboardList: ImageVector
    get() {
        if (_ClipboardList != null) return _ClipboardList!!
        
        _ClipboardList = ImageVector.Builder(
            name = "clipboard-list",
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
                moveTo(96f, 424f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                close()
                moveToRelative(96f, -192f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(128f, 368f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(168f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(144f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(168f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(144f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(168f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(144f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _ClipboardList!!
    }

private var _ClipboardList: ImageVector? = null

