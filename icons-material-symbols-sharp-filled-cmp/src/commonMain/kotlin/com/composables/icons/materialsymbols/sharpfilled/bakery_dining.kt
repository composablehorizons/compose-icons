package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bakery_dining: ImageVector
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
                moveTo(818f, 728f)
                lineToRelative(-78f, -38f)
                lineToRelative(73f, -180f)
                lineToRelative(88f, 170f)
                lineToRelative(-83f, 48f)
                close()
                moveToRelative(-198f, -48f)
                lineToRelative(34f, -377f)
                lineToRelative(152f, 61f)
                lineToRelative(-126f, 316f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-340f, 0f)
                lineTo(154f, 364f)
                lineToRelative(152f, -61f)
                lineToRelative(34f, 377f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-138f, 48f)
                lineToRelative(-83f, -48f)
                lineToRelative(88f, -170f)
                lineToRelative(73f, 180f)
                lineToRelative(-78f, 38f)
                close()
                moveToRelative(258f, -48f)
                lineToRelative(-40f, -440f)
                horizontalLineToRelative(240f)
                lineToRelative(-40f, 440f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Bakery_dining!!
    }

private var _Bakery_dining: ImageVector? = null

