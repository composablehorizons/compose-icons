package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sign_language: ImageVector
    get() {
        if (_Sign_language != null) return _Sign_language!!
        
        _Sign_language = ImageVector.Builder(
            name = "sign_language",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-40f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(284f)
                lineToRelative(-62f, -107f)
                lineToRelative(66f, -66f)
                lineToRelative(312f, 233f)
                verticalLineToRelative(380f)
                horizontalLineTo(160f)
                close()
                moveToRelative(110f, -493f)
                lineToRelative(-47f, -33f)
                lineToRelative(37f, -51f)
                lineToRelative(17f, 12f)
                lineToRelative(31f, 72f)
                horizontalLineToRelative(-38f)
                close()
                moveToRelative(48f, -113f)
                lineToRelative(-87f, -63f)
                lineToRelative(46f, -65f)
                lineToRelative(97f, 70f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(497f, 223f)
                lineTo(522f, 318f)
                lineTo(271f, 131f)
                lineToRelative(47f, -66f)
                lineToRelative(257f, 191f)
                lineToRelative(24f, -32f)
                lineToRelative(-193f, -143f)
                lineToRelative(46f, -64f)
                lineToRelative(230f, 169f)
                lineToRelative(16f, -123f)
                lineToRelative(91f, -14f)
                lineToRelative(111f, 374f)
                lineToRelative(-85f, 114f)
                close()
            }
        }.build()
        
        return _Sign_language!!
    }

private var _Sign_language: ImageVector? = null

