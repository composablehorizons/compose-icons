package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Unfloat_landscape: ImageVector
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
                horizontalLineTo(600f)
                verticalLineToRelative(360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -480f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                verticalLineTo(553f)
                lineToRelative(123f, 123f)
                lineToRelative(57f, -57f)
                lineToRelative(-124f, -123f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(440f, 480f)
                verticalLineTo(616f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Unfloat_landscape!!
    }

private var _Unfloat_landscape: ImageVector? = null

