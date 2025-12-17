package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wheelchair_pickup: ImageVector
    get() {
        if (_Wheelchair_pickup != null) return _Wheelchair_pickup!!
        
        _Wheelchair_pickup = ImageVector.Builder(
            name = "wheelchair_pickup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(180f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(260f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(340f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(260f, 240f)
                close()
                moveTo(200f, 880f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 360f)
                verticalLineToRelative(78f)
                quadToRelative(-63f, 36f, -101.5f, 100f)
                reflectiveQuadTo(260f, 680f)
                quadToRelative(0f, 57f, 21f, 107.5f)
                reflectiveQuadTo(340f, 876f)
                verticalLineToRelative(4f)
                horizontalLineTo(200f)
                close()
                moveToRelative(340f, 0f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(340f, 680f)
                quadToRelative(0f, -67f, 39.5f, -118.5f)
                reflectiveQuadTo(480f, 490f)
                verticalLineToRelative(87f)
                quadToRelative(-27f, 16f, -43.5f, 43f)
                reflectiveQuadTo(420f, 680f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(540f, 880f)
                close()
                moveToRelative(297f, -92f)
                lineToRelative(-99f, -148f)
                horizontalLineTo(520f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(182f)
                lineToRelative(122f, 184f)
                lineToRelative(-67f, 44f)
                close()
            }
        }.build()
        
        return _Wheelchair_pickup!!
    }

private var _Wheelchair_pickup: ImageVector? = null

