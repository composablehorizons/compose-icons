package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Transition_chop: ImageVector
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
                moveToRelative(0f, -138f)
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

