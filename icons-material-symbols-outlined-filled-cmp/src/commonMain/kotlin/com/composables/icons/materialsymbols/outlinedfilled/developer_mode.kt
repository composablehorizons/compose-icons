package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Developer_mode: ImageVector
    get() {
        if (_Developer_mode != null) return _Developer_mode!!
        
        _Developer_mode = ImageVector.Builder(
            name = "developer_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 664f)
                lineTo(160f, 480f)
                lineToRelative(184f, -184f)
                lineToRelative(56f, 58f)
                lineToRelative(-126f, 126f)
                lineToRelative(126f, 126f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(-144f, 16f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-160f)
                close()
                moveToRelative(80f, -400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(336f, 384f)
                lineToRelative(-56f, -58f)
                lineToRelative(126f, -126f)
                lineToRelative(-126f, -126f)
                lineToRelative(56f, -58f)
                lineToRelative(184f, 184f)
                lineToRelative(-184f, 184f)
                close()
            }
        }.build()
        
        return _Developer_mode!!
    }

private var _Developer_mode: ImageVector? = null

