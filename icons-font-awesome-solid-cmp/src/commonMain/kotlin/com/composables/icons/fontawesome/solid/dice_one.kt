package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.DiceOne: ImageVector
    get() {
        if (_DiceOne != null) return _DiceOne!!
        
        _DiceOne = ImageVector.Builder(
            name = "dice-one",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 32f)
                horizontalLineTo(64f)
                curveTo(28.65f, 32f, 0f, 60.65f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(320f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineTo(96f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                close()
                moveTo(224f, 288f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _DiceOne!!
    }

private var _DiceOne: ImageVector? = null

