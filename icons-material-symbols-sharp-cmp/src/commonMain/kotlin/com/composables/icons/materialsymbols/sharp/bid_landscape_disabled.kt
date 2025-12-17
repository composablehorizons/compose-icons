package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bid_landscape_disabled: ImageVector
    get() {
        if (_Bid_landscape_disabled != null) return _Bid_landscape_disabled!!
        
        _Bid_landscape_disabled = ImageVector.Builder(
            name = "bid_landscape_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(73f, 71f)
                lineTo(889f, 887f)
                lineToRelative(-57f, 57f)
                lineToRelative(-104f, -104f)
                horizontalLineTo(120f)
                verticalLineToRelative(-608f)
                lineTo(16f, 128f)
                lineToRelative(57f, -57f)
                close()
                moveToRelative(287f, 447f)
                lineTo(200f, 678f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(448f)
                lineTo(544f, 656f)
                lineToRelative(-22f, 24f)
                lineToRelative(-162f, -162f)
                close()
                moveTo(200f, 312f)
                verticalLineToRelative(252f)
                lineToRelative(126f, -126f)
                lineToRelative(-126f, -126f)
                close()
                moveToRelative(36f, -192f)
                horizontalLineToRelative(604f)
                verticalLineToRelative(604f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-234f)
                lineTo(650f, 534f)
                lineToRelative(-57f, -57f)
                lineToRelative(167f, -187f)
                verticalLineToRelative(-90f)
                horizontalLineTo(316f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(357f, 357f)
                close()
                moveToRelative(-158f, 70f)
                close()
                moveTo(326f, 438f)
                close()
                moveToRelative(34f, 80f)
                close()
                moveToRelative(176f, -98f)
                close()
            }
        }.build()
        
        return _Bid_landscape_disabled!!
    }

private var _Bid_landscape_disabled: ImageVector? = null

