package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Call_missed_outgoing: ImageVector
    get() {
        if (_Call_missed_outgoing != null) return _Call_missed_outgoing!!
        
        _Call_missed_outgoing = ImageVector.Builder(
            name = "call_missed_outgoing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 697f)
                lineTo(120f, 337f)
                lineToRelative(56f, -57f)
                lineToRelative(304f, 304f)
                lineToRelative(224f, -224f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-183f)
                lineTo(480f, 697f)
                close()
            }
        }.build()
        
        return _Call_missed_outgoing!!
    }

private var _Call_missed_outgoing: ImageVector? = null

