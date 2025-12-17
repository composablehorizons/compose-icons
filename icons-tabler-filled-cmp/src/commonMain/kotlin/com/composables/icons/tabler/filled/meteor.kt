package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Meteor: ImageVector
    get() {
        if (_Meteor != null) return _Meteor!!
        
        _Meteor = ImageVector.Builder(
            name = "meteor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.874f, 3.486f)
                lineToRelative(-4.174f, 7.514f)
                horizontalLineToRelative(3.3f)
                curveToRelative(0.846f, 0f, 1.293f, 0.973f, 0.791f, 1.612f)
                lineToRelative(-0.074f, 0.085f)
                lineToRelative(-6.9f, 7.095f)
                arcToRelative(7.5f, 7.5f, 0f, true, true, -10.21f, -10.974f)
                lineToRelative(7.746f, -6.58f)
                curveToRelative(0.722f, -0.614f, 1.814f, 0.028f, 1.628f, 0.958f)
                lineToRelative(-0.577f, 2.879f)
                lineToRelative(7.11f, -3.95f)
                curveToRelative(0.88f, -0.488f, 1.849f, 0.481f, 1.36f, 1.36f)
                moveToRelative(-12.374f, 7.515f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -3.495f, 3.308f)
                lineToRelative(-0.005f, 0.192f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 3.5f, -3.5f)
            }
        }.build()
        
        return _Meteor!!
    }

private var _Meteor: ImageVector? = null

