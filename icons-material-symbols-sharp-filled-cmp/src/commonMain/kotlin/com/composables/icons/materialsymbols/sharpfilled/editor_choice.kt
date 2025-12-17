package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Editor_choice: ImageVector
    get() {
        if (_Editor_choice != null) return _Editor_choice!!
        
        _Editor_choice = ImageVector.Builder(
            name = "editor_choice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                verticalLineToRelative(-329f)
                lineTo(110f, 380f)
                lineToRelative(185f, -300f)
                horizontalLineToRelative(370f)
                lineToRelative(185f, 300f)
                lineToRelative(-130f, 211f)
                verticalLineToRelative(329f)
                lineToRelative(-240f, -80f)
                lineToRelative(-240f, 80f)
                close()
                moveToRelative(100f, -760f)
                lineTo(204f, 380f)
                lineToRelative(136f, 220f)
                horizontalLineToRelative(280f)
                lineToRelative(136f, -220f)
                lineToRelative(-136f, -220f)
                horizontalLineTo(340f)
                close()
                moveToRelative(98f, 383f)
                lineTo(296f, 402f)
                lineToRelative(57f, -57f)
                lineToRelative(85f, 85f)
                lineToRelative(169f, -170f)
                lineToRelative(57f, 56f)
                lineToRelative(-226f, 227f)
                close()
            }
        }.build()
        
        return _Editor_choice!!
    }

private var _Editor_choice: ImageVector? = null

