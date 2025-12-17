package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Unfloat_landscape: ImageVector
    get() {
        if (_Unfloat_landscape != null) return _Unfloat_landscape!!
        
        _Unfloat_landscape = ImageVector.Builder(
            name = "unfloat_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(443f, 676f)
                lineToRelative(57f, -57f)
                lineToRelative(-124f, -123f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                verticalLineTo(553f)
                lineToRelative(123f, 123f)
                close()
                moveToRelative(237f, 220f)
                verticalLineTo(616f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-520f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 256f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 336f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                verticalLineToRelative(360f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Unfloat_landscape!!
    }

private var _Unfloat_landscape: ImageVector? = null

