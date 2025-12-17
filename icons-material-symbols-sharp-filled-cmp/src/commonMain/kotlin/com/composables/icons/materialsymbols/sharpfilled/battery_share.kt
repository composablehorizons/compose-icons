package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_share: ImageVector
    get() {
        if (_Battery_share != null) return _Battery_share!!
        
        _Battery_share = ImageVector.Builder(
            name = "battery_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 680f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(247f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -57f)
                lineToRelative(64f, -63f)
                horizontalLineTo(480f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Battery_share!!
    }

private var _Battery_share: ImageVector? = null

