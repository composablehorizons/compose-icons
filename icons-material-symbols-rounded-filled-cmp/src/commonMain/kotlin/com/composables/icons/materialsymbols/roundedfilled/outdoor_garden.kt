package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Outdoor_garden: ImageVector
    get() {
        if (_Outdoor_garden != null) return _Outdoor_garden!!
        
        _Outdoor_garden = ImageVector.Builder(
            name = "outdoor_garden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-600f)
                lineTo(200f, 120f)
                lineTo(80f, 240f)
                verticalLineToRelative(600f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-600f)
                lineTo(480f, 120f)
                lineTo(360f, 240f)
                verticalLineToRelative(600f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-600f)
                lineTo(760f, 120f)
                lineTo(640f, 240f)
                verticalLineToRelative(600f)
                close()
            }
        }.build()
        
        return _Outdoor_garden!!
    }

private var _Outdoor_garden: ImageVector? = null

