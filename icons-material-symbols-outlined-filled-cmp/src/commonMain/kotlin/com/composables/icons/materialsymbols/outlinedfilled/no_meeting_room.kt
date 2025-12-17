package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.No_meeting_room: ImageVector
    get() {
        if (_No_meeting_room != null) return _No_meeting_room!!
        
        _No_meeting_room = ImageVector.Builder(
            name = "no_meeting_room",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 646f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-326f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(246f)
                lineTo(234f, 120f)
                horizontalLineToRelative(366f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(486f)
                close()
                moveToRelative(32f, 258f)
                lineTo(600f, 712f)
                verticalLineToRelative(128f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-448f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _No_meeting_room!!
    }

private var _No_meeting_room: ImageVector? = null

