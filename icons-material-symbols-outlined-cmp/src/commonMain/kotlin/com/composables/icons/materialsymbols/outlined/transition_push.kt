package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Transition_push: ImageVector
    get() {
        if (_Transition_push != null) return _Transition_push!!
        
        _Transition_push = ImageVector.Builder(
            name = "transition_push",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                verticalLineToRelative(-79f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-481f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(320f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 160f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -79f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-481f)
                horizontalLineTo(640f)
                verticalLineToRelative(481f)
                close()
                moveToRelative(-440f, -81f)
                lineToRelative(-57f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(166f)
                lineToRelative(-63f, -63f)
                lineToRelative(57f, -57f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveToRelative(440f, 81f)
                verticalLineToRelative(-481f)
                verticalLineToRelative(481f)
                close()
            }
        }.build()
        
        return _Transition_push!!
    }

private var _Transition_push: ImageVector? = null

