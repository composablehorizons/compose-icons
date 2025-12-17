package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Carpenter: ImageVector
    get() {
        if (_Carpenter != null) return _Carpenter!!
        
        _Carpenter = ImageVector.Builder(
            name = "carpenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(619f, 852f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadTo(563f, 875f)
                quadToRelative(-16f, 0f, -31f, -6f)
                reflectiveQuadToRelative(-26f, -17f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -16.5f, -24.5f)
                reflectiveQuadTo(427f, 744f)
                quadToRelative(-1f, -14f, 3.5f, -28f)
                reflectiveQuadToRelative(13.5f, -26f)
                lineToRelative(6f, -8f)
                lineToRelative(-326f, -466f)
                lineToRelative(156f, -156f)
                lineToRelative(509f, 509f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                quadToRelative(0f, 16f, -6f, 31f)
                reflectiveQuadToRelative(-17f, 26f)
                lineTo(619f, 852f)
                close()
                moveTo(507f, 625f)
                lineToRelative(113f, -112f)
                lineToRelative(-340f, -340f)
                lineToRelative(-52f, 52f)
                lineToRelative(279f, 400f)
                close()
                moveToRelative(56f, 170f)
                lineToRelative(169f, -169f)
                lineToRelative(-56f, -57f)
                lineToRelative(-170f, 170f)
                lineToRelative(57f, 56f)
                close()
                moveToRelative(-56f, -170f)
                lineToRelative(113f, -112f)
                lineToRelative(-113f, 112f)
                close()
            }
        }.build()
        
        return _Carpenter!!
    }

private var _Carpenter: ImageVector? = null

