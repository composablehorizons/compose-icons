package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Real_estate_agent: ImageVector
    get() {
        if (_Real_estate_agent != null) return _Real_estate_agent!!
        
        _Real_estate_agent = ImageVector.Builder(
            name = "real_estate_agent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 600f)
                verticalLineToRelative(-96f)
                lineTo(374f, 360f)
                horizontalLineToRelative(-94f)
                verticalLineToRelative(-100f)
                lineToRelative(280f, -200f)
                lineToRelative(280f, 200f)
                verticalLineToRelative(340f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(580f, 320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(80f, 80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(40f)
                close()
                moveToRelative(520f, 0f)
                lineToRelative(-280f, -79f)
                verticalLineToRelative(-361f)
                horizontalLineToRelative(79f)
                lineToRelative(321f, 120f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                lineToRelative(-70f, -27f)
                lineToRelative(-14f, 37f)
                lineToRelative(84f, 30f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                lineTo(560f, 880f)
                close()
            }
        }.build()
        
        return _Real_estate_agent!!
    }

private var _Real_estate_agent: ImageVector? = null

