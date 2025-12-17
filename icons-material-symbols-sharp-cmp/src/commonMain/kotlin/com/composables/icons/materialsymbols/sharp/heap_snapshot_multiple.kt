package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Heap_snapshot_multiple: ImageVector
    get() {
        if (_Heap_snapshot_multiple != null) return _Heap_snapshot_multiple!!
        
        _Heap_snapshot_multiple = ImageVector.Builder(
            name = "heap_snapshot_multiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(450f, 460f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(500f, 410f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(450f, 360f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(400f, 410f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(450f, 460f)
                close()
                moveToRelative(7f, 180f)
                lineToRelative(223f, -223f)
                lineToRelative(-57f, -57f)
                lineToRelative(-223f, 223f)
                lineToRelative(57f, 57f)
                close()
                moveToRelative(173f, 0f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(680f, 590f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(630f, 540f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(580f, 590f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(630f, 640f)
                close()
                moveTo(240f, 760f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(240f)
                close()
                moveToRelative(320f, -440f)
                verticalLineToRelative(-200f)
                horizontalLineTo(320f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-360f)
                horizontalLineTo(560f)
                close()
                moveTo(80f, 920f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -800f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Heap_snapshot_multiple!!
    }

private var _Heap_snapshot_multiple: ImageVector? = null

