package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Transition_chop: ImageVector
    get() {
        if (_Transition_chop != null) return _Transition_chop!!
        
        _Transition_chop = ImageVector.Builder(
            name = "transition_chop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -138f)
                lineToRelative(462f, -120f)
                lineToRelative(-78f, -302f)
                horizontalLineTo(160f)
                verticalLineToRelative(422f)
                close()
                moveToRelative(95f, 58f)
                horizontalLineToRelative(545f)
                verticalLineToRelative(-480f)
                horizontalLineTo(627f)
                lineToRelative(93f, 360f)
                lineToRelative(-465f, 120f)
                close()
                moveToRelative(-95f, -480f)
                close()
            }
        }.build()
        
        return _Transition_chop!!
    }

private var _Transition_chop: ImageVector? = null

