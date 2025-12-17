package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LuggageCart: ImageVector
    get() {
        if (_LuggageCart != null) return _LuggageCart!!
        
        _LuggageCart = ImageVector.Builder(
            name = "luggage-cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 320f)
                horizontalLineToRelative(32f)
                verticalLineTo(96f)
                horizontalLineToRelative(-32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                close()
                moveToRelative(352f, -32f)
                verticalLineTo(128f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(224f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                close()
                moveToRelative(48f, 96f)
                horizontalLineTo(128f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveTo(7.16f, 0f, 0f, 7.16f, 0f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(368f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(82.94f)
                curveToRelative(-1.79f, 5.03f, -2.94f, 10.36f, -2.94f, 16f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                curveToRelative(0f, -5.64f, -1.15f, -10.97f, -2.94f, -16f)
                horizontalLineToRelative(197.88f)
                curveToRelative(-1.79f, 5.03f, -2.94f, 10.36f, -2.94f, 16f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                curveToRelative(0f, -5.64f, -1.15f, -10.97f, -2.94f, -16f)
                horizontalLineTo(624f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(480f, 96f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineToRelative(-96f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(272f)
                horizontalLineToRelative(192f)
                verticalLineTo(96f)
                close()
                moveToRelative(-48f, 0f)
                horizontalLineToRelative(-96f)
                verticalLineTo(48f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _LuggageCart!!
    }

private var _LuggageCart: ImageVector? = null

