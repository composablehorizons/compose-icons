package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Unfloat_landscape: ImageVector
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
                moveTo(80f, 896f)
                verticalLineTo(256f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineTo(336f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(363f, -220f)
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
                moveTo(480f, 576f)
                close()
            }
        }.build()
        
        return _Unfloat_landscape!!
    }

private var _Unfloat_landscape: ImageVector? = null

