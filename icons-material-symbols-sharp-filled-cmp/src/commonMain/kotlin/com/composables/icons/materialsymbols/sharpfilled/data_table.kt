package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Data_table: ImageVector
    get() {
        if (_Data_table != null) return _Data_table!!
        
        _Data_table = ImageVector.Builder(
            name = "data_table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-160f)
                horizontalLineTo(120f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-160f)
                horizontalLineTo(120f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-160f)
                horizontalLineTo(120f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(40f, -520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Data_table!!
    }

private var _Data_table: ImageVector? = null

