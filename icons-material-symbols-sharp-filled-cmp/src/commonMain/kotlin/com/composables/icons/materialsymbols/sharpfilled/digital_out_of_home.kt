package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Digital_out_of_home: ImageVector
    get() {
        if (_Digital_out_of_home != null) return _Digital_out_of_home!!
        
        _Digital_out_of_home = ImageVector.Builder(
            name = "digital_out_of_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(880f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(0f)
                close()
                moveToRelative(620f, 0f)
                verticalLineToRelative(-264f)
                lineToRelative(86f, -82f)
                lineToRelative(-21f, -104f)
                quadToRelative(-39f, 45f, -94.5f, 67.5f)
                reflectiveQuadTo(480f, 560f)
                verticalLineToRelative(-80f)
                quadToRelative(48f, 0f, 93f, -23f)
                reflectiveQuadToRelative(74f, -70f)
                lineToRelative(30f, -49f)
                quadToRelative(15f, -25f, 44f, -34f)
                reflectiveQuadToRelative(55f, 2f)
                lineToRelative(184f, 78f)
                verticalLineToRelative(196f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-143f)
                lineToRelative(-57f, -24f)
                lineToRelative(97f, 507f)
                horizontalLineToRelative(-82f)
                lineToRelative(-61f, -286f)
                lineToRelative(-77f, 72f)
                verticalLineToRelative(214f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 520f)
                lineToRelative(140f, -80f)
                lineToRelative(-140f, -80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(520f, -240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 280f)
                close()
            }
        }.build()
        
        return _Digital_out_of_home!!
    }

private var _Digital_out_of_home: ImageVector? = null

