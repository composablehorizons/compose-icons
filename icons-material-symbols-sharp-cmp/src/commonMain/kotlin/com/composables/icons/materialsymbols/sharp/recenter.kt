package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Recenter: ImageVector
    get() {
        if (_Recenter != null) return _Recenter!!
        
        _Recenter = ImageVector.Builder(
            name = "recenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 920f)
                verticalLineToRelative(-167f)
                lineToRelative(-44f, 43f)
                lineToRelative(-56f, -56f)
                lineToRelative(140f, -140f)
                lineToRelative(140f, 140f)
                lineToRelative(-56f, 56f)
                lineToRelative(-44f, -43f)
                verticalLineToRelative(167f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(220f, 620f)
                lineToRelative(-56f, -56f)
                lineToRelative(43f, -44f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-43f, -44f)
                lineToRelative(56f, -56f)
                lineToRelative(140f, 140f)
                lineToRelative(-140f, 140f)
                close()
                moveToRelative(520f, 0f)
                lineTo(600f, 480f)
                lineToRelative(140f, -140f)
                lineToRelative(56f, 56f)
                lineToRelative(-43f, 44f)
                horizontalLineToRelative(167f)
                verticalLineToRelative(80f)
                horizontalLineTo(753f)
                lineToRelative(43f, 44f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-260f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(0f, -180f)
                lineTo(340f, 220f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 43f)
                verticalLineToRelative(-167f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(167f)
                lineToRelative(44f, -43f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
            }
        }.build()
        
        return _Recenter!!
    }

private var _Recenter: ImageVector? = null

