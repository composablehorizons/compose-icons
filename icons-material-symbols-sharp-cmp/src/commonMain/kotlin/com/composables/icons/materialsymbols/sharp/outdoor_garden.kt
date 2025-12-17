package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Outdoor_garden: ImageVector
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
                verticalLineToRelative(-600f)
                lineToRelative(160f, -120f)
                lineToRelative(120f, 90f)
                lineToRelative(120f, -90f)
                lineToRelative(120f, 90f)
                lineToRelative(120f, -90f)
                lineToRelative(160f, 120f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                lineToRelative(-80f, -60f)
                lineToRelative(-80f, 60f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                lineToRelative(-80f, -60f)
                lineToRelative(-80f, 60f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                lineToRelative(-80f, -60f)
                lineToRelative(-80f, 60f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Outdoor_garden!!
    }

private var _Outdoor_garden: ImageVector? = null

