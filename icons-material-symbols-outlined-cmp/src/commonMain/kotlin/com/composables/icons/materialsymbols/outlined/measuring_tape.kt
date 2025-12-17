package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Measuring_tape: ImageVector
    get() {
        if (_Measuring_tape != null) return _Measuring_tape!!
        
        _Measuring_tape = ImageVector.Builder(
            name = "measuring_tape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-340f)
                quadToRelative(0f, -142f, 99f, -241f)
                reflectiveQuadToRelative(241f, -99f)
                quadToRelative(142f, 0f, 241f, 99f)
                reflectiveQuadToRelative(99f, 241f)
                quadToRelative(0f, 142f, -99f, 241f)
                reflectiveQuadToRelative(-241f, 99f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(260f)
                quadToRelative(108f, 0f, 184f, -76f)
                reflectiveQuadToRelative(76f, -184f)
                quadToRelative(0f, -108f, -76f, -184f)
                reflectiveQuadToRelative(-184f, -76f)
                quadToRelative(-108f, 0f, -184f, 76f)
                reflectiveQuadToRelative(-76f, 184f)
                verticalLineToRelative(260f)
                close()
                moveToRelative(260f, -120f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(480f, 460f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(540f, 400f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(600f, 460f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(540f, 520f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(460f, -340f)
                close()
            }
        }.build()
        
        return _Measuring_tape!!
    }

private var _Measuring_tape: ImageVector? = null

