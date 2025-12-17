package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Combine_columns: ImageVector
    get() {
        if (_Combine_columns != null) return _Combine_columns!!
        
        _Combine_columns = ImageVector.Builder(
            name = "combine_columns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(164f)
                quadToRelative(-70f, 14f, -115f, 69f)
                reflectiveQuadToRelative(-45f, 127f)
                quadToRelative(0f, 72f, 45f, 127f)
                reflectiveQuadToRelative(115f, 69f)
                verticalLineToRelative(164f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-164f)
                quadToRelative(70f, -14f, 115f, -69f)
                reflectiveQuadToRelative(45f, -127f)
                quadToRelative(0f, -72f, -45f, -127f)
                reflectiveQuadToRelative(-115f, -69f)
                verticalLineToRelative(-164f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(720f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-80f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Combine_columns!!
    }

private var _Combine_columns: ImageVector? = null

