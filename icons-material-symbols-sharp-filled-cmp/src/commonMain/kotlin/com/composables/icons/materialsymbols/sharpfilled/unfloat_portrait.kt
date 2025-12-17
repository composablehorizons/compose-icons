package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Unfloat_portrait: ImageVector
    get() {
        if (_Unfloat_portrait != null) return _Unfloat_portrait!!
        
        _Unfloat_portrait = ImageVector.Builder(
            name = "unfloat_portrait",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(523f, 596f)
                lineToRelative(57f, -57f)
                lineToRelative(-123f, -123f)
                horizontalLineToRelative(103f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                verticalLineTo(472f)
                lineToRelative(123f, 124f)
                close()
                moveToRelative(77f, 380f)
                verticalLineTo(696f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(280f)
                horizontalLineTo(600f)
                close()
                moveToRelative(-440f, 0f)
                verticalLineTo(176f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(440f)
                horizontalLineTo(520f)
                verticalLineToRelative(360f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Unfloat_portrait!!
    }

private var _Unfloat_portrait: ImageVector? = null

