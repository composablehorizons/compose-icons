package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Transition_chop: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(95f, -80f)
                horizontalLineToRelative(545f)
                verticalLineToRelative(-480f)
                horizontalLineTo(627f)
                lineToRelative(73f, 283f)
                quadToRelative(8f, 32f, -8.5f, 60.5f)
                reflectiveQuadTo(643f, 620f)
                lineTo(255f, 720f)
                close()
            }
        }.build()
        
        return _Transition_chop!!
    }

private var _Transition_chop: ImageVector? = null

