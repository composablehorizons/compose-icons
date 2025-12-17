package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bakery_dining: ImageVector
    get() {
        if (_Bakery_dining != null) return _Bakery_dining!!
        
        _Bakery_dining = ImageVector.Builder(
            name = "bakery_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481f, 720f)
                close()
                moveToRelative(323f, -42f)
                lineToRelative(34f, -34f)
                lineToRelative(-58f, -108f)
                lineToRelative(-42f, 108f)
                lineToRelative(66f, 34f)
                close()
                moveToRelative(-200f, -38f)
                horizontalLineToRelative(48f)
                lineToRelative(102f, -253f)
                lineToRelative(-124f, -49f)
                lineToRelative(-26f, 302f)
                close()
                moveToRelative(-296f, 0f)
                horizontalLineToRelative(48f)
                lineToRelative(-26f, -302f)
                lineToRelative(-124f, 49f)
                lineToRelative(102f, 253f)
                close()
                moveToRelative(-152f, 38f)
                lineToRelative(66f, -34f)
                lineToRelative(-42f, -108f)
                lineToRelative(-58f, 108f)
                lineToRelative(34f, 34f)
                close()
                moveToRelative(280f, -38f)
                horizontalLineToRelative(88f)
                lineToRelative(32f, -360f)
                horizontalLineTo(404f)
                lineToRelative(32f, 360f)
                close()
                moveTo(141f, 777f)
                lineTo(25f, 661f)
                lineToRelative(115f, -221f)
                lineToRelative(-38f, -97f)
                lineToRelative(220f, -88f)
                lineToRelative(-5f, -55f)
                horizontalLineToRelative(325f)
                lineToRelative(-4f, 55f)
                lineToRelative(220f, 88f)
                lineToRelative(-38f, 95f)
                lineToRelative(116f, 222f)
                lineToRelative(-115f, 115f)
                lineToRelative(-113f, -55f)
                horizontalLineTo(250f)
                lineToRelative(-109f, 57f)
                close()
            }
        }.build()
        
        return _Bakery_dining!!
    }

private var _Bakery_dining: ImageVector? = null

