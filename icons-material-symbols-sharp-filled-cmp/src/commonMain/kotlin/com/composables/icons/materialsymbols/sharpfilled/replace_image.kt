package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Replace_image: ImageVector
    get() {
        if (_Replace_image != null) return _Replace_image!!
        
        _Replace_image = ImageVector.Builder(
            name = "replace_image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                horizontalLineToRelative(240f)
                lineToRelative(-79f, -103f)
                lineToRelative(-58f, 69f)
                lineToRelative(-39f, -52f)
                lineToRelative(-64f, 86f)
                close()
                moveTo(240f, 880f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(480f)
                horizontalLineTo(240f)
                close()
                moveTo(140f, 320f)
                quadToRelative(38f, -109f, 131.5f, -174.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(82f, 0f, 155.5f, 35f)
                reflectiveQuadTo(760f, 214f)
                verticalLineToRelative(-134f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(76f)
                quadToRelative(-39f, -39f, -90f, -59.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-81f, 0f, -149.5f, 43f)
                reflectiveQuadTo(227f, 320f)
                horizontalLineToRelative(-87f)
                close()
            }
        }.build()
        
        return _Replace_image!!
    }

private var _Replace_image: ImageVector? = null

