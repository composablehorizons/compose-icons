package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_convert: ImageVector
    get() {
        if (_Table_convert != null) return _Table_convert!!
        
        _Table_convert = ImageVector.Builder(
            name = "table_convert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 640f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineTo(520f)
                close()
                moveTo(120f, 280f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(102f)
                quadToRelative(-48f, -23f, -77.5f, -68f)
                reflectiveQuadTo(115f, 630f)
                quadToRelative(0f, -79f, 55.5f, -134.5f)
                reflectiveQuadTo(305f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-45f, 0f, -77.5f, 32f)
                reflectiveQuadTo(195f, 630f)
                quadToRelative(0f, 39f, 24f, 69f)
                reflectiveQuadToRelative(61f, 38f)
                verticalLineToRelative(-97f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Table_convert!!
    }

private var _Table_convert: ImageVector? = null

