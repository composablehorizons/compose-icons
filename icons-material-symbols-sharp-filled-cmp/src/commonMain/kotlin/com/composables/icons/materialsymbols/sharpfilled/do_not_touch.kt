package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Do_not_touch: ImageVector
    get() {
        if (_Do_not_touch != null) return _Do_not_touch!!
        
        _Do_not_touch = ImageVector.Builder(
            name = "do_not_touch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 726f)
                lineTo(601f, 487f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-407f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(407f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-327f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(566f)
                close()
                moveTo(520f, 406f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-286f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(366f)
                close()
                moveTo(360f, 246f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(126f)
                close()
                moveTo(339f, 920f)
                lineTo(48f, 495f)
                lineToRelative(69f, -66f)
                lineToRelative(163f, 114f)
                verticalLineToRelative(-150f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(896f, 895f)
                lineTo(839f, 952f)
                lineToRelative(-32f, -32f)
                horizontalLineTo(339f)
                close()
            }
        }.build()
        
        return _Do_not_touch!!
    }

private var _Do_not_touch: ImageVector? = null

