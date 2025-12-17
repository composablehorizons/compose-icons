package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RulerVertical: ImageVector
    get() {
        if (_RulerVertical != null) return _RulerVertical!!
        
        _RulerVertical = ImageVector.Builder(
            name = "ruler-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(168f, 416f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-88f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-88f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(88f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-88f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(88f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 0f, 0f, 14.33f, 0f, 32f)
                verticalLineToRelative(448f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(192f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(-88f)
                close()
            }
        }.build()
        
        return _RulerVertical!!
    }

private var _RulerVertical: ImageVector? = null

