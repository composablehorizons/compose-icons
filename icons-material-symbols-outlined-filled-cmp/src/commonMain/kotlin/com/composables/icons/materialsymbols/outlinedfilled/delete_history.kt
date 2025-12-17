package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Delete_history: ImageVector
    get() {
        if (_Delete_history != null) return _Delete_history!!
        
        _Delete_history = ImageVector.Builder(
            name = "delete_history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(656f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
                moveToRelative(-176f, 0f)
                quadToRelative(-138f, 0f, -240.5f, -91.5f)
                reflectiveQuadTo(122f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(14f, 104f, 92.5f, 172f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(11f, 0f, 20.5f, -0.5f)
                reflectiveQuadTo(520f, 757f)
                verticalLineToRelative(81f)
                quadToRelative(-10f, 1f, -19.5f, 1.5f)
                reflectiveQuadToRelative(-20.5f, 0.5f)
                close()
                moveTo(120f, 400f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(94f)
                quadToRelative(51f, -64f, 124.5f, -99f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(150f, 0f, 255f, 105f)
                reflectiveQuadToRelative(105f, 255f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-69f, 0f, -129f, 32f)
                reflectiveQuadToRelative(-101f, 88f)
                horizontalLineToRelative(110f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(414f, 190f)
                lineToRelative(-94f, -94f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(56f, 56f)
                lineToRelative(-42f, 70f)
                close()
            }
        }.build()
        
        return _Delete_history!!
    }

private var _Delete_history: ImageVector? = null

