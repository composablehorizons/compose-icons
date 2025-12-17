package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Landscape: ImageVector
    get() {
        if (_Landscape != null) return _Landscape!!
        
        _Landscape = ImageVector.Builder(
            name = "landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 720f)
                quadToRelative(-25f, 0f, -36f, -22f)
                reflectiveQuadToRelative(4f, -42f)
                lineToRelative(160f, -213f)
                quadToRelative(6f, -8f, 14.5f, -12f)
                reflectiveQuadToRelative(17.5f, -4f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(148f, 197f)
                horizontalLineToRelative(300f)
                lineTo(560f, 374f)
                lineToRelative(-68f, 90f)
                quadToRelative(-12f, 16f, -28f, 16.5f)
                reflectiveQuadToRelative(-28f, -8.5f)
                quadToRelative(-12f, -9f, -16f, -24.5f)
                reflectiveQuadToRelative(8f, -31.5f)
                lineToRelative(100f, -133f)
                quadToRelative(6f, -8f, 14.5f, -12f)
                reflectiveQuadToRelative(17.5f, -4f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(280f, 373f)
                quadToRelative(15f, 20f, 4f, 42f)
                reflectiveQuadToRelative(-36f, 22f)
                horizontalLineTo(120f)
                close()
                moveToRelative(340f, -80f)
                horizontalLineToRelative(300f)
                horizontalLineToRelative(-312f)
                horizontalLineToRelative(68.5f)
                horizontalLineTo(460f)
                close()
                moveToRelative(-260f, 0f)
                horizontalLineToRelative(160f)
                lineToRelative(-80f, -107f)
                lineToRelative(-80f, 107f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Landscape!!
    }

private var _Landscape: ImageVector? = null

