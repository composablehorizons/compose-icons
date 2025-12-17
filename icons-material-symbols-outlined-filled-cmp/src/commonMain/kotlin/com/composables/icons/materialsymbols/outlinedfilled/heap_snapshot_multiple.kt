package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Heap_snapshot_multiple: ImageVector
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
                moveToRelative(130f, 120f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(280f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                close()
                moveTo(560f, 320f)
                horizontalLineToRelative(200f)
                lineTo(560f, 120f)
                verticalLineToRelative(200f)
                close()
                moveTo(160f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Heap_snapshot_multiple!!
    }

private var _Heap_snapshot_multiple: ImageVector? = null

