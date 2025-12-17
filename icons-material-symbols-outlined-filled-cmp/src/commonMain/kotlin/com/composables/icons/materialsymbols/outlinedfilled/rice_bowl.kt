package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Rice_bowl: ImageVector
    get() {
        if (_Rice_bowl != null) return _Rice_bowl!!
        
        _Rice_bowl = ImageVector.Builder(
            name = "rice_bowl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                verticalLineToRelative(-70f)
                quadToRelative(-105f, -42f, -172.5f, -130f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 112f, -67.5f, 200f)
                reflectiveQuadTo(640f, 810f)
                verticalLineToRelative(70f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-310f)
                quadToRelative(-20f, -5f, -40f, -7.5f)
                reflectiveQuadToRelative(-40f, -2.5f)
                quadToRelative(-20f, 0f, -40f, 2.5f)
                reflectiveQuadToRelative(-40f, 7.5f)
                verticalLineToRelative(310f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-277f)
                quadToRelative(-75f, 43f, -117.5f, 117f)
                reflectiveQuadTo(160f, 480f)
                close()
                moveToRelative(480f, 0f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -86f, -42.5f, -160f)
                reflectiveQuadTo(640f, 203f)
                verticalLineToRelative(277f)
                close()
            }
        }.build()
        
        return _Rice_bowl!!
    }

private var _Rice_bowl: ImageVector? = null

