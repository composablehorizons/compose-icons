package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Heap_snapshot_multiple: ImageVector
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
                moveToRelative(36f, 151f)
                lineToRelative(166f, -166f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(652f, 388f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(595f, 388f)
                lineTo(428f, 555f)
                quadToRelative(-12f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(12.5f, 28f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                close()
                moveToRelative(144f, 29f)
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
                horizontalLineToRelative(247f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(367f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                close()
                moveToRelative(0f, -440f)
                lineTo(560f, 120f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 320f)
                horizontalLineToRelative(140f)
                close()
                moveTo(160f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 920f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Heap_snapshot_multiple!!
    }

private var _Heap_snapshot_multiple: ImageVector? = null

