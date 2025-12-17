package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hotel_class: ImageVector
    get() {
        if (_Hotel_class != null) return _Hotel_class!!
        
        _Hotel_class = ImageVector.Builder(
            name = "hotel_class",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(668f, 580f)
                lineToRelative(152f, -130f)
                lineToRelative(120f, 10f)
                lineToRelative(-176f, 153f)
                lineToRelative(52f, 227f)
                lineToRelative(-102f, -62f)
                lineToRelative(-46f, -198f)
                close()
                moveToRelative(-94f, -292f)
                lineToRelative(-42f, -98f)
                lineToRelative(46f, -110f)
                lineToRelative(92f, 217f)
                lineToRelative(-96f, -9f)
                close()
                moveTo(173f, 840f)
                lineToRelative(65f, -281f)
                lineTo(20f, 370f)
                lineToRelative(288f, -25f)
                lineToRelative(112f, -265f)
                lineToRelative(112f, 265f)
                lineToRelative(288f, 25f)
                lineToRelative(-218f, 189f)
                lineToRelative(65f, 281f)
                lineToRelative(-247f, -149f)
                lineToRelative(-247f, 149f)
                close()
            }
        }.build()
        
        return _Hotel_class!!
    }

private var _Hotel_class: ImageVector? = null

