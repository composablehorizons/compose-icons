package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RulerCombined: ImageVector
    get() {
        if (_RulerCombined != null) return _RulerCombined!!
        
        _RulerCombined = ImageVector.Builder(
            name = "ruler-combined",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 288f)
                horizontalLineToRelative(-56f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-56f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineTo(96f)
                horizontalLineToRelative(-56f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineTo(72f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 0f, 0f, 14.33f, 0f, 32f)
                verticalLineToRelative(448f)
                curveToRelative(0f, 2.77f, 0.91f, 5.24f, 1.57f, 7.8f)
                lineTo(160f, 329.38f)
                verticalLineTo(288f)
                close()
                moveToRelative(320f, 64f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-41.37f)
                lineTo(24.2f, 510.43f)
                curveToRelative(2.56f, 0.66f, 5.04f, 1.57f, 7.8f, 1.57f)
                horizontalLineToRelative(448f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _RulerCombined!!
    }

private var _RulerCombined: ImageVector? = null

