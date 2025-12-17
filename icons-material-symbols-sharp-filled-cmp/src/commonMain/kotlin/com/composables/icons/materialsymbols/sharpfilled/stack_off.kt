package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stack_off: ImageVector
    get() {
        if (_Stack_off != null) return _Stack_off!!
        
        _Stack_off = ImageVector.Builder(
            name = "stack_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 766f)
                lineTo(434f, 320f)
                horizontalLineToRelative(446f)
                verticalLineToRelative(446f)
                close()
                moveTo(560f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(274f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(446f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(823f, 937f)
                lineToRelative(-57f, -57f)
                horizontalLineTo(320f)
                verticalLineToRelative(-446f)
                lineTo(160f, 274f)
                verticalLineToRelative(286f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-446f)
                lineToRelative(-57f, -57f)
                lineToRelative(57f, -57f)
                lineTo(880f, 880f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Stack_off!!
    }

private var _Stack_off: ImageVector? = null

