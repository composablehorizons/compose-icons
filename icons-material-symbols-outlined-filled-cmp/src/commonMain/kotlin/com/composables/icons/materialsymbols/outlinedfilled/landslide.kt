package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Landslide: ImageVector
    get() {
        if (_Landslide != null) return _Landslide!!
        
        _Landslide = ImageVector.Builder(
            name = "landslide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-170f)
                lineToRelative(160f, 52f)
                lineToRelative(441f, -147f)
                lineTo(880f, 880f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -202f)
                lineTo(80f, 624f)
                verticalLineToRelative(-74f)
                lineToRelative(160f, 52f)
                lineToRelative(276f, -92f)
                lineToRelative(102f, 41f)
                lineToRelative(-378f, 127f)
                close()
                moveToRelative(500f, -118f)
                lineToRelative(180f, -80f)
                verticalLineToRelative(-160f)
                lineToRelative(-180f, -40f)
                lineToRelative(-100f, 80f)
                verticalLineToRelative(120f)
                lineToRelative(100f, 80f)
                close()
                moveToRelative(-500f, -42f)
                lineTo(80f, 464f)
                verticalLineToRelative(-144f)
                horizontalLineToRelative(240f)
                lineToRelative(103f, 137f)
                lineToRelative(-183f, 61f)
                close()
                moveToRelative(240f, -198f)
                lineToRelative(200f, -80f)
                verticalLineToRelative(-200f)
                lineToRelative(-200f, -40f)
                lineToRelative(-120f, 80f)
                verticalLineToRelative(160f)
                lineToRelative(120f, 80f)
                close()
            }
        }.build()
        
        return _Landslide!!
    }

private var _Landslide: ImageVector? = null

