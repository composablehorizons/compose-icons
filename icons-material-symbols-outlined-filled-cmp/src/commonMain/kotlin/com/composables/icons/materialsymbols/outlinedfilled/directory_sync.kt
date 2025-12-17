package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Directory_sync: ImageVector
    get() {
        if (_Directory_sync != null) return _Directory_sync!!
        
        _Directory_sync = ImageVector.Builder(
            name = "directory_sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(212f, 721f)
                quadToRelative(-43f, -48f, -67.5f, -110f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                verticalLineToRelative(-80f)
                lineToRelative(200f, 150f)
                lineToRelative(-200f, 150f)
                verticalLineToRelative(-80f)
                quadToRelative(-91f, 0f, -155.5f, 64.5f)
                reflectiveQuadTo(260f, 480f)
                quadToRelative(0f, 46f, 17.5f, 86f)
                reflectiveQuadToRelative(47.5f, 70f)
                lineToRelative(-113f, 85f)
                close()
                moveTo(480f, 920f)
                lineTo(280f, 770f)
                lineToRelative(200f, -150f)
                verticalLineToRelative(80f)
                quadToRelative(91f, 0f, 155.5f, -64.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, -46f, -17.5f, -86f)
                reflectiveQuadTo(635f, 324f)
                lineToRelative(113f, -85f)
                quadToRelative(43f, 48f, 67.5f, 110f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 150f, -105f, 255f)
                reflectiveQuadTo(480f, 840f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Directory_sync!!
    }

private var _Directory_sync: ImageVector? = null

